package com.blackhub.bronline.game.common.sensormanager;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SensorDataManager.kt */
@StabilityInferred(parameters = 0)

public final class SensorDataManager implements SensorEventListener {
    public static final int $stable = 8;

    @NotNull
    public final Channel<SensorData> data;

    @Nullable
    public float[] geomagnetic;

    @Nullable
    public float[] gravity;

    @NotNull
    public final SensorManager sensorManager;

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(@Nullable Sensor sensor, int accuracy) {
    }

    public SensorDataManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("sensor");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        SensorManager sensorManager = (SensorManager) systemService;
        this.sensorManager = sensorManager;
        this.data = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        Sensor defaultSensor = sensorManager.getDefaultSensor(9);
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(2);
        sensorManager.registerListener(this, defaultSensor, 2);
        sensorManager.registerListener(this, defaultSensor2, 2);
    }

    @NotNull
    public final Channel<SensorData> getData() {
        return this.data;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(@Nullable SensorEvent event) {
        float[] fArr;
        Sensor sensor;
        Sensor sensor2;
        if (event != null && (sensor2 = event.sensor) != null && sensor2.getType() == 9) {
            this.gravity = event.values;
        }
        if (event != null && (sensor = event.sensor) != null && sensor.getType() == 2) {
            this.geomagnetic = event.values;
        }
        float[] fArr2 = this.gravity;
        if (fArr2 == null || (fArr = this.geomagnetic) == null) {
            return;
        }
        float[] fArr3 = new float[9];
        if (SensorManager.getRotationMatrix(fArr3, new float[9], fArr2, fArr)) {
            float[] fArr4 = new float[3];
            SensorManager.getOrientation(fArr3, fArr4);
            this.data.mo17201trySendJP2dKIU(new SensorData(fArr4[2], fArr4[1]));
        }
    }

    public final void cancel() {
        this.sensorManager.unregisterListener(this);
    }
}

