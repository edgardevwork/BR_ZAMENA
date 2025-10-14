package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes4.dex */
public interface Operation {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final State.IN_PROGRESS IN_PROGRESS;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final State.SUCCESS SUCCESS;

    @NonNull
    ListenableFuture<State.SUCCESS> getResult();

    @NonNull
    LiveData<State> getState();

    static {
        SUCCESS = new State.SUCCESS();
        IN_PROGRESS = new State.IN_PROGRESS();
    }

    public static abstract class State {
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public State() {
        }

        /* loaded from: classes3.dex */
        public static final class SUCCESS extends State {
            public SUCCESS() {
            }

            @NonNull
            public String toString() {
                return "SUCCESS";
            }
        }

        /* loaded from: classes3.dex */
        public static final class IN_PROGRESS extends State {
            public IN_PROGRESS() {
            }

            @NonNull
            public String toString() {
                return "IN_PROGRESS";
            }
        }

        /* loaded from: classes3.dex */
        public static final class FAILURE extends State {
            public final Throwable mThrowable;

            public FAILURE(@NonNull Throwable exception) {
                this.mThrowable = exception;
            }

            @NonNull
            public Throwable getThrowable() {
                return this.mThrowable;
            }

            @NonNull
            public String toString() {
                return "FAILURE (" + this.mThrowable.getMessage() + ")";
            }
        }
    }
}
