package com.dominate.caravan.ui.map;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0005H\u0002J\u0016\u0010\'\u001a\u00020 2\u0006\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020\"J\u0018\u0010*\u001a\u00020+2\u0006\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020\"H\u0002J\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0002J\b\u00100\u001a\u00020 H\u0002J\u0012\u00101\u001a\u00020 2\b\u00102\u001a\u0004\u0018\u000103H\u0016J&\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u0001092\b\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u0010:\u001a\u00020 H\u0016J\b\u0010;\u001a\u00020 H\u0016J\u0010\u0010<\u001a\u00020 2\u0006\u0010=\u001a\u00020\u0005H\u0016J\u0010\u0010>\u001a\u00020 2\u0006\u0010=\u001a\u00020\u0005H\u0016J-\u0010?\u001a\u00020 2\u0006\u0010=\u001a\u00020\u00052\u000e\u0010@\u001a\n\u0012\u0006\b\u0001\u0012\u00020+0A2\u0006\u0010B\u001a\u00020CH\u0016\u00a2\u0006\u0002\u0010DJ\b\u0010E\u001a\u00020 H\u0016J\u0010\u0010F\u001a\u00020 2\u0006\u0010G\u001a\u000203H\u0016J\b\u0010H\u001a\u00020 H\u0016J\b\u0010I\u001a\u00020 H\u0016J\u001a\u0010J\u001a\u00020 2\u0006\u0010K\u001a\u0002052\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u0018\u0010L\u001a\u00020 2\u0006\u0010M\u001a\u00020+2\u0006\u0010N\u001a\u00020+H\u0002J\b\u0010O\u001a\u00020 H\u0002J\u000e\u0010P\u001a\u00020 2\u0006\u0010N\u001a\u00020+J\u0010\u0010Q\u001a\u00020 2\u0006\u0010.\u001a\u00020/H\u0002J\b\u0010R\u001a\u00020 H\u0003J\b\u0010S\u001a\u00020 H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006T"}, d2 = {"Lcom/dominate/caravan/ui/map/MapsFragment;", "Lcom/dominate/caravan/core/base/BaseFragment;", "Lpub/devrel/easypermissions/EasyPermissions$RationaleCallbacks;", "()V", "REQUEST_CODE_LOCATION_PERMISSION", "", "getREQUEST_CODE_LOCATION_PERMISSION", "()I", "<set-?>", "Lcom/caravan/databinding/FragmentMapsBinding;", "binding", "getBinding", "()Lcom/caravan/databinding/FragmentMapsBinding;", "setBinding", "(Lcom/caravan/databinding/FragmentMapsBinding;)V", "binding$delegate", "Lcom/dominate/caravan/core/AutoClearedValue;", "callback", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "locationCallback", "Lcom/google/android/gms/location/LocationCallback;", "locationRequest", "Lcom/google/android/gms/location/LocationRequest;", "mLastClickTime", "", "map", "Lcom/google/android/gms/maps/GoogleMap;", "obj", "Landroid/location/Address;", "animateCamera", "", "latitude", "", "longitude", "bitmapDescriptorFromVector", "Lcom/google/android/gms/maps/model/BitmapDescriptor;", "drawableId", "getAddressFromLatLng", "lat", "lng", "getAddressName", "", "getCameraPositionWithBearing", "Lcom/google/android/gms/maps/model/CameraPosition;", "latLng", "Lcom/google/android/gms/maps/model/LatLng;", "getLocationUpdates", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onLowMemory", "onPause", "onRationaleAccepted", "requestCode", "onRationaleDenied", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onSaveInstanceState", "outState", "onStart", "onStop", "onViewCreated", "view", "permissionsAppSettingsDialog", "title", "message", "requestPermissions", "showErrorToast", "showMarker", "startLocationUpdates", "stopLocationUpdates", "app_debug"})
public final class MapsFragment extends com.dominate.caravan.core.base.BaseFragment implements pub.devrel.easypermissions.EasyPermissions.RationaleCallbacks {
    @org.jetbrains.annotations.NotNull()
    private final com.dominate.caravan.core.AutoClearedValue binding$delegate = null;
    private final int REQUEST_CODE_LOCATION_PERMISSION = 3;
    private final com.google.android.gms.maps.OnMapReadyCallback callback = null;
    private android.location.Address obj;
    private com.google.android.gms.maps.GoogleMap map;
    private long mLastClickTime = 0L;
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationClient;
    private com.google.android.gms.location.LocationRequest locationRequest;
    private com.google.android.gms.location.LocationCallback locationCallback;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.caravan.databinding.FragmentMapsBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.caravan.databinding.FragmentMapsBinding p0) {
    }
    
    public final int getREQUEST_CODE_LOCATION_PERMISSION() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onRationaleAccepted(int requestCode) {
    }
    
    @java.lang.Override()
    public void onRationaleDenied(int requestCode) {
    }
    
    private final void requestPermissions() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void permissionsAppSettingsDialog(java.lang.String title, java.lang.String message) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onLowMemory() {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    private final void animateCamera(double latitude, double longitude) {
    }
    
    private final void showMarker(com.google.android.gms.maps.model.LatLng latLng) {
    }
    
    private final com.google.android.gms.maps.model.CameraPosition getCameraPositionWithBearing(com.google.android.gms.maps.model.LatLng latLng) {
        return null;
    }
    
    private final com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptorFromVector(int drawableId) {
        return null;
    }
    
    public final void getAddressFromLatLng(double lat, double lng) {
    }
    
    private final void getLocationUpdates() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void startLocationUpdates() {
    }
    
    private final void stopLocationUpdates() {
    }
    
    private final java.lang.String getAddressName(double lat, double lng) {
        return null;
    }
    
    public final void showErrorToast(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public MapsFragment() {
        super();
    }
}