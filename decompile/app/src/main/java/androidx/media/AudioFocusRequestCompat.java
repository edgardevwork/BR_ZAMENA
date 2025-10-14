package androidx.media;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.util.ObjectsCompat;
import androidx.media.AudioAttributesCompat;

/* loaded from: classes2.dex */
public class AudioFocusRequestCompat {
    public static final AudioAttributesCompat FOCUS_DEFAULT_ATTR = new AudioAttributesCompat.Builder().setUsage(1).build();
    public final AudioAttributesCompat mAudioAttributesCompat;
    public final Handler mFocusChangeHandler;
    public final int mFocusGain;
    public final Object mFrameworkAudioFocusRequest;
    public final AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener;
    public final boolean mPauseOnDuck;

    public AudioFocusRequestCompat(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, AudioAttributesCompat audioAttributesCompat, boolean z) {
        this.mFocusGain = i;
        this.mFocusChangeHandler = handler;
        this.mAudioAttributesCompat = audioAttributesCompat;
        this.mPauseOnDuck = z;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26 && handler.getLooper() != Looper.getMainLooper()) {
            this.mOnAudioFocusChangeListener = new OnAudioFocusChangeListenerHandlerCompat(onAudioFocusChangeListener, handler);
        } else {
            this.mOnAudioFocusChangeListener = onAudioFocusChangeListener;
        }
        if (i2 >= 26) {
            this.mFrameworkAudioFocusRequest = Api26Impl.createInstance(i, getAudioAttributes(), z, this.mOnAudioFocusChangeListener, handler);
        } else {
            this.mFrameworkAudioFocusRequest = null;
        }
    }

    public int getFocusGain() {
        return this.mFocusGain;
    }

    @NonNull
    public AudioAttributesCompat getAudioAttributesCompat() {
        return this.mAudioAttributesCompat;
    }

    public boolean willPauseWhenDucked() {
        return this.mPauseOnDuck;
    }

    @NonNull
    public AudioManager.OnAudioFocusChangeListener getOnAudioFocusChangeListener() {
        return this.mOnAudioFocusChangeListener;
    }

    @NonNull
    public Handler getFocusChangeHandler() {
        return this.mFocusChangeHandler;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioFocusRequestCompat)) {
            return false;
        }
        AudioFocusRequestCompat audioFocusRequestCompat = (AudioFocusRequestCompat) obj;
        return this.mFocusGain == audioFocusRequestCompat.mFocusGain && this.mPauseOnDuck == audioFocusRequestCompat.mPauseOnDuck && ObjectsCompat.equals(this.mOnAudioFocusChangeListener, audioFocusRequestCompat.mOnAudioFocusChangeListener) && ObjectsCompat.equals(this.mFocusChangeHandler, audioFocusRequestCompat.mFocusChangeHandler) && ObjectsCompat.equals(this.mAudioAttributesCompat, audioFocusRequestCompat.mAudioAttributesCompat);
    }

    public int hashCode() {
        return ObjectsCompat.hash(Integer.valueOf(this.mFocusGain), this.mOnAudioFocusChangeListener, this.mFocusChangeHandler, this.mAudioAttributesCompat, Boolean.valueOf(this.mPauseOnDuck));
    }

    @RequiresApi(21)
    public AudioAttributes getAudioAttributes() {
        AudioAttributesCompat audioAttributesCompat = this.mAudioAttributesCompat;
        if (audioAttributesCompat != null) {
            return (AudioAttributes) audioAttributesCompat.unwrap();
        }
        return null;
    }

    @RequiresApi(26)
    public AudioFocusRequest getAudioFocusRequest() {
        return AudioFocusRequestCompat$$ExternalSyntheticApiModelOutline0.m616m(this.mFrameworkAudioFocusRequest);
    }

    public static final class Builder {
        public AudioAttributesCompat mAudioAttributesCompat;
        public Handler mFocusChangeHandler;
        public int mFocusGain;
        public AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener;
        public boolean mPauseOnDuck;

        public static boolean isValidFocusGain(int i) {
            return i == 1 || i == 2 || i == 3 || i == 4;
        }

        public Builder(int i) {
            this.mAudioAttributesCompat = AudioFocusRequestCompat.FOCUS_DEFAULT_ATTR;
            setFocusGain(i);
        }

        public Builder(@NonNull AudioFocusRequestCompat audioFocusRequestCompat) {
            this.mAudioAttributesCompat = AudioFocusRequestCompat.FOCUS_DEFAULT_ATTR;
            if (audioFocusRequestCompat == null) {
                throw new IllegalArgumentException("AudioFocusRequestCompat to copy must not be null");
            }
            this.mFocusGain = audioFocusRequestCompat.getFocusGain();
            this.mOnAudioFocusChangeListener = audioFocusRequestCompat.getOnAudioFocusChangeListener();
            this.mFocusChangeHandler = audioFocusRequestCompat.getFocusChangeHandler();
            this.mAudioAttributesCompat = audioFocusRequestCompat.getAudioAttributesCompat();
            this.mPauseOnDuck = audioFocusRequestCompat.willPauseWhenDucked();
        }

        @NonNull
        public Builder setFocusGain(int i) {
            if (!isValidFocusGain(i)) {
                throw new IllegalArgumentException("Illegal audio focus gain type " + i);
            }
            this.mFocusGain = i;
            return this;
        }

        @NonNull
        public Builder setOnAudioFocusChangeListener(@NonNull AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
            return setOnAudioFocusChangeListener(onAudioFocusChangeListener, new Handler(Looper.getMainLooper()));
        }

        @NonNull
        public Builder setOnAudioFocusChangeListener(@NonNull AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, @NonNull Handler handler) {
            if (onAudioFocusChangeListener == null) {
                throw new IllegalArgumentException("OnAudioFocusChangeListener must not be null");
            }
            if (handler == null) {
                throw new IllegalArgumentException("Handler must not be null");
            }
            this.mOnAudioFocusChangeListener = onAudioFocusChangeListener;
            this.mFocusChangeHandler = handler;
            return this;
        }

        @NonNull
        public Builder setAudioAttributes(@NonNull AudioAttributesCompat audioAttributesCompat) {
            if (audioAttributesCompat == null) {
                throw new NullPointerException("Illegal null AudioAttributes");
            }
            this.mAudioAttributesCompat = audioAttributesCompat;
            return this;
        }

        @NonNull
        public Builder setWillPauseWhenDucked(boolean z) {
            this.mPauseOnDuck = z;
            return this;
        }

        public AudioFocusRequestCompat build() {
            if (this.mOnAudioFocusChangeListener == null) {
                throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
            }
            return new AudioFocusRequestCompat(this.mFocusGain, this.mOnAudioFocusChangeListener, this.mFocusChangeHandler, this.mAudioAttributesCompat, this.mPauseOnDuck);
        }
    }

    public static class OnAudioFocusChangeListenerHandlerCompat implements Handler.Callback, AudioManager.OnAudioFocusChangeListener {
        public static final int FOCUS_CHANGE = 2782386;
        public final Handler mHandler;
        public final AudioManager.OnAudioFocusChangeListener mListener;

        public OnAudioFocusChangeListenerHandlerCompat(@NonNull AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, @NonNull Handler handler) {
            this.mListener = onAudioFocusChangeListener;
            this.mHandler = new Handler(handler.getLooper(), this);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
            Handler handler = this.mHandler;
            handler.sendMessage(Message.obtain(handler, FOCUS_CHANGE, i, 0));
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 2782386) {
                return false;
            }
            this.mListener.onAudioFocusChange(message.arg1);
            return true;
        }
    }

    @RequiresApi(26)
    public static class Api26Impl {
        @DoNotInline
        public static AudioFocusRequest createInstance(int i, AudioAttributes audioAttributes, boolean z, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            return new AudioFocusRequest.Builder(i).setAudioAttributes(audioAttributes).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        }
    }
}
