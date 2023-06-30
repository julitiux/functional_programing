package com.functionalPrograming.chapter4;

public class Asset {
  enum AssetType {BOND, STOCK};
  AssetType type;
  int value;

  Asset(AssetType assetType, int assetValue) {
    type = assetType;
    value = assetValue;
  }

  AssetType getType() {
    return type;
  }
  int getValue() {
    return value;
  }
}
