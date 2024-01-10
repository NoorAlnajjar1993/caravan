package com.dominate.caravan.medule.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b`\b\u0086\b\u0018\u00002\u00020\u0001B\u00bf\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\b\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011\u0012\u0006\u0010#\u001a\u00020\u0005\u0012\u0006\u0010$\u001a\u00020\u000b\u0012\u0006\u0010%\u001a\u00020\u000b\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\u0006\u0010\'\u001a\u00020\u000b\u0012\u0006\u0010(\u001a\u00020\b\u0012\b\b\u0002\u0010)\u001a\u00020\u0005\u0012\u0006\u0010*\u001a\u00020\u0003\u0012\u0006\u0010+\u001a\u00020\u0003\u0012\u0006\u0010,\u001a\u00020\u000b\u0012\u0006\u0010-\u001a\u00020\u0003\u00a2\u0006\u0002\u0010.J\t\u0010X\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u00c6\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\t\u0010\\\u001a\u00020\u0003H\u00c6\u0003J\t\u0010]\u001a\u00020\u0003H\u00c6\u0003J\t\u0010^\u001a\u00020\u0003H\u00c6\u0003J\t\u0010_\u001a\u00020\u0005H\u00c6\u0003J\t\u0010`\u001a\u00020\bH\u00c6\u0003J\t\u0010a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010d\u001a\u00020\bH\u00c6\u0003J\t\u0010e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010g\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010!H\u00c6\u0003J\u000f\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u00c6\u0003J\t\u0010j\u001a\u00020\u0005H\u00c6\u0003J\t\u0010k\u001a\u00020\u000bH\u00c6\u0003J\t\u0010l\u001a\u00020\u000bH\u00c6\u0003J\t\u0010m\u001a\u00020\u0003H\u00c6\u0003J\t\u0010n\u001a\u00020\u0005H\u00c6\u0003J\t\u0010o\u001a\u00020\u000bH\u00c6\u0003J\t\u0010p\u001a\u00020\bH\u00c6\u0003J\t\u0010q\u001a\u00020\u0005H\u00c6\u0003J\t\u0010r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010s\u001a\u00020\u0003H\u00c6\u0003J\t\u0010t\u001a\u00020\u000bH\u00c6\u0003J\t\u0010u\u001a\u00020\u0003H\u00c6\u0003J\t\u0010v\u001a\u00020\bH\u00c6\u0003J\t\u0010w\u001a\u00020\u0003H\u00c6\u0003J\t\u0010x\u001a\u00020\u000bH\u00c6\u0003J\t\u0010y\u001a\u00020\u000bH\u00c6\u0003J\t\u0010z\u001a\u00020\u000bH\u00c6\u0003J\t\u0010{\u001a\u00020\u0005H\u00c6\u0003J\u0081\u0003\u0010|\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\b\b\u0002\u0010#\u001a\u00020\u00052\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010\'\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010)\u001a\u00020\u00052\b\b\u0002\u0010*\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\u00032\b\b\u0002\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010-\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010}\u001a\u00020\u000b2\b\u0010~\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u007f\u001a\u00020\u0003H\u00d6\u0001J\n\u0010\u0080\u0001\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010&\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00100R\u0011\u0010*\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00100R\u0011\u0010+\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00100R\u0011\u0010-\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00100R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00106R\u0011\u0010)\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00106R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u00100R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010=\"\u0004\b>\u0010?R\u0011\u0010\'\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010=R\u0011\u0010,\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010=R\u0011\u0010\r\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010=R\u0011\u0010(\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010:R\u0011\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u00106R\u0011\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u00106R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0011\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u00100R\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u00100R\u0011\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u00100R\u0011\u0010\u0018\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u00106R\u0011\u0010\u0019\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010:R\u0011\u0010\u001a\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u00100R\u0011\u0010\u001b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u00106R\u0011\u0010\u001c\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010:R\u0011\u0010\u001d\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u00106R\u0011\u0010\u001e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u00100R\u0011\u0010\u001f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u00100R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0013\u0010 \u001a\u0004\u0018\u00010!\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010DR\u0011\u0010#\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u00106R\u0011\u0010$\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010=R\u0011\u0010%\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010=\u00a8\u0006\u0081\u0001"}, d2 = {"Lcom/dominate/caravan/medule/home/HousingAd;", "", "availableFloors", "", "date", "", "description", "garden_area", "", "id", "installment_payment", "", "is_favorite", "is_the_location_approximate", "lat", "long", "media", "", "Lcom/dominate/caravan/medule/home/Media;", "typeOfAds", "Lcom/dominate/caravan/medule/home/TypeOfAds;", "numberOfBathrooms", "numberOfBedrooms", "numberOfFloors", "phone_number", "price", "property_ownership", "region", "roof_area", "title", "totalNumberOfApartment", "totalNumberOfApartmentInFloor", "user", "Lcom/dominate/caravan/medule/profile/profile/Profile;", "videos", "whatsapp", "with_garden", "with_roof", "age_of_construction", "is_featured", "land_area", "floor", "bathrooms_number", "bedrooms_number", "is_new", "building_apartments", "(ILjava/lang/String;Ljava/lang/String;DIZZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/dominate/caravan/medule/home/TypeOfAds;IIILjava/lang/String;DILjava/lang/String;DLjava/lang/String;IILcom/dominate/caravan/medule/profile/profile/Profile;Ljava/util/List;Ljava/lang/String;ZZIZDLjava/lang/String;IIZI)V", "getAge_of_construction", "()I", "getAvailableFloors", "getBathrooms_number", "getBedrooms_number", "getBuilding_apartments", "getDate", "()Ljava/lang/String;", "getDescription", "getFloor", "getGarden_area", "()D", "getId", "getInstallment_payment", "()Z", "set_favorite", "(Z)V", "getLand_area", "getLat", "getLong", "getMedia", "()Ljava/util/List;", "getNumberOfBathrooms", "getNumberOfBedrooms", "getNumberOfFloors", "getPhone_number", "getPrice", "getProperty_ownership", "getRegion", "getRoof_area", "getTitle", "getTotalNumberOfApartment", "getTotalNumberOfApartmentInFloor", "getTypeOfAds", "()Lcom/dominate/caravan/medule/home/TypeOfAds;", "getUser", "()Lcom/dominate/caravan/medule/profile/profile/Profile;", "getVideos", "getWhatsapp", "getWith_garden", "getWith_roof", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "data_debug"})
public final class HousingAd {
    private final int availableFloors = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String date = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description = null;
    private final double garden_area = 0.0;
    private final int id = 0;
    private final boolean installment_payment = false;
    private boolean is_favorite;
    private final boolean is_the_location_approximate = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String lat = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.dominate.caravan.medule.home.Media> media = null;
    @org.jetbrains.annotations.Nullable()
    private final com.dominate.caravan.medule.home.TypeOfAds typeOfAds = null;
    private final int numberOfBathrooms = 0;
    private final int numberOfBedrooms = 0;
    private final int numberOfFloors = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String phone_number = null;
    private final double price = 0.0;
    private final int property_ownership = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String region = null;
    private final double roof_area = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    private final int totalNumberOfApartment = 0;
    private final int totalNumberOfApartmentInFloor = 0;
    @org.jetbrains.annotations.Nullable()
    private final com.dominate.caravan.medule.profile.profile.Profile user = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> videos = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String whatsapp = null;
    private final boolean with_garden = false;
    private final boolean with_roof = false;
    private final int age_of_construction = 0;
    private final boolean is_featured = false;
    private final double land_area = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String floor = null;
    private final int bathrooms_number = 0;
    private final int bedrooms_number = 0;
    private final boolean is_new = false;
    private final int building_apartments = 0;
    
    public final int getAvailableFloors() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final double getGarden_area() {
        return 0.0;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final boolean getInstallment_payment() {
        return false;
    }
    
    public final boolean is_favorite() {
        return false;
    }
    
    public final void set_favorite(boolean p0) {
    }
    
    public final boolean is_the_location_approximate() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLat() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLong() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.dominate.caravan.medule.home.Media> getMedia() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.dominate.caravan.medule.home.TypeOfAds getTypeOfAds() {
        return null;
    }
    
    public final int getNumberOfBathrooms() {
        return 0;
    }
    
    public final int getNumberOfBedrooms() {
        return 0;
    }
    
    public final int getNumberOfFloors() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhone_number() {
        return null;
    }
    
    public final double getPrice() {
        return 0.0;
    }
    
    public final int getProperty_ownership() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRegion() {
        return null;
    }
    
    public final double getRoof_area() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final int getTotalNumberOfApartment() {
        return 0;
    }
    
    public final int getTotalNumberOfApartmentInFloor() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.dominate.caravan.medule.profile.profile.Profile getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getVideos() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWhatsapp() {
        return null;
    }
    
    public final boolean getWith_garden() {
        return false;
    }
    
    public final boolean getWith_roof() {
        return false;
    }
    
    public final int getAge_of_construction() {
        return 0;
    }
    
    public final boolean is_featured() {
        return false;
    }
    
    public final double getLand_area() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFloor() {
        return null;
    }
    
    public final int getBathrooms_number() {
        return 0;
    }
    
    public final int getBedrooms_number() {
        return 0;
    }
    
    public final boolean is_new() {
        return false;
    }
    
    public final int getBuilding_apartments() {
        return 0;
    }
    
    public HousingAd(int availableFloors, @org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.lang.String description, double garden_area, int id, boolean installment_payment, boolean is_favorite, boolean is_the_location_approximate, @org.jetbrains.annotations.NotNull()
    java.lang.String lat, @org.jetbrains.annotations.NotNull()
    java.lang.String p9_1663806, @org.jetbrains.annotations.NotNull()
    java.util.List<com.dominate.caravan.medule.home.Media> media, @org.jetbrains.annotations.Nullable()
    com.dominate.caravan.medule.home.TypeOfAds typeOfAds, int numberOfBathrooms, int numberOfBedrooms, int numberOfFloors, @org.jetbrains.annotations.NotNull()
    java.lang.String phone_number, double price, int property_ownership, @org.jetbrains.annotations.NotNull()
    java.lang.String region, double roof_area, @org.jetbrains.annotations.NotNull()
    java.lang.String title, int totalNumberOfApartment, int totalNumberOfApartmentInFloor, @org.jetbrains.annotations.Nullable()
    com.dominate.caravan.medule.profile.profile.Profile user, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> videos, @org.jetbrains.annotations.NotNull()
    java.lang.String whatsapp, boolean with_garden, boolean with_roof, int age_of_construction, boolean is_featured, double land_area, @org.jetbrains.annotations.NotNull()
    java.lang.String floor, int bathrooms_number, int bedrooms_number, boolean is_new, int building_apartments) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean component8() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.dominate.caravan.medule.home.Media> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.dominate.caravan.medule.home.TypeOfAds component12() {
        return null;
    }
    
    public final int component13() {
        return 0;
    }
    
    public final int component14() {
        return 0;
    }
    
    public final int component15() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    public final double component17() {
        return 0.0;
    }
    
    public final int component18() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component19() {
        return null;
    }
    
    public final double component20() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component21() {
        return null;
    }
    
    public final int component22() {
        return 0;
    }
    
    public final int component23() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.dominate.caravan.medule.profile.profile.Profile component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component25() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component26() {
        return null;
    }
    
    public final boolean component27() {
        return false;
    }
    
    public final boolean component28() {
        return false;
    }
    
    public final int component29() {
        return 0;
    }
    
    public final boolean component30() {
        return false;
    }
    
    public final double component31() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component32() {
        return null;
    }
    
    public final int component33() {
        return 0;
    }
    
    public final int component34() {
        return 0;
    }
    
    public final boolean component35() {
        return false;
    }
    
    public final int component36() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dominate.caravan.medule.home.HousingAd copy(int availableFloors, @org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.lang.String description, double garden_area, int id, boolean installment_payment, boolean is_favorite, boolean is_the_location_approximate, @org.jetbrains.annotations.NotNull()
    java.lang.String lat, @org.jetbrains.annotations.NotNull()
    java.lang.String p9_1663806, @org.jetbrains.annotations.NotNull()
    java.util.List<com.dominate.caravan.medule.home.Media> media, @org.jetbrains.annotations.Nullable()
    com.dominate.caravan.medule.home.TypeOfAds typeOfAds, int numberOfBathrooms, int numberOfBedrooms, int numberOfFloors, @org.jetbrains.annotations.NotNull()
    java.lang.String phone_number, double price, int property_ownership, @org.jetbrains.annotations.NotNull()
    java.lang.String region, double roof_area, @org.jetbrains.annotations.NotNull()
    java.lang.String title, int totalNumberOfApartment, int totalNumberOfApartmentInFloor, @org.jetbrains.annotations.Nullable()
    com.dominate.caravan.medule.profile.profile.Profile user, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> videos, @org.jetbrains.annotations.NotNull()
    java.lang.String whatsapp, boolean with_garden, boolean with_roof, int age_of_construction, boolean is_featured, double land_area, @org.jetbrains.annotations.NotNull()
    java.lang.String floor, int bathrooms_number, int bedrooms_number, boolean is_new, int building_apartments) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}