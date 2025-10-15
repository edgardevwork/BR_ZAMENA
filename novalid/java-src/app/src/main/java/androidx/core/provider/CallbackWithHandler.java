package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.core.provider.FontRequestWorker;
import androidx.core.provider.FontsContractCompat;

/* loaded from: classes.dex */
public class CallbackWithHandler {

    @NonNull
    public final FontsContractCompat.FontRequestCallback mCallback;

    @NonNull
    public final Handler mCallbackHandler;

    public CallbackWithHandler(@NonNull FontsContractCompat.FontRequestCallback fontRequestCallback, @NonNull Handler handler) {
        this.mCallback = fontRequestCallback;
        this.mCallbackHandler = handler;
    }

    public CallbackWithHandler(@NonNull FontsContractCompat.FontRequestCallback fontRequestCallback) {
        this.mCallback = fontRequestCallback;
        this.mCallbackHandler = CalleeHandler.create();
    }

    /* renamed from: androidx.core.provider.CallbackWithHandler$1 */
    public class RunnableC22231 implements Runnable {
        public final /* synthetic */ FontsContractCompat.FontRequestCallback val$callback;
        public final /* synthetic */ Typeface val$typeface;

        public RunnableC22231(FontsContractCompat.FontRequestCallback fontRequestCallback, Typeface typeface) {
            fontRequestCallback = fontRequestCallback;
            typeface = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            fontRequestCallback.onTypefaceRetrieved(typeface);
        }
    }

    public final void onTypefaceRetrieved(@NonNull Typeface typeface) {
        this.mCallbackHandler.post(new Runnable() { // from class: androidx.core.provider.CallbackWithHandler.1
            public final /* synthetic */ FontsContractCompat.FontRequestCallback val$callback;
            public final /* synthetic */ Typeface val$typeface;

            public RunnableC22231(FontsContractCompat.FontRequestCallback fontRequestCallback, Typeface typeface2) {
                fontRequestCallback = fontRequestCallback;
                typeface = typeface2;
            }

            @Override // java.lang.Runnable
            public void run() {
                fontRequestCallback.onTypefaceRetrieved(typeface);
            }
        });
    }

    /* renamed from: androidx.core.provider.CallbackWithHandler$2 */
    public class RunnableC22242 implements Runnable {
        public final /* synthetic */ FontsContractCompat.FontRequestCallback val$callback;
        public final /* synthetic */ int val$reason;

        public RunnableC22242(FontsContractCompat.FontRequestCallback fontRequestCallback, int i) {
            fontRequestCallback = fontRequestCallback;
            i = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            fontRequestCallback.onTypefaceRequestFailed(i);
        }
    }

    public final void onTypefaceRequestFailed(int i) {
        this.mCallbackHandler.post(new Runnable() { // from class: androidx.core.provider.CallbackWithHandler.2
            public final /* synthetic */ FontsContractCompat.FontRequestCallback val$callback;
            public final /* synthetic */ int val$reason;

            public RunnableC22242(FontsContractCompat.FontRequestCallback fontRequestCallback, int i2) {
                fontRequestCallback = fontRequestCallback;
                i = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                fontRequestCallback.onTypefaceRequestFailed(i);
            }
        });
    }

    public void onTypefaceResult(@NonNull FontRequestWorker.TypefaceResult typefaceResult) {
        if (typefaceResult.isSuccess()) {
            onTypefaceRetrieved(typefaceResult.mTypeface);
        } else {
            onTypefaceRequestFailed(typefaceResult.mResult);
        }
    }
}
