package com.blackhub.bronline.game.p019ui.widget.block.rating;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BasicMarqueeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.draw.ScaleKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.text.style.TextOverflow;
import androidx.compose.p003ui.tooling.preview.Preview;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.room.RoomMasterTable;
import com.blackhub.bronline.game.core.enums.SideEnum;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.utils.attachment.CommonEventTopListModel;
import com.blackhub.bronline.game.p019ui.widget.other.ColoredRectangleKt;
import com.blackhub.bronline.game.p019ui.widget.other.GradientSphereKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonEventTopListItem.kt */
@Metadata(m7104d1 = {"\u00004\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001aC\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u001b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m7105d2 = {"COLORED_RECTANGLE_WIDTH_PERCENT", "", "COLOR_STOPS_END", "COLOR_STOPS_START", "GRADIENT_SPHERE_ALPHA", "GRADIENT_SPHERE_HEIGHT_PERCENT", "GRADIENT_SPHERE_SCALE_X", "GRADIENT_SPHERE_SCALE_Y", "TEXT_LEVEL_WEIGHT", "TEXT_NAME_WEIGHT", "TEXT_PLACE_WEIGHT", "TEXT_REWARD_WEIGHT", "CommonEventTopListItem", "", "modifier", "Landroidx/compose/ui/Modifier;", "item", "Lcom/blackhub/bronline/game/core/utils/attachment/CommonEventTopListModel;", "listOfItems", "", "Landroidx/compose/ui/text/AnnotatedString;", "playerPlace", "", "isFromCollaboration", "", "(Landroidx/compose/ui/Modifier;Lcom/blackhub/bronline/game/core/utils/attachment/CommonEventTopListModel;Ljava/util/List;Ljava/lang/String;ZLandroidx/compose/runtime/Composer;II)V", "PreviewCommonEventTopListItem", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCommonEventTopListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonEventTopListItem.kt\ncom/blackhub/bronline/game/ui/widget/block/rating/CommonEventTopListItemKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,277:1\n69#2,5:278\n74#2:311\n78#2:392\n79#3,11:283\n79#3,11:314\n79#3,11:349\n92#3:381\n92#3:386\n92#3:391\n456#4,8:294\n464#4,3:308\n456#4,8:325\n464#4,3:339\n456#4,8:360\n464#4,3:374\n467#4,3:378\n467#4,3:383\n467#4,3:388\n3737#5,6:302\n3737#5,6:333\n3737#5,6:368\n91#6,2:312\n93#6:342\n97#6:387\n74#7,6:343\n80#7:377\n84#7:382\n*S KotlinDebug\n*F\n+ 1 CommonEventTopListItem.kt\ncom/blackhub/bronline/game/ui/widget/block/rating/CommonEventTopListItemKt\n*L\n148#1:278,5\n148#1:311\n148#1:392\n148#1:283,11\n193#1:314,11\n207#1:349,11\n207#1:381\n193#1:386\n148#1:391\n148#1:294,8\n148#1:308,3\n193#1:325,8\n193#1:339,3\n207#1:360,8\n207#1:374,3\n207#1:378,3\n193#1:383,3\n148#1:388,3\n148#1:302,6\n193#1:333,6\n207#1:368,6\n193#1:312,2\n193#1:342\n193#1:387\n207#1:343,6\n207#1:377\n207#1:382\n*E\n"})
/* loaded from: classes3.dex */
public final class CommonEventTopListItemKt {
    public static final float COLORED_RECTANGLE_WIDTH_PERCENT = 0.6f;
    public static final float COLOR_STOPS_END = 1.0f;
    public static final float COLOR_STOPS_START = 0.3f;
    public static final float GRADIENT_SPHERE_ALPHA = 1.0f;
    public static final float GRADIENT_SPHERE_HEIGHT_PERCENT = 0.01f;
    public static final float GRADIENT_SPHERE_SCALE_X = 1.0f;
    public static final float GRADIENT_SPHERE_SCALE_Y = 0.5f;
    public static final float TEXT_LEVEL_WEIGHT = 0.35f;
    public static final float TEXT_NAME_WEIGHT = 0.5f;
    public static final float TEXT_PLACE_WEIGHT = 0.3f;
    public static final float TEXT_REWARD_WEIGHT = 0.36f;

