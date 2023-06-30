package com.functionalPrograming.chapter4

import spock.lang.Specification

import java.util.function.Predicate

class AssetUtilSpec extends Specification {

  def "total asset values"() {
    given:
    AssetUtil service = new AssetUtilImpl();
    List<Asset> assetList = [new Asset(Asset.AssetType.BOND, 1000), new Asset(Asset.AssetType.BOND, 2000), new Asset(Asset.AssetType.STOCK, 3000), new Asset(Asset.AssetType.STOCK, 4000)]
    Predicate<Asset> assetPredicate = _lambda
    Integer response
    when:
    response = service.totalAssetValues(assetList, assetPredicate)
    then:
    response == _response
    where:
    _response | _lambda
    10000     | (asset) -> true
    3000      | (asset) -> asset.getType() == Asset.AssetType.BOND
  }

  def "total bond values"() {
    given:
    AssetUtil service = new AssetUtilImpl();
    List<Asset> assetList = [new Asset(Asset.AssetType.BOND, 1000), new Asset(Asset.AssetType.BOND, 2000), new Asset(Asset.AssetType.STOCK, 3000), new Asset(Asset.AssetType.STOCK, 4000)]
    Integer response
    when:
    response = service.totalBondValues(assetList)
    then:
    response == 3000
  }

  def "total stock values"() {
    given:
    AssetUtil service = new AssetUtilImpl();
    List<Asset> assetList = [new Asset(Asset.AssetType.BOND, 1000), new Asset(Asset.AssetType.BOND, 2000), new Asset(Asset.AssetType.STOCK, 3000), new Asset(Asset.AssetType.STOCK, 4000)]
    Integer response
    when:
    response = service.totalStockValues(assetList)
    then:
    response == 7000
  }

}
