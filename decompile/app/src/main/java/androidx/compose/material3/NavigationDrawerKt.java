package androidx.compose.material3;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.Strings;
import androidx.compose.material3.tokens.NavigationDrawerTokens;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.C1841R;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.RectangleShapeKt;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.input.pointer.PointerInputScope;
import androidx.compose.p003ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.semantics.Role;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.material.badge.BadgeState;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NavigationDrawer.kt */
@Metadata(m7104d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\u001al\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aQ\u0010\u001b\u001a\u00020\t2\u0011\u0010\u001c\u001a\r\u0012\u0004\u0012\u00020\t0\u001d¢\u0006\u0002\b\u00172\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\t0\u001d¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0002\u0010\"\u001aj\u0010#\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00052\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0003ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001al\u0010&\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010\u001a\u001a`\u0010(\u001a\u00020\t2\u0011\u0010\u001c\u001a\r\u0012\u0004\u0012\u00020\t0\u001d¢\u0006\u0002\b\u00172\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010)\u001a\u00020\u000f2\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\t0\u001d¢\u0006\u0002\b\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a\u008c\u0001\u0010,\u001a\u00020\t2\u0011\u0010-\u001a\r\u0012\u0004\u0012\u00020\t0\u001d¢\u0006\u0002\b\u00172\u0006\u0010.\u001a\u00020!2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\t0\u001d2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0015\b\u0002\u00100\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u001d¢\u0006\u0002\b\u00172\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u001d¢\u0006\u0002\b\u00172\b\b\u0002\u00102\u001a\u00020\r2\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u000206H\u0007¢\u0006\u0002\u00107\u001al\u00108\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b9\u0010\u001a\u001a=\u0010:\u001a\u00020\t2\u0011\u0010\u001c\u001a\r\u0012\u0004\u0012\u00020\t0\u001d¢\u0006\u0002\b\u00172\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\t0\u001d¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0002\u0010;\u001a>\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020!2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\t0\u001d2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010@\u001a\u00020\u000fH\u0003ø\u0001\u0000¢\u0006\u0004\bA\u0010B\u001a \u0010C\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u00022\u0006\u0010E\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u0002H\u0002\u001a+\u0010G\u001a\u00020\u001f2\u0006\u0010H\u001a\u00020I2\u0014\b\u0002\u0010J\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020!0\u0015H\u0007¢\u0006\u0002\u0010K\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0002X\u0082D¢\u0006\u0002\n\u0000\"\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u0010\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006L"}, m7105d2 = {"AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "DrawerPositionalThreshold", "DrawerVelocityThreshold", "Landroidx/compose/ui/unit/Dp;", "F", "MinimumDrawerWidth", "DismissibleDrawerSheet", "", "modifier", "Landroidx/compose/ui/Modifier;", "drawerShape", "Landroidx/compose/ui/graphics/Shape;", "drawerContainerColor", "Landroidx/compose/ui/graphics/Color;", "drawerContentColor", "drawerTonalElevation", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "DismissibleDrawerSheet-afqeVBk", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DismissibleNavigationDrawer", "drawerContent", "Lkotlin/Function0;", "drawerState", "Landroidx/compose/material3/DrawerState;", "gesturesEnabled", "", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DrawerState;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "DrawerSheet", "DrawerSheet-vywBR7E", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ModalDrawerSheet", "ModalDrawerSheet-afqeVBk", "ModalNavigationDrawer", "scrimColor", "ModalNavigationDrawer-FHprtrg", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DrawerState;ZJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "NavigationDrawerItem", "label", "selected", "onClick", "icon", BadgeState.BADGE_RESOURCE_TAG, "shape", "colors", "Landroidx/compose/material3/NavigationDrawerItemColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/NavigationDrawerItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "PermanentDrawerSheet", "PermanentDrawerSheet-afqeVBk", "PermanentNavigationDrawer", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Scrim", "open", "onClose", "fraction", "color", "Scrim-Bx497Mc", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;I)V", "calculateFraction", "a", "b", "pos", "rememberDrawerState", "initialValue", "Landroidx/compose/material3/DrawerValue;", "confirmStateChange", "(Landroidx/compose/material3/DrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DrawerState;", "material3_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nNavigationDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 11 Composer.kt\nandroidx/compose/runtime/Updater\n+ 12 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 13 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,948:1\n1116#2,6:949\n1116#2,3:960\n1119#2,3:966\n1116#2,6:973\n1116#2,6:1056\n1116#2,6:1062\n1116#2,6:1068\n1116#2,6:1074\n1116#2,6:1126\n1116#2,3:1137\n1119#2,3:1143\n1116#2,6:1184\n1116#2,6:1221\n1116#2,6:1399\n1116#2,6:1405\n1116#2,6:1412\n1116#2,6:1418\n1116#2,6:1424\n487#3,4:955\n491#3,2:963\n495#3:969\n487#3,4:1132\n491#3,2:1140\n495#3:1146\n25#4:959\n456#4,8:997\n464#4,3:1011\n456#4,8:1033\n464#4,3:1047\n467#4,3:1051\n456#4,8:1097\n464#4,3:1111\n467#4,3:1115\n467#4,3:1120\n25#4:1136\n456#4,8:1166\n464#4,3:1180\n456#4,8:1204\n464#4,3:1218\n456#4,8:1244\n464#4,3:1258\n467#4,3:1262\n456#4,8:1285\n464#4,3:1299\n467#4,3:1303\n467#4,3:1308\n467#4,3:1312\n456#4,8:1334\n464#4,3:1348\n456#4,8:1370\n464#4,3:1384\n467#4,3:1388\n467#4,3:1393\n487#5:965\n487#5:1142\n162#6:970\n162#6:1147\n162#6:1398\n163#6:1411\n74#7:971\n74#7:979\n74#7:1125\n74#7:1148\n1#8:972\n68#9,6:980\n74#9:1014\n67#9,7:1015\n74#9:1050\n78#9:1055\n68#9,6:1080\n74#9:1114\n78#9:1119\n78#9:1124\n68#9,6:1149\n74#9:1183\n68#9,6:1227\n74#9:1261\n78#9:1266\n67#9,7:1267\n74#9:1302\n78#9:1307\n78#9:1316\n67#9,7:1352\n74#9:1387\n78#9:1392\n78#10,11:986\n78#10,11:1022\n91#10:1054\n78#10,11:1086\n91#10:1118\n91#10:1123\n78#10,11:1155\n75#10,14:1190\n78#10,11:1233\n91#10:1265\n78#10,11:1274\n91#10:1306\n91#10:1311\n91#10:1315\n78#10,11:1323\n78#10,11:1359\n91#10:1391\n91#10:1396\n3737#11,6:1005\n3737#11,6:1041\n3737#11,6:1105\n3737#11,6:1174\n3737#11,6:1212\n3737#11,6:1252\n3737#11,6:1293\n3737#11,6:1342\n3737#11,6:1378\n87#12,6:1317\n93#12:1351\n97#12:1397\n154#13:1430\n154#13:1431\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerKt\n*L\n281#1:949,6\n315#1:960,3\n315#1:966,3\n321#1:973,6\n347#1:1056,6\n355#1:1062,6\n362#1:1068,6\n369#1:1074,6\n423#1:1126,6\n433#1:1137,3\n433#1:1143,3\n465#1:1184,6\n447#1:1221,6\n613#1:1399,6\n732#1:1405,6\n923#1:1412,6\n924#1:1418,6\n936#1:1424,6\n315#1:955,4\n315#1:963,2\n315#1:969\n433#1:1132,4\n433#1:1140,2\n433#1:1146\n315#1:959\n332#1:997,8\n332#1:1011,3\n342#1:1033,8\n342#1:1047,3\n342#1:1051,3\n360#1:1097,8\n360#1:1111,3\n360#1:1115,3\n332#1:1120,3\n433#1:1136\n437#1:1166,8\n437#1:1180,3\n446#1:1204,8\n446#1:1218,3\n447#1:1244,8\n447#1:1258,3\n447#1:1262,3\n462#1:1285,8\n462#1:1299,3\n462#1:1303,3\n446#1:1308,3\n437#1:1312,3\n502#1:1334,8\n502#1:1348,3\n504#1:1370,8\n504#1:1384,3\n504#1:1388,3\n502#1:1393,3\n315#1:965\n433#1:1142\n316#1:970\n434#1:1147\n610#1:1398\n920#1:1411\n317#1:971\n331#1:979\n417#1:1125\n436#1:1148\n332#1:980,6\n332#1:1014\n342#1:1015,7\n342#1:1050\n342#1:1055\n360#1:1080,6\n360#1:1114\n360#1:1119\n332#1:1124\n437#1:1149,6\n437#1:1183\n447#1:1227,6\n447#1:1261\n447#1:1266\n462#1:1267,7\n462#1:1302\n462#1:1307\n437#1:1316\n504#1:1352,7\n504#1:1387\n504#1:1392\n332#1:986,11\n342#1:1022,11\n342#1:1054\n360#1:1086,11\n360#1:1118\n332#1:1123\n437#1:1155,11\n446#1:1190,14\n447#1:1233,11\n447#1:1265\n462#1:1274,11\n462#1:1306\n446#1:1311\n437#1:1315\n502#1:1323,11\n504#1:1359,11\n504#1:1391\n502#1:1396\n332#1:1005,6\n342#1:1041,6\n360#1:1105,6\n437#1:1174,6\n446#1:1212,6\n447#1:1252,6\n462#1:1293,6\n502#1:1342,6\n504#1:1378,6\n502#1:1317,6\n502#1:1351\n502#1:1397\n942#1:1430\n943#1:1431\n*E\n"})
/* loaded from: classes4.dex */
public final class NavigationDrawerKt {
    private static final float DrawerPositionalThreshold = 0.5f;
    private static final float DrawerVelocityThreshold = C2046Dp.m13666constructorimpl(400);
    private static final float MinimumDrawerWidth = C2046Dp.m13666constructorimpl(240);

    @NotNull
    private static final TweenSpec<Float> AnimationSpec = new TweenSpec<>(256, 0, null, 6, null);