    /* compiled from: CommonEventTopListItem.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.widget.block.rating.CommonEventTopListItemKt$CommonEventTopListItem$2 */
    /* loaded from: classes6.dex */
    public static final class C63102 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isFromCollaboration;
        public final /* synthetic */ CommonEventTopListModel $item;
        public final /* synthetic */ List<AnnotatedString> $listOfItems;
        public final /* synthetic */ String $playerPlace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C63102(CommonEventTopListModel commonEventTopListModel, List<AnnotatedString> list, String str, boolean z, int i, int i2) {
            super(2);
            commonEventTopListModel = commonEventTopListModel;
            list = list;
            str = str;
            z = z;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            CommonEventTopListItemKt.CommonEventTopListItem(modifier, commonEventTopListModel, list, str, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: CommonEventTopListItem.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.widget.block.rating.CommonEventTopListItemKt$PreviewCommonEventTopListItem$1 */
    /* loaded from: classes6.dex */
    public static final class C63111 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C63111(int i) {
            super(2);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            CommonEventTopListItemKt.PreviewCommonEventTopListItem(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:310:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0741  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CommonEventTopListItem(@Nullable Modifier modifier, @Nullable final CommonEventTopListModel commonEventTopListModel, @Nullable List<AnnotatedString> list, @NotNull String playerPlace, boolean z, @Nullable Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        long jM11377getWhite0d7_KjU;
        Object obj;
        String str;
        List<AnnotatedString> list2;
        int i4;
        TextStyle textStyleM14843montserratMediumCustomSpbl3sdaw;
        Object obj2;
        TextStyle textStyleM14843montserratMediumCustomSpbl3sdaw2;
        TextStyle textStyleM14843montserratMediumCustomSpbl3sdaw3;
        boolean z2;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        List<AnnotatedString> list3;
        int currentCompositeKeyHash2;
        Composer composerM10870constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        List<AnnotatedString> list4;
        Intrinsics.checkNotNullParameter(playerPlace, "playerPlace");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1153155047);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(commonEventTopListModel) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= composerStartRestartGroup.changed(playerPlace) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= CpioConstants.C_ISBLK;
        } else if ((57344 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        int i7 = i3;
        if (i6 != 4 || (46811 & i7) != 9362 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i5 != 0 ? Modifier.INSTANCE : modifier2;
            List<AnnotatedString> list5 = i6 != 0 ? null : list;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1153155047, i7, -1, "com.blackhub.bronline.game.ui.widget.block.rating.CommonEventTopListItem (CommonEventTopListItem.kt:70)");
            }
            String playerPlace2 = commonEventTopListModel != null ? commonEventTopListModel.getPlayerPlace() : null;
            if (playerPlace2 != null) {
                switch (playerPlace2.hashCode()) {
                    case 49:
                        if (playerPlace2.equals("1")) {
                            composerStartRestartGroup.startReplaceableGroup(-1164954295);
                            jM11377getWhite0d7_KjU = ColorResources_androidKt.colorResource(R.color.yellow, composerStartRestartGroup, 6);
                            composerStartRestartGroup.endReplaceableGroup();
                            break;
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-1164954091);
                            composerStartRestartGroup.endReplaceableGroup();
                            jM11377getWhite0d7_KjU = Color.INSTANCE.m11377getWhite0d7_KjU();
                            break;
                        }
                    case 50:
                        if (playerPlace2.equals("2")) {
                            composerStartRestartGroup.startReplaceableGroup(-1164954221);
                            jM11377getWhite0d7_KjU = ColorResources_androidKt.colorResource(R.color.silver, composerStartRestartGroup, 6);
                            composerStartRestartGroup.endReplaceableGroup();
                            break;
                        }
                        break;
                    case 51:
                        if (playerPlace2.equals("3")) {
                            composerStartRestartGroup.startReplaceableGroup(-1164954148);
                            jM11377getWhite0d7_KjU = ColorResources_androidKt.colorResource(R.color.bronze, composerStartRestartGroup, 6);
                            composerStartRestartGroup.endReplaceableGroup();
                            break;
                        }
                        break;
                }
                long j = jM11377getWhite0d7_KjU;
                if (Intrinsics.areEqual(commonEventTopListModel != null ? commonEventTopListModel.getPlayerPlace() : null, "1")) {
                    composerStartRestartGroup.startReplaceableGroup(-1164953988);
                    obj = "1";
                    str = null;
                    list2 = list5;
                    i4 = i7;
                    textStyleM14843montserratMediumCustomSpbl3sdaw = TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._15wsp, j, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composerStartRestartGroup, 12582918, 120);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    obj = "1";
                    str = null;
                    list2 = list5;
                    i4 = i7;
                    composerStartRestartGroup.startReplaceableGroup(-1164953809);
                    if (z) {
                        composerStartRestartGroup.startReplaceableGroup(-1164953766);
                        textStyleM14843montserratMediumCustomSpbl3sdaw = TypographyStyle.INSTANCE.m14843montserratMediumCustomSpbl3sdaw(R.dimen._15wsp, j, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composerStartRestartGroup, 196614, 24);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1164953545);
                        textStyleM14843montserratMediumCustomSpbl3sdaw = TypographyStyle.INSTANCE.m14843montserratMediumCustomSpbl3sdaw(R.dimen._11wsp, j, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composerStartRestartGroup, 196614, 24);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                }
                TextStyle textStyle = textStyleM14843montserratMediumCustomSpbl3sdaw;
                Object obj3 = obj;
                if (Intrinsics.areEqual(commonEventTopListModel != null ? commonEventTopListModel.getPlayerPlace() : str, obj3) && !z) {
                    composerStartRestartGroup.startReplaceableGroup(-1164953217);
                    obj2 = obj3;
                    textStyleM14843montserratMediumCustomSpbl3sdaw2 = TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._15wsp, 0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composerStartRestartGroup, 12582918, 122);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    obj2 = obj3;
                    composerStartRestartGroup.startReplaceableGroup(-1164953061);
                    textStyleM14843montserratMediumCustomSpbl3sdaw2 = TypographyStyle.INSTANCE.m14843montserratMediumCustomSpbl3sdaw(R.dimen._11wsp, 0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composerStartRestartGroup, 196614, 26);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                TextStyle textStyle2 = textStyleM14843montserratMediumCustomSpbl3sdaw2;
                if (Intrinsics.areEqual(commonEventTopListModel != null ? commonEventTopListModel.getPlayerPlace() : null, obj2)) {
                    composerStartRestartGroup.startReplaceableGroup(-1164952833);
                    textStyleM14843montserratMediumCustomSpbl3sdaw3 = TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._15wsp, 0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composerStartRestartGroup, 12582918, 122);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1164952697);
                    textStyleM14843montserratMediumCustomSpbl3sdaw3 = TypographyStyle.INSTANCE.m14843montserratMediumCustomSpbl3sdaw(R.dimen._11wsp, 0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composerStartRestartGroup, 196614, 26);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                Modifier modifierBackground$default = BackgroundKt.background$default(ClipKt.clip(PaddingKt.m8127paddingqDBjuR0$default(SizeKt.m8158height3ABfNKs(modifier3, PrimitiveResources_androidKt.dimensionResource(R.dimen._34wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._15wdp, composerStartRestartGroup, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composerStartRestartGroup, 6), 0.0f, 10, null), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composerStartRestartGroup, 6))), Brush.Companion.m11289horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_gray_blue_2, composerStartRestartGroup, 6)), Color.m11330boximpl(Color.INSTANCE.m11375getTransparent0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                Alignment.Companion companion = Alignment.INSTANCE;
                Alignment center = companion.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierBackground$default);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composerStartRestartGroup);
                Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                final BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (z) {
                    z2 = false;
                    ComposeExtensionKt.IfTrue(Boolean.valueOf(z2), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1455049719, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.rating.CommonEventTopListItemKt$CommonEventTopListItem$1$1
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i8) {
                            if ((i8 & 11) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1455049719, i8, -1, "com.blackhub.bronline.game.ui.widget.block.rating.CommonEventTopListItem.<anonymous>.<anonymous> (CommonEventTopListItem.kt:159)");
                                }
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                Modifier modifierM8084offsetVpY3zN4$default = OffsetKt.m8084offsetVpY3zN4$default(ScaleKt.scale(SizeKt.fillMaxWidth$default(SizeKt.fillMaxHeight(companion3, 0.01f), 0.0f, 1, null), 1.0f, 0.5f), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._90wdp, composer2, 6), 1, null);
                                SideEnum sideEnum = SideEnum.BOTTOM_CENTER;
                                Pair pairM7112to = TuplesKt.m7112to(Float.valueOf(0.3f), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.red, composer2, 6)));
                                Float fValueOf = Float.valueOf(1.0f);
                                Color.Companion companion4 = Color.INSTANCE;
                                GradientSphereKt.GradientSphere(modifierM8084offsetVpY3zN4$default, sideEnum, null, new Pair[]{pairM7112to, TuplesKt.m7112to(fValueOf, Color.m11330boximpl(companion4.m11375getTransparent0d7_KjU()))}, 1.0f, ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._112wdp, composer2, 6), composer2, 0), composer2, 24624, 4);
                                ColoredRectangleKt.ColoredRectangle(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth(boxScopeInstance.align(companion3, Alignment.INSTANCE.getBottomCenter()), 0.6f), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer2, 6)), Brush.Companion.m11291linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(companion4.m11375getTransparent0d7_KjU()), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.orange_80, composer2, 6)), Color.m11330boximpl(companion4.m11375getTransparent0d7_KjU())}), 0L, 0L, 0, 14, (Object) null), composer2, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), composerStartRestartGroup, 48);
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._13wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                    Alignment.Vertical centerVertically = companion.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composerStartRestartGroup, 54);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    list3 = list2;
                    if (list3 != null || (annotatedString = list3.get(0)) == null) {
                        String playerPlace3 = commonEventTopListModel == null ? commonEventTopListModel.getPlayerPlace() : null;
                        AnnotatedString annotatedString = new AnnotatedString(playerPlace3 != null ? "" : playerPlace3, null, null, 6, null);
                    }
                    AnnotatedString annotatedString2 = annotatedString;
                    Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion3, 0.3f, false, 2, null);
                    TextOverflow.Companion companion4 = TextOverflow.INSTANCE;
                    TextKt.m10025TextIbK3jfQ(annotatedString2, modifierWeight$default, 0L, 0L, null, null, null, 0L, null, null, 0L, companion4.m13608getEllipsisgIe3tQ8(), false, 1, 0, null, null, textStyle, composerStartRestartGroup, 0, 3120, 120828);
                    Modifier modifierWeight$default2 = RowScope.weight$default(rowScopeInstance, companion3, 0.5f, false, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierWeight$default2);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (!composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                    if (list3 != null || (annotatedString = list3.get(1)) == null) {
                        String playerName = commonEventTopListModel == null ? commonEventTopListModel.getPlayerName() : null;
                        AnnotatedString annotatedString3 = new AnnotatedString(playerName != null ? "" : playerName, null, null, 6, null);
                    }
                    TextKt.m10025TextIbK3jfQ(annotatedString3, modifierFillMaxWidth$default, 0L, 0L, null, null, null, 0L, null, null, 0L, companion4.m13608getEllipsisgIe3tQ8(), false, 1, 0, null, null, textStyle2, composerStartRestartGroup, 48, 3120, 120828);
                    ComposeExtensionKt.IfTrue(Boolean.valueOf(z), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1763030993, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.rating.CommonEventTopListItemKt$CommonEventTopListItem$1$2$1$1
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i8) {
                            if ((i8 & 11) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1763030993, i8, -1, "com.blackhub.bronline.game.ui.widget.block.rating.CommonEventTopListItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CommonEventTopListItem.kt:216)");
                                }
                                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                CommonEventTopListModel commonEventTopListModel2 = commonEventTopListModel;
                                TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.rating_current_server, new Object[]{StringExtensionKt.getOrEmpty(commonEventTopListModel2 != null ? commonEventTopListModel2.getPlayerServer() : null)}, composer2, 70), modifierFillMaxWidth$default2, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m13608getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._8wsp, 0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, null, composer2, 1572870, 58), composer2, 48, 3120, 55292);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), composerStartRestartGroup, ((i4 >> 12) & 14) | 48);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (list3 != null || (annotatedString = list3.get(2)) == null) {
                        String playerLevel = commonEventTopListModel == null ? commonEventTopListModel.getPlayerLevel() : null;
                        AnnotatedString annotatedString4 = new AnnotatedString(playerLevel != null ? "" : playerLevel, null, null, 6, null);
                    }
                    TextKt.m10025TextIbK3jfQ(annotatedString4, RowScope.weight$default(rowScopeInstance, companion3, 0.35f, false, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, companion4.m13608getEllipsisgIe3tQ8(), false, 1, 0, null, null, textStyleM14843montserratMediumCustomSpbl3sdaw3, composerStartRestartGroup, 0, 3120, 120828);
                    Modifier modifierM7777basicMarquee1Mj1MLw$default = BasicMarqueeKt.m7777basicMarquee1Mj1MLw$default(RowScope.weight$default(rowScopeInstance, companion3, 0.36f, false, 2, null), 0, 0, 0, 0, null, 0.0f, 63, null);
                    if (list3 != null || (annotatedString = list3.get(3)) == null) {
                        String playerRewardOrServer = commonEventTopListModel == null ? commonEventTopListModel.getPlayerRewardOrServer() : null;
                        AnnotatedString annotatedString5 = new AnnotatedString(playerRewardOrServer != null ? "" : playerRewardOrServer, null, null, 6, null);
                    }
                    TextKt.m10025TextIbK3jfQ(annotatedString5, modifierM7777basicMarquee1Mj1MLw$default, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._15wsp, 0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composerStartRestartGroup, 12582918, 122), composerStartRestartGroup, 0, 0, 131068);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    list4 = list3;
                } else {
                    if (Intrinsics.areEqual(commonEventTopListModel != null ? commonEventTopListModel.getPlayerPlace() : null, playerPlace)) {
                        z2 = true;
                    }
                    ComposeExtensionKt.IfTrue(Boolean.valueOf(z2), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1455049719, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.rating.CommonEventTopListItemKt$CommonEventTopListItem$1$1
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i8) {
                            if ((i8 & 11) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1455049719, i8, -1, "com.blackhub.bronline.game.ui.widget.block.rating.CommonEventTopListItem.<anonymous>.<anonymous> (CommonEventTopListItem.kt:159)");
                                }
                                Modifier.Companion companion32 = Modifier.INSTANCE;
                                Modifier modifierM8084offsetVpY3zN4$default = OffsetKt.m8084offsetVpY3zN4$default(ScaleKt.scale(SizeKt.fillMaxWidth$default(SizeKt.fillMaxHeight(companion32, 0.01f), 0.0f, 1, null), 1.0f, 0.5f), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._90wdp, composer2, 6), 1, null);
                                SideEnum sideEnum = SideEnum.BOTTOM_CENTER;
                                Pair pairM7112to = TuplesKt.m7112to(Float.valueOf(0.3f), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.red, composer2, 6)));
                                Float fValueOf = Float.valueOf(1.0f);
                                Color.Companion companion42 = Color.INSTANCE;
                                GradientSphereKt.GradientSphere(modifierM8084offsetVpY3zN4$default, sideEnum, null, new Pair[]{pairM7112to, TuplesKt.m7112to(fValueOf, Color.m11330boximpl(companion42.m11375getTransparent0d7_KjU()))}, 1.0f, ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._112wdp, composer2, 6), composer2, 0), composer2, 24624, 4);
                                ColoredRectangleKt.ColoredRectangle(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth(boxScopeInstance.align(companion32, Alignment.INSTANCE.getBottomCenter()), 0.6f), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer2, 6)), Brush.Companion.m11291linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(companion42.m11375getTransparent0d7_KjU()), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.orange_80, composer2, 6)), Color.m11330boximpl(companion42.m11375getTransparent0d7_KjU())}), 0L, 0L, 0, 14, (Object) null), composer2, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), composerStartRestartGroup, 48);
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    Modifier modifierM8127paddingqDBjuR0$default2 = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._13wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical spaceBetween2 = arrangement2.getSpaceBetween();
                    Alignment.Vertical centerVertically2 = companion.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically2, composerStartRestartGroup, 54);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor22 = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default2);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap22, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM10870constructorimpl.getInserting()) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        function3ModifierMaterializerOf22.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        list3 = list2;
                        if (list3 != null) {
                            if (commonEventTopListModel == null) {
                            }
                            AnnotatedString annotatedString6 = new AnnotatedString(playerPlace3 != null ? "" : playerPlace3, null, null, 6, null);
                            AnnotatedString annotatedString22 = annotatedString6;
                            Modifier modifierWeight$default3 = RowScope.weight$default(rowScopeInstance2, companion32, 0.3f, false, 2, null);
                            TextOverflow.Companion companion42 = TextOverflow.INSTANCE;
                            TextKt.m10025TextIbK3jfQ(annotatedString22, modifierWeight$default3, 0L, 0L, null, null, null, 0L, null, null, 0L, companion42.m13608getEllipsisgIe3tQ8(), false, 1, 0, null, null, textStyle, composerStartRestartGroup, 0, 3120, 120828);
                            Modifier modifierWeight$default22 = RowScope.weight$default(rowScopeInstance2, companion32, 0.5f, false, 2, null);
                            composerStartRestartGroup.startReplaceableGroup(-483455358);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor32 = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf32 = LayoutKt.modifierMaterializerOf(modifierWeight$default22);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
                            }
                            composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
                            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap32, companion2.getSetResolvedCompositionLocals());
                            setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                            if (!composerM10870constructorimpl2.getInserting()) {
                                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                function3ModifierMaterializerOf32.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(2058660585);
                                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null);
                                if (list3 != null) {
                                    if (commonEventTopListModel == null) {
                                    }
                                    AnnotatedString annotatedString32 = new AnnotatedString(playerName != null ? "" : playerName, null, null, 6, null);
                                    TextKt.m10025TextIbK3jfQ(annotatedString32, modifierFillMaxWidth$default2, 0L, 0L, null, null, null, 0L, null, null, 0L, companion42.m13608getEllipsisgIe3tQ8(), false, 1, 0, null, null, textStyle2, composerStartRestartGroup, 48, 3120, 120828);
                                    ComposeExtensionKt.IfTrue(Boolean.valueOf(z), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1763030993, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.rating.CommonEventTopListItemKt$CommonEventTopListItem$1$2$1$1
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer2, int i8) {
                                            if ((i8 & 11) != 2 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1763030993, i8, -1, "com.blackhub.bronline.game.ui.widget.block.rating.CommonEventTopListItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CommonEventTopListItem.kt:216)");
                                                }
                                                Modifier modifierFillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                CommonEventTopListModel commonEventTopListModel2 = commonEventTopListModel;
                                                TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.rating_current_server, new Object[]{StringExtensionKt.getOrEmpty(commonEventTopListModel2 != null ? commonEventTopListModel2.getPlayerServer() : null)}, composer2, 70), modifierFillMaxWidth$default22, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m13608getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._8wsp, 0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, null, composer2, 1572870, 58), composer2, 48, 3120, 55292);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer2.skipToGroupEnd();
                                        }
                                    }), composerStartRestartGroup, ((i4 >> 12) & 14) | 48);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.endNode();
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.endReplaceableGroup();
                                    if (list3 != null) {
                                        if (commonEventTopListModel == null) {
                                        }
                                        AnnotatedString annotatedString42 = new AnnotatedString(playerLevel != null ? "" : playerLevel, null, null, 6, null);
                                        TextKt.m10025TextIbK3jfQ(annotatedString42, RowScope.weight$default(rowScopeInstance2, companion32, 0.35f, false, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, companion42.m13608getEllipsisgIe3tQ8(), false, 1, 0, null, null, textStyleM14843montserratMediumCustomSpbl3sdaw3, composerStartRestartGroup, 0, 3120, 120828);
                                        Modifier modifierM7777basicMarquee1Mj1MLw$default2 = BasicMarqueeKt.m7777basicMarquee1Mj1MLw$default(RowScope.weight$default(rowScopeInstance2, companion32, 0.36f, false, 2, null), 0, 0, 0, 0, null, 0.0f, 63, null);
                                        if (list3 != null) {
                                            if (commonEventTopListModel == null) {
                                            }
                                            AnnotatedString annotatedString52 = new AnnotatedString(playerRewardOrServer != null ? "" : playerRewardOrServer, null, null, 6, null);
                                            TextKt.m10025TextIbK3jfQ(annotatedString52, modifierM7777basicMarquee1Mj1MLw$default2, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._15wsp, 0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composerStartRestartGroup, 12582918, 122), composerStartRestartGroup, 0, 0, 131068);
                                            composerStartRestartGroup.endReplaceableGroup();
                                            composerStartRestartGroup.endNode();
                                            composerStartRestartGroup.endReplaceableGroup();
                                            composerStartRestartGroup.endReplaceableGroup();
                                            composerStartRestartGroup.endReplaceableGroup();
                                            composerStartRestartGroup.endNode();
                                            composerStartRestartGroup.endReplaceableGroup();
                                            composerStartRestartGroup.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            modifier2 = modifier3;
                                            list4 = list3;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            list4 = list;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.rating.CommonEventTopListItemKt.CommonEventTopListItem.2
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ int $$default;
                public final /* synthetic */ boolean $isFromCollaboration;
                public final /* synthetic */ CommonEventTopListModel $item;
                public final /* synthetic */ List<AnnotatedString> $listOfItems;
                public final /* synthetic */ String $playerPlace;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C63102(final CommonEventTopListModel commonEventTopListModel2, List<AnnotatedString> list42, String playerPlace4, boolean z3, int i8, int i22) {
                    super(2);
                    commonEventTopListModel = commonEventTopListModel2;
                    list = list42;
                    str = playerPlace4;
                    z = z3;
                    i = i8;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i8) {
                    CommonEventTopListItemKt.CommonEventTopListItem(modifier, commonEventTopListModel, list, str, z, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "CommonEventTopListItem")
    public static final void PreviewCommonEventTopListItem(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1379461650);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1379461650, i, -1, "com.blackhub.bronline.game.ui.widget.block.rating.PreviewCommonEventTopListItem (CommonEventTopListItem.kt:264)");
            }
            CommonEventTopListItem(null, new CommonEventTopListModel("1", "Fedorovech_Kerelchenkodbabas", RoomMasterTable.DEFAULT_ID, "Уникальный автомобиль Уникальный автомобильУникальный автомобиль", "10"), null, "2", true, composerStartRestartGroup, 27648, 5);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.rating.CommonEventTopListItemKt.PreviewCommonEventTopListItem.1
                public final /* synthetic */ int $$changed;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C63111(int i2) {
                    super(2);
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    CommonEventTopListItemKt.PreviewCommonEventTopListItem(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
