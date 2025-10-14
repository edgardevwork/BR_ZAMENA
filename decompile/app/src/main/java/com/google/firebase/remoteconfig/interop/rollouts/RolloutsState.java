package com.google.firebase.remoteconfig.interop.rollouts;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import java.util.Set;

@AutoValue
/* loaded from: classes6.dex */
public abstract class RolloutsState {
    @NonNull
    public abstract Set<RolloutAssignment> getRolloutAssignments();

    @NonNull
    public static RolloutsState create(@NonNull Set<RolloutAssignment> set) {
        return new AutoValue_RolloutsState(set);
    }
}
