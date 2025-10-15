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
@Metadata(m7104d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m7105d2 = {"Lcom/blackhub/bronline/game/common/sensormanager/SensorDataManager;", "Landroid/hardware/SensorEventListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "data", "Lkotlinx/coroutines/channels/Channel;", "Lcom/blackhub/bronline/game/common/sensormanager/SensorData;", "getData", "()Lkotlinx/coroutines/channels/Channel;", "geomagnetic", "", NotificationCompat.WearableExtender.KEY_GRAVITY, "sensorManager", "Landroid/hardware/SensorManager;", "cancel", "", "onAccuracyChanged", "sensor", "Landroid/hardware/Sensor;", "accuracy", "", "onSensorChanged", "event", "Landroid/hardware/SensorEvent;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
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
