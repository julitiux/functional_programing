package com.functionalPrograming.chapter4;

import java.util.List;

public class AssetUtilImpl implements AssetUtil{

  @Override
  public Integer totalAssetValues(List<Asset> assetList) {
    return assetList.stream().mapToInt(asset -> asset.getValue()).sum();
  }

}
