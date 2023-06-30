package com.functionalPrograming.chapter4

import spock.lang.Specification

class AssetUtilSpec extends Specification {

  def "total asset values"() {
    given:
    AssetUtil service = new AssetUtilImpl();
    List<Asset> assetList = [new Asset(Asset.AssetType.BOND, 1000), new Asset(Asset.AssetType.BOND, 2000), new Asset(Asset.AssetType.STOCK, 3000), new Asset(Asset.AssetType.STOCK, 4000)]
    Integer response
    when:
    response = service.totalAssetValues(assetList)
    then:
    response == 10000
  }

}
