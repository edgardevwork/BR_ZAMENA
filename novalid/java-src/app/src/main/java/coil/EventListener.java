package coil;

import android.graphics.Bitmap;
import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import coil.EventListener;
import coil.decode.DecodeResult;
import coil.decode.Decoder;
import coil.fetch.FetchResult;
import coil.fetch.Fetcher;
import coil.request.ErrorResult;
import coil.request.ImageRequest;
import coil.request.Options;
import coil.request.SuccessResult;
import coil.size.Size;
import coil.transition.Transition;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.apache.ivy.ant.IvyCleanCache;
import org.apache.ivy.osgi.p063p2.P2ArtifactParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EventListener.kt */
@Metadata(m7104d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 +2\u00020\u0001:\u0002+,J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0017J \u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017J*\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0010H\u0017J \u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH\u0017J\u001a\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0017J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0017J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0017H\u0017J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0017J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u001cH\u0017J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u001fH\u0017J\u0018\u0010 \u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"H\u0017J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0018\u0010$\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020%H\u0017J\u0018\u0010&\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020%H\u0017J\u0018\u0010'\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010(\u001a\u00020)H\u0017J\u0018\u0010*\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010(\u001a\u00020)H\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006-À\u0006\u0003"}, m7105d2 = {"Lcoil/EventListener;", "Lcoil/request/ImageRequest$Listener;", "decodeEnd", "", "request", "Lcoil/request/ImageRequest;", "decoder", "Lcoil/decode/Decoder;", "options", "Lcoil/request/Options;", "result", "Lcoil/decode/DecodeResult;", "decodeStart", "fetchEnd", "fetcher", "Lcoil/fetch/Fetcher;", "Lcoil/fetch/FetchResult;", "fetchStart", "keyEnd", P2ArtifactParser.RuleHandler.OUTPUT, "", "keyStart", "input", "", "mapEnd", "mapStart", "onCancel", "onError", "Lcoil/request/ErrorResult;", "onStart", "onSuccess", "Lcoil/request/SuccessResult;", "resolveSizeEnd", "size", "Lcoil/size/Size;", "resolveSizeStart", "transformEnd", "Landroid/graphics/Bitmap;", "transformStart", "transitionEnd", AnimatedStateListDrawableCompat.ELEMENT_TRANSITION, "Lcoil/transition/Transition;", "transitionStart", "Companion", "Factory", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public interface EventListener extends ImageRequest.Listener {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @JvmField
    @NotNull
    public static final EventListener NONE = new EventListener() { // from class: coil.EventListener$Companion$NONE$1
    };

    /* compiled from: EventListener.kt */
    @Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0005"}, m7105d2 = {"Lcoil/EventListener$Companion;", "", "()V", IvyCleanCache.NONE, "Lcoil/EventListener;", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    @WorkerThread
    default void decodeEnd(@NotNull ImageRequest request, @NotNull Decoder decoder, @NotNull Options options, @Nullable DecodeResult result) {
    }

    @WorkerThread
    default void decodeStart(@NotNull ImageRequest request, @NotNull Decoder decoder, @NotNull Options options) {
    }

    @WorkerThread
    default void fetchEnd(@NotNull ImageRequest request, @NotNull Fetcher fetcher, @NotNull Options options, @Nullable FetchResult result) {
    }

    @WorkerThread
    default void fetchStart(@NotNull ImageRequest request, @NotNull Fetcher fetcher, @NotNull Options options) {
    }

    @MainThread
    default void keyEnd(@NotNull ImageRequest request, @Nullable String str) {
    }

    @MainThread
    default void keyStart(@NotNull ImageRequest request, @NotNull Object input) {
    }

    @MainThread
    default void mapEnd(@NotNull ImageRequest request, @NotNull Object obj) {
    }

    @MainThread
    default void mapStart(@NotNull ImageRequest request, @NotNull Object input) {
    }

    @Override // coil.request.ImageRequest.Listener
    @MainThread
    default void onCancel(@NotNull ImageRequest request) {
    }

    @Override // coil.request.ImageRequest.Listener
    @MainThread
    default void onError(@NotNull ImageRequest request, @NotNull ErrorResult result) {
    }

    @Override // coil.request.ImageRequest.Listener
    @MainThread
    default void onStart(@NotNull ImageRequest request) {
    }

    @Override // coil.request.ImageRequest.Listener
    @MainThread
    default void onSuccess(@NotNull ImageRequest request, @NotNull SuccessResult result) {
    }

    @MainThread
    default void resolveSizeEnd(@NotNull ImageRequest request, @NotNull Size size) {
    }

    @MainThread
    default void resolveSizeStart(@NotNull ImageRequest request) {
    }

    @WorkerThread
    default void transformEnd(@NotNull ImageRequest request, @NotNull Bitmap bitmap) {
    }

    @WorkerThread
    default void transformStart(@NotNull ImageRequest request, @NotNull Bitmap input) {
    }

    @MainThread
    default void transitionEnd(@NotNull ImageRequest request, @NotNull Transition transition) {
    }

    @MainThread
    default void transitionStart(@NotNull ImageRequest request, @NotNull Transition transition) {
    }

    /* compiled from: EventListener.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        @MainThread
        @Deprecated
        public static void onStart(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest) {
            EventListener.super.onStart(imageRequest);
        }

        @MainThread
        @Deprecated
        public static void resolveSizeStart(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest) {
            EventListener.super.resolveSizeStart(imageRequest);
        }

        @MainThread
        @Deprecated
        public static void resolveSizeEnd(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull Size size) {
            EventListener.super.resolveSizeEnd(imageRequest, size);
        }

        @MainThread
        @Deprecated
        public static void mapStart(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull Object obj) {
            EventListener.super.mapStart(imageRequest, obj);
        }

        @MainThread
        @Deprecated
        public static void mapEnd(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull Object obj) {
            EventListener.super.mapEnd(imageRequest, obj);
        }

        @MainThread
        @Deprecated
        public static void keyStart(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull Object obj) {
            EventListener.super.keyStart(imageRequest, obj);
        }

        @MainThread
        @Deprecated
        public static void keyEnd(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @Nullable String str) {
            EventListener.super.keyEnd(imageRequest, str);
        }

        @WorkerThread
        @Deprecated
        public static void fetchStart(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull Fetcher fetcher, @NotNull Options options) {
            EventListener.super.fetchStart(imageRequest, fetcher, options);
        }

        @WorkerThread
        @Deprecated
        public static void fetchEnd(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull Fetcher fetcher, @NotNull Options options, @Nullable FetchResult fetchResult) {
            EventListener.super.fetchEnd(imageRequest, fetcher, options, fetchResult);
        }

        @WorkerThread
        @Deprecated
        public static void decodeStart(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull Decoder decoder, @NotNull Options options) {
            EventListener.super.decodeStart(imageRequest, decoder, options);
        }

        @WorkerThread
        @Deprecated
        public static void decodeEnd(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull Decoder decoder, @NotNull Options options, @Nullable DecodeResult decodeResult) {
            EventListener.super.decodeEnd(imageRequest, decoder, options, decodeResult);
        }

        @WorkerThread
        @Deprecated
        public static void transformStart(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull Bitmap bitmap) {
            EventListener.super.transformStart(imageRequest, bitmap);
        }

        @WorkerThread
        @Deprecated
        public static void transformEnd(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull Bitmap bitmap) {
            EventListener.super.transformEnd(imageRequest, bitmap);
        }

        @MainThread
        @Deprecated
        public static void transitionStart(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull Transition transition) {
            EventListener.super.transitionStart(imageRequest, transition);
        }

        @MainThread
        @Deprecated
        public static void transitionEnd(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull Transition transition) {
            EventListener.super.transitionEnd(imageRequest, transition);
        }

        @MainThread
        @Deprecated
        public static void onCancel(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest) {
            EventListener.super.onCancel(imageRequest);
        }

        @MainThread
        @Deprecated
        public static void onError(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull ErrorResult errorResult) {
            EventListener.super.onError(imageRequest, errorResult);
        }

        @MainThread
        @Deprecated
        public static void onSuccess(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull SuccessResult successResult) {
            EventListener.super.onSuccess(imageRequest, successResult);
        }
    }

    /* compiled from: EventListener.kt */
    @Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m7105d2 = {"Lcoil/EventListener$Factory;", "", "create", "Lcoil/EventListener;", "request", "Lcoil/request/ImageRequest;", "Companion", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public interface Factory {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        @JvmField
        @NotNull
        public static final Factory NONE = new Factory() { // from class: coil.EventListener$Factory$$ExternalSyntheticLambda0
            @Override // coil.EventListener.Factory
            public final EventListener create(ImageRequest imageRequest) {
                return EventListener.Factory.NONE$lambda$0(imageRequest);
            }
        };

        /* compiled from: EventListener.kt */
        @Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0005"}, m7105d2 = {"Lcoil/EventListener$Factory$Companion;", "", "()V", IvyCleanCache.NONE, "Lcoil/EventListener$Factory;", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
        public static final class Companion {
            public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        }

        @NotNull
        EventListener create(@NotNull ImageRequest request);

        static EventListener NONE$lambda$0(ImageRequest imageRequest) {
            return EventListener.NONE;
        }
    }
}
