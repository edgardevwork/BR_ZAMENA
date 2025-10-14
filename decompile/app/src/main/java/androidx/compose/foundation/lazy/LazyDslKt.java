package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyDsl.kt */
@Metadata(m7104d1 = {"\u0000\u008c\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001al\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u0014\u001av\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\t2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u0016\u001al\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u001c\u001av\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\t2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u001d\u001a©\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 2%\b\n\u0010!\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u00112%\b\n\u0010&\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0\u001123\b\u0004\u0010'\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0086\b¢\u0006\u0002\u0010+\u001a\u0082\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 2%\b\n\u0010!\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u001123\b\u0004\u0010'\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0087\b¢\u0006\u0002\u0010,\u001a©\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0-2%\b\n\u0010!\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u00112%\b\n\u0010&\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0\u001123\b\u0004\u0010'\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0086\b¢\u0006\u0002\u0010.\u001a\u0082\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0-2%\b\n\u0010!\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u001123\b\u0004\u0010'\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0087\b¢\u0006\u0002\u0010/\u001aè\u0001\u00100\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 2:\b\n\u0010!\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2:\b\u0006\u0010&\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0(2H\b\u0004\u0010'\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0086\b¢\u0006\u0002\u00104\u001a¬\u0001\u00100\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 2:\b\n\u0010!\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2H\b\u0004\u0010'\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0087\b¢\u0006\u0002\u00105\u001aè\u0001\u00100\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0-2:\b\n\u0010!\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2:\b\u0006\u0010&\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0(2H\b\u0004\u0010'\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0086\b¢\u0006\u0002\u00106\u001a¬\u0001\u00100\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0-2:\b\n\u0010!\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2H\b\u0004\u0010'\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0087\b¢\u0006\u0002\u00107¨\u00068"}, m7105d2 = {"LazyColumn", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "userScrollEnabled", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LazyRow", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", FirebaseAnalytics.Param.ITEMS, ExifInterface.GPS_DIRECTION_TRUE, "", "key", "Lkotlin/ParameterName;", "name", "item", "", "contentType", "itemContent", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "itemsIndexed", "", FirebaseAnalytics.Param.INDEX, "Lkotlin/Function3;", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,426:1\n139#1,12:427\n174#1,12:439\n209#1,12:451\n244#1,12:463\n154#2:475\n154#2:476\n154#2:477\n154#2:478\n*S KotlinDebug\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n157#1:427,12\n192#1:439,12\n227#1:451,12\n262#1:463,12\n296#1:475\n352#1:476\n380#1:477\n406#1:478\n*E\n"})
/* loaded from: classes.dex */
public final class LazyDslKt {

    /* compiled from: LazyDsl.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1 */
    /* loaded from: classes2.dex */
    public static final class C06261 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function1<LazyListScope, Unit> $content;
        public final /* synthetic */ PaddingValues $contentPadding;
        public final /* synthetic */ FlingBehavior $flingBehavior;
        public final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
        public final /* synthetic */ boolean $reverseLayout;
        public final /* synthetic */ LazyListState $state;
        public final /* synthetic */ boolean $userScrollEnabled;
        public final /* synthetic */ Arrangement.Vertical $verticalArrangement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C06261(LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, Function1<? super LazyListScope, Unit> function1, int i, int i2) {
            super(2);
            lazyListState = lazyListState;
            paddingValues = paddingValues;
            z = z;
            vertical = vertical;
            horizontal = horizontal;
            flingBehavior = flingBehavior;
            z = z2;
            function1 = function1;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            LazyDslKt.LazyColumn(modifier, lazyListState, paddingValues, z, vertical, horizontal, flingBehavior, z, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$2 */
    /* loaded from: classes2.dex */
    public static final class C06272 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function1<LazyListScope, Unit> $content;
        public final /* synthetic */ PaddingValues $contentPadding;
        public final /* synthetic */ FlingBehavior $flingBehavior;
        public final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
        public final /* synthetic */ boolean $reverseLayout;
        public final /* synthetic */ LazyListState $state;
        public final /* synthetic */ Arrangement.Vertical $verticalArrangement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C06272(LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, Function1<? super LazyListScope, Unit> function1, int i, int i2) {
            super(2);
            lazyListState = lazyListState;
            paddingValues = paddingValues;
            z = z;
            vertical = vertical;
            horizontal = horizontal;
            flingBehavior = flingBehavior;
            function1 = function1;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            LazyDslKt.LazyColumn(modifier, lazyListState, paddingValues, z, vertical, horizontal, flingBehavior, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1 */
    /* loaded from: classes2.dex */
    public static final class C06281 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function1<LazyListScope, Unit> $content;
        public final /* synthetic */ PaddingValues $contentPadding;
        public final /* synthetic */ FlingBehavior $flingBehavior;
        public final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
        public final /* synthetic */ boolean $reverseLayout;
        public final /* synthetic */ LazyListState $state;
        public final /* synthetic */ boolean $userScrollEnabled;
        public final /* synthetic */ Alignment.Vertical $verticalAlignment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C06281(LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, boolean z2, Function1<? super LazyListScope, Unit> function1, int i, int i2) {
            super(2);
            lazyListState = lazyListState;
            paddingValues = paddingValues;
            z = z;
            horizontal = horizontal;
            vertical = vertical;
            flingBehavior = flingBehavior;
            z = z2;
            function1 = function1;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            LazyDslKt.LazyRow(modifier, lazyListState, paddingValues, z, horizontal, vertical, flingBehavior, z, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2 */
    /* loaded from: classes2.dex */
    public static final class C06292 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function1<LazyListScope, Unit> $content;
        public final /* synthetic */ PaddingValues $contentPadding;
        public final /* synthetic */ FlingBehavior $flingBehavior;
        public final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
        public final /* synthetic */ boolean $reverseLayout;
        public final /* synthetic */ LazyListState $state;
        public final /* synthetic */ Alignment.Vertical $verticalAlignment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C06292(LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, Function1<? super LazyListScope, Unit> function1, int i, int i2) {
            super(2);
            lazyListState = lazyListState;
            paddingValues = paddingValues;
            z = z;
            horizontal = horizontal;
            vertical = vertical;
            flingBehavior = flingBehavior;
            function1 = function1;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            LazyDslKt.LazyRow(modifier, lazyListState, paddingValues, z, horizontal, vertical, flingBehavior, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Void;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$1\n*L\n1#1,426:1\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$1 */
    /* loaded from: classes2.dex */
    public static final class C06301 extends Lambda implements Function1 {
        public static final C06301 INSTANCE = new C06301();

        public C06301() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Void invoke(Object obj) {
            return null;
        }
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Void;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$5\n*L\n1#1,426:1\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$5 */
    /* loaded from: classes2.dex */
    public static final class C06345 extends Lambda implements Function1 {
        public static final C06345 INSTANCE = new C06345();

        public C06345() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Void invoke(Object obj) {
            return null;
        }
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List list, Function1 function1, Function1 function12, Function4 function4, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function12 = C06301.INSTANCE;
        }
        lazyListScope.items(list.size(), function1 != null ? new C06312(function1, list) : null, new C06323(function12, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new C06334(function4, list)));
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, FirebaseAnalytics.Param.INDEX, "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$2\n*L\n1#1,426:1\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$2 */
    /* loaded from: classes2.dex */
    public static final class C06312 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ Function1<T, Object> $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C06312(Function1<? super T, ? extends Object> function1, List<? extends T> list) {
            super(1);
            this.$key = function1;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        @NotNull
        public final Object invoke(int i) {
            return this.$key.invoke(this.$items.get(i));
        }
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, FirebaseAnalytics.Param.INDEX, "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$3\n*L\n1#1,426:1\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$3 */
    /* loaded from: classes2.dex */
    public static final class C06323 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function1<T, Object> $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C06323(Function1<? super T, ? extends Object> function1, List<? extends T> list) {
            super(1);
            this.$contentType = function1;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        @Nullable
        public final Object invoke(int i) {
            return this.$contentType.invoke(this.$items.get(i));
        }
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(@NotNull LazyListScope lazyListScope, @NotNull List<? extends T> list, @Nullable Function1<? super T, ? extends Object> function1, @NotNull Function1<? super T, ? extends Object> function12, @NotNull Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4) {
        lazyListScope.items(list.size(), function1 != null ? new C06312(function1, list) : null, new C06323(function12, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new C06334(function4, list)));
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(m7104d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/LazyItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$4\n*L\n1#1,426:1\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$4 */
    /* loaded from: classes2.dex */
    public static final class C06334 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function4<LazyItemScope, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C06334(Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4, List<? extends T> list) {
            super(4);
            this.$itemContent = function4;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        public final void invoke(@NotNull LazyItemScope lazyItemScope, int i, @Nullable Composer composer, int i2) {
            int i3;
            if ((i2 & 14) == 0) {
                i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 112) == 0) {
                i3 |= composer.changed(i) ? 32 : 16;
            }
            if ((i3 & 731) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
            }
            this.$itemContent.invoke(lazyItemScope, this.$items.get(i), composer, Integer.valueOf(i3 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(m7104d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "<anonymous parameter 0>", "", "<anonymous parameter 1>", "invoke", "(ILjava/lang/Object;)Ljava/lang/Void;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$1\n*L\n1#1,426:1\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$1 */
    /* loaded from: classes2.dex */
    public static final class C06381 extends Lambda implements Function2 {
        public static final C06381 INSTANCE = ;

        @Nullable
        public final Void invoke(int i, Object obj) {
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), obj2);
        }
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List list, Function2 function2, Function2 function22, Function5 function5, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            function22 = C06381.INSTANCE;
        }
        lazyListScope.items(list.size(), function2 != null ? new C06392(function2, list) : null, new C06403(function22, list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new C06414(function5, list)));
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, FirebaseAnalytics.Param.INDEX, "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$2\n*L\n1#1,426:1\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$2 */
    /* loaded from: classes2.dex */
    public static final class C06392 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ Function2<Integer, T, Object> $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C06392(Function2<? super Integer, ? super T, ? extends Object> function2, List<? extends T> list) {
            super(1);
            this.$key = function2;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        @NotNull
        public final Object invoke(int i) {
            return this.$key.invoke(Integer.valueOf(i), this.$items.get(i));
        }
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, FirebaseAnalytics.Param.INDEX, "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$3\n*L\n1#1,426:1\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$3 */
    /* loaded from: classes2.dex */
    public static final class C06403 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function2<Integer, T, Object> $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C06403(Function2<? super Integer, ? super T, ? extends Object> function2, List<? extends T> list) {
            super(1);
            this.$contentType = function2;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        @Nullable
        public final Object invoke(int i) {
            return this.$contentType.invoke(Integer.valueOf(i), this.$items.get(i));
        }
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(@NotNull LazyListScope lazyListScope, @NotNull List<? extends T> list, @Nullable Function2<? super Integer, ? super T, ? extends Object> function2, @NotNull Function2<? super Integer, ? super T, ? extends Object> function22, @NotNull Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5) {
        lazyListScope.items(list.size(), function2 != null ? new C06392(function2, list) : null, new C06403(function22, list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new C06414(function5, list)));
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(m7104d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/LazyItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$4\n*L\n1#1,426:1\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$4 */
    /* loaded from: classes2.dex */
    public static final class C06414 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function5<LazyItemScope, Integer, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C06414(Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5, List<? extends T> list) {
            super(4);
            this.$itemContent = function5;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        public final void invoke(@NotNull LazyItemScope lazyItemScope, int i, @Nullable Composer composer, int i2) {
            int i3;
            if ((i2 & 14) == 0) {
                i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 112) == 0) {
                i3 |= composer.changed(i) ? 32 : 16;
            }
            if ((i3 & 731) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:183)");
            }
            this.$itemContent.invoke(lazyItemScope, Integer.valueOf(i), this.$items.get(i), composer, Integer.valueOf(i3 & 126));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] objArr, Function1 function1, Function1 function12, Function4 function4, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function12 = C06345.INSTANCE;
        }
        lazyListScope.items(objArr.length, function1 != null ? new C06356(function1, objArr) : null, new C06367(function12, objArr), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new C06378(function4, objArr)));
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, FirebaseAnalytics.Param.INDEX, "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$6\n*L\n1#1,426:1\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$6 */
    /* loaded from: classes2.dex */
    public static final class C06356 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ T[] $items;
        final /* synthetic */ Function1<T, Object> $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C06356(Function1<? super T, ? extends Object> function1, T[] tArr) {
            super(1);
            this.$key = function1;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        @NotNull
        public final Object invoke(int i) {
            return this.$key.invoke(this.$items[i]);
        }
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, FirebaseAnalytics.Param.INDEX, "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$7\n*L\n1#1,426:1\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$7 */
    /* loaded from: classes2.dex */
    public static final class C06367 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function1<T, Object> $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C06367(Function1<? super T, ? extends Object> function1, T[] tArr) {
            super(1);
            this.$contentType = function1;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        @Nullable
        public final Object invoke(int i) {
            return this.$contentType.invoke(this.$items[i]);
        }
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(@NotNull LazyListScope lazyListScope, @NotNull T[] tArr, @Nullable Function1<? super T, ? extends Object> function1, @NotNull Function1<? super T, ? extends Object> function12, @NotNull Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4) {
        lazyListScope.items(tArr.length, function1 != null ? new C06356(function1, tArr) : null, new C06367(function12, tArr), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new C06378(function4, tArr)));
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(m7104d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/LazyItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$8\n*L\n1#1,426:1\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$8 */
    /* loaded from: classes2.dex */
    public static final class C06378 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function4<LazyItemScope, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C06378(Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4, T[] tArr) {
            super(4);
            this.$itemContent = function4;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        public final void invoke(@NotNull LazyItemScope lazyItemScope, int i, @Nullable Composer composer, int i2) {
            int i3;
            if ((i2 & 14) == 0) {
                i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 112) == 0) {
                i3 |= composer.changed(i) ? 32 : 16;
            }
            if ((i3 & 731) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1043393750, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:218)");
            }
            this.$itemContent.invoke(lazyItemScope, this.$items[i], composer, Integer.valueOf(i3 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(m7104d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "<anonymous parameter 0>", "", "<anonymous parameter 1>", "invoke", "(ILjava/lang/Object;)Ljava/lang/Void;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$5\n*L\n1#1,426:1\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$5 */
    /* loaded from: classes2.dex */
    public static final class C06425 extends Lambda implements Function2 {
        public static final C06425 INSTANCE = ;

        @Nullable
        public final Void invoke(int i, Object obj) {
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), obj2);
        }
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] objArr, Function2 function2, Function2 function22, Function5 function5, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            function22 = C06425.INSTANCE;
        }
        lazyListScope.items(objArr.length, function2 != null ? new C06436(function2, objArr) : null, new C06447(function22, objArr), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new C06458(function5, objArr)));
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, FirebaseAnalytics.Param.INDEX, "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$6\n*L\n1#1,426:1\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$6 */
    /* loaded from: classes2.dex */
    public static final class C06436 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ T[] $items;
        final /* synthetic */ Function2<Integer, T, Object> $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C06436(Function2<? super Integer, ? super T, ? extends Object> function2, T[] tArr) {
            super(1);
            this.$key = function2;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        @NotNull
        public final Object invoke(int i) {
            return this.$key.invoke(Integer.valueOf(i), this.$items[i]);
        }
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, FirebaseAnalytics.Param.INDEX, "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$7\n*L\n1#1,426:1\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$7 */
    /* loaded from: classes2.dex */
    public static final class C06447 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function2<Integer, T, Object> $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C06447(Function2<? super Integer, ? super T, ? extends Object> function2, T[] tArr) {
            super(1);
            this.$contentType = function2;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        @Nullable
        public final Object invoke(int i) {
            return this.$contentType.invoke(Integer.valueOf(i), this.$items[i]);
        }
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(@NotNull LazyListScope lazyListScope, @NotNull T[] tArr, @Nullable Function2<? super Integer, ? super T, ? extends Object> function2, @NotNull Function2<? super Integer, ? super T, ? extends Object> function22, @NotNull Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5) {
        lazyListScope.items(tArr.length, function2 != null ? new C06436(function2, tArr) : null, new C06447(function22, tArr), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new C06458(function5, tArr)));
    }

    /* compiled from: LazyDsl.kt */
    @Metadata(m7104d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/LazyItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$8\n*L\n1#1,426:1\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$8 */
    /* loaded from: classes2.dex */
    public static final class C06458 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function5<LazyItemScope, Integer, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C06458(Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5, T[] tArr) {
            super(4);
            this.$itemContent = function5;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        public final void invoke(@NotNull LazyItemScope lazyItemScope, int i, @Nullable Composer composer, int i2) {
            int i3;
            if ((i2 & 14) == 0) {
                i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 112) == 0) {
                i3 |= composer.changed(i) ? 32 : 16;
            }
            if ((i3 & 731) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1600639390, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:253)");
            }
            this.$itemContent.invoke(lazyItemScope, Integer.valueOf(i), this.$items[i], composer, Integer.valueOf(i3 & 126));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:325:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyRow(@Nullable Modifier modifier, @Nullable LazyListState lazyListState, @Nullable PaddingValues paddingValues, boolean z, @Nullable Arrangement.Horizontal horizontal, @Nullable Alignment.Vertical vertical, @Nullable FlingBehavior flingBehavior, boolean z2, @NotNull Function1<? super LazyListScope, Unit> function1, @Nullable Composer composer, int i, int i2) {
        int i3;
        PaddingValues paddingValues2;
        int i4;
        boolean z3;
        Arrangement.Horizontal horizontal2;
        int i5;
        Alignment.Vertical vertical2;
        FlingBehavior flingBehavior2;
        int i6;
        Modifier modifier2;
        LazyListState lazyListStateRememberLazyListState;
        PaddingValues paddingValuesM8116PaddingValues0680j_4;
        boolean z4;
        Arrangement.Horizontal start;
        Alignment.Vertical top;
        FlingBehavior flingBehavior3;
        boolean z5;
        boolean z6;
        Arrangement.Horizontal horizontal3;
        FlingBehavior flingBehavior4;
        boolean z7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1724297413);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changed(lazyListState)) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else {
            if ((i & 896) == 0) {
                paddingValues2 = paddingValues;
                i3 |= composerStartRestartGroup.changed(paddingValues2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 7168) == 0) {
                    z3 = z;
                    i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                }
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        horizontal2 = horizontal;
                        int i9 = composerStartRestartGroup.changed(horizontal2) ? 16384 : 8192;
                        i3 |= i9;
                    } else {
                        horizontal2 = horizontal;
                    }
                    i3 |= i9;
                } else {
                    horizontal2 = horizontal;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                } else {
                    if ((i & 458752) == 0) {
                        vertical2 = vertical;
                        i3 |= composerStartRestartGroup.changed(vertical2) ? 131072 : 65536;
                    }
                    if ((i & 3670016) != 0) {
                        flingBehavior2 = flingBehavior;
                        i3 |= ((i2 & 64) == 0 && composerStartRestartGroup.changed(flingBehavior2)) ? 1048576 : 524288;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i3 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
                    }
                    if ((i2 & 256) != 0) {
                        if ((234881024 & i) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function1) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                        }
                        if ((i3 & 191739611) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                modifier2 = i7 == 0 ? Modifier.INSTANCE : modifier;
                                if ((i2 & 2) == 0) {
                                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                    i3 &= -113;
                                } else {
                                    lazyListStateRememberLazyListState = lazyListState;
                                }
                                paddingValuesM8116PaddingValues0680j_4 = i8 == 0 ? PaddingKt.m8116PaddingValues0680j_4(C2046Dp.m13666constructorimpl(0)) : paddingValues2;
                                z4 = i4 == 0 ? z3 : false;
                                if ((i2 & 16) == 0) {
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    start = !z4 ? arrangement.getStart() : arrangement.getEnd();
                                    i3 &= -57345;
                                } else {
                                    start = horizontal2;
                                }
                                top = i5 == 0 ? Alignment.INSTANCE.getTop() : vertical2;
                                if ((i2 & 64) == 0) {
                                    flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    flingBehavior3 = flingBehavior2;
                                }
                                z5 = i6 == 0 ? true : z2;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 2) != 0) {
                                    i3 &= -113;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                modifier2 = modifier;
                                lazyListStateRememberLazyListState = lazyListState;
                                z5 = z2;
                                paddingValuesM8116PaddingValues0680j_4 = paddingValues2;
                                z4 = z3;
                                start = horizontal2;
                                flingBehavior3 = flingBehavior2;
                                top = vertical2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:303)");
                            }
                            int i10 = i3 >> 3;
                            LazyListKt.LazyList(modifier2, lazyListStateRememberLazyListState, paddingValuesM8116PaddingValues0680j_4, z4, false, flingBehavior3, z5, 0, null, null, top, start, function1, composerStartRestartGroup, (i3 & 14) | CpioConstants.C_ISBLK | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i10) | (i10 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z6 = z4;
                            horizontal3 = start;
                            flingBehavior4 = flingBehavior3;
                            z7 = z5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            lazyListStateRememberLazyListState = lazyListState;
                            paddingValuesM8116PaddingValues0680j_4 = paddingValues2;
                            z6 = z3;
                            horizontal3 = horizontal2;
                            flingBehavior4 = flingBehavior2;
                            top = vertical2;
                            z7 = z2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.1
                                public final /* synthetic */ int $$changed;
                                public final /* synthetic */ int $$default;
                                public final /* synthetic */ Function1<LazyListScope, Unit> $content;
                                public final /* synthetic */ PaddingValues $contentPadding;
                                public final /* synthetic */ FlingBehavior $flingBehavior;
                                public final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
                                public final /* synthetic */ boolean $reverseLayout;
                                public final /* synthetic */ LazyListState $state;
                                public final /* synthetic */ boolean $userScrollEnabled;
                                public final /* synthetic */ Alignment.Vertical $verticalAlignment;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C06281(LazyListState lazyListStateRememberLazyListState2, PaddingValues paddingValuesM8116PaddingValues0680j_42, boolean z62, Arrangement.Horizontal horizontal32, Alignment.Vertical top2, FlingBehavior flingBehavior42, boolean z72, Function1<? super LazyListScope, Unit> function12, int i11, int i22) {
                                    super(2);
                                    lazyListState = lazyListStateRememberLazyListState2;
                                    paddingValues = paddingValuesM8116PaddingValues0680j_42;
                                    z = z62;
                                    horizontal = horizontal32;
                                    vertical = top2;
                                    flingBehavior = flingBehavior42;
                                    z = z72;
                                    function1 = function12;
                                    i = i11;
                                    i = i22;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i11) {
                                    LazyDslKt.LazyRow(modifier, lazyListState, paddingValues, z, horizontal, vertical, flingBehavior, z, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 100663296;
                    if ((i3 & 191739611) != 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i11 & 1) != 0) {
                            if (i7 == 0) {
                            }
                            if ((i22 & 2) == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i4 == 0) {
                            }
                            if ((i22 & 16) == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if ((i22 & 64) == 0) {
                            }
                            if (i6 == 0) {
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i102 = i3 >> 3;
                            LazyListKt.LazyList(modifier2, lazyListStateRememberLazyListState2, paddingValuesM8116PaddingValues0680j_42, z4, false, flingBehavior3, z5, 0, null, null, top2, start, function12, composerStartRestartGroup, (i3 & 14) | CpioConstants.C_ISBLK | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i102) | (i102 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z62 = z4;
                            horizontal32 = start;
                            flingBehavior42 = flingBehavior3;
                            z72 = z5;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                vertical2 = vertical;
                if ((i11 & 3670016) != 0) {
                }
                i6 = i22 & 128;
                if (i6 == 0) {
                }
                if ((i22 & 256) != 0) {
                }
                if ((i3 & 191739611) != 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z3 = z;
            if ((57344 & i11) == 0) {
            }
            i5 = i22 & 32;
            if (i5 != 0) {
            }
            vertical2 = vertical;
            if ((i11 & 3670016) != 0) {
            }
            i6 = i22 & 128;
            if (i6 == 0) {
            }
            if ((i22 & 256) != 0) {
            }
            if ((i3 & 191739611) != 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        paddingValues2 = paddingValues;
        i4 = i22 & 8;
        if (i4 == 0) {
        }
        z3 = z;
        if ((57344 & i11) == 0) {
        }
        i5 = i22 & 32;
        if (i5 != 0) {
        }
        vertical2 = vertical;
        if ((i11 & 3670016) != 0) {
        }
        i6 = i22 & 128;
        if (i6 == 0) {
        }
        if ((i22 & 256) != 0) {
        }
        if ((i3 & 191739611) != 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:325:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyColumn(@Nullable Modifier modifier, @Nullable LazyListState lazyListState, @Nullable PaddingValues paddingValues, boolean z, @Nullable Arrangement.Vertical vertical, @Nullable Alignment.Horizontal horizontal, @Nullable FlingBehavior flingBehavior, boolean z2, @NotNull Function1<? super LazyListScope, Unit> function1, @Nullable Composer composer, int i, int i2) {
        int i3;
        PaddingValues paddingValues2;
        int i4;
        boolean z3;
        Arrangement.Vertical vertical2;
        int i5;
        Alignment.Horizontal horizontal2;
        FlingBehavior flingBehavior2;
        int i6;
        Modifier modifier2;
        LazyListState lazyListStateRememberLazyListState;
        PaddingValues paddingValuesM8116PaddingValues0680j_4;
        boolean z4;
        Arrangement.Vertical top;
        Alignment.Horizontal start;
        FlingBehavior flingBehavior3;
        boolean z5;
        boolean z6;
        Arrangement.Vertical vertical3;
        FlingBehavior flingBehavior4;
        boolean z7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-740714857);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changed(lazyListState)) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else {
            if ((i & 896) == 0) {
                paddingValues2 = paddingValues;
                i3 |= composerStartRestartGroup.changed(paddingValues2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 7168) == 0) {
                    z3 = z;
                    i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                }
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        vertical2 = vertical;
                        int i9 = composerStartRestartGroup.changed(vertical2) ? 16384 : 8192;
                        i3 |= i9;
                    } else {
                        vertical2 = vertical;
                    }
                    i3 |= i9;
                } else {
                    vertical2 = vertical;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                } else {
                    if ((i & 458752) == 0) {
                        horizontal2 = horizontal;
                        i3 |= composerStartRestartGroup.changed(horizontal2) ? 131072 : 65536;
                    }
                    if ((i & 3670016) != 0) {
                        flingBehavior2 = flingBehavior;
                        i3 |= ((i2 & 64) == 0 && composerStartRestartGroup.changed(flingBehavior2)) ? 1048576 : 524288;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i3 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
                    }
                    if ((i2 & 256) != 0) {
                        if ((i & 234881024) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function1) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                        }
                        if ((i3 & 191739611) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                modifier2 = i7 == 0 ? Modifier.INSTANCE : modifier;
                                if ((i2 & 2) == 0) {
                                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                    i3 &= -113;
                                } else {
                                    lazyListStateRememberLazyListState = lazyListState;
                                }
                                paddingValuesM8116PaddingValues0680j_4 = i8 == 0 ? PaddingKt.m8116PaddingValues0680j_4(C2046Dp.m13666constructorimpl(0)) : paddingValues2;
                                z4 = i4 == 0 ? z3 : false;
                                if ((i2 & 16) == 0) {
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    top = !z4 ? arrangement.getTop() : arrangement.getBottom();
                                    i3 &= -57345;
                                } else {
                                    top = vertical2;
                                }
                                start = i5 == 0 ? Alignment.INSTANCE.getStart() : horizontal2;
                                if ((i2 & 64) == 0) {
                                    flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    flingBehavior3 = flingBehavior2;
                                }
                                z5 = i6 == 0 ? true : z2;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 2) != 0) {
                                    i3 &= -113;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                modifier2 = modifier;
                                lazyListStateRememberLazyListState = lazyListState;
                                z5 = z2;
                                paddingValuesM8116PaddingValues0680j_4 = paddingValues2;
                                z4 = z3;
                                top = vertical2;
                                flingBehavior3 = flingBehavior2;
                                start = horizontal2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:359)");
                            }
                            int i10 = i3 >> 3;
                            LazyListKt.LazyList(modifier2, lazyListStateRememberLazyListState, paddingValuesM8116PaddingValues0680j_4, z4, true, flingBehavior3, z5, 0, start, top, null, null, function1, composerStartRestartGroup, (i3 & 14) | CpioConstants.C_ISBLK | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i10) | (i10 & 3670016) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z6 = z4;
                            vertical3 = top;
                            flingBehavior4 = flingBehavior3;
                            z7 = z5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            lazyListStateRememberLazyListState = lazyListState;
                            paddingValuesM8116PaddingValues0680j_4 = paddingValues2;
                            z6 = z3;
                            vertical3 = vertical2;
                            flingBehavior4 = flingBehavior2;
                            start = horizontal2;
                            z7 = z2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.1
                                public final /* synthetic */ int $$changed;
                                public final /* synthetic */ int $$default;
                                public final /* synthetic */ Function1<LazyListScope, Unit> $content;
                                public final /* synthetic */ PaddingValues $contentPadding;
                                public final /* synthetic */ FlingBehavior $flingBehavior;
                                public final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
                                public final /* synthetic */ boolean $reverseLayout;
                                public final /* synthetic */ LazyListState $state;
                                public final /* synthetic */ boolean $userScrollEnabled;
                                public final /* synthetic */ Arrangement.Vertical $verticalArrangement;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C06261(LazyListState lazyListStateRememberLazyListState2, PaddingValues paddingValuesM8116PaddingValues0680j_42, boolean z62, Arrangement.Vertical vertical32, Alignment.Horizontal start2, FlingBehavior flingBehavior42, boolean z72, Function1<? super LazyListScope, Unit> function12, int i11, int i22) {
                                    super(2);
                                    lazyListState = lazyListStateRememberLazyListState2;
                                    paddingValues = paddingValuesM8116PaddingValues0680j_42;
                                    z = z62;
                                    vertical = vertical32;
                                    horizontal = start2;
                                    flingBehavior = flingBehavior42;
                                    z = z72;
                                    function1 = function12;
                                    i = i11;
                                    i = i22;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i11) {
                                    LazyDslKt.LazyColumn(modifier, lazyListState, paddingValues, z, vertical, horizontal, flingBehavior, z, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 100663296;
                    if ((i3 & 191739611) != 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i11 & 1) != 0) {
                            if (i7 == 0) {
                            }
                            if ((i22 & 2) == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i4 == 0) {
                            }
                            if ((i22 & 16) == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if ((i22 & 64) == 0) {
                            }
                            if (i6 == 0) {
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i102 = i3 >> 3;
                            LazyListKt.LazyList(modifier2, lazyListStateRememberLazyListState2, paddingValuesM8116PaddingValues0680j_42, z4, true, flingBehavior3, z5, 0, start2, top, null, null, function12, composerStartRestartGroup, (i3 & 14) | CpioConstants.C_ISBLK | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i102) | (i102 & 3670016) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z62 = z4;
                            vertical32 = top;
                            flingBehavior42 = flingBehavior3;
                            z72 = z5;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                horizontal2 = horizontal;
                if ((i11 & 3670016) != 0) {
                }
                i6 = i22 & 128;
                if (i6 == 0) {
                }
                if ((i22 & 256) != 0) {
                }
                if ((i3 & 191739611) != 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z3 = z;
            if ((57344 & i11) == 0) {
            }
            i5 = i22 & 32;
            if (i5 != 0) {
            }
            horizontal2 = horizontal;
            if ((i11 & 3670016) != 0) {
            }
            i6 = i22 & 128;
            if (i6 == 0) {
            }
            if ((i22 & 256) != 0) {
            }
            if ((i3 & 191739611) != 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        paddingValues2 = paddingValues;
        i4 = i22 & 8;
        if (i4 == 0) {
        }
        z3 = z;
        if ((57344 & i11) == 0) {
        }
        i5 = i22 & 32;
        if (i5 != 0) {
        }
        horizontal2 = horizontal;
        if ((i11 & 3670016) != 0) {
        }
        i6 = i22 & 128;
        if (i6 == 0) {
        }
        if ((i22 & 256) != 0) {
        }
        if ((i3 & 191739611) != 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:287:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void LazyColumn(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, Function1 function1, Composer composer, int i, int i2) {
        int i3;
        LazyListState lazyListStateRememberLazyListState;
        PaddingValues paddingValuesM8116PaddingValues0680j_4;
        int i4;
        boolean z2;
        Arrangement.Vertical top;
        int i5;
        Alignment.Horizontal start;
        FlingBehavior flingBehavior2;
        FlingBehavior flingBehavior3;
        boolean z3;
        Alignment.Horizontal horizontal2;
        Modifier modifier2;
        PaddingValues paddingValues2;
        FlingBehavior flingBehavior4;
        boolean z4;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-563353797);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                lazyListStateRememberLazyListState = lazyListState;
                int i7 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) ? 32 : 16;
                i3 |= i7;
            } else {
                lazyListStateRememberLazyListState = lazyListState;
            }
            i3 |= i7;
        } else {
            lazyListStateRememberLazyListState = lazyListState;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else {
            if ((i & 896) == 0) {
                paddingValuesM8116PaddingValues0680j_4 = paddingValues;
                i3 |= composerStartRestartGroup.changed(paddingValuesM8116PaddingValues0680j_4) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 7168) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((i & 57344) == 0) {
                    if ((i2 & 16) == 0) {
                        top = vertical;
                        int i9 = composerStartRestartGroup.changed(top) ? 16384 : 8192;
                        i3 |= i9;
                    } else {
                        top = vertical;
                    }
                    i3 |= i9;
                } else {
                    top = vertical;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    start = horizontal;
                } else {
                    start = horizontal;
                    if ((i & 458752) == 0) {
                        i3 |= composerStartRestartGroup.changed(start) ? 131072 : 65536;
                    }
                }
                if ((i & 3670016) == 0) {
                    flingBehavior2 = flingBehavior;
                    i3 |= ((i2 & 64) == 0 && composerStartRestartGroup.changed(flingBehavior2)) ? 1048576 : 524288;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if ((i2 & 128) == 0) {
                    if ((29360128 & i) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function1) ? 8388608 : 4194304;
                    }
                    if ((i3 & 23967451) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            modifier = i6 == 0 ? Modifier.INSTANCE : modifier;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            }
                            if (i8 != 0) {
                                paddingValuesM8116PaddingValues0680j_4 = PaddingKt.m8116PaddingValues0680j_4(C2046Dp.m13666constructorimpl(0));
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                Arrangement arrangement = Arrangement.INSTANCE;
                                top = !z2 ? arrangement.getTop() : arrangement.getBottom();
                                i3 &= -57345;
                            }
                            if (i5 != 0) {
                                start = Alignment.INSTANCE.getStart();
                            }
                            if ((i2 & 64) == 0) {
                                i3 &= -3670017;
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                z3 = z2;
                                horizontal2 = start;
                                modifier2 = modifier;
                            }
                            int i10 = i3;
                            Arrangement.Vertical vertical2 = top;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-563353797, i10, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:386)");
                            }
                            LazyColumn(modifier2, lazyListStateRememberLazyListState, paddingValuesM8116PaddingValues0680j_4, z3, vertical2, horizontal2, flingBehavior3, true, function1, composerStartRestartGroup, (i10 & 14) | 12582912 | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (i10 & 3670016) | ((i10 << 3) & 234881024), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            top = vertical2;
                            paddingValues2 = paddingValuesM8116PaddingValues0680j_4;
                            flingBehavior4 = flingBehavior3;
                            z4 = z3;
                            modifier3 = modifier2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                        }
                        modifier2 = modifier;
                        z3 = z2;
                        flingBehavior3 = flingBehavior2;
                        horizontal2 = start;
                        int i102 = i3;
                        Arrangement.Vertical vertical22 = top;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        LazyColumn(modifier2, lazyListStateRememberLazyListState, paddingValuesM8116PaddingValues0680j_4, z3, vertical22, horizontal2, flingBehavior3, true, function1, composerStartRestartGroup, (i102 & 14) | 12582912 | (i102 & 112) | (i102 & 896) | (i102 & 7168) | (57344 & i102) | (458752 & i102) | (i102 & 3670016) | ((i102 << 3) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        top = vertical22;
                        paddingValues2 = paddingValuesM8116PaddingValues0680j_4;
                        flingBehavior4 = flingBehavior3;
                        z4 = z3;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        paddingValues2 = paddingValuesM8116PaddingValues0680j_4;
                        z4 = z2;
                        flingBehavior4 = flingBehavior2;
                        horizontal2 = start;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.2
                            public final /* synthetic */ int $$changed;
                            public final /* synthetic */ int $$default;
                            public final /* synthetic */ Function1<LazyListScope, Unit> $content;
                            public final /* synthetic */ PaddingValues $contentPadding;
                            public final /* synthetic */ FlingBehavior $flingBehavior;
                            public final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
                            public final /* synthetic */ boolean $reverseLayout;
                            public final /* synthetic */ LazyListState $state;
                            public final /* synthetic */ Arrangement.Vertical $verticalArrangement;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public C06272(LazyListState lazyListStateRememberLazyListState2, PaddingValues paddingValues22, boolean z42, Arrangement.Vertical top2, Alignment.Horizontal horizontal22, FlingBehavior flingBehavior42, Function1<? super LazyListScope, Unit> function12, int i11, int i22) {
                                super(2);
                                lazyListState = lazyListStateRememberLazyListState2;
                                paddingValues = paddingValues22;
                                z = z42;
                                vertical = top2;
                                horizontal = horizontal22;
                                flingBehavior = flingBehavior42;
                                function1 = function12;
                                i = i11;
                                i = i22;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i11) {
                                LazyDslKt.LazyColumn(modifier, lazyListState, paddingValues, z, vertical, horizontal, flingBehavior, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 12582912;
                if ((i3 & 23967451) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        modifier = i6 == 0 ? Modifier.INSTANCE : modifier;
                        if ((i22 & 2) != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if ((i22 & 16) != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if ((i22 & 64) == 0) {
                            modifier2 = modifier;
                            z3 = z2;
                            flingBehavior3 = flingBehavior2;
                            horizontal22 = start;
                        }
                        int i1022 = i3;
                        Arrangement.Vertical vertical222 = top2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        LazyColumn(modifier2, lazyListStateRememberLazyListState2, paddingValuesM8116PaddingValues0680j_4, z3, vertical222, horizontal22, flingBehavior3, true, function12, composerStartRestartGroup, (i1022 & 14) | 12582912 | (i1022 & 112) | (i1022 & 896) | (i1022 & 7168) | (57344 & i1022) | (458752 & i1022) | (i1022 & 3670016) | ((i1022 << 3) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        top2 = vertical222;
                        paddingValues22 = paddingValuesM8116PaddingValues0680j_4;
                        flingBehavior42 = flingBehavior3;
                        z42 = z3;
                        modifier3 = modifier2;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i11 & 57344) == 0) {
            }
            i5 = i22 & 32;
            if (i5 != 0) {
            }
            if ((i11 & 3670016) == 0) {
            }
            if ((i22 & 128) == 0) {
            }
            if ((i3 & 23967451) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        paddingValuesM8116PaddingValues0680j_4 = paddingValues;
        i4 = i22 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i11 & 57344) == 0) {
        }
        i5 = i22 & 32;
        if (i5 != 0) {
        }
        if ((i11 & 3670016) == 0) {
        }
        if ((i22 & 128) == 0) {
        }
        if ((i3 & 23967451) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:287:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void LazyRow(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, Function1 function1, Composer composer, int i, int i2) {
        int i3;
        LazyListState lazyListStateRememberLazyListState;
        PaddingValues paddingValuesM8116PaddingValues0680j_4;
        int i4;
        boolean z2;
        Arrangement.Horizontal start;
        int i5;
        Alignment.Vertical top;
        FlingBehavior flingBehavior2;
        FlingBehavior flingBehavior3;
        boolean z3;
        Alignment.Vertical vertical2;
        Modifier modifier2;
        PaddingValues paddingValues2;
        FlingBehavior flingBehavior4;
        boolean z4;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(407929823);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                lazyListStateRememberLazyListState = lazyListState;
                int i7 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) ? 32 : 16;
                i3 |= i7;
            } else {
                lazyListStateRememberLazyListState = lazyListState;
            }
            i3 |= i7;
        } else {
            lazyListStateRememberLazyListState = lazyListState;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else {
            if ((i & 896) == 0) {
                paddingValuesM8116PaddingValues0680j_4 = paddingValues;
                i3 |= composerStartRestartGroup.changed(paddingValuesM8116PaddingValues0680j_4) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 7168) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((i & 57344) == 0) {
                    if ((i2 & 16) == 0) {
                        start = horizontal;
                        int i9 = composerStartRestartGroup.changed(start) ? 16384 : 8192;
                        i3 |= i9;
                    } else {
                        start = horizontal;
                    }
                    i3 |= i9;
                } else {
                    start = horizontal;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    top = vertical;
                } else {
                    top = vertical;
                    if ((i & 458752) == 0) {
                        i3 |= composerStartRestartGroup.changed(top) ? 131072 : 65536;
                    }
                }
                if ((i & 3670016) == 0) {
                    flingBehavior2 = flingBehavior;
                    i3 |= ((i2 & 64) == 0 && composerStartRestartGroup.changed(flingBehavior2)) ? 1048576 : 524288;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if ((i2 & 128) == 0) {
                    if ((29360128 & i) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function1) ? 8388608 : 4194304;
                    }
                    if ((i3 & 23967451) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            modifier = i6 == 0 ? Modifier.INSTANCE : modifier;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            }
                            if (i8 != 0) {
                                paddingValuesM8116PaddingValues0680j_4 = PaddingKt.m8116PaddingValues0680j_4(C2046Dp.m13666constructorimpl(0));
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                Arrangement arrangement = Arrangement.INSTANCE;
                                start = !z2 ? arrangement.getStart() : arrangement.getEnd();
                                i3 &= -57345;
                            }
                            if (i5 != 0) {
                                top = Alignment.INSTANCE.getTop();
                            }
                            if ((i2 & 64) == 0) {
                                i3 &= -3670017;
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                z3 = z2;
                                vertical2 = top;
                                modifier2 = modifier;
                            }
                            int i10 = i3;
                            Arrangement.Horizontal horizontal2 = start;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(407929823, i10, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:412)");
                            }
                            LazyRow(modifier2, lazyListStateRememberLazyListState, paddingValuesM8116PaddingValues0680j_4, z3, horizontal2, vertical2, flingBehavior3, true, function1, composerStartRestartGroup, (i10 & 14) | 12582912 | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (i10 & 3670016) | ((i10 << 3) & 234881024), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            start = horizontal2;
                            paddingValues2 = paddingValuesM8116PaddingValues0680j_4;
                            flingBehavior4 = flingBehavior3;
                            z4 = z3;
                            modifier3 = modifier2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                        }
                        modifier2 = modifier;
                        z3 = z2;
                        flingBehavior3 = flingBehavior2;
                        vertical2 = top;
                        int i102 = i3;
                        Arrangement.Horizontal horizontal22 = start;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        LazyRow(modifier2, lazyListStateRememberLazyListState, paddingValuesM8116PaddingValues0680j_4, z3, horizontal22, vertical2, flingBehavior3, true, function1, composerStartRestartGroup, (i102 & 14) | 12582912 | (i102 & 112) | (i102 & 896) | (i102 & 7168) | (57344 & i102) | (458752 & i102) | (i102 & 3670016) | ((i102 << 3) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        start = horizontal22;
                        paddingValues2 = paddingValuesM8116PaddingValues0680j_4;
                        flingBehavior4 = flingBehavior3;
                        z4 = z3;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        paddingValues2 = paddingValuesM8116PaddingValues0680j_4;
                        z4 = z2;
                        flingBehavior4 = flingBehavior2;
                        vertical2 = top;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.2
                            public final /* synthetic */ int $$changed;
                            public final /* synthetic */ int $$default;
                            public final /* synthetic */ Function1<LazyListScope, Unit> $content;
                            public final /* synthetic */ PaddingValues $contentPadding;
                            public final /* synthetic */ FlingBehavior $flingBehavior;
                            public final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
                            public final /* synthetic */ boolean $reverseLayout;
                            public final /* synthetic */ LazyListState $state;
                            public final /* synthetic */ Alignment.Vertical $verticalAlignment;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public C06292(LazyListState lazyListStateRememberLazyListState2, PaddingValues paddingValues22, boolean z42, Arrangement.Horizontal start2, Alignment.Vertical vertical22, FlingBehavior flingBehavior42, Function1<? super LazyListScope, Unit> function12, int i11, int i22) {
                                super(2);
                                lazyListState = lazyListStateRememberLazyListState2;
                                paddingValues = paddingValues22;
                                z = z42;
                                horizontal = start2;
                                vertical = vertical22;
                                flingBehavior = flingBehavior42;
                                function1 = function12;
                                i = i11;
                                i = i22;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i11) {
                                LazyDslKt.LazyRow(modifier, lazyListState, paddingValues, z, horizontal, vertical, flingBehavior, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 12582912;
                if ((i3 & 23967451) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        modifier = i6 == 0 ? Modifier.INSTANCE : modifier;
                        if ((i22 & 2) != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if ((i22 & 16) != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if ((i22 & 64) == 0) {
                            modifier2 = modifier;
                            z3 = z2;
                            flingBehavior3 = flingBehavior2;
                            vertical22 = top;
                        }
                        int i1022 = i3;
                        Arrangement.Horizontal horizontal222 = start2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        LazyRow(modifier2, lazyListStateRememberLazyListState2, paddingValuesM8116PaddingValues0680j_4, z3, horizontal222, vertical22, flingBehavior3, true, function12, composerStartRestartGroup, (i1022 & 14) | 12582912 | (i1022 & 112) | (i1022 & 896) | (i1022 & 7168) | (57344 & i1022) | (458752 & i1022) | (i1022 & 3670016) | ((i1022 << 3) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        start2 = horizontal222;
                        paddingValues22 = paddingValuesM8116PaddingValues0680j_4;
                        flingBehavior42 = flingBehavior3;
                        z42 = z3;
                        modifier3 = modifier2;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i11 & 57344) == 0) {
            }
            i5 = i22 & 32;
            if (i5 != 0) {
            }
            if ((i11 & 3670016) == 0) {
            }
            if ((i22 & 128) == 0) {
            }
            if ((i3 & 23967451) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        paddingValuesM8116PaddingValues0680j_4 = paddingValues;
        i4 = i22 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i11 & 57344) == 0) {
        }
        i5 = i22 & 32;
        if (i5 != 0) {
        }
        if ((i11 & 3670016) == 0) {
        }
        if ((i22 & 128) == 0) {
        }
        if ((i3 & 23967451) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List list, Function1 function1, Function4 function4, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        lazyListScope.items(list.size(), function1 != null ? new C06312(function1, list) : null, new C06323(C06301.INSTANCE, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new C06334(function4, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List list, Function2 function2, Function5 function5, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        lazyListScope.items(list.size(), function2 != null ? new C06392(function2, list) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1(list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new C06414(function5, list)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] objArr, Function1 function1, Function4 function4, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        lazyListScope.items(objArr.length, function1 != null ? new C06356(function1, objArr) : null, new C06367(C06345.INSTANCE, objArr), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new C06378(function4, objArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] objArr, Function2 function2, Function5 function5, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        lazyListScope.items(objArr.length, function2 != null ? new C06436(function2, objArr) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2(objArr), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new C06458(function5, objArr)));
    }
}