    @Composable
    @NotNull
    public static final DrawerState rememberDrawerState(@NotNull final DrawerValue drawerValue, @Nullable final Function1<? super DrawerValue, Boolean> function1, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(2098699222);
        if ((i2 & 2) != 0) {
            function1 = new Function1<DrawerValue, Boolean>() { // from class: androidx.compose.material3.NavigationDrawerKt.rememberDrawerState.1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull DrawerValue drawerValue2) {
                    return Boolean.TRUE;
                }
            };
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2098699222, i, -1, "androidx.compose.material3.rememberDrawerState (NavigationDrawer.kt:279)");
        }
        Object[] objArr = new Object[0];
        Saver<DrawerState, DrawerValue> Saver = DrawerState.Companion.Saver(function1);
        composer.startReplaceableGroup(-21510967);
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(drawerValue)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(function1)) || (i & 48) == 32);
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<DrawerState>() { // from class: androidx.compose.material3.NavigationDrawerKt$rememberDrawerState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final DrawerState invoke() {
                    return new DrawerState(drawerValue, function1);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        DrawerState drawerState = (DrawerState) RememberSaveableKt.m10957rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return drawerState;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011d  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: ModalNavigationDrawer-FHprtrg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9600ModalNavigationDrawerFHprtrg(@NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Modifier modifier, @Nullable DrawerState drawerState, boolean z, long j, @NotNull final Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        DrawerState drawerStateRememberDrawerState;
        int i4;
        boolean z2;
        long j2;
        long scrimColor;
        final boolean z3;
        int i5;
        final DrawerState drawerState2;
        Object objRememberedValue;
        Composer.Companion companion;
        final CoroutineScope coroutineScope;
        final String strM9866getStringNWtq28;
        final Density density;
        final float f;
        boolean zChanged;
        Object objRememberedValue2;
        final float f2;
        Object obj;
        int i6;
        boolean z4;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM10870constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        boolean zChangedInstance;
        Object objRememberedValue3;
        boolean zChanged2;
        Object objRememberedValue4;
        boolean z5;
        Object objRememberedValue5;
        boolean zChanged3;
        Object objRememberedValue6;
        int currentCompositeKeyHash3;
        Composer composerM10870constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        final boolean z6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1169303680);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    drawerStateRememberDrawerState = drawerState;
                    int i8 = composerStartRestartGroup.changed(drawerStateRememberDrawerState) ? 256 : 128;
                    i3 |= i8;
                } else {
                    drawerStateRememberDrawerState = drawerState;
                }
                i3 |= i8;
            } else {
                drawerStateRememberDrawerState = drawerState;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((i & CpioConstants.C_ISBLK) == 0) {
                    if ((i2 & 16) == 0) {
                        j2 = j;
                        int i9 = composerStartRestartGroup.changed(j2) ? 16384 : 8192;
                        i3 |= i9;
                    } else {
                        j2 = j;
                    }
                    i3 |= i9;
                } else {
                    j2 = j;
                }
                if ((i2 & 32) != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                } else if ((i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function22) ? 131072 : 65536;
                }
                if ((i3 & 74899) != 74898 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                    } else {
                        if (i7 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 16) == 0) {
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            z3 = z2;
                            i5 = i3 & (-57345);
                            drawerState2 = drawerStateRememberDrawerState;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1169303680, i5, -1, "androidx.compose.material3.ModalNavigationDrawer (NavigationDrawer.kt:313)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(773894976);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Strings.Companion companion2 = Strings.INSTANCE;
                        strM9866getStringNWtq28 = Strings_androidKt.m9866getStringNWtq28(Strings.m9797constructorimpl(C1841R.string.navigation_menu), composerStartRestartGroup, 0);
                        density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        f = -density.mo7874toPx0680j_4(NavigationDrawerTokens.INSTANCE.m10526getContainerWidthD9Ej5fM());
                        composerStartRestartGroup.startReplaceableGroup(-1870335235);
                        int i10 = (i5 & 896) ^ 384;
                        zChanged = ((i10 > 256 && composerStartRestartGroup.changed(drawerState2)) || (i5 & 384) == 256) | composerStartRestartGroup.changed(density) | composerStartRestartGroup.changed(f);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        f2 = 0.0f;
                        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    drawerState2.setDensity$material3_release(density);
                                    AnchoredDraggableState<DrawerValue> anchoredDraggableState$material3_release = drawerState2.getAnchoredDraggableState$material3_release();
                                    final float f3 = f;
                                    final float f4 = f2;
                                    AnchoredDraggableState.updateAnchors$default(anchoredDraggableState$material3_release, AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<DrawerValue>, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<DrawerValue> draggableAnchorsConfig) {
                                            invoke2(draggableAnchorsConfig);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull DraggableAnchorsConfig<DrawerValue> draggableAnchorsConfig) {
                                            draggableAnchorsConfig.m96at(DrawerValue.Closed, f3);
                                            draggableAnchorsConfig.m96at(DrawerValue.Open, f4);
                                        }
                                    }), null, 2, null);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.SideEffect((Function0) objRememberedValue2, composerStartRestartGroup, 0);
                        if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) != LayoutDirection.Rtl) {
                            obj = null;
                            i6 = 1;
                            z4 = true;
                        } else {
                            obj = null;
                            i6 = 1;
                            z4 = false;
                        }
                        Modifier modifierAnchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(SizeKt.fillMaxSize$default(modifier2, 0.0f, i6, obj), drawerState2.getAnchoredDraggableState$material3_release(), Orientation.Horizontal, z3, z4, null, 16, null);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierAnchoredDraggable$default);
                        Modifier modifier3 = modifier2;
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                        if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        Modifier.Companion companion5 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion5);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
                        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                        if (!composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        function22.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 15) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        boolean zIsOpen = drawerState2.isOpen();
                        composerStartRestartGroup.startReplaceableGroup(2009208457);
                        zChangedInstance = ((i5 & 7168) != 2048) | ((i10 <= 256 && composerStartRestartGroup.changed(drawerState2)) || (i5 & 384) == 256) | composerStartRestartGroup.changedInstance(coroutineScope);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function0<Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (z3 && drawerState2.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(DrawerValue.Closed).booleanValue()) {
                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C15231(drawerState2, null), 3, null);
                                    }
                                }

                                /* compiled from: NavigationDrawer.kt */
                                @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                @DebugMetadata(m7119c = "androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$2$1$1", m7120f = "NavigationDrawer.kt", m7121i = {}, m7122l = {352}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                /* renamed from: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$2$1$1 */
                                public static final class C15231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    public final /* synthetic */ DrawerState $drawerState;
                                    public int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public C15231(DrawerState drawerState, Continuation<? super C15231> continuation) {
                                        super(2, continuation);
                                        this.$drawerState = drawerState;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @NotNull
                                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                        return new C15231(this.$drawerState, continuation);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    @Nullable
                                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                        return ((C15231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i = this.label;
                                        if (i == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            DrawerState drawerState = this.$drawerState;
                                            this.label = 1;
                                            if (drawerState.close(this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } else {
                                            if (i != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.throwOnFailure(obj);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        Function0 function0 = (Function0) objRememberedValue3;
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(2009208746);
                        zChanged2 = composerStartRestartGroup.changed(f) | ((i10 <= 256 && composerStartRestartGroup.changed(drawerState2)) || (i5 & 384) == 256);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                            final float f3 = 0.0f;
                            objRememberedValue4 = new Function0<Float>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$3$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final Float invoke() {
                                    return Float.valueOf(NavigationDrawerKt.calculateFraction(f, f3, drawerState2.requireOffset$material3_release()));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        boolean z7 = z3;
                        m9602ScrimBx497Mc(zIsOpen, function0, (Function0) objRememberedValue4, scrimColor, composerStartRestartGroup, (i5 >> 3) & 7168);
                        composerStartRestartGroup.startReplaceableGroup(2009208945);
                        z5 = (i10 <= 256 && composerStartRestartGroup.changed(drawerState2)) || (i5 & 384) == 256;
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (z5 || objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$4$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ IntOffset invoke(Density density2) {
                                    return IntOffset.m13785boximpl(m9605invokeBjo55l4(density2));
                                }

                                /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                public final long m9605invokeBjo55l4(@NotNull Density density2) {
                                    return IntOffsetKt.IntOffset(MathKt__MathJVMKt.roundToInt(drawerState2.requireOffset$material3_release()), 0);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierOffset = OffsetKt.offset(companion5, (Function1) objRememberedValue5);
                        composerStartRestartGroup.startReplaceableGroup(2009209171);
                        zChanged3 = composerStartRestartGroup.changed(strM9866getStringNWtq28) | ((i10 <= 256 && composerStartRestartGroup.changed(drawerState2)) || (i5 & 384) == 256) | composerStartRestartGroup.changedInstance(coroutineScope);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3 || objRememberedValue6 == companion.getEmpty()) {
                            objRememberedValue6 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM9866getStringNWtq28);
                                    if (drawerState2.isOpen()) {
                                        final DrawerState drawerState3 = drawerState2;
                                        final CoroutineScope coroutineScope2 = coroutineScope;
                                        SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            public final Boolean invoke() {
                                                if (drawerState3.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(DrawerValue.Closed).booleanValue()) {
                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(drawerState3, null), 3, null);
                                                }
                                                return Boolean.TRUE;
                                            }

                                            /* compiled from: NavigationDrawer.kt */
                                            @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                            @DebugMetadata(m7119c = "androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5$1$1$1", m7120f = "NavigationDrawer.kt", m7121i = {}, m7122l = {377}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                            /* renamed from: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5$1$1$1, reason: invalid class name */
                                            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                public final /* synthetic */ DrawerState $drawerState;
                                                public int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public AnonymousClass1(DrawerState drawerState, Continuation<? super AnonymousClass1> continuation) {
                                                    super(2, continuation);
                                                    this.$drawerState = drawerState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @NotNull
                                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                    return new AnonymousClass1(this.$drawerState, continuation);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                @Nullable
                                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @Nullable
                                                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        ResultKt.throwOnFailure(obj);
                                                        DrawerState drawerState = this.$drawerState;
                                                        this.label = 1;
                                                        if (drawerState.close(this) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                    } else {
                                                        if (i != 1) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        ResultKt.throwOnFailure(obj);
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }
                                        }, 1, null);
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierOffset, false, (Function1) objRememberedValue6, 1, null);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierSemantics$default);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor3);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM10870constructorimpl3 = Updater.m10870constructorimpl(composerStartRestartGroup);
                        Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy3, companion4.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                        setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                        if (!composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        function2.invoke(composerStartRestartGroup, Integer.valueOf(i5 & 14));
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
                        z6 = z7;
                        modifier2 = modifier3;
                    }
                    i5 = i3;
                    drawerState2 = drawerStateRememberDrawerState;
                    z3 = z2;
                    scrimColor = j2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Strings.Companion companion22 = Strings.INSTANCE;
                    strM9866getStringNWtq28 = Strings_androidKt.m9866getStringNWtq28(Strings.m9797constructorimpl(C1841R.string.navigation_menu), composerStartRestartGroup, 0);
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    f = -density.mo7874toPx0680j_4(NavigationDrawerTokens.INSTANCE.m10526getContainerWidthD9Ej5fM());
                    composerStartRestartGroup.startReplaceableGroup(-1870335235);
                    int i102 = (i5 & 896) ^ 384;
                    if (i102 > 256) {
                        zChanged = ((i102 > 256 && composerStartRestartGroup.changed(drawerState2)) || (i5 & 384) == 256) | composerStartRestartGroup.changed(density) | composerStartRestartGroup.changed(f);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        f2 = 0.0f;
                        if (zChanged) {
                            objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    drawerState2.setDensity$material3_release(density);
                                    AnchoredDraggableState<DrawerValue> anchoredDraggableState$material3_release = drawerState2.getAnchoredDraggableState$material3_release();
                                    final float f32 = f;
                                    final float f4 = f2;
                                    AnchoredDraggableState.updateAnchors$default(anchoredDraggableState$material3_release, AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<DrawerValue>, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<DrawerValue> draggableAnchorsConfig) {
                                            invoke2(draggableAnchorsConfig);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull DraggableAnchorsConfig<DrawerValue> draggableAnchorsConfig) {
                                            draggableAnchorsConfig.m96at(DrawerValue.Closed, f32);
                                            draggableAnchorsConfig.m96at(DrawerValue.Open, f4);
                                        }
                                    }), null, 2, null);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.SideEffect((Function0) objRememberedValue2, composerStartRestartGroup, 0);
                            if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) != LayoutDirection.Rtl) {
                            }
                            Modifier modifierAnchoredDraggable$default2 = AnchoredDraggableKt.anchoredDraggable$default(SizeKt.fillMaxSize$default(modifier2, 0.0f, i6, obj), drawerState2.getAnchoredDraggableState$material3_release(), Orientation.Horizontal, z3, z4, null, 16, null);
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            Alignment.Companion companion32 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(companion32.getTopStart(), false, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor4 = companion42.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierAnchoredDraggable$default2);
                            Modifier modifier32 = modifier2;
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
                            }
                            composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy4, companion42.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap4, companion42.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion42.getSetCompositeKeyHash();
                            if (!composerM10870constructorimpl.getInserting()) {
                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                composerStartRestartGroup.startReplaceableGroup(733328855);
                                Modifier.Companion companion52 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(companion32.getTopStart(), false, composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor22 = companion42.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(companion52);
                                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (!composerStartRestartGroup.getInserting()) {
                                }
                                composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
                                Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy22, companion42.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap22, companion42.getSetResolvedCompositionLocals());
                                setCompositeKeyHash2 = companion42.getSetCompositeKeyHash();
                                if (!composerM10870constructorimpl2.getInserting()) {
                                    composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    function3ModifierMaterializerOf22.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                                    function22.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 15) & 14));
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.endNode();
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.endReplaceableGroup();
                                    boolean zIsOpen2 = drawerState2.isOpen();
                                    composerStartRestartGroup.startReplaceableGroup(2009208457);
                                    if (i102 <= 256) {
                                        zChangedInstance = ((i5 & 7168) != 2048) | ((i102 <= 256 && composerStartRestartGroup.changed(drawerState2)) || (i5 & 384) == 256) | composerStartRestartGroup.changedInstance(coroutineScope);
                                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                        if (zChangedInstance) {
                                            objRememberedValue3 = new Function0<Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$2$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public /* bridge */ /* synthetic */ Unit invoke() {
                                                    invoke2();
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    if (z3 && drawerState2.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(DrawerValue.Closed).booleanValue()) {
                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C15231(drawerState2, null), 3, null);
                                                    }
                                                }

                                                /* compiled from: NavigationDrawer.kt */
                                                @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                                @DebugMetadata(m7119c = "androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$2$1$1", m7120f = "NavigationDrawer.kt", m7121i = {}, m7122l = {352}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                                /* renamed from: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$2$1$1 */
                                                public static final class C15231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                    public final /* synthetic */ DrawerState $drawerState;
                                                    public int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    public C15231(DrawerState drawerState, Continuation<? super C15231> continuation) {
                                                        super(2, continuation);
                                                        this.$drawerState = drawerState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    @NotNull
                                                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                        return new C15231(this.$drawerState, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    @Nullable
                                                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                        return ((C15231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    @Nullable
                                                    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                                        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            ResultKt.throwOnFailure(obj);
                                                            DrawerState drawerState = this.$drawerState;
                                                            this.label = 1;
                                                            if (drawerState.close(this) == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                        } else {
                                                            if (i != 1) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            ResultKt.throwOnFailure(obj);
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                            Function0 function02 = (Function0) objRememberedValue3;
                                            composerStartRestartGroup.endReplaceableGroup();
                                            composerStartRestartGroup.startReplaceableGroup(2009208746);
                                            if (i102 <= 256) {
                                                zChanged2 = composerStartRestartGroup.changed(f) | ((i102 <= 256 && composerStartRestartGroup.changed(drawerState2)) || (i5 & 384) == 256);
                                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                                if (zChanged2) {
                                                    final float f32 = 0.0f;
                                                    objRememberedValue4 = new Function0<Float>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$3$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(0);
                                                        }

                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                        @Override // kotlin.jvm.functions.Function0
                                                        @NotNull
                                                        public final Float invoke() {
                                                            return Float.valueOf(NavigationDrawerKt.calculateFraction(f, f32, drawerState2.requireOffset$material3_release()));
                                                        }
                                                    };
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                                    composerStartRestartGroup.endReplaceableGroup();
                                                    boolean z72 = z3;
                                                    m9602ScrimBx497Mc(zIsOpen2, function02, (Function0) objRememberedValue4, scrimColor, composerStartRestartGroup, (i5 >> 3) & 7168);
                                                    composerStartRestartGroup.startReplaceableGroup(2009208945);
                                                    if (i102 <= 256) {
                                                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                                        if (z5) {
                                                            objRememberedValue5 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$4$1
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public /* bridge */ /* synthetic */ IntOffset invoke(Density density2) {
                                                                    return IntOffset.m13785boximpl(m9605invokeBjo55l4(density2));
                                                                }

                                                                /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                                                public final long m9605invokeBjo55l4(@NotNull Density density2) {
                                                                    return IntOffsetKt.IntOffset(MathKt__MathJVMKt.roundToInt(drawerState2.requireOffset$material3_release()), 0);
                                                                }
                                                            };
                                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                                            composerStartRestartGroup.endReplaceableGroup();
                                                            Modifier modifierOffset2 = OffsetKt.offset(companion52, (Function1) objRememberedValue5);
                                                            composerStartRestartGroup.startReplaceableGroup(2009209171);
                                                            if (i102 <= 256) {
                                                                zChanged3 = composerStartRestartGroup.changed(strM9866getStringNWtq28) | ((i102 <= 256 && composerStartRestartGroup.changed(drawerState2)) || (i5 & 384) == 256) | composerStartRestartGroup.changedInstance(coroutineScope);
                                                                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                                                if (zChanged3) {
                                                                    objRememberedValue6 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5$1
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(1);
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                            invoke2(semanticsPropertyReceiver);
                                                                            return Unit.INSTANCE;
                                                                        }

                                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                            SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM9866getStringNWtq28);
                                                                            if (drawerState2.isOpen()) {
                                                                                final DrawerState drawerState3 = drawerState2;
                                                                                final CoroutineScope coroutineScope2 = coroutineScope;
                                                                                SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5$1.1
                                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                    {
                                                                                        super(0);
                                                                                    }

                                                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                                                    @Override // kotlin.jvm.functions.Function0
                                                                                    @NotNull
                                                                                    public final Boolean invoke() {
                                                                                        if (drawerState3.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(DrawerValue.Closed).booleanValue()) {
                                                                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(drawerState3, null), 3, null);
                                                                                        }
                                                                                        return Boolean.TRUE;
                                                                                    }

                                                                                    /* compiled from: NavigationDrawer.kt */
                                                                                    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                                                                    @DebugMetadata(m7119c = "androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5$1$1$1", m7120f = "NavigationDrawer.kt", m7121i = {}, m7122l = {377}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                                                                    /* renamed from: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5$1$1$1, reason: invalid class name */
                                                                                    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                                        public final /* synthetic */ DrawerState $drawerState;
                                                                                        public int label;

                                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                        public AnonymousClass1(DrawerState drawerState, Continuation<? super AnonymousClass1> continuation) {
                                                                                            super(2, continuation);
                                                                                            this.$drawerState = drawerState;
                                                                                        }

                                                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                        @NotNull
                                                                                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                                                            return new AnonymousClass1(this.$drawerState, continuation);
                                                                                        }

                                                                                        @Override // kotlin.jvm.functions.Function2
                                                                                        @Nullable
                                                                                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                                                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                                        }

                                                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                        @Nullable
                                                                                        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                                                                            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                                            int i = this.label;
                                                                                            if (i == 0) {
                                                                                                ResultKt.throwOnFailure(obj);
                                                                                                DrawerState drawerState = this.$drawerState;
                                                                                                this.label = 1;
                                                                                                if (drawerState.close(this) == coroutine_suspended) {
                                                                                                    return coroutine_suspended;
                                                                                                }
                                                                                            } else {
                                                                                                if (i != 1) {
                                                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                }
                                                                                                ResultKt.throwOnFailure(obj);
                                                                                            }
                                                                                            return Unit.INSTANCE;
                                                                                        }
                                                                                    }
                                                                                }, 1, null);
                                                                            }
                                                                        }
                                                                    };
                                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                                                    composerStartRestartGroup.endReplaceableGroup();
                                                                    Modifier modifierSemantics$default2 = SemanticsModifierKt.semantics$default(modifierOffset2, false, (Function1) objRememberedValue6, 1, null);
                                                                    composerStartRestartGroup.startReplaceableGroup(733328855);
                                                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy32 = BoxKt.rememberBoxMeasurePolicy(companion32.getTopStart(), false, composerStartRestartGroup, 0);
                                                                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                                                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                                                    CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                                                    Function0<ComposeUiNode> constructor32 = companion42.getConstructor();
                                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf32 = LayoutKt.modifierMaterializerOf(modifierSemantics$default2);
                                                                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                                                    }
                                                                    composerStartRestartGroup.startReusableNode();
                                                                    if (!composerStartRestartGroup.getInserting()) {
                                                                    }
                                                                    composerM10870constructorimpl3 = Updater.m10870constructorimpl(composerStartRestartGroup);
                                                                    Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy32, companion42.getSetMeasurePolicy());
                                                                    Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap32, companion42.getSetResolvedCompositionLocals());
                                                                    setCompositeKeyHash3 = companion42.getSetCompositeKeyHash();
                                                                    if (!composerM10870constructorimpl3.getInserting()) {
                                                                        composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                                        composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                                        function3ModifierMaterializerOf32.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                                                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                                                                        function2.invoke(composerStartRestartGroup, Integer.valueOf(i5 & 14));
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
                                                                        z6 = z72;
                                                                        modifier2 = modifier32;
                                                                    }
                                                                }
                                                            } else {
                                                                zChanged3 = composerStartRestartGroup.changed(strM9866getStringNWtq28) | ((i102 <= 256 && composerStartRestartGroup.changed(drawerState2)) || (i5 & 384) == 256) | composerStartRestartGroup.changedInstance(coroutineScope);
                                                                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                                                if (zChanged3) {
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                                        if (z5) {
                                                        }
                                                    }
                                                }
                                            } else {
                                                zChanged2 = composerStartRestartGroup.changed(f) | ((i102 <= 256 && composerStartRestartGroup.changed(drawerState2)) || (i5 & 384) == 256);
                                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                                if (zChanged2) {
                                                }
                                            }
                                        }
                                    } else {
                                        zChangedInstance = ((i5 & 7168) != 2048) | ((i102 <= 256 && composerStartRestartGroup.changed(drawerState2)) || (i5 & 384) == 256) | composerStartRestartGroup.changedInstance(coroutineScope);
                                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                        if (zChangedInstance) {
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        zChanged = ((i102 > 256 && composerStartRestartGroup.changed(drawerState2)) || (i5 & 384) == 256) | composerStartRestartGroup.changed(density) | composerStartRestartGroup.changed(f);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        f2 = 0.0f;
                        if (zChanged) {
                        }
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    drawerState2 = drawerStateRememberDrawerState;
                    z6 = z2;
                    scrimColor = j2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier4 = modifier2;
                    final long j3 = scrimColor;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i11) {
                            NavigationDrawerKt.m9600ModalNavigationDrawerFHprtrg(function2, modifier4, drawerState2, z6, j3, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            z2 = z;
            if ((i & CpioConstants.C_ISBLK) == 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((i3 & 74899) != 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i7 != 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if ((i2 & 16) == 0) {
                        i5 = i3;
                        drawerState2 = drawerStateRememberDrawerState;
                        z3 = z2;
                        scrimColor = j2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Strings.Companion companion222 = Strings.INSTANCE;
                    strM9866getStringNWtq28 = Strings_androidKt.m9866getStringNWtq28(Strings.m9797constructorimpl(C1841R.string.navigation_menu), composerStartRestartGroup, 0);
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    f = -density.mo7874toPx0680j_4(NavigationDrawerTokens.INSTANCE.m10526getContainerWidthD9Ej5fM());
                    composerStartRestartGroup.startReplaceableGroup(-1870335235);
                    int i1022 = (i5 & 896) ^ 384;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i & CpioConstants.C_ISBLK) == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i3 & 74899) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x018b  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DismissibleNavigationDrawer(@NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Modifier modifier, @Nullable DrawerState drawerState, boolean z, @NotNull final Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final DrawerState drawerStateRememberDrawerState;
        int i4;
        boolean z2;
        final Density density;
        final float f;
        boolean zChanged;
        Object objRememberedValue;
        Object objRememberedValue2;
        Composer.Companion companion;
        final CoroutineScope coroutineScope;
        final String strM9866getStringNWtq28;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z3;
        Object objRememberedValue3;
        int currentCompositeKeyHash2;
        Composer composerM10870constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        boolean zChanged2;
        Object objRememberedValue4;
        int currentCompositeKeyHash3;
        Composer composerM10870constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        int currentCompositeKeyHash4;
        Composer composerM10870constructorimpl4;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4;
        final DrawerState drawerState2;
        final boolean z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(398812198);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    drawerStateRememberDrawerState = drawerState;
                    int i6 = composerStartRestartGroup.changed(drawerStateRememberDrawerState) ? 256 : 128;
                    i3 |= i6;
                } else {
                    drawerStateRememberDrawerState = drawerState;
                }
                i3 |= i6;
            } else {
                drawerStateRememberDrawerState = drawerState;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= CpioConstants.C_ISBLK;
                } else if ((i & CpioConstants.C_ISBLK) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i5 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(398812198, i3, -1, "androidx.compose.material3.DismissibleNavigationDrawer (NavigationDrawer.kt:415)");
                    }
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    f = -density.mo7874toPx0680j_4(NavigationDrawerTokens.INSTANCE.m10526getContainerWidthD9Ej5fM());
                    composerStartRestartGroup.startReplaceableGroup(171918245);
                    int i7 = (i3 & 896) ^ 384;
                    zChanged = ((i7 <= 256 && composerStartRestartGroup.changed(drawerStateRememberDrawerState)) || (i3 & 384) == 256) | composerStartRestartGroup.changed(density) | composerStartRestartGroup.changed(f);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final float f2 = 0.0f;
                        objRememberedValue = new Function0<Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                drawerStateRememberDrawerState.setDensity$material3_release(density);
                                AnchoredDraggableState<DrawerValue> anchoredDraggableState$material3_release = drawerStateRememberDrawerState.getAnchoredDraggableState$material3_release();
                                final float f3 = f;
                                final float f4 = f2;
                                AnchoredDraggableState.updateAnchors$default(anchoredDraggableState$material3_release, AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<DrawerValue>, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<DrawerValue> draggableAnchorsConfig) {
                                        invoke2(draggableAnchorsConfig);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull DraggableAnchorsConfig<DrawerValue> draggableAnchorsConfig) {
                                        draggableAnchorsConfig.m96at(DrawerValue.Closed, f3);
                                        draggableAnchorsConfig.m96at(DrawerValue.Open, f4);
                                    }
                                }), null, 2, null);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.SideEffect((Function0) objRememberedValue, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(773894976);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        objRememberedValue2 = compositionScopedCoroutineScopeCanceller;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    Strings.Companion companion2 = Strings.INSTANCE;
                    strM9866getStringNWtq28 = Strings_androidKt.m9866getStringNWtq28(Strings.m9797constructorimpl(C1841R.string.navigation_menu), composerStartRestartGroup, 0);
                    Modifier modifierAnchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(modifier2, drawerStateRememberDrawerState.getAnchoredDraggableState$material3_release(), Orientation.Horizontal, z2, composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) != LayoutDirection.Rtl, null, 16, null);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierAnchoredDraggable$default);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                    if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(973031425);
                    z3 = (i7 <= 256 && composerStartRestartGroup.changed(drawerStateRememberDrawerState)) || (i3 & 384) == 256;
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (z3 || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new MeasurePolicy() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$2$1
                            @Override // androidx.compose.p003ui.layout.MeasurePolicy
                            @NotNull
                            /* renamed from: measure-3p2s80s */
                            public final MeasureResult mo7599measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                                final Placeable placeableMo12610measureBRTryo0 = list.get(0).mo12610measureBRTryo0(j);
                                final Placeable placeableMo12610measureBRTryo02 = list.get(1).mo12610measureBRTryo0(j);
                                int width = placeableMo12610measureBRTryo02.getWidth();
                                int height = placeableMo12610measureBRTryo02.getHeight();
                                final DrawerState drawerState3 = drawerStateRememberDrawerState;
                                return MeasureScope.layout$default(measureScope, width, height, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$2$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                        invoke2(placementScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12610measureBRTryo02, MathKt__MathJVMKt.roundToInt(drawerState3.requireOffset$material3_release()) + placeableMo12610measureBRTryo0.getWidth(), 0, 0.0f, 4, null);
                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12610measureBRTryo0, MathKt__MathJVMKt.roundToInt(drawerState3.requireOffset$material3_release()), 0, 0.0f, 4, null);
                                    }
                                }, 4, null);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue3;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                    Modifier modifier3 = modifier2;
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion5);
                    boolean z5 = z2;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                    if (!composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(94149472);
                    zChanged2 = composerStartRestartGroup.changed(strM9866getStringNWtq28) | ((i7 <= 256 && composerStartRestartGroup.changed(drawerStateRememberDrawerState)) || (i3 & 384) == 256) | composerStartRestartGroup.changedInstance(coroutineScope);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM9866getStringNWtq28);
                                if (drawerStateRememberDrawerState.isOpen()) {
                                    final DrawerState drawerState3 = drawerStateRememberDrawerState;
                                    final CoroutineScope coroutineScope2 = coroutineScope;
                                    SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final Boolean invoke() {
                                            if (drawerState3.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(DrawerValue.Closed).booleanValue()) {
                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(drawerState3, null), 3, null);
                                            }
                                            return Boolean.TRUE;
                                        }

                                        /* compiled from: NavigationDrawer.kt */
                                        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                        @DebugMetadata(m7119c = "androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1$1$1", m7120f = "NavigationDrawer.kt", m7121i = {}, m7122l = {455}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                        /* renamed from: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1$1$1, reason: invalid class name */
                                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            public final /* synthetic */ DrawerState $drawerState;
                                            public int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public AnonymousClass1(DrawerState drawerState, Continuation<? super AnonymousClass1> continuation) {
                                                super(2, continuation);
                                                this.$drawerState = drawerState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @NotNull
                                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                return new AnonymousClass1(this.$drawerState, continuation);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            @Nullable
                                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @Nullable
                                            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                int i = this.label;
                                                if (i == 0) {
                                                    ResultKt.throwOnFailure(obj);
                                                    DrawerState drawerState = this.$drawerState;
                                                    this.label = 1;
                                                    if (drawerState.close(this) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                } else {
                                                    if (i != 1) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    ResultKt.throwOnFailure(obj);
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }
                                    }, 1, null);
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion5, false, (Function1) objRememberedValue4, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierSemantics$default);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM10870constructorimpl3 = Updater.m10870constructorimpl(composerStartRestartGroup);
                    Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                    if (!composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf(i3 & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion5);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor4);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM10870constructorimpl4 = Updater.m10870constructorimpl(composerStartRestartGroup);
                    Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy3, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
                    setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
                    if (!composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    function22.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 12) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    drawerState2 = drawerStateRememberDrawerState;
                    modifier2 = modifier3;
                    z4 = z5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    drawerState2 = drawerStateRememberDrawerState;
                    z4 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier4 = modifier2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt.DismissibleNavigationDrawer.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i8) {
                            NavigationDrawerKt.DismissibleNavigationDrawer(function2, modifier4, drawerState2, z4, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            z2 = z;
            if ((i2 & 16) != 0) {
            }
            if ((i3 & 9363) != 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i5 != 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                    if (i4 != 0) {
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    f = -density.mo7874toPx0680j_4(NavigationDrawerTokens.INSTANCE.m10526getContainerWidthD9Ej5fM());
                    composerStartRestartGroup.startReplaceableGroup(171918245);
                    int i72 = (i3 & 896) ^ 384;
                    if (i72 <= 256) {
                        zChanged = ((i72 <= 256 && composerStartRestartGroup.changed(drawerStateRememberDrawerState)) || (i3 & 384) == 256) | composerStartRestartGroup.changed(density) | composerStartRestartGroup.changed(f);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            final float f22 = 0.0f;
                            objRememberedValue = new Function0<Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    drawerStateRememberDrawerState.setDensity$material3_release(density);
                                    AnchoredDraggableState<DrawerValue> anchoredDraggableState$material3_release = drawerStateRememberDrawerState.getAnchoredDraggableState$material3_release();
                                    final float f3 = f;
                                    final float f4 = f22;
                                    AnchoredDraggableState.updateAnchors$default(anchoredDraggableState$material3_release, AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<DrawerValue>, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<DrawerValue> draggableAnchorsConfig) {
                                            invoke2(draggableAnchorsConfig);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull DraggableAnchorsConfig<DrawerValue> draggableAnchorsConfig) {
                                            draggableAnchorsConfig.m96at(DrawerValue.Closed, f3);
                                            draggableAnchorsConfig.m96at(DrawerValue.Open, f4);
                                        }
                                    }), null, 2, null);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.SideEffect((Function0) objRememberedValue, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(773894976);
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue2 == companion.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
                            composerStartRestartGroup.endReplaceableGroup();
                            Strings.Companion companion22 = Strings.INSTANCE;
                            strM9866getStringNWtq28 = Strings_androidKt.m9866getStringNWtq28(Strings.m9797constructorimpl(C1841R.string.navigation_menu), composerStartRestartGroup, 0);
                            Modifier modifierAnchoredDraggable$default2 = AnchoredDraggableKt.anchoredDraggable$default(modifier2, drawerStateRememberDrawerState.getAnchoredDraggableState$material3_release(), Orientation.Horizontal, z2, composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) != LayoutDirection.Rtl, null, 16, null);
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            Alignment.Companion companion32 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(companion32.getTopStart(), false, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor5 = companion42.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierAnchoredDraggable$default2);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
                            }
                            composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy4, companion42.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap5, companion42.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion42.getSetCompositeKeyHash();
                            if (!composerM10870constructorimpl.getInserting()) {
                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                composerStartRestartGroup.startReplaceableGroup(973031425);
                                if (i72 <= 256) {
                                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    if (z3) {
                                        objRememberedValue3 = new MeasurePolicy() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$2$1
                                            @Override // androidx.compose.p003ui.layout.MeasurePolicy
                                            @NotNull
                                            /* renamed from: measure-3p2s80s */
                                            public final MeasureResult mo7599measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
                                                final Placeable placeableMo12610measureBRTryo0 = list.get(0).mo12610measureBRTryo0(j);
                                                final Placeable placeableMo12610measureBRTryo02 = list.get(1).mo12610measureBRTryo0(j);
                                                int width = placeableMo12610measureBRTryo02.getWidth();
                                                int height = placeableMo12610measureBRTryo02.getHeight();
                                                final DrawerState drawerState3 = drawerStateRememberDrawerState;
                                                return MeasureScope.layout$default(measureScope, width, height, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$2$1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                        invoke2(placementScope);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12610measureBRTryo02, MathKt__MathJVMKt.roundToInt(drawerState3.requireOffset$material3_release()) + placeableMo12610measureBRTryo0.getWidth(), 0, 0.0f, 4, null);
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12610measureBRTryo0, MathKt__MathJVMKt.roundToInt(drawerState3.requireOffset$material3_release()), 0, 0.0f, 4, null);
                                                    }
                                                }, 4, null);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                        MeasurePolicy measurePolicy2 = (MeasurePolicy) objRememberedValue3;
                                        composerStartRestartGroup.endReplaceableGroup();
                                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                        Modifier.Companion companion52 = Modifier.INSTANCE;
                                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        Function0<ComposeUiNode> constructor22 = companion42.getConstructor();
                                        Modifier modifier32 = modifier2;
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(companion52);
                                        boolean z52 = z2;
                                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                        }
                                        composerStartRestartGroup.startReusableNode();
                                        if (!composerStartRestartGroup.getInserting()) {
                                        }
                                        composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
                                        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicy2, companion42.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap22, companion42.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash2 = companion42.getSetCompositeKeyHash();
                                        if (!composerM10870constructorimpl2.getInserting()) {
                                            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            function3ModifierMaterializerOf22.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                                            composerStartRestartGroup.startReplaceableGroup(94149472);
                                            if (i72 <= 256) {
                                                zChanged2 = composerStartRestartGroup.changed(strM9866getStringNWtq28) | ((i72 <= 256 && composerStartRestartGroup.changed(drawerStateRememberDrawerState)) || (i3 & 384) == 256) | composerStartRestartGroup.changedInstance(coroutineScope);
                                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                                if (zChanged2) {
                                                    objRememberedValue4 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                            invoke2(semanticsPropertyReceiver);
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                            SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM9866getStringNWtq28);
                                                            if (drawerStateRememberDrawerState.isOpen()) {
                                                                final DrawerState drawerState3 = drawerStateRememberDrawerState;
                                                                final CoroutineScope coroutineScope2 = coroutineScope;
                                                                SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1.1
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    {
                                                                        super(0);
                                                                    }

                                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    @NotNull
                                                                    public final Boolean invoke() {
                                                                        if (drawerState3.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(DrawerValue.Closed).booleanValue()) {
                                                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(drawerState3, null), 3, null);
                                                                        }
                                                                        return Boolean.TRUE;
                                                                    }

                                                                    /* compiled from: NavigationDrawer.kt */
                                                                    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                                                    @DebugMetadata(m7119c = "androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1$1$1", m7120f = "NavigationDrawer.kt", m7121i = {}, m7122l = {455}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                                                    /* renamed from: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1$1$1, reason: invalid class name */
                                                                    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                        public final /* synthetic */ DrawerState $drawerState;
                                                                        public int label;

                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        public AnonymousClass1(DrawerState drawerState, Continuation<? super AnonymousClass1> continuation) {
                                                                            super(2, continuation);
                                                                            this.$drawerState = drawerState;
                                                                        }

                                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                        @NotNull
                                                                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                                            return new AnonymousClass1(this.$drawerState, continuation);
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function2
                                                                        @Nullable
                                                                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                        }

                                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                        @Nullable
                                                                        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                                                            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                            int i = this.label;
                                                                            if (i == 0) {
                                                                                ResultKt.throwOnFailure(obj);
                                                                                DrawerState drawerState = this.$drawerState;
                                                                                this.label = 1;
                                                                                if (drawerState.close(this) == coroutine_suspended) {
                                                                                    return coroutine_suspended;
                                                                                }
                                                                            } else {
                                                                                if (i != 1) {
                                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                }
                                                                                ResultKt.throwOnFailure(obj);
                                                                            }
                                                                            return Unit.INSTANCE;
                                                                        }
                                                                    }
                                                                }, 1, null);
                                                            }
                                                        }
                                                    };
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                                    composerStartRestartGroup.endReplaceableGroup();
                                                    Modifier modifierSemantics$default2 = SemanticsModifierKt.semantics$default(companion52, false, (Function1) objRememberedValue4, 1, null);
                                                    composerStartRestartGroup.startReplaceableGroup(733328855);
                                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(companion32.getTopStart(), false, composerStartRestartGroup, 0);
                                                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                                    CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                                    Function0<ComposeUiNode> constructor32 = companion42.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf32 = LayoutKt.modifierMaterializerOf(modifierSemantics$default2);
                                                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                                    }
                                                    composerStartRestartGroup.startReusableNode();
                                                    if (!composerStartRestartGroup.getInserting()) {
                                                    }
                                                    composerM10870constructorimpl3 = Updater.m10870constructorimpl(composerStartRestartGroup);
                                                    Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy22, companion42.getSetMeasurePolicy());
                                                    Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap32, companion42.getSetResolvedCompositionLocals());
                                                    setCompositeKeyHash3 = companion42.getSetCompositeKeyHash();
                                                    if (!composerM10870constructorimpl3.getInserting()) {
                                                        composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                        composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                        function3ModifierMaterializerOf32.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                                                        function2.invoke(composerStartRestartGroup, Integer.valueOf(i3 & 14));
                                                        composerStartRestartGroup.endReplaceableGroup();
                                                        composerStartRestartGroup.endNode();
                                                        composerStartRestartGroup.endReplaceableGroup();
                                                        composerStartRestartGroup.endReplaceableGroup();
                                                        composerStartRestartGroup.startReplaceableGroup(733328855);
                                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy32 = BoxKt.rememberBoxMeasurePolicy(companion32.getTopStart(), false, composerStartRestartGroup, 0);
                                                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                                        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                                        CompositionLocalMap currentCompositionLocalMap42 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                                        Function0<ComposeUiNode> constructor42 = companion42.getConstructor();
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf42 = LayoutKt.modifierMaterializerOf(companion52);
                                                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                                        }
                                                        composerStartRestartGroup.startReusableNode();
                                                        if (!composerStartRestartGroup.getInserting()) {
                                                        }
                                                        composerM10870constructorimpl4 = Updater.m10870constructorimpl(composerStartRestartGroup);
                                                        Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy32, companion42.getSetMeasurePolicy());
                                                        Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap42, companion42.getSetResolvedCompositionLocals());
                                                        setCompositeKeyHash4 = companion42.getSetCompositeKeyHash();
                                                        if (!composerM10870constructorimpl4.getInserting()) {
                                                            composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                            composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                                            function3ModifierMaterializerOf42.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                                                            function22.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 12) & 14));
                                                            composerStartRestartGroup.endReplaceableGroup();
                                                            composerStartRestartGroup.endNode();
                                                            composerStartRestartGroup.endReplaceableGroup();
                                                            composerStartRestartGroup.endReplaceableGroup();
                                                            composerStartRestartGroup.endReplaceableGroup();
                                                            composerStartRestartGroup.endNode();
                                                            composerStartRestartGroup.endReplaceableGroup();
                                                            composerStartRestartGroup.endReplaceableGroup();
                                                            composerStartRestartGroup.endNode();
                                                            composerStartRestartGroup.endReplaceableGroup();
                                                            composerStartRestartGroup.endReplaceableGroup();
                                                            if (ComposerKt.isTraceInProgress()) {
                                                            }
                                                            drawerState2 = drawerStateRememberDrawerState;
                                                            modifier2 = modifier32;
                                                            z4 = z52;
                                                        }
                                                    }
                                                }
                                            } else {
                                                zChanged2 = composerStartRestartGroup.changed(strM9866getStringNWtq28) | ((i72 <= 256 && composerStartRestartGroup.changed(drawerStateRememberDrawerState)) || (i3 & 384) == 256) | composerStartRestartGroup.changedInstance(coroutineScope);
                                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                                if (zChanged2) {
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    if (z3) {
                                    }
                                }
                            }
                        }
                    } else {
                        zChanged = ((i72 <= 256 && composerStartRestartGroup.changed(drawerStateRememberDrawerState)) || (i3 & 384) == 256) | composerStartRestartGroup.changed(density) | composerStartRestartGroup.changed(f);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i2 & 16) != 0) {
        }
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PermanentNavigationDrawer(@NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Modifier modifier, @NotNull final Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM10870constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-276843608);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function22) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-276843608, i3, -1, "androidx.compose.material3.PermanentNavigationDrawer (NavigationDrawer.kt:500)");
                }
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion.getTop(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                function2.invoke(composerStartRestartGroup, Integer.valueOf(i3 & 14));
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion3);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
                Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                function22.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 6) & 14));
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
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt.PermanentNavigationDrawer.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i5) {
                        NavigationDrawerKt.PermanentNavigationDrawer(function2, modifier4, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Arrangement.Horizontal start2 = Arrangement.INSTANCE.getStart();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(start2, companion4.getTop(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM10870constructorimpl.getInserting()) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                function2.invoke(composerStartRestartGroup, Integer.valueOf(i3 & 14));
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Modifier.Companion companion32 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(companion32);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
                Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM10870constructorimpl2.getInserting()) {
                    composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    function3ModifierMaterializerOf22.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    function22.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 6) & 14));
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
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e3  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: ModalDrawerSheet-afqeVBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9599ModalDrawerSheetafqeVBk(@Nullable Modifier modifier, @Nullable Shape shape, long j, long j2, float f, @Nullable WindowInsets windowInsets, @NotNull final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Shape shape2;
        long containerColor;
        long jM9292contentColorForek8zF_U;
        float fM9432getModalDrawerElevationD9Ej5fM;
        WindowInsets windowInsets2;
        Modifier modifier3;
        WindowInsets windowInsets3;
        float f2;
        final Shape shape3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1001163336);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                shape2 = shape;
                int i5 = composerStartRestartGroup.changed(shape2) ? 32 : 16;
                i3 |= i5;
            } else {
                shape2 = shape;
            }
            i3 |= i5;
        } else {
            shape2 = shape;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                containerColor = j;
                int i6 = composerStartRestartGroup.changed(containerColor) ? 256 : 128;
                i3 |= i6;
            } else {
                containerColor = j;
            }
            i3 |= i6;
        } else {
            containerColor = j;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                jM9292contentColorForek8zF_U = j2;
                int i7 = composerStartRestartGroup.changed(jM9292contentColorForek8zF_U) ? 2048 : 1024;
                i3 |= i7;
            } else {
                jM9292contentColorForek8zF_U = j2;
            }
            i3 |= i7;
        } else {
            jM9292contentColorForek8zF_U = j2;
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i3 |= CpioConstants.C_ISBLK;
        } else {
            if ((i & CpioConstants.C_ISBLK) == 0) {
                fM9432getModalDrawerElevationD9Ej5fM = f;
                i3 |= composerStartRestartGroup.changed(fM9432getModalDrawerElevationD9Ej5fM) ? 16384 : 8192;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    windowInsets2 = windowInsets;
                    int i9 = composerStartRestartGroup.changed(windowInsets2) ? 131072 : 65536;
                    i3 |= i9;
                } else {
                    windowInsets2 = windowInsets;
                }
                i3 |= i9;
            } else {
                windowInsets2 = windowInsets;
            }
            if ((i2 & 64) != 0) {
                if ((i & 1572864) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                }
                if ((599187 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            shape2 = DrawerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        }
                        if ((i2 & 4) != 0) {
                            containerColor = DrawerDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            jM9292contentColorForek8zF_U = ColorSchemeKt.m9292contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i3 >> 6) & 14);
                            i3 &= -7169;
                        }
                        if (i8 != 0) {
                            fM9432getModalDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m9432getModalDrawerElevationD9Ej5fM();
                        }
                        if ((i2 & 32) == 0) {
                            i3 &= -458753;
                            windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                            f2 = fM9432getModalDrawerElevationD9Ej5fM;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1001163336, i3, -1, "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:534)");
                        }
                        int i10 = i3 << 3;
                        m9598DrawerSheetvywBR7E(windowInsets3, modifier3, shape2, containerColor, jM9292contentColorForek8zF_U, f2, function3, composerStartRestartGroup, ((i3 >> 15) & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (i10 & 458752) | (i3 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        fM9432getModalDrawerElevationD9Ej5fM = f2;
                        windowInsets2 = windowInsets3;
                        shape3 = shape2;
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        modifier3 = modifier2;
                    }
                    f2 = fM9432getModalDrawerElevationD9Ej5fM;
                    windowInsets3 = windowInsets2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i102 = i3 << 3;
                    m9598DrawerSheetvywBR7E(windowInsets3, modifier3, shape2, containerColor, jM9292contentColorForek8zF_U, f2, function3, composerStartRestartGroup, ((i3 >> 15) & 14) | (i102 & 112) | (i102 & 896) | (i102 & 7168) | (57344 & i102) | (i102 & 458752) | (i3 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    fM9432getModalDrawerElevationD9Ej5fM = f2;
                    windowInsets2 = windowInsets3;
                    shape3 = shape2;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    shape3 = shape2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier4 = modifier2;
                    final long j3 = containerColor;
                    final long j4 = jM9292contentColorForek8zF_U;
                    final float f3 = fM9432getModalDrawerElevationD9Ej5fM;
                    final WindowInsets windowInsets4 = windowInsets2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalDrawerSheet$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i11) {
                            NavigationDrawerKt.m9599ModalDrawerSheetafqeVBk(modifier4, shape3, j3, j4, f3, windowInsets4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 1572864;
            if ((599187 & i3) != 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i4 == 0) {
                    }
                    if ((i2 & 2) != 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                    if ((i2 & 8) != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if ((i2 & 32) == 0) {
                        f2 = fM9432getModalDrawerElevationD9Ej5fM;
                        windowInsets3 = windowInsets2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i1022 = i3 << 3;
                    m9598DrawerSheetvywBR7E(windowInsets3, modifier3, shape2, containerColor, jM9292contentColorForek8zF_U, f2, function3, composerStartRestartGroup, ((i3 >> 15) & 14) | (i1022 & 112) | (i1022 & 896) | (i1022 & 7168) | (57344 & i1022) | (i1022 & 458752) | (i3 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    fM9432getModalDrawerElevationD9Ej5fM = f2;
                    windowInsets2 = windowInsets3;
                    shape3 = shape2;
                    modifier2 = modifier3;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        fM9432getModalDrawerElevationD9Ej5fM = f;
        if ((196608 & i) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((599187 & i3) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e8  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: DismissibleDrawerSheet-afqeVBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9597DismissibleDrawerSheetafqeVBk(@Nullable Modifier modifier, @Nullable Shape shape, long j, long j2, float f, @Nullable WindowInsets windowInsets, @NotNull final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Shape rectangleShape;
        long containerColor;
        long jM9292contentColorForek8zF_U;
        int i4;
        float fM9430getDismissibleDrawerElevationD9Ej5fM;
        WindowInsets windowInsets2;
        Modifier modifier2;
        WindowInsets windowInsets3;
        int i5;
        long j3;
        float f2;
        Modifier modifier3;
        final float f3;
        final WindowInsets windowInsets4;
        final long j4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-588600583);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                rectangleShape = shape;
                i3 |= composerStartRestartGroup.changed(rectangleShape) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    containerColor = j;
                    int i8 = composerStartRestartGroup.changed(containerColor) ? 256 : 128;
                    i3 |= i8;
                } else {
                    containerColor = j;
                }
                i3 |= i8;
            } else {
                containerColor = j;
            }
            if ((i & 3072) != 0) {
                jM9292contentColorForek8zF_U = j2;
                i3 |= ((i2 & 8) == 0 && composerStartRestartGroup.changed(jM9292contentColorForek8zF_U)) ? 2048 : 1024;
            } else {
                jM9292contentColorForek8zF_U = j2;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= CpioConstants.C_ISBLK;
            } else {
                if ((i & CpioConstants.C_ISBLK) == 0) {
                    fM9430getDismissibleDrawerElevationD9Ej5fM = f;
                    i3 |= composerStartRestartGroup.changed(fM9430getDismissibleDrawerElevationD9Ej5fM) ? 16384 : 8192;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        windowInsets2 = windowInsets;
                        int i9 = composerStartRestartGroup.changed(windowInsets2) ? 131072 : 65536;
                        i3 |= i9;
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    i3 |= i9;
                } else {
                    windowInsets2 = windowInsets;
                }
                if ((i2 & 64) == 0) {
                    if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                    }
                    if ((i3 & 599187) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            modifier2 = i6 == 0 ? Modifier.INSTANCE : modifier;
                            if (i7 != 0) {
                                rectangleShape = RectangleShapeKt.getRectangleShape();
                            }
                            if ((i2 & 4) != 0) {
                                containerColor = DrawerDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                jM9292contentColorForek8zF_U = ColorSchemeKt.m9292contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i3 >> 6) & 14);
                                i3 &= -7169;
                            }
                            if (i4 != 0) {
                                fM9430getDismissibleDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m9430getDismissibleDrawerElevationD9Ej5fM();
                            }
                            if ((i2 & 32) == 0) {
                                windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                                i5 = i3 & (-458753);
                                j3 = jM9292contentColorForek8zF_U;
                                f2 = fM9430getDismissibleDrawerElevationD9Ej5fM;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-588600583, i5, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:571)");
                            }
                            int i10 = i5 << 3;
                            m9598DrawerSheetvywBR7E(windowInsets3, modifier2, rectangleShape, containerColor, j3, f2, function3, composerStartRestartGroup, ((i5 >> 15) & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (i10 & 458752) | (i5 & 3670016), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            jM9292contentColorForek8zF_U = j3;
                            modifier3 = modifier2;
                            long j5 = containerColor;
                            f3 = f2;
                            windowInsets4 = windowInsets3;
                            j4 = j5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            modifier2 = modifier;
                        }
                        i5 = i3;
                        j3 = jM9292contentColorForek8zF_U;
                        f2 = fM9430getDismissibleDrawerElevationD9Ej5fM;
                        windowInsets3 = windowInsets2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i102 = i5 << 3;
                        m9598DrawerSheetvywBR7E(windowInsets3, modifier2, rectangleShape, containerColor, j3, f2, function3, composerStartRestartGroup, ((i5 >> 15) & 14) | (i102 & 112) | (i102 & 896) | (i102 & 7168) | (57344 & i102) | (i102 & 458752) | (i5 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        jM9292contentColorForek8zF_U = j3;
                        modifier3 = modifier2;
                        long j52 = containerColor;
                        f3 = f2;
                        windowInsets4 = windowInsets3;
                        j4 = j52;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        j4 = containerColor;
                        f3 = fM9430getDismissibleDrawerElevationD9Ej5fM;
                        windowInsets4 = windowInsets2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final Modifier modifier4 = modifier3;
                        final Shape shape2 = rectangleShape;
                        final long j6 = jM9292contentColorForek8zF_U;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleDrawerSheet$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i11) {
                                NavigationDrawerKt.m9597DismissibleDrawerSheetafqeVBk(modifier4, shape2, j4, j6, f3, windowInsets4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 1572864;
                if ((i3 & 599187) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i6 == 0) {
                        }
                        if (i7 != 0) {
                        }
                        if ((i2 & 4) != 0) {
                        }
                        if ((i2 & 8) != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if ((i2 & 32) == 0) {
                            i5 = i3;
                            j3 = jM9292contentColorForek8zF_U;
                            f2 = fM9430getDismissibleDrawerElevationD9Ej5fM;
                            windowInsets3 = windowInsets2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i1022 = i5 << 3;
                        m9598DrawerSheetvywBR7E(windowInsets3, modifier2, rectangleShape, containerColor, j3, f2, function3, composerStartRestartGroup, ((i5 >> 15) & 14) | (i1022 & 112) | (i1022 & 896) | (i1022 & 7168) | (57344 & i1022) | (i1022 & 458752) | (i5 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        jM9292contentColorForek8zF_U = j3;
                        modifier3 = modifier2;
                        long j522 = containerColor;
                        f3 = f2;
                        windowInsets4 = windowInsets3;
                        j4 = j522;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            fM9430getDismissibleDrawerElevationD9Ej5fM = f;
            if ((196608 & i) == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if ((i3 & 599187) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        rectangleShape = shape;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        fM9430getDismissibleDrawerElevationD9Ej5fM = f;
        if ((196608 & i) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((i3 & 599187) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e8  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: PermanentDrawerSheet-afqeVBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9601PermanentDrawerSheetafqeVBk(@Nullable Modifier modifier, @Nullable Shape shape, long j, long j2, float f, @Nullable WindowInsets windowInsets, @NotNull final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Shape rectangleShape;
        long containerColor;
        long jM9292contentColorForek8zF_U;
        int i4;
        float fM9433getPermanentDrawerElevationD9Ej5fM;
        WindowInsets windowInsets2;
        Modifier modifier2;
        WindowInsets windowInsets3;
        int i5;
        long j3;
        float f2;
        final String strM9866getStringNWtq28;
        boolean zChanged;
        Object objRememberedValue;
        Modifier modifier3;
        final float f3;
        final WindowInsets windowInsets4;
        final long j4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1733353241);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                rectangleShape = shape;
                i3 |= composerStartRestartGroup.changed(rectangleShape) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    containerColor = j;
                    int i8 = composerStartRestartGroup.changed(containerColor) ? 256 : 128;
                    i3 |= i8;
                } else {
                    containerColor = j;
                }
                i3 |= i8;
            } else {
                containerColor = j;
            }
            if ((i & 3072) != 0) {
                jM9292contentColorForek8zF_U = j2;
                i3 |= ((i2 & 8) == 0 && composerStartRestartGroup.changed(jM9292contentColorForek8zF_U)) ? 2048 : 1024;
            } else {
                jM9292contentColorForek8zF_U = j2;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= CpioConstants.C_ISBLK;
            } else {
                if ((i & CpioConstants.C_ISBLK) == 0) {
                    fM9433getPermanentDrawerElevationD9Ej5fM = f;
                    i3 |= composerStartRestartGroup.changed(fM9433getPermanentDrawerElevationD9Ej5fM) ? 16384 : 8192;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        windowInsets2 = windowInsets;
                        int i9 = composerStartRestartGroup.changed(windowInsets2) ? 131072 : 65536;
                        i3 |= i9;
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    i3 |= i9;
                } else {
                    windowInsets2 = windowInsets;
                }
                if ((i2 & 64) == 0) {
                    if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                    }
                    if ((i3 & 599187) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            modifier2 = i6 == 0 ? Modifier.INSTANCE : modifier;
                            if (i7 != 0) {
                                rectangleShape = RectangleShapeKt.getRectangleShape();
                            }
                            if ((i2 & 4) != 0) {
                                containerColor = DrawerDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                jM9292contentColorForek8zF_U = ColorSchemeKt.m9292contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i3 >> 6) & 14);
                                i3 &= -7169;
                            }
                            if (i4 != 0) {
                                fM9433getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m9433getPermanentDrawerElevationD9Ej5fM();
                            }
                            if ((i2 & 32) == 0) {
                                windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                                i5 = i3 & (-458753);
                                j3 = jM9292contentColorForek8zF_U;
                                f2 = fM9433getPermanentDrawerElevationD9Ej5fM;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1733353241, i5, -1, "androidx.compose.material3.PermanentDrawerSheet (NavigationDrawer.kt:608)");
                            }
                            Strings.Companion companion = Strings.INSTANCE;
                            strM9866getStringNWtq28 = Strings_androidKt.m9866getStringNWtq28(Strings.m9797constructorimpl(C1841R.string.navigation_menu), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(705343847);
                            zChanged = composerStartRestartGroup.changed(strM9866getStringNWtq28);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$PermanentDrawerSheet$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM9866getStringNWtq28);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            int i10 = i5 << 3;
                            m9598DrawerSheetvywBR7E(windowInsets3, SemanticsModifierKt.semantics$default(modifier2, false, (Function1) objRememberedValue, 1, null), rectangleShape, containerColor, j3, f2, function3, composerStartRestartGroup, ((i5 >> 15) & 14) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (i10 & 458752) | (i5 & 3670016), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            jM9292contentColorForek8zF_U = j3;
                            modifier3 = modifier2;
                            long j5 = containerColor;
                            f3 = f2;
                            windowInsets4 = windowInsets3;
                            j4 = j5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            modifier2 = modifier;
                        }
                        i5 = i3;
                        j3 = jM9292contentColorForek8zF_U;
                        f2 = fM9433getPermanentDrawerElevationD9Ej5fM;
                        windowInsets3 = windowInsets2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Strings.Companion companion2 = Strings.INSTANCE;
                        strM9866getStringNWtq28 = Strings_androidKt.m9866getStringNWtq28(Strings.m9797constructorimpl(C1841R.string.navigation_menu), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(705343847);
                        zChanged = composerStartRestartGroup.changed(strM9866getStringNWtq28);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$PermanentDrawerSheet$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM9866getStringNWtq28);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceableGroup();
                            int i102 = i5 << 3;
                            m9598DrawerSheetvywBR7E(windowInsets3, SemanticsModifierKt.semantics$default(modifier2, false, (Function1) objRememberedValue, 1, null), rectangleShape, containerColor, j3, f2, function3, composerStartRestartGroup, ((i5 >> 15) & 14) | (i102 & 896) | (i102 & 7168) | (57344 & i102) | (i102 & 458752) | (i5 & 3670016), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            jM9292contentColorForek8zF_U = j3;
                            modifier3 = modifier2;
                            long j52 = containerColor;
                            f3 = f2;
                            windowInsets4 = windowInsets3;
                            j4 = j52;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        j4 = containerColor;
                        f3 = fM9433getPermanentDrawerElevationD9Ej5fM;
                        windowInsets4 = windowInsets2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final Modifier modifier4 = modifier3;
                        final Shape shape2 = rectangleShape;
                        final long j6 = jM9292contentColorForek8zF_U;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$PermanentDrawerSheet$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i11) {
                                NavigationDrawerKt.m9601PermanentDrawerSheetafqeVBk(modifier4, shape2, j4, j6, f3, windowInsets4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 1572864;
                if ((i3 & 599187) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i6 == 0) {
                        }
                        if (i7 != 0) {
                        }
                        if ((i2 & 4) != 0) {
                        }
                        if ((i2 & 8) != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if ((i2 & 32) == 0) {
                            i5 = i3;
                            j3 = jM9292contentColorForek8zF_U;
                            f2 = fM9433getPermanentDrawerElevationD9Ej5fM;
                            windowInsets3 = windowInsets2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Strings.Companion companion22 = Strings.INSTANCE;
                        strM9866getStringNWtq28 = Strings_androidKt.m9866getStringNWtq28(Strings.m9797constructorimpl(C1841R.string.navigation_menu), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(705343847);
                        zChanged = composerStartRestartGroup.changed(strM9866getStringNWtq28);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            fM9433getPermanentDrawerElevationD9Ej5fM = f;
            if ((196608 & i) == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if ((i3 & 599187) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        rectangleShape = shape;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        fM9433getPermanentDrawerElevationD9Ej5fM = f;
        if ((196608 & i) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((i3 & 599187) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0111  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: DrawerSheet-vywBR7E, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9598DrawerSheetvywBR7E(final WindowInsets windowInsets, Modifier modifier, Shape shape, long j, long j2, float f, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Shape shape2;
        long j3;
        long j4;
        int i5;
        float f2;
        Modifier modifier2;
        Shape rectangleShape;
        long containerColor;
        long jM9292contentColorForek8zF_U;
        long j5;
        float fM9433getPermanentDrawerElevationD9Ej5fM;
        Modifier modifier3;
        final float f3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(175072821);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(windowInsets) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    shape2 = shape;
                    i3 |= composerStartRestartGroup.changed(shape2) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    j3 = j;
                    i3 |= ((i2 & 8) == 0 && composerStartRestartGroup.changed(j3)) ? 2048 : 1024;
                } else {
                    j3 = j;
                }
                if ((i & CpioConstants.C_ISBLK) == 0) {
                    j4 = j2;
                    i3 |= ((i2 & 16) == 0 && composerStartRestartGroup.changed(j4)) ? 16384 : 8192;
                } else {
                    j4 = j2;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((196608 & i) == 0) {
                        f2 = f;
                        i3 |= composerStartRestartGroup.changed(f2) ? 131072 : 65536;
                    }
                    if ((i2 & 64) == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                    }
                    if ((i3 & 599187) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            modifier2 = i6 == 0 ? Modifier.INSTANCE : modifier;
                            rectangleShape = i4 == 0 ? RectangleShapeKt.getRectangleShape() : shape2;
                            if ((i2 & 8) == 0) {
                                containerColor = DrawerDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i3 &= -7169;
                            } else {
                                containerColor = j3;
                            }
                            if ((i2 & 16) == 0) {
                                jM9292contentColorForek8zF_U = ColorSchemeKt.m9292contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i3 >> 9) & 14);
                                i3 &= -57345;
                            } else {
                                jM9292contentColorForek8zF_U = j4;
                            }
                            if (i5 == 0) {
                                fM9433getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m9433getPermanentDrawerElevationD9Ej5fM();
                                j5 = jM9292contentColorForek8zF_U;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(175072821, i3, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:632)");
                                }
                                int i7 = i3 >> 3;
                                SurfaceKt.m9876SurfaceT9BRK9s(SizeKt.fillMaxHeight$default(SizeKt.m8176sizeInqDBjuR0$default(modifier2, MinimumDrawerWidth, 0.0f, DrawerDefaults.INSTANCE.m9431getMaximumDrawerWidthD9Ej5fM(), 0.0f, 10, null), 0.0f, 1, null), rectangleShape, containerColor, j5, fM9433getPermanentDrawerElevationD9Ej5fM, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 959363152, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DrawerSheet$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
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
                                        if ((i8 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(959363152, i8, -1, "androidx.compose.material3.DrawerSheet.<anonymous> (NavigationDrawer.kt:645)");
                                            }
                                            Modifier modifierWindowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.m8176sizeInqDBjuR0$default(Modifier.INSTANCE, NavigationDrawerKt.MinimumDrawerWidth, 0.0f, DrawerDefaults.INSTANCE.m9431getMaximumDrawerWidthD9Ej5fM(), 0.0f, 10, null), windowInsets);
                                            Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                                            composer2.startReplaceableGroup(-483455358);
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                            composer2.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierWindowInsetsPadding);
                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor);
                                            } else {
                                                composer2.useNode();
                                            }
                                            Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                            composer2.startReplaceableGroup(2058660585);
                                            function32.invoke(ColumnScopeInstance.INSTANCE, composer2, 6);
                                            composer2.endReplaceableGroup();
                                            composer2.endNode();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }), composerStartRestartGroup, (i7 & 112) | 12582912 | (i7 & 896) | (i7 & 7168) | (i7 & 57344), 96);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier2;
                                f3 = fM9433getPermanentDrawerElevationD9Ej5fM;
                            } else {
                                j5 = jM9292contentColorForek8zF_U;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            modifier2 = modifier;
                            rectangleShape = shape2;
                            containerColor = j3;
                            j5 = j4;
                        }
                        fM9433getPermanentDrawerElevationD9Ej5fM = f2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i72 = i3 >> 3;
                        SurfaceKt.m9876SurfaceT9BRK9s(SizeKt.fillMaxHeight$default(SizeKt.m8176sizeInqDBjuR0$default(modifier2, MinimumDrawerWidth, 0.0f, DrawerDefaults.INSTANCE.m9431getMaximumDrawerWidthD9Ej5fM(), 0.0f, 10, null), 0.0f, 1, null), rectangleShape, containerColor, j5, fM9433getPermanentDrawerElevationD9Ej5fM, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 959363152, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DrawerSheet$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
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
                                if ((i8 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(959363152, i8, -1, "androidx.compose.material3.DrawerSheet.<anonymous> (NavigationDrawer.kt:645)");
                                    }
                                    Modifier modifierWindowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.m8176sizeInqDBjuR0$default(Modifier.INSTANCE, NavigationDrawerKt.MinimumDrawerWidth, 0.0f, DrawerDefaults.INSTANCE.m9431getMaximumDrawerWidthD9Ej5fM(), 0.0f, 10, null), windowInsets);
                                    Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                                    composer2.startReplaceableGroup(-483455358);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                    composer2.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierWindowInsetsPadding);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    function32.invoke(ColumnScopeInstance.INSTANCE, composer2, 6);
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }), composerStartRestartGroup, (i72 & 112) | 12582912 | (i72 & 896) | (i72 & 7168) | (i72 & 57344), 96);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier2;
                        f3 = fM9433getPermanentDrawerElevationD9Ej5fM;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        rectangleShape = shape2;
                        containerColor = j3;
                        j5 = j4;
                        f3 = f2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final Modifier modifier4 = modifier3;
                        final Shape shape3 = rectangleShape;
                        final long j6 = containerColor;
                        final long j7 = j5;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DrawerSheet$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i8) {
                                NavigationDrawerKt.m9598DrawerSheetvywBR7E(windowInsets, modifier4, shape3, j6, j7, f3, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                f2 = f;
                if ((i2 & 64) == 0) {
                }
                if ((i3 & 599187) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i6 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 8) == 0) {
                        }
                        if ((i2 & 16) == 0) {
                        }
                        if (i5 == 0) {
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            shape2 = shape;
            if ((i & 3072) == 0) {
            }
            if ((i & CpioConstants.C_ISBLK) == 0) {
            }
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            f2 = f;
            if ((i2 & 64) == 0) {
            }
            if ((i3 & 599187) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        shape2 = shape;
        if ((i & 3072) == 0) {
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
        }
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        f2 = f;
        if ((i2 & 64) == 0) {
        }
        if ((i3 & 599187) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f1  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NavigationDrawerItem(@NotNull final Function2<? super Composer, ? super Integer, Unit> function2, final boolean z, @NotNull final Function0<Unit> function0, @Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function2<? super Composer, ? super Integer, Unit> function23, @Nullable Shape shape, @Nullable NavigationDrawerItemColors navigationDrawerItemColors, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Shape shape2;
        NavigationDrawerItemColors navigationDrawerItemColors2;
        int i6;
        Shape value;
        NavigationDrawerItemColors navigationDrawerItemColorsM9596colorsoq7We08;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier2;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Shape shape3;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i7;
        NavigationDrawerItemColors navigationDrawerItemColors3;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final Shape shape4;
        final MutableInteractionSource mutableInteractionSource3;
        final Modifier modifier3;
        final NavigationDrawerItemColors navigationDrawerItemColors4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1304626543);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= CpioConstants.C_ISBLK;
            } else {
                if ((i & CpioConstants.C_ISBLK) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((196608 & i) == 0) {
                        function24 = function23;
                        i3 |= composerStartRestartGroup.changedInstance(function24) ? 131072 : 65536;
                    }
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            shape2 = shape;
                            int i9 = composerStartRestartGroup.changed(shape2) ? 1048576 : 524288;
                            i3 |= i9;
                        } else {
                            shape2 = shape;
                        }
                        i3 |= i9;
                    } else {
                        shape2 = shape;
                    }
                    if ((12582912 & i) != 0) {
                        if ((i2 & 128) == 0) {
                            navigationDrawerItemColors2 = navigationDrawerItemColors;
                            int i10 = composerStartRestartGroup.changed(navigationDrawerItemColors2) ? 8388608 : 4194304;
                            i3 |= i10;
                        } else {
                            navigationDrawerItemColors2 = navigationDrawerItemColors;
                        }
                        i3 |= i10;
                    } else {
                        navigationDrawerItemColors2 = navigationDrawerItemColors;
                    }
                    i6 = i2 & 256;
                    if (i6 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    if ((i3 & 38347923) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier;
                            Function2<? super Composer, ? super Integer, Unit> function29 = i4 == 0 ? null : function22;
                            if (i5 != 0) {
                                function24 = null;
                            }
                            if ((i2 & 64) == 0) {
                                value = ShapesKt.getValue(NavigationDrawerTokens.INSTANCE.getActiveIndicatorShape(), composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                value = shape2;
                            }
                            if ((i2 & 128) == 0) {
                                navigationDrawerItemColorsM9596colorsoq7We08 = NavigationDrawerItemDefaults.INSTANCE.m9596colorsoq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 100663296, 255);
                                i3 &= -29360129;
                            } else {
                                navigationDrawerItemColorsM9596colorsoq7We08 = navigationDrawerItemColors2;
                            }
                            if (i6 == 0) {
                                composerStartRestartGroup.startReplaceableGroup(111536735);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            modifier2 = modifier4;
                            function25 = function29;
                            shape3 = value;
                            function26 = function24;
                            i7 = i3;
                            navigationDrawerItemColors3 = navigationDrawerItemColorsM9596colorsoq7We08;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                            }
                            modifier2 = modifier;
                            function25 = function22;
                            mutableInteractionSource2 = mutableInteractionSource;
                            i7 = i3;
                            function26 = function24;
                            shape3 = shape2;
                            navigationDrawerItemColors3 = navigationDrawerItemColors2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1304626543, i7, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:732)");
                        }
                        int i11 = i7 >> 3;
                        final Function2<? super Composer, ? super Integer, Unit> function210 = function25;
                        final NavigationDrawerItemColors navigationDrawerItemColors5 = navigationDrawerItemColors3;
                        final Function2<? super Composer, ? super Integer, Unit> function211 = function26;
                        NavigationDrawerItemColors navigationDrawerItemColors6 = navigationDrawerItemColors3;
                        Modifier modifier5 = modifier2;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m9877Surfaced85dljk(z, function0, SizeKt.fillMaxWidth$default(SizeKt.m8158height3ABfNKs(SemanticsModifierKt.semantics$default(modifier2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt.NavigationDrawerItem.2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.m13009setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m12999getTabo7Vup1c());
                            }
                        }, 1, null), NavigationDrawerTokens.INSTANCE.m10524getActiveIndicatorHeightD9Ej5fM()), 0.0f, 1, null), false, shape3, navigationDrawerItemColors3.containerColor(z, composerStartRestartGroup, (i11 & 14) | ((i7 >> 18) & 112)).getValue().m11350unboximpl(), 0L, 0.0f, 0.0f, (BorderStroke) null, mutableInteractionSource2, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, 191488423, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt.NavigationDrawerItem.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i12) {
                                if ((i12 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(191488423, i12, -1, "androidx.compose.material3.NavigationDrawerItem.<anonymous> (NavigationDrawer.kt:744)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(companion, C2046Dp.m13666constructorimpl(16), 0.0f, C2046Dp.m13666constructorimpl(24), 0.0f, 10, null);
                                    Alignment.Companion companion2 = Alignment.INSTANCE;
                                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                    Function2<Composer, Integer, Unit> function212 = function210;
                                    NavigationDrawerItemColors navigationDrawerItemColors7 = navigationDrawerItemColors5;
                                    boolean z2 = z;
                                    Function2<Composer, Integer, Unit> function213 = function211;
                                    Function2<Composer, Integer, Unit> function214 = function2;
                                    composer3.startReplaceableGroup(693286680);
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                                    composer3.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer3);
                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    composer3.startReplaceableGroup(-1538529193);
                                    if (function212 != null) {
                                        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(navigationDrawerItemColors7.iconColor(z2, composer3, 0).getValue().m11350unboximpl())), function212, composer3, ProvidedValue.$stable);
                                        SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion, C2046Dp.m13666constructorimpl(12)), composer3, 6);
                                    }
                                    composer3.endReplaceableGroup();
                                    Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
                                    composer3.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer3, 0);
                                    composer3.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierWeight$default);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor2);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer3);
                                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    ProvidedValue<Color> providedValueProvides = ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(navigationDrawerItemColors7.textColor(z2, composer3, 0).getValue().m11350unboximpl()));
                                    int i13 = ProvidedValue.$stable;
                                    CompositionLocalKt.CompositionLocalProvider(providedValueProvides, function214, composer3, i13);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.startReplaceableGroup(-533536502);
                                    if (function213 != null) {
                                        SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion, C2046Dp.m13666constructorimpl(12)), composer3, 6);
                                        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(navigationDrawerItemColors7.badgeColor(z2, composer3, 0).getValue().m11350unboximpl())), function213, composer3, i13);
                                    }
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, (i11 & 126) | ((i7 >> 6) & 57344), ((i7 >> 24) & 14) | 48, 968);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function27 = function25;
                        function28 = function26;
                        shape4 = shape3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier3 = modifier5;
                        navigationDrawerItemColors4 = navigationDrawerItemColors6;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        function27 = function22;
                        composer2 = composerStartRestartGroup;
                        function28 = function24;
                        shape4 = shape2;
                        navigationDrawerItemColors4 = navigationDrawerItemColors2;
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt.NavigationDrawerItem.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer3, int i12) {
                                NavigationDrawerKt.NavigationDrawerItem(function2, z, function0, modifier3, function27, function28, shape4, navigationDrawerItemColors4, mutableInteractionSource3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                function24 = function23;
                if ((1572864 & i) != 0) {
                }
                if ((12582912 & i) != 0) {
                }
                i6 = i2 & 256;
                if (i6 == 0) {
                }
                if ((i3 & 38347923) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 != 0) {
                        }
                        if ((i2 & 64) == 0) {
                        }
                        if ((i2 & 128) == 0) {
                        }
                        if (i6 == 0) {
                        }
                        modifier2 = modifier4;
                        function25 = function29;
                        shape3 = value;
                        function26 = function24;
                        i7 = i3;
                        navigationDrawerItemColors3 = navigationDrawerItemColorsM9596colorsoq7We08;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i112 = i7 >> 3;
                        final Function2<? super Composer, ? super Integer, Unit> function2102 = function25;
                        final NavigationDrawerItemColors navigationDrawerItemColors52 = navigationDrawerItemColors3;
                        final Function2<? super Composer, ? super Integer, Unit> function2112 = function26;
                        NavigationDrawerItemColors navigationDrawerItemColors62 = navigationDrawerItemColors3;
                        Modifier modifier52 = modifier2;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m9877Surfaced85dljk(z, function0, SizeKt.fillMaxWidth$default(SizeKt.m8158height3ABfNKs(SemanticsModifierKt.semantics$default(modifier2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt.NavigationDrawerItem.2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.m13009setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m12999getTabo7Vup1c());
                            }
                        }, 1, null), NavigationDrawerTokens.INSTANCE.m10524getActiveIndicatorHeightD9Ej5fM()), 0.0f, 1, null), false, shape3, navigationDrawerItemColors3.containerColor(z, composerStartRestartGroup, (i112 & 14) | ((i7 >> 18) & 112)).getValue().m11350unboximpl(), 0L, 0.0f, 0.0f, (BorderStroke) null, mutableInteractionSource2, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, 191488423, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt.NavigationDrawerItem.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i12) {
                                if ((i12 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(191488423, i12, -1, "androidx.compose.material3.NavigationDrawerItem.<anonymous> (NavigationDrawer.kt:744)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(companion, C2046Dp.m13666constructorimpl(16), 0.0f, C2046Dp.m13666constructorimpl(24), 0.0f, 10, null);
                                    Alignment.Companion companion2 = Alignment.INSTANCE;
                                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                    Function2<Composer, Integer, Unit> function212 = function2102;
                                    NavigationDrawerItemColors navigationDrawerItemColors7 = navigationDrawerItemColors52;
                                    boolean z2 = z;
                                    Function2<Composer, Integer, Unit> function213 = function2112;
                                    Function2<Composer, Integer, Unit> function214 = function2;
                                    composer3.startReplaceableGroup(693286680);
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                                    composer3.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer3);
                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    composer3.startReplaceableGroup(-1538529193);
                                    if (function212 != null) {
                                        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(navigationDrawerItemColors7.iconColor(z2, composer3, 0).getValue().m11350unboximpl())), function212, composer3, ProvidedValue.$stable);
                                        SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion, C2046Dp.m13666constructorimpl(12)), composer3, 6);
                                    }
                                    composer3.endReplaceableGroup();
                                    Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
                                    composer3.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer3, 0);
                                    composer3.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierWeight$default);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor2);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer3);
                                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    ProvidedValue<Color> providedValueProvides = ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(navigationDrawerItemColors7.textColor(z2, composer3, 0).getValue().m11350unboximpl()));
                                    int i13 = ProvidedValue.$stable;
                                    CompositionLocalKt.CompositionLocalProvider(providedValueProvides, function214, composer3, i13);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.startReplaceableGroup(-533536502);
                                    if (function213 != null) {
                                        SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion, C2046Dp.m13666constructorimpl(12)), composer3, 6);
                                        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(navigationDrawerItemColors7.badgeColor(z2, composer3, 0).getValue().m11350unboximpl())), function213, composer3, i13);
                                    }
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, (i112 & 126) | ((i7 >> 6) & 57344), ((i7 >> 24) & 14) | 48, 968);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function27 = function25;
                        function28 = function26;
                        shape4 = shape3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier3 = modifier52;
                        navigationDrawerItemColors4 = navigationDrawerItemColors62;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            function24 = function23;
            if ((1572864 & i) != 0) {
            }
            if ((12582912 & i) != 0) {
            }
            i6 = i2 & 256;
            if (i6 == 0) {
            }
            if ((i3 & 38347923) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        function24 = function23;
        if ((1572864 & i) != 0) {
        }
        if ((12582912 & i) != 0) {
        }
        i6 = i2 & 256;
        if (i6 == 0) {
        }
        if ((i3 & 38347923) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateFraction(float f, float f2, float f3) {
        return RangesKt___RangesKt.coerceIn((f3 - f) / (f2 - f), 0.0f, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Scrim-Bx497Mc, reason: not valid java name */
    public static final void m9602ScrimBx497Mc(final boolean z, final Function0<Unit> function0, final Function0<Float> function02, final long j, Composer composer, final int i) {
        int i2;
        Modifier modifierSemantics;
        Composer composerStartRestartGroup = composer.startRestartGroup(2106487387);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2106487387, i2, -1, "androidx.compose.material3.Scrim (NavigationDrawer.kt:918)");
            }
            Strings.Companion companion = Strings.INSTANCE;
            final String strM9866getStringNWtq28 = Strings_androidKt.m9866getStringNWtq28(Strings.m9797constructorimpl(C1841R.string.close_drawer), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1858700652);
            if (z) {
                Modifier.Companion companion2 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-1858700588);
                int i3 = i2 & 112;
                boolean z2 = i3 == 32;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new NavigationDrawerKt$Scrim$dismissDrawer$1$1(function0, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, function0, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue);
                composerStartRestartGroup.startReplaceableGroup(-1858700504);
                boolean zChanged = (i3 == 32) | composerStartRestartGroup.changed(strM9866getStringNWtq28);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$Scrim$dismissDrawer$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM9866getStringNWtq28);
                            final Function0<Unit> function03 = function0;
                            SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.NavigationDrawerKt$Scrim$dismissDrawer$2$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final Boolean invoke() {
                                    function03.invoke();
                                    return Boolean.TRUE;
                                }
                            }, 1, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                modifierSemantics = SemanticsModifierKt.semantics(modifierPointerInput, true, (Function1) objRememberedValue2);
            } else {
                modifierSemantics = Modifier.INSTANCE;
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierThen = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifierSemantics);
            composerStartRestartGroup.startReplaceableGroup(-1858700263);
            boolean z3 = ((i2 & 7168) == 2048) | ((i2 & 896) == 256);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$Scrim$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull DrawScope drawScope) {
                        DrawScope.m11884drawRectnJ9OG0$default(drawScope, j, 0L, 0L, function02.invoke().floatValue(), null, null, 0, 118, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierThen, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$Scrim$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i4) {
                    NavigationDrawerKt.m9602ScrimBx497Mc(z, function0, function02, j, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
