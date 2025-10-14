package com.google.firebase.perf.session;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.p025v1.PerfSession;
import com.google.firebase.perf.p025v1.SessionVerbosity;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Timer;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class PerfSession implements Parcelable {
    public static final Parcelable.Creator<PerfSession> CREATOR = new Parcelable.Creator<PerfSession>() { // from class: com.google.firebase.perf.session.PerfSession.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PerfSession createFromParcel(@NonNull Parcel parcel) {
            return new PerfSession(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PerfSession[] newArray(int i) {
            return new PerfSession[i];
        }
    };
    private final Timer creationTime;
    private boolean isGaugeAndEventCollectionEnabled;
    private final String sessionId;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static PerfSession createWithId(@NonNull String str) {
        PerfSession perfSession = new PerfSession(str.replace("-", ""), new Clock());
        perfSession.setGaugeAndEventCollectionEnabled(shouldCollectGaugesAndEvents());
        return perfSession;
    }

    @VisibleForTesting(otherwise = 3)
    public PerfSession(String str, Clock clock) {
        this.isGaugeAndEventCollectionEnabled = false;
        this.sessionId = str;
        this.creationTime = clock.getTime();
    }

    private PerfSession(@NonNull Parcel parcel) {
        this.isGaugeAndEventCollectionEnabled = false;
        this.sessionId = parcel.readString();
        this.isGaugeAndEventCollectionEnabled = parcel.readByte() != 0;
        this.creationTime = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
    }

    public String sessionId() {
        return this.sessionId;
    }

    public Timer getTimer() {
        return this.creationTime;
    }

    public void setGaugeAndEventCollectionEnabled(boolean z) {
        this.isGaugeAndEventCollectionEnabled = z;
    }

    public boolean isGaugeAndEventCollectionEnabled() {
        return this.isGaugeAndEventCollectionEnabled;
    }

    public boolean isVerbose() {
        return this.isGaugeAndEventCollectionEnabled;
    }

    @VisibleForTesting
    public static boolean isVerbose(@NonNull com.google.firebase.perf.p025v1.PerfSession perfSession) {
        Iterator<SessionVerbosity> it = perfSession.getSessionVerbosityList().iterator();
        while (it.hasNext()) {
            if (it.next() == SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS) {
                return true;
            }
        }
        return false;
    }

    public boolean isSessionRunningTooLong() {
        return TimeUnit.MICROSECONDS.toMinutes(this.creationTime.getDurationMicros()) > ConfigResolver.getInstance().getSessionsMaxDurationMinutes();
    }

    public com.google.firebase.perf.p025v1.PerfSession build() {
        PerfSession.Builder sessionId = com.google.firebase.perf.p025v1.PerfSession.newBuilder().setSessionId(this.sessionId);
        if (this.isGaugeAndEventCollectionEnabled) {
            sessionId.addSessionVerbosity(SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS);
        }
        return sessionId.build();
    }

    @Nullable
    public static com.google.firebase.perf.p025v1.PerfSession[] buildAndSort(@NonNull List<PerfSession> list) {
        if (list.isEmpty()) {
            return null;
        }
        com.google.firebase.perf.p025v1.PerfSession[] perfSessionArr = new com.google.firebase.perf.p025v1.PerfSession[list.size()];
        com.google.firebase.perf.p025v1.PerfSession perfSessionBuild = list.get(0).build();
        boolean z = false;
        for (int i = 1; i < list.size(); i++) {
            com.google.firebase.perf.p025v1.PerfSession perfSessionBuild2 = list.get(i).build();
            if (!z && list.get(i).isVerbose()) {
                perfSessionArr[0] = perfSessionBuild2;
                perfSessionArr[i] = perfSessionBuild;
                z = true;
            } else {
                perfSessionArr[i] = perfSessionBuild2;
            }
        }
        if (!z) {
            perfSessionArr[0] = perfSessionBuild;
        }
        return perfSessionArr;
    }

    public static boolean shouldCollectGaugesAndEvents() {
        ConfigResolver configResolver = ConfigResolver.getInstance();
        return configResolver.isPerformanceMonitoringEnabled() && Math.random() < configResolver.getSessionsSamplingRate();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(this.sessionId);
        parcel.writeByte(this.isGaugeAndEventCollectionEnabled ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.creationTime, 0);
    }
}
