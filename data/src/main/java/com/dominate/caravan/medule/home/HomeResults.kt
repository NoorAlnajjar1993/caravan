package com.dominate.caravan.medule.home

data class HomeResults(
    val commercial_ads: MutableList<CommercialAd>, // اعلانات تجارية
    val commercial_estates: MutableList<CommercialEstate>, // اعلانات عقارية تجارية
    val featured_ads: MutableList<Any>, //اعلانات مميزة
    val housing_ads: MutableList<HousingAd>,
    val latest_ads: MutableList<LatestAd>,
    val real_estate_ads: MutableList<RealEstateAd> // اعلانات عقارية
)