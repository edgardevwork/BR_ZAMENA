package com.google.firebase.perf.injection.components;

import androidx.annotation.NonNull;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;
import dagger.Component;
import javax.inject.Singleton;

@Component(modules = {FirebasePerformanceModule.class})
@Singleton
/* loaded from: classes5.dex */
public interface FirebasePerformanceComponent {
    @NonNull
    FirebasePerformance getFirebasePerformance();
}
