package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class LocationCompat {
    public static final String EXTRA_BEARING_ACCURACY = "bearingAccuracy";
    public static final String EXTRA_IS_MOCK = "mockLocation";
    public static final String EXTRA_MSL_ALTITUDE = "androidx.core.location.extra.MSL_ALTITUDE";
    public static final String EXTRA_MSL_ALTITUDE_ACCURACY = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY";
    public static final String EXTRA_SPEED_ACCURACY = "speedAccuracy";
    public static final String EXTRA_VERTICAL_ACCURACY = "verticalAccuracy";

    @Nullable
    public static Field sFieldsMaskField;

    @Nullable
    public static Integer sHasBearingAccuracyMask;

    @Nullable
    public static Integer sHasSpeedAccuracyMask;

    @Nullable
    public static Integer sHasVerticalAccuracyMask;

    @Nullable
    public static Method sSetIsFromMockProviderMethod;

    public static long getElapsedRealtimeNanos(@NonNull Location location) {
        return location.getElapsedRealtimeNanos();
    }

    public static long getElapsedRealtimeMillis(@NonNull Location location) {
        return TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos());
    }

    public static boolean hasVerticalAccuracy(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.hasVerticalAccuracy(location);
        }
        return containsExtra(location, "verticalAccuracy");
    }

    public static float getVerticalAccuracyMeters(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getVerticalAccuracyMeters(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat("verticalAccuracy", 0.0f);
    }

    public static void setVerticalAccuracyMeters(@NonNull Location location, float f) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setVerticalAccuracyMeters(location, f);
        } else {
            getOrCreateExtras(location).putFloat("verticalAccuracy", f);
        }
    }

    public static void removeVerticalAccuracy(@NonNull Location location) throws IllegalAccessException, IllegalArgumentException {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            Api33Impl.removeVerticalAccuracy(location);
            return;
        }
        if (i >= 29) {
            Api29Impl.removeVerticalAccuracy(location);
            return;
        }
        if (i >= 28) {
            Api28Impl.removeVerticalAccuracy(location);
        } else if (i >= 26) {
            Api26Impl.removeVerticalAccuracy(location);
        } else {
            removeExtra(location, "verticalAccuracy");
        }
    }

    public static boolean hasSpeedAccuracy(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.hasSpeedAccuracy(location);
        }
        return containsExtra(location, EXTRA_SPEED_ACCURACY);
    }

    public static float getSpeedAccuracyMetersPerSecond(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getSpeedAccuracyMetersPerSecond(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(EXTRA_SPEED_ACCURACY, 0.0f);
    }

    public static void setSpeedAccuracyMetersPerSecond(@NonNull Location location, float f) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setSpeedAccuracyMetersPerSecond(location, f);
        } else {
            getOrCreateExtras(location).putFloat(EXTRA_SPEED_ACCURACY, f);
        }
    }

    public static void removeSpeedAccuracy(@NonNull Location location) throws IllegalAccessException, IllegalArgumentException {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            Api33Impl.removeSpeedAccuracy(location);
            return;
        }
        if (i >= 29) {
            Api29Impl.removeSpeedAccuracy(location);
            return;
        }
        if (i >= 28) {
            Api28Impl.removeSpeedAccuracy(location);
        } else if (i >= 26) {
            Api26Impl.removeSpeedAccuracy(location);
        } else {
            removeExtra(location, EXTRA_SPEED_ACCURACY);
        }
    }

    public static boolean hasBearingAccuracy(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.hasBearingAccuracy(location);
        }
        return containsExtra(location, EXTRA_BEARING_ACCURACY);
    }

    public static float getBearingAccuracyDegrees(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getBearingAccuracyDegrees(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(EXTRA_BEARING_ACCURACY, 0.0f);
    }

    public static void setBearingAccuracyDegrees(@NonNull Location location, float f) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setBearingAccuracyDegrees(location, f);
        } else {
            getOrCreateExtras(location).putFloat(EXTRA_BEARING_ACCURACY, f);
        }
    }

    public static void removeBearingAccuracy(@NonNull Location location) throws IllegalAccessException, IllegalArgumentException {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            Api33Impl.removeBearingAccuracy(location);
            return;
        }
        if (i >= 29) {
            Api29Impl.removeBearingAccuracy(location);
            return;
        }
        if (i >= 28) {
            Api28Impl.removeBearingAccuracy(location);
        } else if (i >= 26) {
            Api26Impl.removeBearingAccuracy(location);
        } else {
            removeExtra(location, EXTRA_BEARING_ACCURACY);
        }
    }

    public static double getMslAltitudeMeters(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.getMslAltitudeMeters(location);
        }
        return getOrCreateExtras(location).getDouble(EXTRA_MSL_ALTITUDE);
    }

    public static void setMslAltitudeMeters(@NonNull Location location, double d) {
        if (Build.VERSION.SDK_INT >= 34) {
            Api34Impl.setMslAltitudeMeters(location, d);
        } else {
            getOrCreateExtras(location).putDouble(EXTRA_MSL_ALTITUDE, d);
        }
    }

    public static boolean hasMslAltitude(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.hasMslAltitude(location);
        }
        return containsExtra(location, EXTRA_MSL_ALTITUDE);
    }

    public static void removeMslAltitude(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 34) {
            Api34Impl.removeMslAltitude(location);
        } else {
            removeExtra(location, EXTRA_MSL_ALTITUDE);
        }
    }

    @FloatRange(from = 0.0d)
    public static float getMslAltitudeAccuracyMeters(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.getMslAltitudeAccuracyMeters(location);
        }
        return getOrCreateExtras(location).getFloat(EXTRA_MSL_ALTITUDE_ACCURACY);
    }

    public static void setMslAltitudeAccuracyMeters(@NonNull Location location, @FloatRange(from = 0.0d) float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            Api34Impl.setMslAltitudeAccuracyMeters(location, f);
        } else {
            getOrCreateExtras(location).putFloat(EXTRA_MSL_ALTITUDE_ACCURACY, f);
        }
    }

    public static boolean hasMslAltitudeAccuracy(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.hasMslAltitudeAccuracy(location);
        }
        return containsExtra(location, EXTRA_MSL_ALTITUDE_ACCURACY);
    }

    public static void removeMslAltitudeAccuracy(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 34) {
            Api34Impl.removeMslAltitudeAccuracy(location);
        } else {
            removeExtra(location, EXTRA_MSL_ALTITUDE_ACCURACY);
        }
    }

    public static boolean isMock(@NonNull Location location) {
        return location.isFromMockProvider();
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static void setMock(@NonNull Location location, boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            getSetIsFromMockProviderMethod().invoke(location, Boolean.valueOf(z));
        } catch (IllegalAccessException e) {
            IllegalAccessError illegalAccessError = new IllegalAccessError();
            illegalAccessError.initCause(e);
            throw illegalAccessError;
        } catch (NoSuchMethodException e2) {
            NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
            noSuchMethodError.initCause(e2);
            throw noSuchMethodError;
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @RequiresApi(34)
    public static class Api34Impl {
        @DoNotInline
        public static double getMslAltitudeMeters(Location location) {
            return location.getMslAltitudeMeters();
        }

        @DoNotInline
        public static void setMslAltitudeMeters(Location location, double d) {
            location.setMslAltitudeMeters(d);
        }

        @DoNotInline
        public static boolean hasMslAltitude(Location location) {
            return location.hasMslAltitude();
        }

        @DoNotInline
        public static void removeMslAltitude(Location location) {
            location.removeMslAltitude();
        }

        @DoNotInline
        public static float getMslAltitudeAccuracyMeters(Location location) {
            return location.getMslAltitudeAccuracyMeters();
        }

        @DoNotInline
        public static void setMslAltitudeAccuracyMeters(Location location, float f) {
            location.setMslAltitudeAccuracyMeters(f);
        }

        @DoNotInline
        public static boolean hasMslAltitudeAccuracy(Location location) {
            return location.hasMslAltitudeAccuracy();
        }

        @DoNotInline
        public static void removeMslAltitudeAccuracy(Location location) {
            location.removeMslAltitudeAccuracy();
        }
    }

    @RequiresApi(33)
    public static class Api33Impl {
        @DoNotInline
        public static void removeVerticalAccuracy(Location location) {
            location.removeVerticalAccuracy();
        }

        @DoNotInline
        public static void removeSpeedAccuracy(Location location) {
            location.removeSpeedAccuracy();
        }

        @DoNotInline
        public static void removeBearingAccuracy(Location location) {
            location.removeBearingAccuracy();
        }
    }

    @RequiresApi(29)
    public static class Api29Impl {
        @DoNotInline
        public static void removeVerticalAccuracy(Location location) {
            if (location.hasVerticalAccuracy()) {
                double elapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
                Api28Impl.removeVerticalAccuracy(location);
                location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNanos);
            }
        }

        @DoNotInline
        public static void removeSpeedAccuracy(Location location) {
            if (location.hasSpeedAccuracy()) {
                double elapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
                Api28Impl.removeSpeedAccuracy(location);
                location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNanos);
            }
        }

        @DoNotInline
        public static void removeBearingAccuracy(Location location) {
            if (location.hasBearingAccuracy()) {
                double elapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
                Api28Impl.removeBearingAccuracy(location);
                location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNanos);
            }
        }
    }

    @RequiresApi(28)
    public static class Api28Impl {
        @DoNotInline
        public static void removeVerticalAccuracy(Location location) {
            if (location.hasVerticalAccuracy()) {
                String provider = location.getProvider();
                long time = location.getTime();
                long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                boolean zHasAltitude = location.hasAltitude();
                double altitude = location.getAltitude();
                boolean zHasSpeed = location.hasSpeed();
                float speed = location.getSpeed();
                boolean zHasBearing = location.hasBearing();
                float bearing = location.getBearing();
                boolean zHasAccuracy = location.hasAccuracy();
                float accuracy = location.getAccuracy();
                boolean zHasSpeedAccuracy = location.hasSpeedAccuracy();
                float speedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
                boolean zHasBearingAccuracy = location.hasBearingAccuracy();
                float bearingAccuracyDegrees = location.getBearingAccuracyDegrees();
                Bundle extras = location.getExtras();
                location.reset();
                location.setProvider(provider);
                location.setTime(time);
                location.setElapsedRealtimeNanos(elapsedRealtimeNanos);
                location.setLatitude(latitude);
                location.setLongitude(longitude);
                if (zHasAltitude) {
                    location.setAltitude(altitude);
                }
                if (zHasSpeed) {
                    location.setSpeed(speed);
                }
                if (zHasBearing) {
                    location.setBearing(bearing);
                }
                if (zHasAccuracy) {
                    location.setAccuracy(accuracy);
                }
                if (zHasSpeedAccuracy) {
                    location.setSpeedAccuracyMetersPerSecond(speedAccuracyMetersPerSecond);
                }
                if (zHasBearingAccuracy) {
                    location.setBearingAccuracyDegrees(bearingAccuracyDegrees);
                }
                if (extras != null) {
                    location.setExtras(extras);
                }
            }
        }

        @DoNotInline
        public static void removeSpeedAccuracy(Location location) {
            if (location.hasSpeedAccuracy()) {
                String provider = location.getProvider();
                long time = location.getTime();
                long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                boolean zHasAltitude = location.hasAltitude();
                double altitude = location.getAltitude();
                boolean zHasSpeed = location.hasSpeed();
                float speed = location.getSpeed();
                boolean zHasBearing = location.hasBearing();
                float bearing = location.getBearing();
                boolean zHasAccuracy = location.hasAccuracy();
                float accuracy = location.getAccuracy();
                boolean zHasVerticalAccuracy = location.hasVerticalAccuracy();
                float verticalAccuracyMeters = location.getVerticalAccuracyMeters();
                boolean zHasBearingAccuracy = location.hasBearingAccuracy();
                float bearingAccuracyDegrees = location.getBearingAccuracyDegrees();
                Bundle extras = location.getExtras();
                location.reset();
                location.setProvider(provider);
                location.setTime(time);
                location.setElapsedRealtimeNanos(elapsedRealtimeNanos);
                location.setLatitude(latitude);
                location.setLongitude(longitude);
                if (zHasAltitude) {
                    location.setAltitude(altitude);
                }
                if (zHasSpeed) {
                    location.setSpeed(speed);
                }
                if (zHasBearing) {
                    location.setBearing(bearing);
                }
                if (zHasAccuracy) {
                    location.setAccuracy(accuracy);
                }
                if (zHasVerticalAccuracy) {
                    location.setVerticalAccuracyMeters(verticalAccuracyMeters);
                }
                if (zHasBearingAccuracy) {
                    location.setBearingAccuracyDegrees(bearingAccuracyDegrees);
                }
                if (extras != null) {
                    location.setExtras(extras);
                }
            }
        }

        @DoNotInline
        public static void removeBearingAccuracy(Location location) {
            if (location.hasBearingAccuracy()) {
                String provider = location.getProvider();
                long time = location.getTime();
                long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                boolean zHasAltitude = location.hasAltitude();
                double altitude = location.getAltitude();
                boolean zHasSpeed = location.hasSpeed();
                float speed = location.getSpeed();
                boolean zHasBearing = location.hasBearing();
                float bearing = location.getBearing();
                boolean zHasAccuracy = location.hasAccuracy();
                float accuracy = location.getAccuracy();
                boolean zHasVerticalAccuracy = location.hasVerticalAccuracy();
                float verticalAccuracyMeters = location.getVerticalAccuracyMeters();
                boolean zHasSpeedAccuracy = location.hasSpeedAccuracy();
                float speedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
                Bundle extras = location.getExtras();
                location.reset();
                location.setProvider(provider);
                location.setTime(time);
                location.setElapsedRealtimeNanos(elapsedRealtimeNanos);
                location.setLatitude(latitude);
                location.setLongitude(longitude);
                if (zHasAltitude) {
                    location.setAltitude(altitude);
                }
                if (zHasSpeed) {
                    location.setSpeed(speed);
                }
                if (zHasBearing) {
                    location.setBearing(bearing);
                }
                if (zHasAccuracy) {
                    location.setAccuracy(accuracy);
                }
                if (zHasVerticalAccuracy) {
                    location.setVerticalAccuracyMeters(verticalAccuracyMeters);
                }
                if (zHasSpeedAccuracy) {
                    location.setBearingAccuracyDegrees(speedAccuracyMetersPerSecond);
                }
                if (extras != null) {
                    location.setExtras(extras);
                }
            }
        }
    }

    @RequiresApi(26)
    public static class Api26Impl {
        @DoNotInline
        public static boolean hasVerticalAccuracy(Location location) {
            return location.hasVerticalAccuracy();
        }

        @DoNotInline
        public static float getVerticalAccuracyMeters(Location location) {
            return location.getVerticalAccuracyMeters();
        }

        @DoNotInline
        public static void setVerticalAccuracyMeters(Location location, float f) {
            location.setVerticalAccuracyMeters(f);
        }

        @DoNotInline
        public static void removeVerticalAccuracy(Location location) throws IllegalAccessException, IllegalArgumentException {
            try {
                LocationCompat.getFieldsMaskField().setByte(location, (byte) (LocationCompat.getFieldsMaskField().getByte(location) & (~LocationCompat.getHasVerticalAccuracyMask())));
            } catch (IllegalAccessException | NoSuchFieldException e) {
                IllegalAccessError illegalAccessError = new IllegalAccessError();
                illegalAccessError.initCause(e);
                throw illegalAccessError;
            }
        }

        @DoNotInline
        public static boolean hasSpeedAccuracy(Location location) {
            return location.hasSpeedAccuracy();
        }

        @DoNotInline
        public static float getSpeedAccuracyMetersPerSecond(Location location) {
            return location.getSpeedAccuracyMetersPerSecond();
        }

        @DoNotInline
        public static void setSpeedAccuracyMetersPerSecond(Location location, float f) {
            location.setSpeedAccuracyMetersPerSecond(f);
        }

        @DoNotInline
        public static void removeSpeedAccuracy(Location location) throws IllegalAccessException, IllegalArgumentException {
            try {
                LocationCompat.getFieldsMaskField().setByte(location, (byte) (LocationCompat.getFieldsMaskField().getByte(location) & (~LocationCompat.getHasSpeedAccuracyMask())));
            } catch (IllegalAccessException e) {
                IllegalAccessError illegalAccessError = new IllegalAccessError();
                illegalAccessError.initCause(e);
                throw illegalAccessError;
            } catch (NoSuchFieldException e2) {
                NoSuchFieldError noSuchFieldError = new NoSuchFieldError();
                noSuchFieldError.initCause(e2);
                throw noSuchFieldError;
            }
        }

        @DoNotInline
        public static boolean hasBearingAccuracy(Location location) {
            return location.hasBearingAccuracy();
        }

        @DoNotInline
        public static float getBearingAccuracyDegrees(Location location) {
            return location.getBearingAccuracyDegrees();
        }

        @DoNotInline
        public static void setBearingAccuracyDegrees(Location location, float f) {
            location.setBearingAccuracyDegrees(f);
        }

        @DoNotInline
        public static void removeBearingAccuracy(Location location) throws IllegalAccessException, IllegalArgumentException {
            try {
                LocationCompat.getFieldsMaskField().setByte(location, (byte) (LocationCompat.getFieldsMaskField().getByte(location) & (~LocationCompat.getHasBearingAccuracyMask())));
            } catch (IllegalAccessException e) {
                IllegalAccessError illegalAccessError = new IllegalAccessError();
                illegalAccessError.initCause(e);
                throw illegalAccessError;
            } catch (NoSuchFieldException e2) {
                NoSuchFieldError noSuchFieldError = new NoSuchFieldError();
                noSuchFieldError.initCause(e2);
                throw noSuchFieldError;
            }
        }
    }

    public static Method getSetIsFromMockProviderMethod() throws NoSuchMethodException, SecurityException {
        if (sSetIsFromMockProviderMethod == null) {
            Method declaredMethod = Location.class.getDeclaredMethod("setIsFromMockProvider", Boolean.TYPE);
            sSetIsFromMockProviderMethod = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return sSetIsFromMockProviderMethod;
    }

    @SuppressLint({"BlockedPrivateApi"})
    public static Field getFieldsMaskField() throws NoSuchFieldException, SecurityException {
        if (sFieldsMaskField == null) {
            Field declaredField = Location.class.getDeclaredField("mFieldsMask");
            sFieldsMaskField = declaredField;
            declaredField.setAccessible(true);
        }
        return sFieldsMaskField;
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static int getHasSpeedAccuracyMask() throws IllegalAccessException, NoSuchFieldException, SecurityException {
        if (sHasSpeedAccuracyMask == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_SPEED_ACCURACY_MASK");
            declaredField.setAccessible(true);
            sHasSpeedAccuracyMask = Integer.valueOf(declaredField.getInt(null));
        }
        return sHasSpeedAccuracyMask.intValue();
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static int getHasBearingAccuracyMask() throws IllegalAccessException, NoSuchFieldException, SecurityException {
        if (sHasBearingAccuracyMask == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_BEARING_ACCURACY_MASK");
            declaredField.setAccessible(true);
            sHasBearingAccuracyMask = Integer.valueOf(declaredField.getInt(null));
        }
        return sHasBearingAccuracyMask.intValue();
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static int getHasVerticalAccuracyMask() throws IllegalAccessException, NoSuchFieldException, SecurityException {
        if (sHasVerticalAccuracyMask == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_VERTICAL_ACCURACY_MASK");
            declaredField.setAccessible(true);
            sHasVerticalAccuracyMask = Integer.valueOf(declaredField.getInt(null));
        }
        return sHasVerticalAccuracyMask.intValue();
    }

    public static Bundle getOrCreateExtras(@NonNull Location location) {
        Bundle extras = location.getExtras();
        if (extras != null) {
            return extras;
        }
        location.setExtras(new Bundle());
        return location.getExtras();
    }

    public static boolean containsExtra(@NonNull Location location, String str) {
        Bundle extras = location.getExtras();
        return extras != null && extras.containsKey(str);
    }

    public static void removeExtra(@NonNull Location location, String str) {
        Bundle extras = location.getExtras();
        if (extras != null) {
            extras.remove(str);
            if (extras.isEmpty()) {
                location.setExtras(null);
            }
        }
    }
}
