package com.airbnb.lottie.compose;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.datasource.DefaultDataSource;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieImageAsset;
import com.airbnb.lottie.LottieListener;
import com.airbnb.lottie.LottieTask;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.google.common.net.MediaType;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: rememberLottieComposition.kt */
@Metadata(m7104d1 = {"\u0000t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\u001a0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0082@¢\u0006\u0002\u0010\n\u001a(\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0082@¢\u0006\u0002\u0010\r\u001aD\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0082@¢\u0006\u0002\u0010\u0012\u001a2\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00142\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0015\u001a\u00020\u0016H\u0002\u001a\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0002\u001a\"\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0002\u001a*\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0002\u001a\u008b\u0001\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012H\b\u0002\u0010 \u001aB\b\u0001\u0012\u0013\u0012\u00110\"¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110&¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b('\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160(\u0012\u0006\u0012\u0004\u0018\u00010)0!H\u0007¢\u0006\u0002\u0010*\u001a\u001a\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u0001H\u0002\u001a\u001e\u0010/\u001a\u0002H0\"\u0004\b\u0000\u00100*\b\u0012\u0004\u0012\u0002H00\u0014H\u0082@¢\u0006\u0002\u00101\u001a\f\u00102\u001a\u00020\u0001*\u00020\u0001H\u0002\u001a\u0010\u00103\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u00064²\u0006\n\u00105\u001a\u000206X\u008a\u0084\u0002"}, m7105d2 = {"DefaultCacheKey", "", "loadFontsFromAssets", "", "context", "Landroid/content/Context;", "composition", "Lcom/airbnb/lottie/LottieComposition;", "fontAssetsFolder", "fontFileExtension", "(Landroid/content/Context;Lcom/airbnb/lottie/LottieComposition;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadImagesFromAssets", "imageAssetsFolder", "(Landroid/content/Context;Lcom/airbnb/lottie/LottieComposition;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lottieComposition", "spec", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "cacheKey", "(Landroid/content/Context;Lcom/airbnb/lottie/compose/LottieCompositionSpec;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lottieTask", "Lcom/airbnb/lottie/LottieTask;", "isWarmingCache", "", "maybeDecodeBase64Image", DefaultDataSource.SCHEME_ASSET, "Lcom/airbnb/lottie/LottieImageAsset;", "maybeLoadImageFromAsset", "maybeLoadTypefaceFromAssets", MediaType.FONT_TYPE, "Lcom/airbnb/lottie/model/Font;", "rememberLottieComposition", "Lcom/airbnb/lottie/compose/LottieCompositionResult;", "onRetry", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "failCount", "", "previousException", "Lkotlin/coroutines/Continuation;", "", "(Lcom/airbnb/lottie/compose/LottieCompositionSpec;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Lcom/airbnb/lottie/compose/LottieCompositionResult;", "typefaceForStyle", "Landroid/graphics/Typeface;", "typeface", "style", "await", ExifInterface.GPS_DIRECTION_TRUE, "(Lcom/airbnb/lottie/LottieTask;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ensureLeadingPeriod", "ensureTrailingSlash", "lottie-compose_release", "result", "Lcom/airbnb/lottie/compose/LottieCompositionResultImpl;"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nrememberLottieComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 rememberLottieComposition.kt\ncom/airbnb/lottie/compose/RememberLottieCompositionKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,313:1\n74#2:314\n1116#3,6:315\n1116#3,6:321\n314#4,11:327\n81#5:338\n*S KotlinDebug\n*F\n+ 1 rememberLottieComposition.kt\ncom/airbnb/lottie/compose/RememberLottieCompositionKt\n*L\n83#1:314\n84#1:315,6\n87#1:321,6\n190#1:327,11\n84#1:338\n*E\n"})
/* loaded from: classes.dex */
public final class RememberLottieCompositionKt {

    @NotNull
    public static final String DefaultCacheKey = "__LottieInternalDefaultCacheKey__";

    /* compiled from: rememberLottieComposition.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.airbnb.lottie.compose.RememberLottieCompositionKt", m7120f = "rememberLottieComposition.kt", m7121i = {0, 0, 0, 0, 1, 1, 1, 1, 2}, m7122l = {126, 127, 128}, m7123m = "lottieComposition", m7124n = {"context", "imageAssetsFolder", "fontAssetsFolder", "fontFileExtension", "context", "fontAssetsFolder", "fontFileExtension", "composition", "composition"}, m7125s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0"})
    /* renamed from: com.airbnb.lottie.compose.RememberLottieCompositionKt$lottieComposition$1 */
    /* loaded from: classes2.dex */
    public static final class C34631 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C34631(Continuation<? super C34631> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RememberLottieCompositionKt.lottieComposition(null, null, null, null, null, null, this);
        }
    }

    @Composable
    @JvmOverloads
    @NotNull
    public static final LottieCompositionResult rememberLottieComposition(@NotNull LottieCompositionSpec spec, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Function3<? super Integer, ? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> function3, @Nullable Composer composer, int i, int i2) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(spec, "spec");
        composer.startReplaceableGroup(-1248473602);
        String str5 = (i2 & 2) != 0 ? null : str;
        String str6 = (i2 & 4) != 0 ? "fonts/" : str2;
        String str7 = (i2 & 8) != 0 ? ".ttf" : str3;
        String str8 = (i2 & 16) != 0 ? DefaultCacheKey : str4;
        Function3<? super Integer, ? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> c34641 = (i2 & 32) != 0 ? new C34641(null) : function3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1248473602, i, -1, "com.airbnb.lottie.compose.rememberLottieComposition (rememberLottieComposition.kt:81)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer.startReplaceableGroup(1388713885);
        int i3 = i & 14;
        int i4 = i3 ^ 6;
        boolean z = (i4 > 4 && composer.changed(spec)) || (i & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new LottieCompositionResultImpl(), null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(1388714176);
        boolean z2 = ((i4 > 4 && composer.changed(spec)) || (i & 6) == 4) | ((((57344 & i) ^ CpioConstants.C_ISBLK) > 16384 && composer.changed(str8)) || (i & CpioConstants.C_ISBLK) == 16384);
        Object objRememberedValue2 = composer.rememberedValue();
        if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = lottieTask(context, spec, str8, true);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(spec, str8, new C34653(c34641, context, spec, str5, str6, str7, str8, mutableState, null), composer, i3 | 512 | ((i >> 9) & 112));
        LottieCompositionResultImpl lottieCompositionResultImplRememberLottieComposition$lambda$1 = rememberLottieComposition$lambda$1(mutableState);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lottieCompositionResultImplRememberLottieComposition$lambda$1;
    }

    /* compiled from: rememberLottieComposition.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$1", m7120f = "rememberLottieComposition.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$1 */
    public static final class C34641 extends SuspendLambda implements Function3<Integer, Throwable, Continuation<? super Boolean>, Object> {
        public int label;

        public C34641(Continuation<? super C34641> continuation) {
            super(3, continuation);
        }

        @Nullable
        public final Object invoke(int i, @NotNull Throwable th, @Nullable Continuation<? super Boolean> continuation) {
            return new C34641(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Throwable th, Continuation<? super Boolean> continuation) {
            return invoke(num.intValue(), th, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(false);
        }
    }

    /* compiled from: rememberLottieComposition.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3", m7120f = "rememberLottieComposition.kt", m7121i = {0, 0, 1, 1}, m7122l = {91, 93}, m7123m = "invokeSuspend", m7124n = {"exception", "failedCount", "exception", "failedCount"}, m7125s = {"L$0", "I$0", "L$0", "I$0"})
    /* renamed from: com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3 */
    public static final class C34653 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String $cacheKey;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $fontAssetsFolder;
        public final /* synthetic */ String $fontFileExtension;
        public final /* synthetic */ String $imageAssetsFolder;
        public final /* synthetic */ Function3<Integer, Throwable, Continuation<? super Boolean>, Object> $onRetry;
        public final /* synthetic */ MutableState<LottieCompositionResultImpl> $result$delegate;
        public final /* synthetic */ LottieCompositionSpec $spec;
        public int I$0;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C34653(Function3<? super Integer, ? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> function3, Context context, LottieCompositionSpec lottieCompositionSpec, String str, String str2, String str3, String str4, MutableState<LottieCompositionResultImpl> mutableState, Continuation<? super C34653> continuation) {
            super(2, continuation);
            this.$onRetry = function3;
            this.$context = context;
            this.$spec = lottieCompositionSpec;
            this.$imageAssetsFolder = str;
            this.$fontAssetsFolder = str2;
            this.$fontFileExtension = str3;
            this.$cacheKey = str4;
            this.$result$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C34653(this.$onRetry, this.$context, this.$spec, this.$imageAssetsFolder, this.$fontAssetsFolder, this.$fontFileExtension, this.$cacheKey, this.$result$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C34653) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
        
            if (((java.lang.Boolean) r13).booleanValue() == false) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0083 -> B:26:0x0086). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i;
            Throwable th;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                i = 0;
                th = null;
                if (!RememberLottieCompositionKt.rememberLottieComposition$lambda$1(this.$result$delegate).isSuccess()) {
                }
                if (!RememberLottieCompositionKt.rememberLottieComposition$lambda$1(this.$result$delegate).isComplete()) {
                    RememberLottieCompositionKt.rememberLottieComposition$lambda$1(this.$result$delegate).completeExceptionally$lottie_compose_release(th);
                }
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$0;
                th = (Throwable) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th2) {
                    th = th2;
                    i++;
                }
                RememberLottieCompositionKt.rememberLottieComposition$lambda$1(this.$result$delegate).complete$lottie_compose_release((LottieComposition) obj);
                if (!RememberLottieCompositionKt.rememberLottieComposition$lambda$1(this.$result$delegate).isSuccess()) {
                    if (i != 0) {
                        Function3<Integer, Throwable, Continuation<? super Boolean>, Object> function3 = this.$onRetry;
                        Integer numBoxInt = Boxing.boxInt(i);
                        Intrinsics.checkNotNull(th);
                        this.L$0 = th;
                        this.I$0 = i;
                        this.label = 1;
                        obj = function3.invoke(numBoxInt, th, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    Context context = this.$context;
                    LottieCompositionSpec lottieCompositionSpec = this.$spec;
                    String strEnsureTrailingSlash = RememberLottieCompositionKt.ensureTrailingSlash(this.$imageAssetsFolder);
                    String strEnsureTrailingSlash2 = RememberLottieCompositionKt.ensureTrailingSlash(this.$fontAssetsFolder);
                    String strEnsureLeadingPeriod = RememberLottieCompositionKt.ensureLeadingPeriod(this.$fontFileExtension);
                    String str = this.$cacheKey;
                    this.L$0 = th;
                    this.I$0 = i;
                    this.label = 2;
                    obj = RememberLottieCompositionKt.lottieComposition(context, lottieCompositionSpec, strEnsureTrailingSlash, strEnsureTrailingSlash2, strEnsureLeadingPeriod, str, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    RememberLottieCompositionKt.rememberLottieComposition$lambda$1(this.$result$delegate).complete$lottie_compose_release((LottieComposition) obj);
                    if (!RememberLottieCompositionKt.rememberLottieComposition$lambda$1(this.$result$delegate).isSuccess()) {
                    }
                }
                if (!RememberLottieCompositionKt.rememberLottieComposition$lambda$1(this.$result$delegate).isComplete() && th != null) {
                    RememberLottieCompositionKt.rememberLottieComposition$lambda$1(this.$result$delegate).completeExceptionally$lottie_compose_release(th);
                }
                return Unit.INSTANCE;
            }
            i = this.I$0;
            th = (Throwable) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object lottieComposition(Context context, LottieCompositionSpec lottieCompositionSpec, String str, String str2, String str3, String str4, Continuation<? super LottieComposition> continuation) throws Throwable {
        C34631 c34631;
        String str5;
        String str6;
        Context context2;
        LottieComposition lottieComposition;
        if (continuation instanceof C34631) {
            c34631 = (C34631) continuation;
            int i = c34631.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34631.label = i - Integer.MIN_VALUE;
            } else {
                c34631 = new C34631(continuation);
            }
        }
        Object objAwait = c34631.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34631.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwait);
            LottieTask<LottieComposition> lottieTask = lottieTask(context, lottieCompositionSpec, str4, false);
            if (lottieTask == null) {
                throw new IllegalArgumentException(("Unable to create parsing task for " + lottieCompositionSpec + ".").toString());
            }
            c34631.L$0 = context;
            c34631.L$1 = str;
            c34631.L$2 = str2;
            c34631.L$3 = str3;
            c34631.label = 1;
            objAwait = await(lottieTask, c34631);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    LottieComposition lottieComposition2 = (LottieComposition) c34631.L$0;
                    ResultKt.throwOnFailure(objAwait);
                    return lottieComposition2;
                }
                lottieComposition = (LottieComposition) c34631.L$3;
                str6 = (String) c34631.L$2;
                str5 = (String) c34631.L$1;
                context2 = (Context) c34631.L$0;
                ResultKt.throwOnFailure(objAwait);
                c34631.L$0 = lottieComposition;
                c34631.L$1 = null;
                c34631.L$2 = null;
                c34631.L$3 = null;
                c34631.label = 3;
                return loadFontsFromAssets(context2, lottieComposition, str5, str6, c34631) != coroutine_suspended ? coroutine_suspended : lottieComposition;
            }
            str3 = (String) c34631.L$3;
            str2 = (String) c34631.L$2;
            str = (String) c34631.L$1;
            context = (Context) c34631.L$0;
            ResultKt.throwOnFailure(objAwait);
        }
        LottieComposition lottieComposition3 = (LottieComposition) objAwait;
        c34631.L$0 = context;
        c34631.L$1 = str2;
        c34631.L$2 = str3;
        c34631.L$3 = lottieComposition3;
        c34631.label = 2;
        if (loadImagesFromAssets(context, lottieComposition3, str, c34631) == coroutine_suspended) {
            return coroutine_suspended;
        }
        str5 = str2;
        str6 = str3;
        context2 = context;
        lottieComposition = lottieComposition3;
        c34631.L$0 = lottieComposition;
        c34631.L$1 = null;
        c34631.L$2 = null;
        c34631.L$3 = null;
        c34631.label = 3;
        if (loadFontsFromAssets(context2, lottieComposition, str5, str6, c34631) != coroutine_suspended) {
        }
    }

    public static final LottieTask<LottieComposition> lottieTask(Context context, LottieCompositionSpec lottieCompositionSpec, String str, boolean z) throws FileNotFoundException {
        if (lottieCompositionSpec instanceof LottieCompositionSpec.RawRes) {
            if (Intrinsics.areEqual(str, DefaultCacheKey)) {
                return LottieCompositionFactory.fromRawRes(context, ((LottieCompositionSpec.RawRes) lottieCompositionSpec).m14343unboximpl());
            }
            return LottieCompositionFactory.fromRawRes(context, ((LottieCompositionSpec.RawRes) lottieCompositionSpec).m14343unboximpl(), str);
        }
        if (lottieCompositionSpec instanceof LottieCompositionSpec.Url) {
            if (Intrinsics.areEqual(str, DefaultCacheKey)) {
                return LottieCompositionFactory.fromUrl(context, ((LottieCompositionSpec.Url) lottieCompositionSpec).m14350unboximpl());
            }
            return LottieCompositionFactory.fromUrl(context, ((LottieCompositionSpec.Url) lottieCompositionSpec).m14350unboximpl(), str);
        }
        if (lottieCompositionSpec instanceof LottieCompositionSpec.File) {
            if (z) {
                return null;
            }
            LottieCompositionSpec.File file = (LottieCompositionSpec.File) lottieCompositionSpec;
            FileInputStream fileInputStream = new FileInputStream(file.m14329unboximpl());
            if (StringsKt__StringsJVMKt.endsWith$default(file.m14329unboximpl(), ArchiveStreamFactory.ZIP, false, 2, null)) {
                ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
                if (Intrinsics.areEqual(str, DefaultCacheKey)) {
                    str = file.m14329unboximpl();
                }
                return LottieCompositionFactory.fromZipStream(zipInputStream, str);
            }
            if (Intrinsics.areEqual(str, DefaultCacheKey)) {
                str = file.m14329unboximpl();
            }
            return LottieCompositionFactory.fromJsonInputStream(fileInputStream, str);
        }
        if (lottieCompositionSpec instanceof LottieCompositionSpec.Asset) {
            if (Intrinsics.areEqual(str, DefaultCacheKey)) {
                return LottieCompositionFactory.fromAsset(context, ((LottieCompositionSpec.Asset) lottieCompositionSpec).m14315unboximpl());
            }
            return LottieCompositionFactory.fromAsset(context, ((LottieCompositionSpec.Asset) lottieCompositionSpec).m14315unboximpl(), str);
        }
        if (lottieCompositionSpec instanceof LottieCompositionSpec.JsonString) {
            if (Intrinsics.areEqual(str, DefaultCacheKey)) {
                str = String.valueOf(((LottieCompositionSpec.JsonString) lottieCompositionSpec).m14336unboximpl().hashCode());
            }
            return LottieCompositionFactory.fromJsonString(((LottieCompositionSpec.JsonString) lottieCompositionSpec).m14336unboximpl(), str);
        }
        if (!(lottieCompositionSpec instanceof LottieCompositionSpec.ContentProvider)) {
            throw new NoWhenBranchMatchedException();
        }
        LottieCompositionSpec.ContentProvider contentProvider = (LottieCompositionSpec.ContentProvider) lottieCompositionSpec;
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(contentProvider.m14322unboximpl());
        if (Intrinsics.areEqual(str, DefaultCacheKey)) {
            str = contentProvider.m14322unboximpl().toString();
        }
        return LottieCompositionFactory.fromJsonInputStream(inputStreamOpenInputStream, str);
    }

    public static final Object loadImagesFromAssets(Context context, LottieComposition lottieComposition, String str, Continuation<? super Unit> continuation) throws Throwable {
        if (!lottieComposition.hasImages()) {
            return Unit.INSTANCE;
        }
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C34622(lottieComposition, context, str, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* compiled from: rememberLottieComposition.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadImagesFromAssets$2", m7120f = "rememberLottieComposition.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.airbnb.lottie.compose.RememberLottieCompositionKt$loadImagesFromAssets$2 */
    public static final class C34622 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ LottieComposition $composition;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $imageAssetsFolder;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34622(LottieComposition lottieComposition, Context context, String str, Continuation<? super C34622> continuation) {
            super(2, continuation);
            this.$composition = lottieComposition;
            this.$context = context;
            this.$imageAssetsFolder = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C34622(this.$composition, this.$context, this.$imageAssetsFolder, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C34622) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            for (LottieImageAsset lottieImageAsset : this.$composition.getImages().values()) {
                Intrinsics.checkNotNull(lottieImageAsset);
                RememberLottieCompositionKt.maybeDecodeBase64Image(lottieImageAsset);
                RememberLottieCompositionKt.maybeLoadImageFromAsset(this.$context, lottieImageAsset, this.$imageAssetsFolder);
            }
            return Unit.INSTANCE;
        }
    }

    public static final void maybeLoadImageFromAsset(Context context, LottieImageAsset lottieImageAsset, String str) throws IOException {
        if (lottieImageAsset.getBitmap() != null || str == null) {
            return;
        }
        String fileName = lottieImageAsset.getFileName();
        try {
            InputStream inputStreamOpen = context.getAssets().open(str + fileName);
            Intrinsics.checkNotNull(inputStreamOpen);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                lottieImageAsset.setBitmap(Utils.resizeBitmapIfNeeded(BitmapFactory.decodeStream(inputStreamOpen, null, options), lottieImageAsset.getWidth(), lottieImageAsset.getHeight()));
            } catch (IllegalArgumentException e) {
                Logger.warning("Unable to decode image.", e);
            }
        } catch (IOException e2) {
            Logger.warning("Unable to open asset.", e2);
        }
    }

    public static final void maybeDecodeBase64Image(LottieImageAsset lottieImageAsset) {
        if (lottieImageAsset.getBitmap() != null) {
            return;
        }
        String fileName = lottieImageAsset.getFileName();
        Intrinsics.checkNotNull(fileName);
        if (!StringsKt__StringsJVMKt.startsWith$default(fileName, "data:", false, 2, null) || StringsKt__StringsKt.indexOf$default((CharSequence) fileName, "base64,", 0, false, 6, (Object) null) <= 0) {
            return;
        }
        try {
            String strSubstring = fileName.substring(StringsKt__StringsKt.indexOf$default((CharSequence) fileName, ',', 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            byte[] bArrDecode = Base64.decode(strSubstring, 0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = true;
            options.inDensity = 160;
            lottieImageAsset.setBitmap(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
        } catch (IllegalArgumentException e) {
            Logger.warning("data URL did not have correct base64 format.", e);
        }
    }

    /* compiled from: rememberLottieComposition.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadFontsFromAssets$2", m7120f = "rememberLottieComposition.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.airbnb.lottie.compose.RememberLottieCompositionKt$loadFontsFromAssets$2 */
    public static final class C34612 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ LottieComposition $composition;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $fontAssetsFolder;
        public final /* synthetic */ String $fontFileExtension;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34612(LottieComposition lottieComposition, Context context, String str, String str2, Continuation<? super C34612> continuation) {
            super(2, continuation);
            this.$composition = lottieComposition;
            this.$context = context;
            this.$fontAssetsFolder = str;
            this.$fontFileExtension = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C34612(this.$composition, this.$context, this.$fontAssetsFolder, this.$fontFileExtension, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C34612) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            for (Font font : this.$composition.getFonts().values()) {
                Context context = this.$context;
                Intrinsics.checkNotNull(font);
                RememberLottieCompositionKt.maybeLoadTypefaceFromAssets(context, font, this.$fontAssetsFolder, this.$fontFileExtension);
            }
            return Unit.INSTANCE;
        }
    }

    public static final Object loadFontsFromAssets(Context context, LottieComposition lottieComposition, String str, String str2, Continuation<? super Unit> continuation) {
        Object objWithContext;
        return (!lottieComposition.getFonts().isEmpty() && (objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C34612(lottieComposition, context, str, str2, null), continuation)) == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? objWithContext : Unit.INSTANCE;
    }

    public static final void maybeLoadTypefaceFromAssets(Context context, Font font, String str, String str2) {
        String str3 = str + font.getFamily() + str2;
        try {
            Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), str3);
            try {
                Intrinsics.checkNotNull(typefaceCreateFromAsset);
                String style = font.getStyle();
                Intrinsics.checkNotNullExpressionValue(style, "getStyle(...)");
                font.setTypeface(typefaceForStyle(typefaceCreateFromAsset, style));
            } catch (Exception e) {
                Logger.error("Failed to create " + font.getFamily() + " typeface with style=" + font.getStyle() + "!", e);
            }
        } catch (Exception e2) {
            Logger.error("Failed to find typeface in assets with path " + str3 + ".", e2);
        }
    }

    public static final Typeface typefaceForStyle(Typeface typeface, String str) {
        int i = 0;
        boolean zContains$default = StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "Italic", false, 2, (Object) null);
        boolean zContains$default2 = StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "Bold", false, 2, (Object) null);
        if (zContains$default && zContains$default2) {
            i = 3;
        } else if (zContains$default) {
            i = 2;
        } else if (zContains$default2) {
            i = 1;
        }
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }

    public static final String ensureTrailingSlash(String str) {
        if (str == null || StringsKt__StringsJVMKt.isBlank(str)) {
            return null;
        }
        if (StringsKt__StringsKt.endsWith$default((CharSequence) str, '/', false, 2, (Object) null)) {
            return str;
        }
        return str + "/";
    }

    public static final String ensureLeadingPeriod(String str) {
        if (StringsKt__StringsJVMKt.isBlank(str) || StringsKt__StringsJVMKt.startsWith$default(str, ".", false, 2, null)) {
            return str;
        }
        return "." + str;
    }

    public static final <T> Object await(LottieTask<T> lottieTask, Continuation<? super T> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        lottieTask.addListener(new LottieListener() { // from class: com.airbnb.lottie.compose.RememberLottieCompositionKt$await$2$1
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(T t) {
                if (cancellableContinuationImpl.isCompleted()) {
                    return;
                }
                CancellableContinuation<T> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m15699constructorimpl(t));
            }
        }).addFailureListener(new LottieListener() { // from class: com.airbnb.lottie.compose.RememberLottieCompositionKt$await$2$2
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(Throwable th) {
                if (cancellableContinuationImpl.isCompleted()) {
                    return;
                }
                CancellableContinuation<T> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.checkNotNull(th);
                cancellableContinuation.resumeWith(Result.m15699constructorimpl(ResultKt.createFailure(th)));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final LottieCompositionResultImpl rememberLottieComposition$lambda$1(MutableState<LottieCompositionResultImpl> mutableState) {
        return mutableState.getValue();
    }
}
