package com.functionalPrograming.chapter4;

import java.util.List;
import java.util.function.Predicate;

public interface AssetUtil {
  Integer totalAssetValues(List<Asset> assetList, Predicate<Asset> assetPredicate);
  Integer totalBondValues(List<Asset> assetList);
  Integer totalStockValues(List<Asset> assetList);
}
