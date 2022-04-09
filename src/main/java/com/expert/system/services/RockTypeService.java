package com.expert.system.services;

import java.util.Scanner;

import com.expert.system.models.Rock;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class RockTypeService {
  private Scanner myObj = new Scanner(System.in);
  private Rock rock;
  private KieServices ks = KieServices.Factory.get();
  private KieContainer kContainer = ks.getKieClasspathContainer();
  private KieSession kSession = kContainer.newKieSession("ksession-rule-type");

  public RockTypeService(Rock rock) {
    this.rock = rock;
  }

  public String getRockType() {
    askAllQuestions();
    kSession.insert(rock);
    kSession.fireAllRules();
    if (rock.getType() == null) {
      requestRockType();
    }
    return rock.getType();
  }

  public void requestRockType() {
    String answer = "";
    while (!isValidRockType(answer)) {
      System.out.println(
          "Could not identify rock type. Please identify your rock type manually and enter in terminal. (Igneous/Sedimentary/Metamorphic)");
      answer = myObj.nextLine();
      if (isValidRockType(answer)) {
        answer = answer.toLowerCase();
        answer = answer.substring(0, 1).toUpperCase() + answer.substring(1);
        rock.setType(answer);
      } else {
        System.out.println(
            "INPUT INVALID: Please identify your rock type manually and enter in terminal. (Igneous/Sedimentary/Metamorphic)");
      }
    }

  }

  public void askAllQuestions() {
    askHoles();
    askFossil();
    askCrystals();
    askHasMultipleGrainSizes();
    askIsSwirly();
    askHasMudCrackOrRipple();
    askHeavy();
    askLayered();
    askLight();
  }

  public void askColor() {
    System.out.println("Is your rock light colored or dark? (light/dark OR any color)");
    String answer = myObj.nextLine();
    rock.setColor(answer.toLowerCase());
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

  public Boolean isValidRockType(String answer) {
    if (answer.toLowerCase().equals("igneous") ||
        answer.toLowerCase().equals("metamorphic") ||
        answer.toLowerCase().equals("sedimentary")) {
      return true;
    } else {
      return false;
    }
  }

  public void askHasMultipleGrainSizes() {
    String answer = "";
    while (!isValidYesNoAnswer(answer)) {
      System.out.println("Does your rock have multiple grain sizes? (Y/y N/n)");
      answer = myObj.nextLine();
      if (isValidYesNoAnswer(answer)) {
        if (answer.toLowerCase().equals("y") || answer.toLowerCase().equals("yes")) {
          rock.setHasMultipleGrainSizes(true);
        } else {
          rock.setHasMultipleGrainSizes(false);
        }
      } else {
        System.out.println("Invalid input");
      }

    }
  }

  public void askHoles() {
    String answer = "";
    while (!isValidYesNoAnswer(answer)) {
      System.out.println("Does your rock have holes? (Y/y N/n)");
      answer = myObj.nextLine();
      if (isValidYesNoAnswer(answer)) {
        if (answer.toLowerCase().equals("y") || answer.toLowerCase().equals("yes")) {
          rock.setIsHolesIdentified(true);
        } else {
          rock.setIsHolesIdentified(false);
        }
      } else {
        System.out.println("Invalid input. Please enter Yes/Y or No/n");
      }
    }
  }

  public void askHeavy() {
    String answer = "";
    while (!isValidYesNoAnswer(answer)) {
      System.out.println("Does your rock heavy? (Y/y N/n)");
      answer = myObj.nextLine();
      if (isValidYesNoAnswer(answer)) {
        if (answer.toLowerCase().equals("y") || answer.toLowerCase().equals("yes")) {
          rock.setIsHeavy(true);
        } else {
          rock.setIsHeavy(false);
        }
      } else {
        System.out.println("Invalid input. Please enter Yes/Y or No/n");
      }
    }
  }

  public void askLight() {
    String answer = "";
    while (!isValidYesNoAnswer(answer)) {
      System.out.println("Does your rock light weight? (Y/y N/n)");
      answer = myObj.nextLine();
      if (isValidYesNoAnswer(answer)) {
        if (answer.toLowerCase().equals("y") || answer.toLowerCase().equals("yes")) {
          rock.setIsLight(true);
        } else {
          rock.setIsLight(false);
        }
      } else {
        System.out.println("Invalid input. Please enter Yes/Y or No/n");
      }
    }
  }

  public void askFossil() {
    String answer = "";
    while (!isValidYesNoAnswer(answer)) {
      System.out.println("Does your rock have any fossils? (Y/y N/n)");
      answer = myObj.nextLine();
      if (isValidYesNoAnswer(answer)) {
        if (answer.toLowerCase().equals("y") || answer.toLowerCase().equals("yes")) {
          rock.setIsFossilsIdentified(true);
        } else {
          rock.setIsFossilsIdentified(false);
        }
      } else {
        System.out.println("Invalid input. Please enter Yes/Y or No/n");
      }
    }
  }

  public void askCrystals() {
    String answer = "";
    while (!isValidYesNoAnswer(answer)) {
      System.out.println("Does your rock have any crystals between bands? (Y/y N/n)");
      answer = myObj.nextLine();
      if (isValidYesNoAnswer(answer)) {
        if (answer.toLowerCase().equals("y") || answer.toLowerCase().equals("yes")) {
          rock.setIsCrystalsBetweenBandsIdentified(true);
        } else {
          rock.setIsCrystalsBetweenBandsIdentified(false);
        }
      } else {
        System.out.println("Invalid input. Please enter Yes/Y or No/n");
      }
    }
  }

  public void askLayered() {
    String answer = "";
    while (!isValidYesNoAnswer(answer)) {
      System.out.println("Does your rock have layers? (Y/y N/n)");
      answer = myObj.nextLine();
      if (isValidYesNoAnswer(answer)) {
        if (answer.toLowerCase().equals("y") || answer.toLowerCase().equals("yes")) {
          rock.setIsLayered(true);
        } else {
          rock.setIsLayered(false);
        }
      } else {
        System.out.println("Invalid input. Please enter Yes/Y or No/n");
      }
    }
  }

  public void askIsSwirly() {
    String answer = "";
    while (!isValidYesNoAnswer(answer)) {
      System.out.println("Does your rock have swirls? (Y/y N/n)");
      answer = myObj.nextLine();
      if (isValidYesNoAnswer(answer)) {
        if (answer.toLowerCase().equals("y") || answer.toLowerCase().equals("yes")) {
          rock.setIsSwirly(true);
        } else {
          rock.setIsSwirly(false);
        }
      } else {
        System.out.println("Invalid input. Please enter Yes/Y or No/n");
      }
    }
  }

  public void askHasMudCrackOrRipple() {
    String answer = "";
    while (!isValidYesNoAnswer(answer)) {
      System.out.println("Does your rock have mud cracks or ripples? (Y/y N/n)");
      answer = myObj.nextLine();
      if (isValidYesNoAnswer(answer)) {
        if (answer.toLowerCase().equals("y") || answer.toLowerCase().equals("yes")) {
          rock.setMudCrackOrRipple(true);
        } else {
          rock.setMudCrackOrRipple(false);
        }
      } else {
        System.out.println("Invalid input. Please enter Yes/Y or No/n");
      }
    }
  }
}
