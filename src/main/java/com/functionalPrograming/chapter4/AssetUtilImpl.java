package com.functionalPrograming.chapter4;

import java.util.List;
import java.util.function.Predicate;

public class AssetUtilImpl implements AssetUtil {

  @Override
  public Integer totalAssetValues(List<Asset> assetList, Predicate<Asset> assetPredicate) {
    return assetList.stream().filter(assetPredicate).mapToInt(Asset::getValue).sum();
  }

  @Override
  public Integer totalBondValues(List<Asset> assetList) {
    return assetList.stream().mapToInt(asset -> asset.getType() == Asset.AssetType.BOND ? asset.getValue() : 0).sum();
  }

  @Override
  public Integer totalStockValues(List<Asset> assetList) {
    return assetList.stream().mapToInt(asset -> asset.getType() == Asset.AssetType.STOCK ? asset.getValue() : 0).sum();
  }

}
