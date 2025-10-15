package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public interface ConfigUpdateListener {
    void onError(@NonNull FirebaseRemoteConfigException firebaseRemoteConfigException);

    void onUpdate(@NonNull ConfigUpdate configUpdate);
}
