package com.dominate.caravan.medule.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\bG\b\u0086\b\u0018\u00002\u00020\u0001B\u00e9\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\b\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u0011\u0012\u0006\u0010!\u001a\u00020\u0005\u0012\u0006\u0010\"\u001a\u00020\u000b\u0012\u0006\u0010#\u001a\u00020\u000b\u00a2\u0006\u0002\u0010$J\t\u0010F\u001a\u00020\u0003H\u00c6\u0003J\t\u0010G\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u00c6\u0003J\t\u0010I\u001a\u00020\u0003H\u00c6\u0003J\t\u0010J\u001a\u00020\u0003H\u00c6\u0003J\t\u0010K\u001a\u00020\u0003H\u00c6\u0003J\t\u0010L\u001a\u00020\u0005H\u00c6\u0003J\t\u0010M\u001a\u00020\bH\u00c6\u0003J\t\u0010N\u001a\u00020\u0003H\u00c6\u0003J\t\u0010O\u001a\u00020\u0005H\u00c6\u0003J\t\u0010P\u001a\u00020\bH\u00c6\u0003J\t\u0010Q\u001a\u00020\u0005H\u00c6\u0003J\t\u0010R\u001a\u00020\u0005H\u00c6\u0003J\t\u0010S\u001a\u00020\u0003H\u00c6\u0003J\t\u0010T\u001a\u00020\u0003H\u00c6\u0003J\t\u0010U\u001a\u00020\u001fH\u00c6\u0003J\u000f\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u00c6\u0003J\t\u0010W\u001a\u00020\u0005H\u00c6\u0003J\t\u0010X\u001a\u00020\u000bH\u00c6\u0003J\t\u0010Y\u001a\u00020\u000bH\u00c6\u0003J\t\u0010Z\u001a\u00020\u0005H\u00c6\u0003J\t\u0010[\u001a\u00020\bH\u00c6\u0003J\t\u0010\\\u001a\u00020\u0003H\u00c6\u0003J\t\u0010]\u001a\u00020\u000bH\u00c6\u0003J\t\u0010^\u001a\u00020\u000bH\u00c6\u0003J\t\u0010_\u001a\u00020\u000bH\u00c6\u0003J\t\u0010`\u001a\u00020\u0005H\u00c6\u0003J\u00a3\u0002\u0010a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\b\b\u0002\u0010!\u001a\u00020\u00052\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010b\u001a\u00020\u000b2\b\u0010c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010d\u001a\u00020\u0003H\u00d6\u0001J\t\u0010e\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010&R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010.\"\u0004\b/\u00100R\u0011\u0010\r\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010.R\u0011\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010(R\u0011\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010(R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010&R\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010&R\u0011\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010&R\u0011\u0010\u0016\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010(R\u0011\u0010\u0017\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010+R\u0011\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010&R\u0011\u0010\u0019\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010(R\u0011\u0010\u001a\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010+R\u0011\u0010\u001b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010(R\u0011\u0010\u001c\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010&R\u0011\u0010\u001d\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010&R\u0011\u0010\u001e\u001a\u00020\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u00104R\u0011\u0010!\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010(R\u0011\u0010\"\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010.R\u0011\u0010#\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010.\u00a8\u0006f"}, d2 = {"Lcom/dominate/caravan/medule/home/HousingAd;", "", "availableFloors", "", "date", "", "description", "garden_area", "", "id", "installment_payment", "", "is_favorite", "is_the_location_approximate", "lat", "long", "media", "", "Lcom/dominate/caravan/medule/home/Media;", "numberOfBathrooms", "numberOfBedrooms", "numberOfFloors", "phone_number", "price", "property_ownership", "region", "roof_area", "title", "totalNumberOfApartment", "totalNumberOfApartmentInFloor", "user", "Lcom/dominate/caravan/medule/profile/profile/Profile;", "videos", "whatsapp", "with_garden", "with_roof", "(ILjava/lang/String;Ljava/lang/String;DIZZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;IIILjava/lang/String;DILjava/lang/String;DLjava/lang/String;IILcom/dominate/caravan/medule/profile/profile/Profile;Ljava/util/List;Ljava/lang/String;ZZ)V", "getAvailableFloors", "()I", "getDate", "()Ljava/lang/String;", "getDescription", "getGarden_area", "()D", "getId", "getInstallment_payment", "()Z", "set_favorite", "(Z)V", "getLat", "getLong", "getMedia", "()Ljava/util/List;", "getNumberOfBathrooms", "getNumberOfBedrooms", "getNumberOfFloors", "getPhone_number", "getPrice", "getProperty_ownership", "getRegion", "getRoof_area", "getTitle", "getTotalNumberOfApartment", "getTotalNumberOfApartmentInFloor", "getUser", "()Lcom/dominate/caravan/medule/profile/profile/Profile;", "getVideos", "getWhatsapp", "getWith_garden", "getWith_roof", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "data_debug"})
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
    @org.jetbrains.annotations.NotNull()
    private final com.dominate.caravan.medule.profile.profile.Profile user = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> videos = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String whatsapp = null;
    private final boolean with_garden = false;
    private final boolean with_roof = false;
    
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
    
    @org.jetbrains.annotations.NotNull()
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
    
    public HousingAd(int availableFloors, @org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.lang.String description, double garden_area, int id, boolean installment_payment, boolean is_favorite, boolean is_the_location_approximate, @org.jetbrains.annotations.NotNull()
    java.lang.String lat, @org.jetbrains.annotations.NotNull()
    java.lang.String p9_1663806, @org.jetbrains.annotations.NotNull()
    java.util.List<com.dominate.caravan.medule.home.Media> media, int numberOfBathrooms, int numberOfBedrooms, int numberOfFloors, @org.jetbrains.annotations.NotNull()
    java.lang.String phone_number, double price, int property_ownership, @org.jetbrains.annotations.NotNull()
    java.lang.String region, double roof_area, @org.jetbrains.annotations.NotNull()
    java.lang.String title, int totalNumberOfApartment, int totalNumberOfApartmentInFloor, @org.jetbrains.annotations.NotNull()
    com.dominate.caravan.medule.profile.profile.Profile user, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> videos, @org.jetbrains.annotations.NotNull()
    java.lang.String whatsapp, boolean with_garden, boolean with_roof) {
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
    
    public final int component12() {
        return 0;
    }
    
    public final int component13() {
        return 0;
    }
    
    public final int component14() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    public final double component16() {
        return 0.0;
    }
    
    public final int component17() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    public final double component19() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component20() {
        return null;
    }
    
    public final int component21() {
        return 0;
    }
    
    public final int component22() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dominate.caravan.medule.profile.profile.Profile component23() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component25() {
        return null;
    }
    
    public final boolean component26() {
        return false;
    }
    
    public final boolean component27() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dominate.caravan.medule.home.HousingAd copy(int availableFloors, @org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.lang.String description, double garden_area, int id, boolean installment_payment, boolean is_favorite, boolean is_the_location_approximate, @org.jetbrains.annotations.NotNull()
    java.lang.String lat, @org.jetbrains.annotations.NotNull()
    java.lang.String p9_1663806, @org.jetbrains.annotations.NotNull()
    java.util.List<com.dominate.caravan.medule.home.Media> media, int numberOfBathrooms, int numberOfBedrooms, int numberOfFloors, @org.jetbrains.annotations.NotNull()
    java.lang.String phone_number, double price, int property_ownership, @org.jetbrains.annotations.NotNull()
    java.lang.String region, double roof_area, @org.jetbrains.annotations.NotNull()
    java.lang.String title, int totalNumberOfApartment, int totalNumberOfApartmentInFloor, @org.jetbrains.annotations.NotNull()
    com.dominate.caravan.medule.profile.profile.Profile user, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> videos, @org.jetbrains.annotations.NotNull()
    java.lang.String whatsapp, boolean with_garden, boolean with_roof) {
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