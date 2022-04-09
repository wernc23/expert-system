package com.expert.system.services;

import java.util.Scanner;

import com.expert.system.models.Rock;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class RockIdService {
  private Scanner myObj = new Scanner(System.in);
  private Rock rock;
  private KieServices ks = KieServices.Factory.get();
  private KieContainer kContainer = ks.getKieClasspathContainer();
  private KieSession kSession = kContainer.newKieSession("ksession-rule-id");

  public RockIdService(Rock rock) {
    this.rock = rock;
  }

  public void getRockId() {
    askAllQuestions();
    kSession.insert(rock);
    kSession.fireAllRules();
    if (rock.getRockName() == null) {
      System.out.println("Your rock could not be identified past the type of rock. Type: " + rock.getType());
    } else {
      System.out.println("Your rock is " + rock.getRockName());
    }
  }

  public void askAllQuestions() {
    askGrainSize();
    askHardness();
    askColor();
    askDistinguishingCharacteristic();
    askIsFoliated();
  }

  public Boolean isValidGrainSize(String answer) {
    if (answer.toLowerCase().equals("fine") ||
        answer.toLowerCase().equals("mixed") ||
        answer.toLowerCase().equals("coarse")) {
      return true;
    } else {
      return false;
    }
  }

  public Boolean isValidHardness(String answer) {
    try {
      Double.parseDouble(answer);
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  public void askGrainSize() {
    String answer = "";
    while (!isValidGrainSize(answer)) {
      System.out.println("What is the grain size? (fine, mixed, or coarse)");
      answer = myObj.nextLine();
      if (isValidGrainSize(answer)) {
        rock.setGrainSize(answer);
      } else {
        System.out.println("Invalid input");
      }

    }
  }

  public void askHardness() {
    String answer = "";
    while (!isValidHardness(answer)) {
      System.out.println("What is the hardness of the rock?");
      answer = myObj.nextLine();
      if (isValidHardness(answer)) {
        rock.setHardness(Double.parseDouble(answer));
      } else {
        System.out.println("Invalid input");
      }

    }
  }

  public void askIsFoliated() {
    String answer = "";
    while (!isValidYesNoAnswer(answer)) {
      System.out.println("Is you rock foliated? (Y/y N/n)");
      answer = myObj.nextLine();
      if (isValidYesNoAnswer(answer)) {
        if (answer.toLowerCase().equals("y") || answer.toLowerCase().equals("yes")) {
          rock.setIsFoliated(true);
        } else {
          rock.setIsFoliated(false);
        }
      } else {
        System.out.println("Invalid input. Please enter Yes/Y or No/n");
      }
    }
  }

  public void askColor() {
    System.out.println("Is your rock light colored or dark? (light/medium/dark OR any color)");
    String answer = myObj.nextLine();
    rock.setColor(answer.toLowerCase());
  }

  public void askDistinguishingCharacteristic() {
    System.out.println(
        "Please enter a distinguishing characteristic about your rock; I.E. Glassy, Bubbles, Dense, Quartz, etc.");
    String answer = myObj.nextLine();
    rock.setDistinguishingCharacteristic(answer.toLowerCase());
  }

  public Boolean isValidYesNoAnswer(String answer) {
    if (answer.toLowerCase().equals("y") ||
        answer.toLowerCase().equals("yes") ||
        answer.toLowerCase().equals("no") ||
        answer.toLowerCase().equals("n")) {
      return true;
    } else {
      return false;
    }
  }
}
