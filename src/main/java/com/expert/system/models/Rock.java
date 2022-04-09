package com.expert.system.models;

public class Rock {
  String grainSize;
  Boolean isHolesIdentified;
  String color;
  Boolean isHeavy;
  Boolean isLight;
  Boolean hasMultipleGrainSizes;
  Boolean isLayered;
  Boolean isChingSound;
  Boolean isGrainsCemented;
  Boolean isFossilsIdentified;
  Boolean isCrystalsBetweenBandsIdentified;
  Double hardness;
  String type;
  String rockName;
  String distinguishingCharacteristic;
  Boolean isSwirly;
  Boolean hasMudCrackOrRipple;
  Boolean isFoliated;

  public Rock() {
    this.isHolesIdentified = false;
    this.isHeavy = false;
    this.isLight = false;
    this.hasMultipleGrainSizes = false;
    this.isLayered = false;
    this.isChingSound = false;
    this.isGrainsCemented = false;
    this.isFossilsIdentified = false;
    this.hasMudCrackOrRipple = false;
    this.isCrystalsBetweenBandsIdentified = false;
    this.isFoliated = false;
    this.isSwirly = false;
    this.hardness = 0.0;
  }

  public String getDistinguishingCharacteristic() {
    System.out.println("getDistinguishingCharacteristic fired");
    return this.distinguishingCharacteristic;
  }

  public void setDistinguishingCharacteristic(String distinguishingCharacteristic) {
    this.distinguishingCharacteristic = distinguishingCharacteristic;
  }

  public String getRockName() {
    System.out.println("getRockName fired");
    return this.rockName;
  }

  public void setRockName(String rockName) {
    this.rockName = rockName;
  }

  public Double getHardness() {
    System.out.println("getHardness fired");
    return this.hardness;
  }

  public void setHardness(Double hardness) {
    this.hardness = hardness;
  }

  public Boolean getIsCrystalsBetweenBandsIdentified() {
    System.out.println("getIsCrystalsBetweenBandsIdentified fired");
    return this.isCrystalsBetweenBandsIdentified;
  }

  public void setIsCrystalsBetweenBandsIdentified(Boolean isCrystalsBetweenBandsIdentified) {
    this.isCrystalsBetweenBandsIdentified = isCrystalsBetweenBandsIdentified;
  }

  public Boolean getIsFossilsIdentified() {
    System.out.println("getIsFossilsIdentified fired");
    return this.isFossilsIdentified;
  }

  public void setIsFossilsIdentified(Boolean isFossilsIdentified) {
    this.isFossilsIdentified = isFossilsIdentified;
  }

  public String getType() {
    System.out.println("getType fired");
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String isGrainSize() {
    return this.grainSize;
  }

  public String getGrainSize() {
    System.out.println("getGrainSize fired");
    return this.grainSize;
  }

  public void setGrainSize(String isLargeGrainsIdentified) {
    this.grainSize = isLargeGrainsIdentified;
  }

  public Boolean isIsHolesIdentified() {
    return this.isHolesIdentified;
  }

  public Boolean getIsHolesIdentified() {
    System.out.println("getIsHolesIdentified fired");
    return this.isHolesIdentified;
  }

  public void setIsHolesIdentified(Boolean isHolesIdentified) {
    this.isHolesIdentified = isHolesIdentified;
  }

  public String getColor() {
    System.out.println("getColor fired");
    return this.color;
  }

  public void setColor(String isDarkColored) {
    this.color = isDarkColored;
  }

  public Boolean isIsHeavy() {
    return this.isHeavy;
  }

  public Boolean getIsHeavy() {
    System.out.println("getIsHeavy fired");
    return this.isHeavy;
  }

  public void setIsHeavy(Boolean isHeavy) {
    this.isHeavy = isHeavy;
  }

  public Boolean isIsLight() {
    return this.isLight;
  }

  public Boolean getIsLight() {
    System.out.println("getIsLight fired");
    return this.isLight;
  }

  public void setIsLight(Boolean isLight) {
    this.isLight = isLight;
  }

  public Boolean isHasMultipleGrainSizes() {
    return this.hasMultipleGrainSizes;
  }

  public Boolean getHasMultipleGrainSizes() {
    System.out.println("getHasMultipleGrainSizes fired");
    return this.hasMultipleGrainSizes;
  }

  public void setHasMultipleGrainSizes(Boolean hasMultipleGrainSizes) {
    this.hasMultipleGrainSizes = hasMultipleGrainSizes;
  }

  public Boolean isIsLayered() {
    return this.isLayered;
  }

  public Boolean getIsLayered() {
    System.out.println("getIsLayered fired");
    return this.isLayered;
  }

  public void setIsLayered(Boolean isLayered) {
    this.isLayered = isLayered;
  }

  public Boolean isIsFoliated() {
    return this.isFoliated;
  }

  public Boolean getIsFoliated() {
    System.out.println("getIsFoliated fired");
    return this.isFoliated;
  }

  public void setIsFoliated(Boolean isFoliated) {
    this.isFoliated = isFoliated;
  }

  public Boolean isMudCrackOrRipple() {
    return this.hasMudCrackOrRipple;
  }

  public Boolean getMudCrackOrRipple() {
    System.out.println("getMudCrackOrRipple fired");
    return this.hasMudCrackOrRipple;
  }

  public void setMudCrackOrRipple(Boolean hasMudCrackOrRipple) {
    this.hasMudCrackOrRipple = hasMudCrackOrRipple;
  }

  public Boolean isIsChingSound() {
    return this.isChingSound;
  }

  public Boolean getIsChingSound() {
    System.out.println("getIsChingSound fired");
    return this.isChingSound;
  }

  public void setIsChingSound(Boolean isChingSound) {
    this.isChingSound = isChingSound;
  }

  public Boolean isIsSwirly() {
    return this.isSwirly;
  }

  public Boolean getIsSwirly() {
    System.out.println("getIsSwirly fired");
    return this.isSwirly;
  }

  public void setIsSwirly(Boolean isSwirly) {
    this.isSwirly = isSwirly;
  }

  public Boolean isIsGrainsCemented() {
    return this.isGrainsCemented;
  }

  public Boolean getIsGrainsCemented() {
    System.out.println("getIsGrainsCemented fired");
    return this.isGrainsCemented;
  }

  public void setIsGrainsCemented(Boolean isGrainsCemented) {
    this.isGrainsCemented = isGrainsCemented;
  }

}
