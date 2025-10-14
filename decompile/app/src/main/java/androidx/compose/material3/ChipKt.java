package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.AssistChipTokens;
import androidx.compose.material3.tokens.FilterChipTokens;
import androidx.compose.material3.tokens.InputChipTokens;
import androidx.compose.material3.tokens.SuggestionChipTokens;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p003ui.graphics.GraphicsLayerScope;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.layout.LayoutIdKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.semantics.Role;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.material.chip.Chip;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Chip.kt */
@Metadata(m7104d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a¦\u0001\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$H\u0007¢\u0006\u0002\u0010%\u001a¦\u0001\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010#\u001a\u00020$H\u0007¢\u0006\u0002\u0010'\u001a¹\u0001\u0010(\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0013\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0013\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00012\u0006\u0010#\u001a\u00020$H\u0003ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a\u0094\u0001\u00101\u001a\u00020\u00112\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0013\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0013\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0013\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0006\u00103\u001a\u00020,2\u0006\u00104\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b5\u00106\u001a¦\u0001\u00107\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$H\u0007¢\u0006\u0002\u0010%\u001a¦\u0001\u00107\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010#\u001a\u00020$H\u0007¢\u0006\u0002\u0010'\u001a®\u0001\u00108\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u00192\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020:2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010;2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$H\u0007¢\u0006\u0002\u0010<\u001a\u008f\u0001\u0010=\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010>\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$H\u0007¢\u0006\u0002\u0010?\u001a\u008f\u0001\u0010=\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010>\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010#\u001a\u00020$H\u0007¢\u0006\u0002\u0010@\u001a®\u0001\u0010A\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u00192\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020:2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010;2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$H\u0007¢\u0006\u0002\u0010<\u001aÅ\u0001\u0010B\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u00192\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020:2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010;2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$H\u0007¢\u0006\u0002\u0010C\u001aÎ\u0001\u0010D\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\u0006\u0010)\u001a\u00020*2\u0013\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0013\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0013\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020:2\b\u0010\u001f\u001a\u0004\u0018\u00010;2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00012\u0006\u0010#\u001a\u00020$H\u0003ø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001a\u008f\u0001\u0010G\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010>\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$H\u0007¢\u0006\u0002\u0010?\u001a\u008f\u0001\u0010G\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010>\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010#\u001a\u00020$H\u0007¢\u0006\u0002\u0010@\u001a&\u0010H\u001a\u00020\u00012\b\b\u0002\u0010I\u001a\u00020\u00192\b\b\u0002\u0010J\u001a\u00020\u00192\b\b\u0002\u0010K\u001a\u00020\u0019H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u000b\u001a\u00020\f*\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006L"}, m7105d2 = {"AssistChipPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "FilterChipPadding", "HorizontalElementsPadding", "Landroidx/compose/ui/unit/Dp;", "F", "LabelLayoutId", "", "LeadingIconLayoutId", "SuggestionChipPadding", "TrailingIconLayoutId", "defaultSuggestionChipColors", "Landroidx/compose/material3/ChipColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultSuggestionChipColors", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/ChipColors;", "AssistChip", "", "onClick", "Lkotlin/Function0;", "label", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", ChipKt.LeadingIconLayoutId, ChipKt.TrailingIconLayoutId, "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "elevation", "Landroidx/compose/material3/ChipElevation;", androidx.compose.material.OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/material3/ChipBorder;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", Chip.TAG, "labelTextStyle", "Landroidx/compose/ui/text/TextStyle;", "labelColor", "Landroidx/compose/ui/graphics/Color;", "minHeight", "paddingValues", "Chip-nkUnTEs", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "ChipContent", "avatar", "leadingIconColor", "trailingIconColor", "ChipContent-fe0OD_I", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V", "ElevatedAssistChip", "ElevatedFilterChip", "selected", "Landroidx/compose/material3/SelectableChipColors;", "Landroidx/compose/material3/SelectableChipElevation;", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "ElevatedSuggestionChip", "icon", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "FilterChip", "InputChip", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "SelectableChip", "SelectableChip-u0RnIRE", "(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "SuggestionChip", "inputChipPadding", "hasAvatar", "hasLeadingIcon", "hasTrailingIcon", "material3_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,2741:1\n1116#2,6:2742\n1116#2,6:2748\n1116#2,6:2754\n1116#2,6:2760\n1116#2,6:2766\n1116#2,6:2772\n1116#2,6:2778\n1116#2,6:2784\n1116#2,6:2790\n1116#2,6:2796\n1116#2,6:2802\n154#3:2808\n154#3:2809\n154#3:2810\n154#3:2811\n154#3:2812\n154#3:2813\n154#3:2814\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipKt\n*L\n124#1:2742,6\n204#1:2748,6\n275#1:2754,6\n354#1:2760,6\n435#1:2766,6\n514#1:2772,6\n598#1:2778,6\n693#1:2784,6\n770#1:2790,6\n838#1:2796,6\n914#1:2802,6\n1869#1:2808\n1870#1:2809\n1916#1:2810\n1917#1:2811\n2713#1:2812\n2714#1:2813\n2721#1:2814\n*E\n"})
/* loaded from: classes3.dex */
public final class ChipKt {

    @NotNull
    private static final PaddingValues AssistChipPadding;

    @NotNull
    private static final PaddingValues FilterChipPadding;
    private static final float HorizontalElementsPadding;

    @NotNull
    private static final String LabelLayoutId = "label";

    @NotNull
    private static final String LeadingIconLayoutId = "leadingIcon";

    @NotNull
    private static final PaddingValues SuggestionChipPadding;

    @NotNull
    private static final String TrailingIconLayoutId = "trailingIcon";

    /* compiled from: Chip.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.ChipKt$AssistChip$2 */
    /* loaded from: classes2.dex */
    public static final class C13612 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BorderStroke $border;
        public final /* synthetic */ ChipColors $colors;
        public final /* synthetic */ ChipElevation $elevation;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ Shape $shape;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13612(Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3) {
            super(2);
            function0 = function0;
            function2 = function2;
            modifier = modifier;
            z = z;
            function2 = function22;
            function2 = function23;
            shape = shape;
            chipColors = chipColors;
            chipElevation = chipElevation;
            borderStroke = borderStroke;
            mutableInteractionSource = mutableInteractionSource;
            i = i;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            ChipKt.AssistChip(function0, function2, modifier, z, function2, function2, shape, chipColors, chipElevation, borderStroke, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* compiled from: Chip.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.ChipKt$AssistChip$4 */
    /* loaded from: classes2.dex */
    public static final class C13624 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ChipBorder $border;
        public final /* synthetic */ ChipColors $colors;
        public final /* synthetic */ ChipElevation $elevation;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ Shape $shape;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13624(Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3) {
            super(2);
            function0 = function0;
            function2 = function2;
            modifier = modifier;
            z = z;
            function2 = function22;
            function2 = function23;
            shape = shape;
            chipColors = chipColors;
            chipElevation = chipElevation;
            chipBorder = chipBorder;
            mutableInteractionSource = mutableInteractionSource;
            i = i;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            ChipKt.AssistChip(function0, function2, modifier, z, function2, function2, shape, chipColors, chipElevation, chipBorder, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* compiled from: Chip.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.ChipKt$ElevatedAssistChip$2 */
    /* loaded from: classes2.dex */
    public static final class C13642 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BorderStroke $border;
        public final /* synthetic */ ChipColors $colors;
        public final /* synthetic */ ChipElevation $elevation;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ Shape $shape;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13642(Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3) {
            super(2);
            function0 = function0;
            function2 = function2;
            modifier = modifier;
            z = z;
            function2 = function22;
            function2 = function23;
            shape = shape;
            chipColors = chipColors;
            chipElevation = chipElevation;
            borderStroke = borderStroke;
            mutableInteractionSource = mutableInteractionSource;
            i = i;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            ChipKt.ElevatedAssistChip(function0, function2, modifier, z, function2, function2, shape, chipColors, chipElevation, borderStroke, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* compiled from: Chip.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.ChipKt$ElevatedAssistChip$4 */
    /* loaded from: classes2.dex */
    public static final class C13654 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ChipBorder $border;
        public final /* synthetic */ ChipColors $colors;
        public final /* synthetic */ ChipElevation $elevation;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ Shape $shape;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13654(Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3) {
            super(2);
            function0 = function0;
            function2 = function2;
            modifier = modifier;
            z = z;
            function2 = function22;
            function2 = function23;
            shape = shape;
            chipColors = chipColors;
            chipElevation = chipElevation;
            chipBorder = chipBorder;
            mutableInteractionSource = mutableInteractionSource;
            i = i;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            ChipKt.ElevatedAssistChip(function0, function2, modifier, z, function2, function2, shape, chipColors, chipElevation, chipBorder, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* compiled from: Chip.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.ChipKt$ElevatedFilterChip$2 */
    /* loaded from: classes2.dex */
    public static final class C13662 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BorderStroke $border;
        public final /* synthetic */ SelectableChipColors $colors;
        public final /* synthetic */ SelectableChipElevation $elevation;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ boolean $selected;
        public final /* synthetic */ Shape $shape;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13662(boolean z, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3) {
            super(2);
            z = z;
            function0 = function0;
            function2 = function2;
            modifier = modifier;
            z = z2;
            function2 = function22;
            function2 = function23;
            shape = shape;
            selectableChipColors = selectableChipColors;
            selectableChipElevation = selectableChipElevation;
            borderStroke = borderStroke;
            mutableInteractionSource = mutableInteractionSource;
            i = i;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            ChipKt.ElevatedFilterChip(z, function0, function2, modifier, z, function2, function2, shape, selectableChipColors, selectableChipElevation, borderStroke, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* compiled from: Chip.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.ChipKt$ElevatedSuggestionChip$2 */
    /* loaded from: classes2.dex */
    public static final class C13672 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BorderStroke $border;
        public final /* synthetic */ ChipColors $colors;
        public final /* synthetic */ ChipElevation $elevation;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $icon;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13672(Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z, Function2<? super Composer, ? super Integer, Unit> function22, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i, int i2) {
            super(2);
            function0 = function0;
            function2 = function2;
            modifier = modifier;
            z = z;
            function2 = function22;
            shape = shape;
            chipColors = chipColors;
            chipElevation = chipElevation;
            borderStroke = borderStroke;
            mutableInteractionSource = mutableInteractionSource;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            ChipKt.ElevatedSuggestionChip(function0, function2, modifier, z, function2, shape, chipColors, chipElevation, borderStroke, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: Chip.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.ChipKt$ElevatedSuggestionChip$4 */
    /* loaded from: classes2.dex */
    public static final class C13684 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ChipBorder $border;
        public final /* synthetic */ ChipColors $colors;
        public final /* synthetic */ ChipElevation $elevation;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $icon;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13684(Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z, Function2<? super Composer, ? super Integer, Unit> function22, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, int i, int i2) {
            super(2);
            function0 = function0;
            function2 = function2;
            modifier = modifier;
            z = z;
            function2 = function22;
            shape = shape;
            chipColors = chipColors;
            chipElevation = chipElevation;
            chipBorder = chipBorder;
            mutableInteractionSource = mutableInteractionSource;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            ChipKt.ElevatedSuggestionChip(function0, function2, modifier, z, function2, shape, chipColors, chipElevation, chipBorder, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: Chip.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.ChipKt$FilterChip$2 */
    /* loaded from: classes2.dex */
    public static final class C13692 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BorderStroke $border;
        public final /* synthetic */ SelectableChipColors $colors;
        public final /* synthetic */ SelectableChipElevation $elevation;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ boolean $selected;
        public final /* synthetic */ Shape $shape;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13692(boolean z, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3) {
            super(2);
            z = z;
            function0 = function0;
            function2 = function2;
            modifier = modifier;
            z = z2;
            function2 = function22;
            function2 = function23;
            shape = shape;
            selectableChipColors = selectableChipColors;
            selectableChipElevation = selectableChipElevation;
            borderStroke = borderStroke;
            mutableInteractionSource = mutableInteractionSource;
            i = i;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            ChipKt.FilterChip(z, function0, function2, modifier, z, function2, function2, shape, selectableChipColors, selectableChipElevation, borderStroke, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* compiled from: Chip.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.ChipKt$InputChip$3 */
    /* loaded from: classes2.dex */
    public static final class C13713 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $avatar;
        public final /* synthetic */ BorderStroke $border;
        public final /* synthetic */ SelectableChipColors $colors;
        public final /* synthetic */ SelectableChipElevation $elevation;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ boolean $selected;
        public final /* synthetic */ Shape $shape;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13713(boolean z, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3) {
            super(2);
            z = z;
            function0 = function0;
            function2 = function2;
            modifier = modifier;
            z = z2;
            function2 = function22;
            function2 = function23;
            function2 = function24;
            shape = shape;
            selectableChipColors = selectableChipColors;
            selectableChipElevation = selectableChipElevation;
            borderStroke = borderStroke;
            mutableInteractionSource = mutableInteractionSource;
            i = i;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            ChipKt.InputChip(z, function0, function2, modifier, z, function2, function2, function2, shape, selectableChipColors, selectableChipElevation, borderStroke, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* compiled from: Chip.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.ChipKt$SuggestionChip$2 */
    /* loaded from: classes2.dex */
    public static final class C13722 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BorderStroke $border;
        public final /* synthetic */ ChipColors $colors;
        public final /* synthetic */ ChipElevation $elevation;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $icon;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13722(Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z, Function2<? super Composer, ? super Integer, Unit> function22, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i, int i2) {
            super(2);
            function0 = function0;
            function2 = function2;
            modifier = modifier;
            z = z;
            function2 = function22;
            shape = shape;
            chipColors = chipColors;
            chipElevation = chipElevation;
            borderStroke = borderStroke;
            mutableInteractionSource = mutableInteractionSource;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            ChipKt.SuggestionChip(function0, function2, modifier, z, function2, shape, chipColors, chipElevation, borderStroke, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: Chip.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.ChipKt$SuggestionChip$4 */
    /* loaded from: classes2.dex */
    public static final class C13734 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ChipBorder $border;
        public final /* synthetic */ ChipColors $colors;
        public final /* synthetic */ ChipElevation $elevation;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $icon;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13734(Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z, Function2<? super Composer, ? super Integer, Unit> function22, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, int i, int i2) {
            super(2);
            function0 = function0;
            function2 = function2;
            modifier = modifier;
            z = z;
            function2 = function22;
            shape = shape;
            chipColors = chipColors;
            chipElevation = chipElevation;
            chipBorder = chipBorder;
            mutableInteractionSource = mutableInteractionSource;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            ChipKt.SuggestionChip(function0, function2, modifier, z, function2, shape, chipColors, chipElevation, chipBorder, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:229:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:385:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AssistChip(@NotNull Function0<Unit> function0, @NotNull Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Modifier modifier, boolean z, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function2<? super Composer, ? super Integer, Unit> function23, @Nullable Shape shape, @Nullable ChipColors chipColors, @Nullable ChipElevation chipElevation, @Nullable BorderStroke borderStroke, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Composer composer, int i, int i2, int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        ChipColors chipColorsAssistChipColors;
        int i8;
        int i9;
        int i10;
        Shape shape2;
        int i11;
        ChipElevation chipElevationM9139assistChipElevationaqJV_2Y;
        BorderStroke borderStrokeM9137assistChipBorderh1eTWw;
        int i12;
        MutableInteractionSource mutableInteractionSource2;
        BorderStroke borderStroke2;
        int i13;
        ChipElevation chipElevation2;
        Shape shape3;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i14;
        ChipElevation chipElevation3;
        BorderStroke borderStroke3;
        boolean z3;
        MutableInteractionSource mutableInteractionSource3;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Shape shape4;
        ChipColors chipColors2;
        Modifier modifier3;
        Function2<? super Composer, ? super Integer, Unit> function27;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(313450168);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i15 = i3 & 4;
        if (i15 != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 == 0) {
                    if ((i & CpioConstants.C_ISBLK) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    } else if ((i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function23) ? 131072 : 65536;
                    }
                    if ((i & 1572864) == 0) {
                        i4 |= ((i3 & 64) == 0 && composerStartRestartGroup.changed(shape)) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) != 0) {
                        if ((i3 & 128) == 0) {
                            chipColorsAssistChipColors = chipColors;
                            int i16 = composerStartRestartGroup.changed(chipColorsAssistChipColors) ? 8388608 : 4194304;
                            i4 |= i16;
                        } else {
                            chipColorsAssistChipColors = chipColors;
                        }
                        i4 |= i16;
                    } else {
                        chipColorsAssistChipColors = chipColors;
                    }
                    if ((i & 100663296) == 0) {
                        i4 |= ((i3 & 256) == 0 && composerStartRestartGroup.changed(chipElevation)) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    if ((i & 805306368) == 0) {
                        i4 |= ((i3 & 512) == 0 && composerStartRestartGroup.changed(borderStroke)) ? 536870912 : 268435456;
                    }
                    i8 = i3 & 1024;
                    if (i8 == 0) {
                        i9 = i8;
                        i10 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i9 = i8;
                        i10 = i2 | (composerStartRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                    } else {
                        i9 = i8;
                        i10 = i2;
                    }
                    if ((i4 & 306783379) != 306783378 && (i10 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        function26 = function23;
                        chipElevation3 = chipElevation;
                        borderStroke3 = borderStroke;
                        mutableInteractionSource3 = mutableInteractionSource;
                        chipColors2 = chipColorsAssistChipColors;
                        modifier3 = modifier2;
                        z3 = z2;
                        function27 = function22;
                        shape4 = shape;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        int i17 = i10;
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier4 = i15 == 0 ? Modifier.INSTANCE : modifier2;
                            boolean z4 = i5 == 0 ? true : z2;
                            Function2<? super Composer, ? super Integer, Unit> function28 = i6 == 0 ? null : function22;
                            Function2<? super Composer, ? super Integer, Unit> function29 = i7 == 0 ? null : function23;
                            if ((i3 & 64) == 0) {
                                i4 &= -3670017;
                                shape2 = AssistChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            } else {
                                shape2 = shape;
                            }
                            if ((i3 & 128) != 0) {
                                chipColorsAssistChipColors = AssistChipDefaults.INSTANCE.assistChipColors(composerStartRestartGroup, 6);
                                i4 &= -29360129;
                            }
                            int i18 = i4;
                            ChipColors chipColors3 = chipColorsAssistChipColors;
                            if ((i3 & 256) == 0) {
                                i11 = i17;
                                i18 &= -234881025;
                                chipElevationM9139assistChipElevationaqJV_2Y = AssistChipDefaults.INSTANCE.m9139assistChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                            } else {
                                i11 = i17;
                                chipElevationM9139assistChipElevationaqJV_2Y = chipElevation;
                            }
                            if ((i3 & 512) == 0) {
                                borderStrokeM9137assistChipBorderh1eTWw = AssistChipDefaults.INSTANCE.m9137assistChipBorderh1eTWw(z4, 0L, 0L, 0.0f, composerStartRestartGroup, ((i18 >> 9) & 14) | CpioConstants.C_ISBLK, 14);
                                i12 = i18 & (-1879048193);
                            } else {
                                borderStrokeM9137assistChipBorderh1eTWw = borderStroke;
                                i12 = i18;
                            }
                            if (i9 == 0) {
                                composerStartRestartGroup.startReplaceableGroup(839902005);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                modifier2 = modifier4;
                                borderStroke2 = borderStrokeM9137assistChipBorderh1eTWw;
                                i13 = i12;
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                                modifier2 = modifier4;
                                borderStroke2 = borderStrokeM9137assistChipBorderh1eTWw;
                                i13 = i12;
                            }
                            chipElevation2 = chipElevationM9139assistChipElevationaqJV_2Y;
                            shape3 = shape2;
                            z2 = z4;
                            function24 = function28;
                            function25 = function29;
                            chipColorsAssistChipColors = chipColors3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                            }
                            if ((i3 & 256) != 0) {
                                i4 &= -234881025;
                            }
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                            }
                            function24 = function22;
                            shape3 = shape;
                            chipElevation2 = chipElevation;
                            borderStroke2 = borderStroke;
                            mutableInteractionSource2 = mutableInteractionSource;
                            i11 = i17;
                            i13 = i4;
                            function25 = function23;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            i14 = i11;
                        } else {
                            i14 = i11;
                            ComposerKt.traceEventStart(313450168, i13, i14, "androidx.compose.material3.AssistChip (Chip.kt:124)");
                        }
                        int i19 = i13 << 6;
                        int i20 = ((i13 >> 6) & 14) | ((i13 << 3) & 112) | ((i13 >> 3) & 896) | (i19 & 7168) | (3670016 & i19) | (29360128 & i19) | (234881024 & i19) | (i19 & 1879048192);
                        int i21 = i13 >> 24;
                        m9240ChipnkUnTEs(modifier2, function0, z2, function2, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), AssistChipTokens.INSTANCE.getLabelTextFont()), chipColorsAssistChipColors.m9230labelColorvNxB06k$material3_release(z2), function24, function25, shape3, chipColorsAssistChipColors, chipElevation2, borderStroke2, AssistChipDefaults.INSTANCE.m9142getHeightD9Ej5fM(), AssistChipPadding, mutableInteractionSource2, composerStartRestartGroup, i20, (i21 & 112) | (i21 & 14) | 3456 | ((i14 << 12) & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        chipElevation3 = chipElevation2;
                        borderStroke3 = borderStroke2;
                        z3 = z2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        function26 = function25;
                        shape4 = shape3;
                        chipColors2 = chipColorsAssistChipColors;
                        modifier3 = modifier2;
                        function27 = function24;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.AssistChip.2
                            public final /* synthetic */ int $$changed;
                            public final /* synthetic */ int $$changed1;
                            public final /* synthetic */ int $$default;
                            public final /* synthetic */ BorderStroke $border;
                            public final /* synthetic */ ChipColors $colors;
                            public final /* synthetic */ ChipElevation $elevation;
                            public final /* synthetic */ boolean $enabled;
                            public final /* synthetic */ MutableInteractionSource $interactionSource;
                            public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                            public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                            public final /* synthetic */ Modifier $modifier;
                            public final /* synthetic */ Function0<Unit> $onClick;
                            public final /* synthetic */ Shape $shape;
                            public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public C13612(Function0<Unit> function02, Function2<? super Composer, ? super Integer, Unit> function210, Modifier modifier32, boolean z32, Function2<? super Composer, ? super Integer, Unit> function272, Function2<? super Composer, ? super Integer, Unit> function262, Shape shape42, ChipColors chipColors22, ChipElevation chipElevation32, BorderStroke borderStroke32, MutableInteractionSource mutableInteractionSource32, int i22, int i23, int i32) {
                                super(2);
                                function0 = function02;
                                function2 = function210;
                                modifier = modifier32;
                                z = z32;
                                function2 = function272;
                                function2 = function262;
                                shape = shape42;
                                chipColors = chipColors22;
                                chipElevation = chipElevation32;
                                borderStroke = borderStroke32;
                                mutableInteractionSource = mutableInteractionSource32;
                                i = i22;
                                i = i23;
                                i = i32;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i22) {
                                ChipKt.AssistChip(function0, function2, modifier, z, function2, function2, shape, chipColors, chipElevation, borderStroke, mutableInteractionSource, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= CpioConstants.C_ISBLK;
                i7 = i32 & 32;
                if (i7 == 0) {
                }
                if ((i22 & 1572864) == 0) {
                }
                if ((i22 & 12582912) != 0) {
                }
                if ((i22 & 100663296) == 0) {
                }
                if ((i22 & 805306368) == 0) {
                }
                i8 = i32 & 1024;
                if (i8 == 0) {
                }
                if ((i4 & 306783379) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    int i172 = i10;
                    if ((i22 & 1) != 0) {
                        if (i15 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if ((i32 & 64) == 0) {
                        }
                        if ((i32 & 128) != 0) {
                        }
                        int i182 = i4;
                        ChipColors chipColors32 = chipColorsAssistChipColors;
                        if ((i32 & 256) == 0) {
                        }
                        if ((i32 & 512) == 0) {
                        }
                        if (i9 == 0) {
                        }
                        chipElevation2 = chipElevationM9139assistChipElevationaqJV_2Y;
                        shape3 = shape2;
                        z2 = z4;
                        function24 = function28;
                        function25 = function29;
                        chipColorsAssistChipColors = chipColors32;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i192 = i13 << 6;
                        int i202 = ((i13 >> 6) & 14) | ((i13 << 3) & 112) | ((i13 >> 3) & 896) | (i192 & 7168) | (3670016 & i192) | (29360128 & i192) | (234881024 & i192) | (i192 & 1879048192);
                        int i212 = i13 >> 24;
                        m9240ChipnkUnTEs(modifier2, function02, z2, function210, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), AssistChipTokens.INSTANCE.getLabelTextFont()), chipColorsAssistChipColors.m9230labelColorvNxB06k$material3_release(z2), function24, function25, shape3, chipColorsAssistChipColors, chipElevation2, borderStroke2, AssistChipDefaults.INSTANCE.m9142getHeightD9Ej5fM(), AssistChipPadding, mutableInteractionSource2, composerStartRestartGroup, i202, (i212 & 112) | (i212 & 14) | 3456 | ((i14 << 12) & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        chipElevation32 = chipElevation2;
                        borderStroke32 = borderStroke2;
                        z32 = z2;
                        mutableInteractionSource32 = mutableInteractionSource2;
                        function262 = function25;
                        shape42 = shape3;
                        chipColors22 = chipColorsAssistChipColors;
                        modifier32 = modifier2;
                        function272 = function24;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i6 = i32 & 16;
            if (i6 == 0) {
            }
            i7 = i32 & 32;
            if (i7 == 0) {
            }
            if ((i22 & 1572864) == 0) {
            }
            if ((i22 & 12582912) != 0) {
            }
            if ((i22 & 100663296) == 0) {
            }
            if ((i22 & 805306368) == 0) {
            }
            i8 = i32 & 1024;
            if (i8 == 0) {
            }
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i32 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i32 & 16;
        if (i6 == 0) {
        }
        i7 = i32 & 32;
        if (i7 == 0) {
        }
        if ((i22 & 1572864) == 0) {
        }
        if ((i22 & 12582912) != 0) {
        }
        if ((i22 & 100663296) == 0) {
        }
        if ((i22 & 805306368) == 0) {
        }
        i8 = i32 & 1024;
        if (i8 == 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:237:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:401:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with AssistChip that take a BorderStroke instead", replaceWith = @ReplaceWith(expression = "AssistChip(onClick, label, modifier, enabled,leadingIcon, trailingIcon, shape, colors, elevation, border, interactionSource", imports = {}))
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void AssistChip(Function0 function0, Function2 function2, Modifier modifier, boolean z, Function2 function22, Function2 function23, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2, int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        ChipColors chipColorsAssistChipColors;
        int i8;
        int i9;
        int i10;
        Shape shape2;
        int i11;
        ChipElevation chipElevationM9139assistChipElevationaqJV_2Y;
        ChipBorder chipBorderM9136assistChipBorderd_3_b6Q;
        int i12;
        MutableInteractionSource mutableInteractionSource2;
        ChipBorder chipBorder2;
        int i13;
        Shape shape3;
        Function2 function24;
        Function2 function25;
        int i14;
        ChipColors chipColors2;
        Modifier modifier3;
        MutableInteractionSource mutableInteractionSource3;
        boolean z3;
        ChipElevation chipElevation2;
        ChipBorder chipBorder3;
        Function2 function26;
        Function2 function27;
        Shape shape4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1932300596);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i15 = i3 & 4;
        if (i15 != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 == 0) {
                    if ((i & CpioConstants.C_ISBLK) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    } else if ((i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function23) ? 131072 : 65536;
                    }
                    if ((i & 1572864) == 0) {
                        i4 |= ((i3 & 64) == 0 && composerStartRestartGroup.changed(shape)) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) != 0) {
                        if ((i3 & 128) == 0) {
                            chipColorsAssistChipColors = chipColors;
                            int i16 = composerStartRestartGroup.changed(chipColorsAssistChipColors) ? 8388608 : 4194304;
                            i4 |= i16;
                        } else {
                            chipColorsAssistChipColors = chipColors;
                        }
                        i4 |= i16;
                    } else {
                        chipColorsAssistChipColors = chipColors;
                    }
                    if ((i & 100663296) == 0) {
                        i4 |= ((i3 & 256) == 0 && composerStartRestartGroup.changed(chipElevation)) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    if ((i & 805306368) == 0) {
                        i4 |= ((i3 & 512) == 0 && composerStartRestartGroup.changed(chipBorder)) ? 536870912 : 268435456;
                    }
                    i8 = i3 & 1024;
                    if (i8 == 0) {
                        i9 = i8;
                        i10 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i9 = i8;
                        i10 = i2 | (composerStartRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                    } else {
                        i9 = i8;
                        i10 = i2;
                    }
                    if ((i4 & 306783379) != 306783378 && (i10 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        function27 = function23;
                        chipElevation2 = chipElevation;
                        chipBorder3 = chipBorder;
                        mutableInteractionSource3 = mutableInteractionSource;
                        chipColors2 = chipColorsAssistChipColors;
                        modifier3 = modifier2;
                        z3 = z2;
                        function26 = function22;
                        shape4 = shape;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        int i17 = i10;
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier4 = i15 == 0 ? Modifier.INSTANCE : modifier2;
                            boolean z4 = i5 == 0 ? true : z2;
                            Function2 function28 = i6 == 0 ? null : function22;
                            Function2 function29 = i7 == 0 ? null : function23;
                            if ((i3 & 64) == 0) {
                                i4 &= -3670017;
                                shape2 = AssistChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            } else {
                                shape2 = shape;
                            }
                            if ((i3 & 128) != 0) {
                                chipColorsAssistChipColors = AssistChipDefaults.INSTANCE.assistChipColors(composerStartRestartGroup, 6);
                                i4 &= -29360129;
                            }
                            int i18 = i4;
                            ChipColors chipColors3 = chipColorsAssistChipColors;
                            if ((i3 & 256) == 0) {
                                i11 = i17;
                                i18 &= -234881025;
                                chipElevationM9139assistChipElevationaqJV_2Y = AssistChipDefaults.INSTANCE.m9139assistChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                            } else {
                                i11 = i17;
                                chipElevationM9139assistChipElevationaqJV_2Y = chipElevation;
                            }
                            if ((i3 & 512) == 0) {
                                chipBorderM9136assistChipBorderd_3_b6Q = AssistChipDefaults.INSTANCE.m9136assistChipBorderd_3_b6Q(0L, 0L, 0.0f, composerStartRestartGroup, 3072, 7);
                                i12 = i18 & (-1879048193);
                            } else {
                                chipBorderM9136assistChipBorderd_3_b6Q = chipBorder;
                                i12 = i18;
                            }
                            if (i9 == 0) {
                                composerStartRestartGroup.startReplaceableGroup(839906043);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                modifier2 = modifier4;
                                chipBorder2 = chipBorderM9136assistChipBorderd_3_b6Q;
                                i13 = i12;
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                                modifier2 = modifier4;
                                chipBorder2 = chipBorderM9136assistChipBorderd_3_b6Q;
                                i13 = i12;
                            }
                            shape3 = shape2;
                            z2 = z4;
                            function24 = function28;
                            function25 = function29;
                            chipColorsAssistChipColors = chipColors3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                            }
                            if ((i3 & 256) != 0) {
                                i4 &= -234881025;
                            }
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                            }
                            function24 = function22;
                            shape3 = shape;
                            chipElevationM9139assistChipElevationaqJV_2Y = chipElevation;
                            chipBorder2 = chipBorder;
                            mutableInteractionSource2 = mutableInteractionSource;
                            i11 = i17;
                            i13 = i4;
                            function25 = function23;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            i14 = i11;
                        } else {
                            i14 = i11;
                            ComposerKt.traceEventStart(-1932300596, i13, i14, "androidx.compose.material3.AssistChip (Chip.kt:204)");
                        }
                        TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), AssistChipTokens.INSTANCE.getLabelTextFont());
                        long jM9230labelColorvNxB06k$material3_release = chipColorsAssistChipColors.m9230labelColorvNxB06k$material3_release(z2);
                        composerStartRestartGroup.startReplaceableGroup(839906470);
                        State<BorderStroke> stateBorderStroke$material3_release = chipBorder2 != null ? null : chipBorder2.borderStroke$material3_release(z2, composerStartRestartGroup, ((i13 >> 9) & 14) | ((i13 >> 24) & 112));
                        composerStartRestartGroup.endReplaceableGroup();
                        BorderStroke value = stateBorderStroke$material3_release == null ? stateBorderStroke$material3_release.getValue() : null;
                        ChipBorder chipBorder4 = chipBorder2;
                        int i19 = i13 << 6;
                        m9240ChipnkUnTEs(modifier2, function0, z2, function2, textStyleFromToken, jM9230labelColorvNxB06k$material3_release, function24, function25, shape3, chipColorsAssistChipColors, chipElevationM9139assistChipElevationaqJV_2Y, value, AssistChipDefaults.INSTANCE.m9142getHeightD9Ej5fM(), AssistChipPadding, mutableInteractionSource2, composerStartRestartGroup, ((i13 >> 3) & 896) | ((i13 >> 6) & 14) | ((i13 << 3) & 112) | (i19 & 7168) | (3670016 & i19) | (29360128 & i19) | (234881024 & i19) | (i19 & 1879048192), ((i13 >> 24) & 14) | 3456 | ((i14 << 12) & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        chipColors2 = chipColorsAssistChipColors;
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z3 = z2;
                        chipElevation2 = chipElevationM9139assistChipElevationaqJV_2Y;
                        chipBorder3 = chipBorder4;
                        function26 = function24;
                        function27 = function25;
                        shape4 = shape3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.AssistChip.4
                            public final /* synthetic */ int $$changed;
                            public final /* synthetic */ int $$changed1;
                            public final /* synthetic */ int $$default;
                            public final /* synthetic */ ChipBorder $border;
                            public final /* synthetic */ ChipColors $colors;
                            public final /* synthetic */ ChipElevation $elevation;
                            public final /* synthetic */ boolean $enabled;
                            public final /* synthetic */ MutableInteractionSource $interactionSource;
                            public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                            public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                            public final /* synthetic */ Modifier $modifier;
                            public final /* synthetic */ Function0<Unit> $onClick;
                            public final /* synthetic */ Shape $shape;
                            public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public C13624(Function0<Unit> function02, Function2<? super Composer, ? super Integer, Unit> function210, Modifier modifier32, boolean z32, Function2<? super Composer, ? super Integer, Unit> function262, Function2<? super Composer, ? super Integer, Unit> function272, Shape shape42, ChipColors chipColors22, ChipElevation chipElevation22, ChipBorder chipBorder32, MutableInteractionSource mutableInteractionSource32, int i20, int i22, int i32) {
                                super(2);
                                function0 = function02;
                                function2 = function210;
                                modifier = modifier32;
                                z = z32;
                                function2 = function262;
                                function2 = function272;
                                shape = shape42;
                                chipColors = chipColors22;
                                chipElevation = chipElevation22;
                                chipBorder = chipBorder32;
                                mutableInteractionSource = mutableInteractionSource32;
                                i = i20;
                                i = i22;
                                i = i32;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i20) {
                                ChipKt.AssistChip(function0, function2, modifier, z, function2, function2, shape, chipColors, chipElevation, chipBorder, mutableInteractionSource, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= CpioConstants.C_ISBLK;
                i7 = i32 & 32;
                if (i7 == 0) {
                }
                if ((i20 & 1572864) == 0) {
                }
                if ((i20 & 12582912) != 0) {
                }
                if ((i20 & 100663296) == 0) {
                }
                if ((i20 & 805306368) == 0) {
                }
                i8 = i32 & 1024;
                if (i8 == 0) {
                }
                if ((i4 & 306783379) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    int i172 = i10;
                    if ((i20 & 1) != 0) {
                        if (i15 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if ((i32 & 64) == 0) {
                        }
                        if ((i32 & 128) != 0) {
                        }
                        int i182 = i4;
                        ChipColors chipColors32 = chipColorsAssistChipColors;
                        if ((i32 & 256) == 0) {
                        }
                        if ((i32 & 512) == 0) {
                        }
                        if (i9 == 0) {
                        }
                        shape3 = shape2;
                        z2 = z4;
                        function24 = function28;
                        function25 = function29;
                        chipColorsAssistChipColors = chipColors32;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), AssistChipTokens.INSTANCE.getLabelTextFont());
                        long jM9230labelColorvNxB06k$material3_release2 = chipColorsAssistChipColors.m9230labelColorvNxB06k$material3_release(z2);
                        composerStartRestartGroup.startReplaceableGroup(839906470);
                        if (chipBorder2 != null) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (stateBorderStroke$material3_release == null) {
                        }
                        ChipBorder chipBorder42 = chipBorder2;
                        int i192 = i13 << 6;
                        m9240ChipnkUnTEs(modifier2, function02, z2, function210, textStyleFromToken2, jM9230labelColorvNxB06k$material3_release2, function24, function25, shape3, chipColorsAssistChipColors, chipElevationM9139assistChipElevationaqJV_2Y, value, AssistChipDefaults.INSTANCE.m9142getHeightD9Ej5fM(), AssistChipPadding, mutableInteractionSource2, composerStartRestartGroup, ((i13 >> 3) & 896) | ((i13 >> 6) & 14) | ((i13 << 3) & 112) | (i192 & 7168) | (3670016 & i192) | (29360128 & i192) | (234881024 & i192) | (i192 & 1879048192), ((i13 >> 24) & 14) | 3456 | ((i14 << 12) & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        chipColors22 = chipColorsAssistChipColors;
                        modifier32 = modifier2;
                        mutableInteractionSource32 = mutableInteractionSource2;
                        z32 = z2;
                        chipElevation22 = chipElevationM9139assistChipElevationaqJV_2Y;
                        chipBorder32 = chipBorder42;
                        function262 = function24;
                        function272 = function25;
                        shape42 = shape3;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i6 = i32 & 16;
            if (i6 == 0) {
            }
            i7 = i32 & 32;
            if (i7 == 0) {
            }
            if ((i20 & 1572864) == 0) {
            }
            if ((i20 & 12582912) != 0) {
            }
            if ((i20 & 100663296) == 0) {
            }
            if ((i20 & 805306368) == 0) {
            }
            i8 = i32 & 1024;
            if (i8 == 0) {
            }
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i32 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i32 & 16;
        if (i6 == 0) {
        }
        i7 = i32 & 32;
        if (i7 == 0) {
        }
        if ((i20 & 1572864) == 0) {
        }
        if ((i20 & 12582912) != 0) {
        }
        if ((i20 & 100663296) == 0) {
        }
        if ((i20 & 805306368) == 0) {
        }
        i8 = i32 & 1024;
        if (i8 == 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:226:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:379:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ElevatedAssistChip(@NotNull Function0<Unit> function0, @NotNull Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Modifier modifier, boolean z, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function2<? super Composer, ? super Integer, Unit> function23, @Nullable Shape shape, @Nullable ChipColors chipColors, @Nullable ChipElevation chipElevation, @Nullable BorderStroke borderStroke, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Composer composer, int i, int i2, int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        ChipColors chipColorsElevatedAssistChipColors;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Shape shape2;
        int i13;
        ChipElevation chipElevationM9141elevatedAssistChipElevationaqJV_2Y;
        int i14;
        MutableInteractionSource mutableInteractionSource2;
        ChipElevation chipElevation2;
        int i15;
        Shape shape3;
        BorderStroke borderStroke2;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i16;
        ChipElevation chipElevation3;
        BorderStroke borderStroke3;
        boolean z3;
        MutableInteractionSource mutableInteractionSource3;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Shape shape4;
        ChipColors chipColors2;
        Modifier modifier3;
        Function2<? super Composer, ? super Integer, Unit> function27;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1594789934);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i17 = i3 & 4;
        if (i17 != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= CpioConstants.C_ISBLK;
                } else {
                    if ((i & CpioConstants.C_ISBLK) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    } else if ((i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function23) ? 131072 : 65536;
                    }
                    if ((i & 1572864) == 0) {
                        i4 |= ((i3 & 64) == 0 && composerStartRestartGroup.changed(shape)) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) != 0) {
                        if ((i3 & 128) == 0) {
                            chipColorsElevatedAssistChipColors = chipColors;
                            int i18 = composerStartRestartGroup.changed(chipColorsElevatedAssistChipColors) ? 8388608 : 4194304;
                            i4 |= i18;
                        } else {
                            chipColorsElevatedAssistChipColors = chipColors;
                        }
                        i4 |= i18;
                    } else {
                        chipColorsElevatedAssistChipColors = chipColors;
                    }
                    if ((i & 100663296) == 0) {
                        i4 |= ((i3 & 256) == 0 && composerStartRestartGroup.changed(chipElevation)) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    i8 = i3 & 512;
                    if (i8 != 0) {
                        if ((i & 805306368) == 0) {
                            i9 = i8;
                            i4 |= composerStartRestartGroup.changed(borderStroke) ? 536870912 : 268435456;
                        }
                        i10 = i3 & 1024;
                        if (i10 != 0) {
                            i11 = i10;
                            i12 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i11 = i10;
                            i12 = i2 | (composerStartRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                        } else {
                            i11 = i10;
                            i12 = i2;
                        }
                        if ((i4 & 306783379) == 306783378 && (i12 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            function26 = function23;
                            chipElevation3 = chipElevation;
                            borderStroke3 = borderStroke;
                            mutableInteractionSource3 = mutableInteractionSource;
                            chipColors2 = chipColorsElevatedAssistChipColors;
                            modifier3 = modifier2;
                            z3 = z2;
                            function27 = function22;
                            shape4 = shape;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            int i19 = i12;
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier4 = i17 == 0 ? Modifier.INSTANCE : modifier2;
                                boolean z4 = i5 == 0 ? true : z2;
                                Function2<? super Composer, ? super Integer, Unit> function28 = i6 == 0 ? null : function22;
                                Function2<? super Composer, ? super Integer, Unit> function29 = i7 == 0 ? null : function23;
                                if ((i3 & 64) == 0) {
                                    i4 &= -3670017;
                                    shape2 = AssistChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                } else {
                                    shape2 = shape;
                                }
                                if ((i3 & 128) != 0) {
                                    chipColorsElevatedAssistChipColors = AssistChipDefaults.INSTANCE.elevatedAssistChipColors(composerStartRestartGroup, 6);
                                    i4 &= -29360129;
                                }
                                int i20 = i4;
                                ChipColors chipColors3 = chipColorsElevatedAssistChipColors;
                                if ((i3 & 256) == 0) {
                                    i13 = i19;
                                    chipElevationM9141elevatedAssistChipElevationaqJV_2Y = AssistChipDefaults.INSTANCE.m9141elevatedAssistChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                                    i14 = i20 & (-234881025);
                                } else {
                                    i13 = i19;
                                    chipElevationM9141elevatedAssistChipElevationaqJV_2Y = chipElevation;
                                    i14 = i20;
                                }
                                BorderStroke borderStroke4 = i9 == 0 ? borderStroke : null;
                                if (i11 == 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-227035565);
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    modifier2 = modifier4;
                                    chipElevation2 = chipElevationM9141elevatedAssistChipElevationaqJV_2Y;
                                    i15 = i14;
                                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    modifier2 = modifier4;
                                    chipElevation2 = chipElevationM9141elevatedAssistChipElevationaqJV_2Y;
                                    i15 = i14;
                                }
                                shape3 = shape2;
                                z2 = z4;
                                borderStroke2 = borderStroke4;
                                function24 = function28;
                                function25 = function29;
                                chipColorsElevatedAssistChipColors = chipColors3;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                }
                                if ((i3 & 128) != 0) {
                                    i4 &= -29360129;
                                }
                                if ((i3 & 256) != 0) {
                                    i4 &= -234881025;
                                }
                                function24 = function22;
                                shape3 = shape;
                                chipElevation2 = chipElevation;
                                borderStroke2 = borderStroke;
                                mutableInteractionSource2 = mutableInteractionSource;
                                i13 = i19;
                                i15 = i4;
                                function25 = function23;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                i16 = i13;
                            } else {
                                i16 = i13;
                                ComposerKt.traceEventStart(1594789934, i15, i16, "androidx.compose.material3.ElevatedAssistChip (Chip.kt:275)");
                            }
                            int i21 = i15 << 6;
                            int i22 = ((i15 >> 6) & 14) | ((i15 << 3) & 112) | ((i15 >> 3) & 896) | (i21 & 7168) | (3670016 & i21) | (29360128 & i21) | (234881024 & i21) | (i21 & 1879048192);
                            int i23 = i15 >> 24;
                            m9240ChipnkUnTEs(modifier2, function0, z2, function2, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), AssistChipTokens.INSTANCE.getLabelTextFont()), chipColorsElevatedAssistChipColors.m9230labelColorvNxB06k$material3_release(z2), function24, function25, shape3, chipColorsElevatedAssistChipColors, chipElevation2, borderStroke2, AssistChipDefaults.INSTANCE.m9142getHeightD9Ej5fM(), AssistChipPadding, mutableInteractionSource2, composerStartRestartGroup, i22, (i23 & 112) | (i23 & 14) | 3456 | ((i16 << 12) & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            chipElevation3 = chipElevation2;
                            borderStroke3 = borderStroke2;
                            z3 = z2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            function26 = function25;
                            shape4 = shape3;
                            chipColors2 = chipColorsElevatedAssistChipColors;
                            modifier3 = modifier2;
                            function27 = function24;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.ElevatedAssistChip.2
                                public final /* synthetic */ int $$changed;
                                public final /* synthetic */ int $$changed1;
                                public final /* synthetic */ int $$default;
                                public final /* synthetic */ BorderStroke $border;
                                public final /* synthetic */ ChipColors $colors;
                                public final /* synthetic */ ChipElevation $elevation;
                                public final /* synthetic */ boolean $enabled;
                                public final /* synthetic */ MutableInteractionSource $interactionSource;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                                public final /* synthetic */ Modifier $modifier;
                                public final /* synthetic */ Function0<Unit> $onClick;
                                public final /* synthetic */ Shape $shape;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C13642(Function0<Unit> function02, Function2<? super Composer, ? super Integer, Unit> function210, Modifier modifier32, boolean z32, Function2<? super Composer, ? super Integer, Unit> function272, Function2<? super Composer, ? super Integer, Unit> function262, Shape shape42, ChipColors chipColors22, ChipElevation chipElevation32, BorderStroke borderStroke32, MutableInteractionSource mutableInteractionSource32, int i24, int i25, int i32) {
                                    super(2);
                                    function0 = function02;
                                    function2 = function210;
                                    modifier = modifier32;
                                    z = z32;
                                    function2 = function272;
                                    function2 = function262;
                                    shape = shape42;
                                    chipColors = chipColors22;
                                    chipElevation = chipElevation32;
                                    borderStroke = borderStroke32;
                                    mutableInteractionSource = mutableInteractionSource32;
                                    i = i24;
                                    i = i25;
                                    i = i32;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i24) {
                                    ChipKt.ElevatedAssistChip(function0, function2, modifier, z, function2, function2, shape, chipColors, chipElevation, borderStroke, mutableInteractionSource, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 805306368;
                    i9 = i8;
                    i10 = i32 & 1024;
                    if (i10 != 0) {
                    }
                    if ((i4 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        int i192 = i12;
                        if ((i24 & 1) != 0) {
                            if (i17 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if ((i32 & 64) == 0) {
                            }
                            if ((i32 & 128) != 0) {
                            }
                            int i202 = i4;
                            ChipColors chipColors32 = chipColorsElevatedAssistChipColors;
                            if ((i32 & 256) == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i11 == 0) {
                            }
                            shape3 = shape2;
                            z2 = z4;
                            borderStroke2 = borderStroke4;
                            function24 = function28;
                            function25 = function29;
                            chipColorsElevatedAssistChipColors = chipColors32;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i212 = i15 << 6;
                            int i222 = ((i15 >> 6) & 14) | ((i15 << 3) & 112) | ((i15 >> 3) & 896) | (i212 & 7168) | (3670016 & i212) | (29360128 & i212) | (234881024 & i212) | (i212 & 1879048192);
                            int i232 = i15 >> 24;
                            m9240ChipnkUnTEs(modifier2, function02, z2, function210, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), AssistChipTokens.INSTANCE.getLabelTextFont()), chipColorsElevatedAssistChipColors.m9230labelColorvNxB06k$material3_release(z2), function24, function25, shape3, chipColorsElevatedAssistChipColors, chipElevation2, borderStroke2, AssistChipDefaults.INSTANCE.m9142getHeightD9Ej5fM(), AssistChipPadding, mutableInteractionSource2, composerStartRestartGroup, i222, (i232 & 112) | (i232 & 14) | 3456 | ((i16 << 12) & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            chipElevation32 = chipElevation2;
                            borderStroke32 = borderStroke2;
                            z32 = z2;
                            mutableInteractionSource32 = mutableInteractionSource2;
                            function262 = function25;
                            shape42 = shape3;
                            chipColors22 = chipColorsElevatedAssistChipColors;
                            modifier32 = modifier2;
                            function272 = function24;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i7 = i32 & 32;
                if (i7 == 0) {
                }
                if ((i24 & 1572864) == 0) {
                }
                if ((i24 & 12582912) != 0) {
                }
                if ((i24 & 100663296) == 0) {
                }
                i8 = i32 & 512;
                if (i8 != 0) {
                }
                i9 = i8;
                i10 = i32 & 1024;
                if (i10 != 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z2 = z;
            i6 = i32 & 16;
            if (i6 != 0) {
            }
            i7 = i32 & 32;
            if (i7 == 0) {
            }
            if ((i24 & 1572864) == 0) {
            }
            if ((i24 & 12582912) != 0) {
            }
            if ((i24 & 100663296) == 0) {
            }
            i8 = i32 & 512;
            if (i8 != 0) {
            }
            i9 = i8;
            i10 = i32 & 1024;
            if (i10 != 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i32 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i32 & 16;
        if (i6 != 0) {
        }
        i7 = i32 & 32;
        if (i7 == 0) {
        }
        if ((i24 & 1572864) == 0) {
        }
        if ((i24 & 12582912) != 0) {
        }
        if ((i24 & 100663296) == 0) {
        }
        i8 = i32 & 512;
        if (i8 != 0) {
        }
        i9 = i8;
        i10 = i32 & 1024;
        if (i10 != 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:232:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:391:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with ElevatedAssistChip that take a BorderStroke instead", replaceWith = @ReplaceWith(expression = "ElevatedAssistChip(onClick, label, modifier, enabled,leadingIcon, trailingIcon, shape, colors, elevation, border, interactionSource", imports = {}))
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void ElevatedAssistChip(Function0 function0, Function2 function2, Modifier modifier, boolean z, Function2 function22, Function2 function23, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2, int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        ChipColors chipColorsElevatedAssistChipColors;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Shape shape2;
        int i13;
        ChipElevation chipElevationM9141elevatedAssistChipElevationaqJV_2Y;
        int i14;
        MutableInteractionSource mutableInteractionSource2;
        ChipElevation chipElevation2;
        int i15;
        ChipBorder chipBorder2;
        Shape shape3;
        Function2 function24;
        Function2 function25;
        int i16;
        ChipBorder chipBorder3;
        Function2 function26;
        ChipElevation chipElevation3;
        boolean z3;
        MutableInteractionSource mutableInteractionSource3;
        Shape shape4;
        ChipColors chipColors2;
        Modifier modifier3;
        Function2 function27;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1295844802);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i17 = i3 & 4;
        if (i17 != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= CpioConstants.C_ISBLK;
                } else {
                    if ((i & CpioConstants.C_ISBLK) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    } else if ((i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function23) ? 131072 : 65536;
                    }
                    if ((i & 1572864) == 0) {
                        i4 |= ((i3 & 64) == 0 && composerStartRestartGroup.changed(shape)) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) != 0) {
                        if ((i3 & 128) == 0) {
                            chipColorsElevatedAssistChipColors = chipColors;
                            int i18 = composerStartRestartGroup.changed(chipColorsElevatedAssistChipColors) ? 8388608 : 4194304;
                            i4 |= i18;
                        } else {
                            chipColorsElevatedAssistChipColors = chipColors;
                        }
                        i4 |= i18;
                    } else {
                        chipColorsElevatedAssistChipColors = chipColors;
                    }
                    if ((i & 100663296) == 0) {
                        i4 |= ((i3 & 256) == 0 && composerStartRestartGroup.changed(chipElevation)) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    i8 = i3 & 512;
                    if (i8 != 0) {
                        if ((i & 805306368) == 0) {
                            i9 = i8;
                            i4 |= composerStartRestartGroup.changed(chipBorder) ? 536870912 : 268435456;
                        }
                        i10 = i3 & 1024;
                        if (i10 != 0) {
                            i11 = i10;
                            i12 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i11 = i10;
                            i12 = i2 | (composerStartRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                        } else {
                            i11 = i10;
                            i12 = i2;
                        }
                        if ((i4 & 306783379) == 306783378 && (i12 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            function26 = function23;
                            chipElevation3 = chipElevation;
                            chipBorder3 = chipBorder;
                            mutableInteractionSource3 = mutableInteractionSource;
                            chipColors2 = chipColorsElevatedAssistChipColors;
                            modifier3 = modifier2;
                            z3 = z2;
                            function27 = function22;
                            shape4 = shape;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            int i19 = i12;
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier4 = i17 == 0 ? Modifier.INSTANCE : modifier2;
                                boolean z4 = i5 == 0 ? true : z2;
                                Function2 function28 = i6 == 0 ? null : function22;
                                Function2 function29 = i7 == 0 ? null : function23;
                                if ((i3 & 64) == 0) {
                                    i4 &= -3670017;
                                    shape2 = AssistChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                } else {
                                    shape2 = shape;
                                }
                                if ((i3 & 128) != 0) {
                                    chipColorsElevatedAssistChipColors = AssistChipDefaults.INSTANCE.elevatedAssistChipColors(composerStartRestartGroup, 6);
                                    i4 &= -29360129;
                                }
                                int i20 = i4;
                                ChipColors chipColors3 = chipColorsElevatedAssistChipColors;
                                if ((i3 & 256) == 0) {
                                    i13 = i19;
                                    chipElevationM9141elevatedAssistChipElevationaqJV_2Y = AssistChipDefaults.INSTANCE.m9141elevatedAssistChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                                    i14 = i20 & (-234881025);
                                } else {
                                    i13 = i19;
                                    chipElevationM9141elevatedAssistChipElevationaqJV_2Y = chipElevation;
                                    i14 = i20;
                                }
                                ChipBorder chipBorder4 = i9 == 0 ? null : chipBorder;
                                if (i11 == 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-227031535);
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    modifier2 = modifier4;
                                    i15 = i14;
                                    chipBorder2 = chipBorder4;
                                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                    shape3 = shape2;
                                    z2 = z4;
                                    function24 = function28;
                                    chipColorsElevatedAssistChipColors = chipColors3;
                                    chipElevation2 = chipElevationM9141elevatedAssistChipElevationaqJV_2Y;
                                    function25 = function29;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    modifier2 = modifier4;
                                    chipElevation2 = chipElevationM9141elevatedAssistChipElevationaqJV_2Y;
                                    i15 = i14;
                                    chipBorder2 = chipBorder4;
                                    shape3 = shape2;
                                    z2 = z4;
                                    function24 = function28;
                                    function25 = function29;
                                    chipColorsElevatedAssistChipColors = chipColors3;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                }
                                if ((i3 & 128) != 0) {
                                    i4 &= -29360129;
                                }
                                if ((i3 & 256) != 0) {
                                    i4 &= -234881025;
                                }
                                function24 = function22;
                                shape3 = shape;
                                chipElevation2 = chipElevation;
                                chipBorder2 = chipBorder;
                                mutableInteractionSource2 = mutableInteractionSource;
                                i13 = i19;
                                i15 = i4;
                                function25 = function23;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                i16 = i13;
                            } else {
                                i16 = i13;
                                ComposerKt.traceEventStart(1295844802, i15, i16, "androidx.compose.material3.ElevatedAssistChip (Chip.kt:354)");
                            }
                            TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), AssistChipTokens.INSTANCE.getLabelTextFont());
                            long jM9230labelColorvNxB06k$material3_release = chipColorsElevatedAssistChipColors.m9230labelColorvNxB06k$material3_release(z2);
                            float fM9142getHeightD9Ej5fM = AssistChipDefaults.INSTANCE.m9142getHeightD9Ej5fM();
                            PaddingValues paddingValues = AssistChipPadding;
                            composerStartRestartGroup.startReplaceableGroup(-227031027);
                            State<BorderStroke> stateBorderStroke$material3_release = chipBorder2 != null ? null : chipBorder2.borderStroke$material3_release(z2, composerStartRestartGroup, ((i15 >> 9) & 14) | ((i15 >> 24) & 112));
                            composerStartRestartGroup.endReplaceableGroup();
                            int i21 = i15 << 6;
                            ChipBorder chipBorder5 = chipBorder2;
                            m9240ChipnkUnTEs(modifier2, function0, z2, function2, textStyleFromToken, jM9230labelColorvNxB06k$material3_release, function24, function25, shape3, chipColorsElevatedAssistChipColors, chipElevation2, stateBorderStroke$material3_release == null ? stateBorderStroke$material3_release.getValue() : null, fM9142getHeightD9Ej5fM, paddingValues, mutableInteractionSource2, composerStartRestartGroup, (i21 & 7168) | ((i15 >> 6) & 14) | ((i15 << 3) & 112) | ((i15 >> 3) & 896) | (3670016 & i21) | (29360128 & i21) | (234881024 & i21) | (1879048192 & i21), ((i15 >> 24) & 14) | 3456 | ((i16 << 12) & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            chipBorder3 = chipBorder5;
                            function26 = function25;
                            chipElevation3 = chipElevation2;
                            z3 = z2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape4 = shape3;
                            chipColors2 = chipColorsElevatedAssistChipColors;
                            modifier3 = modifier2;
                            function27 = function24;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.ElevatedAssistChip.4
                                public final /* synthetic */ int $$changed;
                                public final /* synthetic */ int $$changed1;
                                public final /* synthetic */ int $$default;
                                public final /* synthetic */ ChipBorder $border;
                                public final /* synthetic */ ChipColors $colors;
                                public final /* synthetic */ ChipElevation $elevation;
                                public final /* synthetic */ boolean $enabled;
                                public final /* synthetic */ MutableInteractionSource $interactionSource;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                                public final /* synthetic */ Modifier $modifier;
                                public final /* synthetic */ Function0<Unit> $onClick;
                                public final /* synthetic */ Shape $shape;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C13654(Function0<Unit> function02, Function2<? super Composer, ? super Integer, Unit> function210, Modifier modifier32, boolean z32, Function2<? super Composer, ? super Integer, Unit> function272, Function2<? super Composer, ? super Integer, Unit> function262, Shape shape42, ChipColors chipColors22, ChipElevation chipElevation32, ChipBorder chipBorder32, MutableInteractionSource mutableInteractionSource32, int i22, int i23, int i32) {
                                    super(2);
                                    function0 = function02;
                                    function2 = function210;
                                    modifier = modifier32;
                                    z = z32;
                                    function2 = function272;
                                    function2 = function262;
                                    shape = shape42;
                                    chipColors = chipColors22;
                                    chipElevation = chipElevation32;
                                    chipBorder = chipBorder32;
                                    mutableInteractionSource = mutableInteractionSource32;
                                    i = i22;
                                    i = i23;
                                    i = i32;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i22) {
                                    ChipKt.ElevatedAssistChip(function0, function2, modifier, z, function2, function2, shape, chipColors, chipElevation, chipBorder, mutableInteractionSource, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 805306368;
                    i9 = i8;
                    i10 = i32 & 1024;
                    if (i10 != 0) {
                    }
                    if ((i4 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        int i192 = i12;
                        if ((i22 & 1) != 0) {
                            if (i17 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if ((i32 & 64) == 0) {
                            }
                            if ((i32 & 128) != 0) {
                            }
                            int i202 = i4;
                            ChipColors chipColors32 = chipColorsElevatedAssistChipColors;
                            if ((i32 & 256) == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i11 == 0) {
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), AssistChipTokens.INSTANCE.getLabelTextFont());
                            long jM9230labelColorvNxB06k$material3_release2 = chipColorsElevatedAssistChipColors.m9230labelColorvNxB06k$material3_release(z2);
                            float fM9142getHeightD9Ej5fM2 = AssistChipDefaults.INSTANCE.m9142getHeightD9Ej5fM();
                            PaddingValues paddingValues2 = AssistChipPadding;
                            composerStartRestartGroup.startReplaceableGroup(-227031027);
                            if (chipBorder2 != null) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            int i212 = i15 << 6;
                            ChipBorder chipBorder52 = chipBorder2;
                            m9240ChipnkUnTEs(modifier2, function02, z2, function210, textStyleFromToken2, jM9230labelColorvNxB06k$material3_release2, function24, function25, shape3, chipColorsElevatedAssistChipColors, chipElevation2, stateBorderStroke$material3_release == null ? stateBorderStroke$material3_release.getValue() : null, fM9142getHeightD9Ej5fM2, paddingValues2, mutableInteractionSource2, composerStartRestartGroup, (i212 & 7168) | ((i15 >> 6) & 14) | ((i15 << 3) & 112) | ((i15 >> 3) & 896) | (3670016 & i212) | (29360128 & i212) | (234881024 & i212) | (1879048192 & i212), ((i15 >> 24) & 14) | 3456 | ((i16 << 12) & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            chipBorder32 = chipBorder52;
                            function262 = function25;
                            chipElevation32 = chipElevation2;
                            z32 = z2;
                            mutableInteractionSource32 = mutableInteractionSource2;
                            shape42 = shape3;
                            chipColors22 = chipColorsElevatedAssistChipColors;
                            modifier32 = modifier2;
                            function272 = function24;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i7 = i32 & 32;
                if (i7 == 0) {
                }
                if ((i22 & 1572864) == 0) {
                }
                if ((i22 & 12582912) != 0) {
                }
                if ((i22 & 100663296) == 0) {
                }
                i8 = i32 & 512;
                if (i8 != 0) {
                }
                i9 = i8;
                i10 = i32 & 1024;
                if (i10 != 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z2 = z;
            i6 = i32 & 16;
            if (i6 != 0) {
            }
            i7 = i32 & 32;
            if (i7 == 0) {
            }
            if ((i22 & 1572864) == 0) {
            }
            if ((i22 & 12582912) != 0) {
            }
            if ((i22 & 100663296) == 0) {
            }
            i8 = i32 & 512;
            if (i8 != 0) {
            }
            i9 = i8;
            i10 = i32 & 1024;
            if (i10 != 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i32 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i32 & 16;
        if (i6 != 0) {
        }
        i7 = i32 & 32;
        if (i7 == 0) {
        }
        if ((i22 & 1572864) == 0) {
        }
        if ((i22 & 12582912) != 0) {
        }
        if ((i22 & 100663296) == 0) {
        }
        i8 = i32 & 512;
        if (i8 != 0) {
        }
        i9 = i8;
        i10 = i32 & 1024;
        if (i10 != 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:248:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:403:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilterChip(boolean z, @NotNull Function0<Unit> function0, @NotNull Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Modifier modifier, boolean z2, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function2<? super Composer, ? super Integer, Unit> function23, @Nullable Shape shape, @Nullable SelectableChipColors selectableChipColors, @Nullable SelectableChipElevation selectableChipElevation, @Nullable BorderStroke borderStroke, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Composer composer, int i, int i2, int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z3;
        int i6;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Shape shape2;
        SelectableChipColors selectableChipColors2;
        int i8;
        int i9;
        int i10;
        MutableInteractionSource mutableInteractionSource2;
        int i11;
        Modifier modifier3;
        boolean z4;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Shape shape3;
        int i12;
        SelectableChipColors selectableChipColorsFilterChipColors;
        int i13;
        SelectableChipElevation selectableChipElevationM9463filterChipElevationaqJV_2Y;
        int i14;
        BorderStroke borderStrokeM9461filterChipBorder_7El2pE;
        int i15;
        BorderStroke borderStroke2;
        int i16;
        Modifier modifier4;
        BorderStroke borderStroke3;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Shape shape4;
        SelectableChipColors selectableChipColors3;
        MutableInteractionSource mutableInteractionSource3;
        boolean z5;
        Function2<? super Composer, ? super Integer, Unit> function27;
        SelectableChipElevation selectableChipElevation2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i17;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1711985619);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        int i18 = i3 & 8;
        if (i18 != 0) {
            i4 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i & CpioConstants.C_ISBLK) == 0) {
                    z3 = z2;
                    i4 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                } else if ((i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function22) ? 131072 : 65536;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                    function24 = function23;
                } else {
                    function24 = function23;
                    if ((i & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function24) ? 1048576 : 524288;
                    }
                }
                if ((i & 12582912) == 0) {
                    if ((i3 & 128) == 0) {
                        shape2 = shape;
                        int i19 = composerStartRestartGroup.changed(shape2) ? 8388608 : 4194304;
                        i4 |= i19;
                    } else {
                        shape2 = shape;
                    }
                    i4 |= i19;
                } else {
                    shape2 = shape;
                }
                if ((i & 100663296) == 0) {
                    if ((i3 & 256) == 0) {
                        selectableChipColors2 = selectableChipColors;
                        if (composerStartRestartGroup.changed(selectableChipColors2)) {
                            i17 = 67108864;
                        }
                        i4 |= i17;
                    } else {
                        selectableChipColors2 = selectableChipColors;
                    }
                    i17 = NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    i4 |= i17;
                } else {
                    selectableChipColors2 = selectableChipColors;
                }
                if ((i & 805306368) == 0) {
                    i4 |= ((i3 & 512) == 0 && composerStartRestartGroup.changed(selectableChipElevation)) ? 536870912 : 268435456;
                }
                if ((i2 & 6) == 0) {
                    i8 = i2 | (((i3 & 1024) == 0 && composerStartRestartGroup.changed(borderStroke)) ? 4 : 2);
                } else {
                    i8 = i2;
                }
                i9 = i3 & 2048;
                if (i9 != 0) {
                    i10 = i9;
                    i11 = i8 | 48;
                    mutableInteractionSource2 = mutableInteractionSource;
                } else {
                    if ((i2 & 48) == 0) {
                        i10 = i9;
                        mutableInteractionSource2 = mutableInteractionSource;
                        i8 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 32 : 16;
                    } else {
                        i10 = i9;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    i11 = i8;
                }
                if ((i4 & 306783379) == 306783378 && (i11 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    borderStroke3 = borderStroke;
                    shape4 = shape2;
                    modifier4 = modifier2;
                    z5 = z3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    selectableChipElevation2 = selectableChipElevation;
                    function26 = function24;
                    selectableChipColors3 = selectableChipColors2;
                    function27 = function22;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i18 == 0 ? Modifier.INSTANCE : modifier2;
                        z4 = i5 == 0 ? true : z3;
                        function25 = i6 == 0 ? null : function22;
                        if (i7 != 0) {
                            function24 = null;
                        }
                        Function2<? super Composer, ? super Integer, Unit> function28 = function24;
                        if ((i3 & 128) == 0) {
                            i4 &= -29360129;
                            shape3 = FilterChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        } else {
                            shape3 = shape2;
                        }
                        if ((i3 & 256) == 0) {
                            i12 = i4 & (-234881025);
                            selectableChipColorsFilterChipColors = FilterChipDefaults.INSTANCE.filterChipColors(composerStartRestartGroup, 6);
                        } else {
                            i12 = i4;
                            selectableChipColorsFilterChipColors = selectableChipColors2;
                        }
                        if ((i3 & 512) == 0) {
                            i13 = i10;
                            selectableChipElevationM9463filterChipElevationaqJV_2Y = FilterChipDefaults.INSTANCE.m9463filterChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                            i14 = i12 & (-1879048193);
                        } else {
                            i13 = i10;
                            selectableChipElevationM9463filterChipElevationaqJV_2Y = selectableChipElevation;
                            i14 = i12;
                        }
                        if ((i3 & 1024) == 0) {
                            borderStrokeM9461filterChipBorder_7El2pE = FilterChipDefaults.INSTANCE.m9461filterChipBorder_7El2pE(z4, z, 0L, 0L, 0L, 0L, 0.0f, 0.0f, composerStartRestartGroup, ((i14 >> 12) & 14) | 100663296 | ((i14 << 3) & 112), SnappyCompressorOutputStream.FOUR_SIZE_BYTE_MARKER);
                            i11 &= -15;
                        } else {
                            borderStrokeM9461filterChipBorder_7El2pE = borderStroke;
                        }
                        if (i13 == 0) {
                            composerStartRestartGroup.startReplaceableGroup(276179389);
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            i16 = i11;
                            shape2 = shape3;
                            selectableChipColors2 = selectableChipColorsFilterChipColors;
                            i15 = i14;
                            borderStroke2 = borderStrokeM9461filterChipBorder_7El2pE;
                            function24 = function28;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                            i15 = i14;
                            borderStroke2 = borderStrokeM9461filterChipBorder_7El2pE;
                            i16 = i11;
                            function24 = function28;
                            shape2 = shape3;
                            selectableChipColors2 = selectableChipColorsFilterChipColors;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                        }
                        if ((i3 & 256) != 0) {
                            i4 &= -234881025;
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                        }
                        if ((i3 & 1024) != 0) {
                            i11 &= -15;
                        }
                        function25 = function22;
                        borderStroke2 = borderStroke;
                        i15 = i4;
                        modifier3 = modifier2;
                        z4 = z3;
                        i16 = i11;
                        selectableChipElevationM9463filterChipElevationaqJV_2Y = selectableChipElevation;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1711985619, i15, i16, "androidx.compose.material3.FilterChip (Chip.kt:435)");
                    }
                    int i20 = i15 << 3;
                    int i21 = i15 << 6;
                    int i22 = (i15 & 14) | 12582912 | ((i15 >> 6) & 112) | (i20 & 896) | ((i15 >> 3) & 7168) | (i21 & 57344) | (i20 & 3670016) | (234881024 & i21) | (1879048192 & i21);
                    int i23 = i15 >> 24;
                    m9242SelectableChipu0RnIRE(z, modifier3, function0, z4, function2, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), FilterChipTokens.INSTANCE.getLabelTextFont()), function25, null, function24, shape2, selectableChipColors2, selectableChipElevationM9463filterChipElevationaqJV_2Y, borderStroke2, FilterChipDefaults.INSTANCE.m9464getHeightD9Ej5fM(), FilterChipPadding, mutableInteractionSource2, composerStartRestartGroup, i22, (i23 & 112) | (i23 & 14) | 27648 | ((i16 << 6) & 896) | ((i16 << 12) & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    borderStroke3 = borderStroke2;
                    function26 = function24;
                    shape4 = shape2;
                    selectableChipColors3 = selectableChipColors2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z5 = z4;
                    function27 = function25;
                    selectableChipElevation2 = selectableChipElevationM9463filterChipElevationaqJV_2Y;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.FilterChip.2
                        public final /* synthetic */ int $$changed;
                        public final /* synthetic */ int $$changed1;
                        public final /* synthetic */ int $$default;
                        public final /* synthetic */ BorderStroke $border;
                        public final /* synthetic */ SelectableChipColors $colors;
                        public final /* synthetic */ SelectableChipElevation $elevation;
                        public final /* synthetic */ boolean $enabled;
                        public final /* synthetic */ MutableInteractionSource $interactionSource;
                        public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                        public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                        public final /* synthetic */ Modifier $modifier;
                        public final /* synthetic */ Function0<Unit> $onClick;
                        public final /* synthetic */ boolean $selected;
                        public final /* synthetic */ Shape $shape;
                        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public C13692(boolean z6, Function0<Unit> function02, Function2<? super Composer, ? super Integer, Unit> function29, Modifier modifier42, boolean z52, Function2<? super Composer, ? super Integer, Unit> function272, Function2<? super Composer, ? super Integer, Unit> function262, Shape shape42, SelectableChipColors selectableChipColors32, SelectableChipElevation selectableChipElevation22, BorderStroke borderStroke32, MutableInteractionSource mutableInteractionSource32, int i24, int i25, int i32) {
                            super(2);
                            z = z6;
                            function0 = function02;
                            function2 = function29;
                            modifier = modifier42;
                            z = z52;
                            function2 = function272;
                            function2 = function262;
                            shape = shape42;
                            selectableChipColors = selectableChipColors32;
                            selectableChipElevation = selectableChipElevation22;
                            borderStroke = borderStroke32;
                            mutableInteractionSource = mutableInteractionSource32;
                            i = i24;
                            i = i25;
                            i = i32;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i24) {
                            ChipKt.FilterChip(z, function0, function2, modifier, z, function2, function2, shape, selectableChipColors, selectableChipElevation, borderStroke, mutableInteractionSource, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= CpioConstants.C_ISBLK;
            z3 = z2;
            i6 = i32 & 32;
            if (i6 != 0) {
            }
            i7 = i32 & 64;
            if (i7 != 0) {
            }
            if ((i24 & 12582912) == 0) {
            }
            if ((i24 & 100663296) == 0) {
            }
            if ((i24 & 805306368) == 0) {
            }
            if ((i25 & 6) == 0) {
            }
            i9 = i32 & 2048;
            if (i9 != 0) {
            }
            if ((i4 & 306783379) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i24 & 1) != 0) {
                    if (i18 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 != 0) {
                    }
                    Function2<? super Composer, ? super Integer, Unit> function282 = function24;
                    if ((i32 & 128) == 0) {
                    }
                    if ((i32 & 256) == 0) {
                    }
                    if ((i32 & 512) == 0) {
                    }
                    if ((i32 & 1024) == 0) {
                    }
                    if (i13 == 0) {
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i202 = i15 << 3;
                    int i212 = i15 << 6;
                    int i222 = (i15 & 14) | 12582912 | ((i15 >> 6) & 112) | (i202 & 896) | ((i15 >> 3) & 7168) | (i212 & 57344) | (i202 & 3670016) | (234881024 & i212) | (1879048192 & i212);
                    int i232 = i15 >> 24;
                    m9242SelectableChipu0RnIRE(z6, modifier3, function02, z4, function29, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), FilterChipTokens.INSTANCE.getLabelTextFont()), function25, null, function24, shape2, selectableChipColors2, selectableChipElevationM9463filterChipElevationaqJV_2Y, borderStroke2, FilterChipDefaults.INSTANCE.m9464getHeightD9Ej5fM(), FilterChipPadding, mutableInteractionSource2, composerStartRestartGroup, i222, (i232 & 112) | (i232 & 14) | 27648 | ((i16 << 6) & 896) | ((i16 << 12) & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier42 = modifier3;
                    borderStroke32 = borderStroke2;
                    function262 = function24;
                    shape42 = shape2;
                    selectableChipColors32 = selectableChipColors2;
                    mutableInteractionSource32 = mutableInteractionSource2;
                    z52 = z4;
                    function272 = function25;
                    selectableChipElevation22 = selectableChipElevationM9463filterChipElevationaqJV_2Y;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i32 & 16;
        if (i5 != 0) {
        }
        z3 = z2;
        i6 = i32 & 32;
        if (i6 != 0) {
        }
        i7 = i32 & 64;
        if (i7 != 0) {
        }
        if ((i24 & 12582912) == 0) {
        }
        if ((i24 & 100663296) == 0) {
        }
        if ((i24 & 805306368) == 0) {
        }
        if ((i25 & 6) == 0) {
        }
        i9 = i32 & 2048;
        if (i9 != 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:247:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:401:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ElevatedFilterChip(boolean z, @NotNull Function0<Unit> function0, @NotNull Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Modifier modifier, boolean z2, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function2<? super Composer, ? super Integer, Unit> function23, @Nullable Shape shape, @Nullable SelectableChipColors selectableChipColors, @Nullable SelectableChipElevation selectableChipElevation, @Nullable BorderStroke borderStroke, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Composer composer, int i, int i2, int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z3;
        int i6;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Shape shape2;
        SelectableChipColors selectableChipColors2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Shape shape3;
        int i13;
        SelectableChipColors selectableChipColorsElevatedFilterChipColors;
        Modifier modifier3;
        int i14;
        SelectableChipElevation selectableChipElevationM9460elevatedFilterChipElevationaqJV_2Y;
        int i15;
        MutableInteractionSource mutableInteractionSource2;
        int i16;
        BorderStroke borderStroke2;
        SelectableChipElevation selectableChipElevation2;
        Function2<? super Composer, ? super Integer, Unit> function25;
        SelectableChipElevation selectableChipElevation3;
        BorderStroke borderStroke3;
        Modifier modifier4;
        MutableInteractionSource mutableInteractionSource3;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Shape shape4;
        boolean z4;
        SelectableChipColors selectableChipColors3;
        Function2<? super Composer, ? super Integer, Unit> function27;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i17;
        Composer composerStartRestartGroup = composer.startRestartGroup(-106647389);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        int i18 = i3 & 8;
        if (i18 != 0) {
            i4 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i & CpioConstants.C_ISBLK) == 0) {
                    z3 = z2;
                    i4 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                } else if ((i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function22) ? 131072 : 65536;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                    function24 = function23;
                } else {
                    function24 = function23;
                    if ((i & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function24) ? 1048576 : 524288;
                    }
                }
                if ((i & 12582912) == 0) {
                    if ((i3 & 128) == 0) {
                        shape2 = shape;
                        int i19 = composerStartRestartGroup.changed(shape2) ? 8388608 : 4194304;
                        i4 |= i19;
                    } else {
                        shape2 = shape;
                    }
                    i4 |= i19;
                } else {
                    shape2 = shape;
                }
                if ((i & 100663296) == 0) {
                    if ((i3 & 256) == 0) {
                        selectableChipColors2 = selectableChipColors;
                        if (composerStartRestartGroup.changed(selectableChipColors2)) {
                            i17 = 67108864;
                        }
                        i4 |= i17;
                    } else {
                        selectableChipColors2 = selectableChipColors;
                    }
                    i17 = NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    i4 |= i17;
                } else {
                    selectableChipColors2 = selectableChipColors;
                }
                if ((i & 805306368) == 0) {
                    i4 |= ((i3 & 512) == 0 && composerStartRestartGroup.changed(selectableChipElevation)) ? 536870912 : 268435456;
                }
                i8 = i3 & 1024;
                if (i8 != 0) {
                    i10 = i2 | 6;
                    i9 = i8;
                } else if ((i2 & 6) == 0) {
                    i9 = i8;
                    i10 = i2 | (composerStartRestartGroup.changed(borderStroke) ? 4 : 2);
                } else {
                    i9 = i8;
                    i10 = i2;
                }
                i11 = i3 & 2048;
                if (i11 != 0) {
                    i10 |= 48;
                    i12 = i11;
                } else if ((i2 & 48) == 0) {
                    i12 = i11;
                    i10 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 32 : 16;
                } else {
                    i12 = i11;
                }
                int i20 = i10;
                if ((i4 & 306783379) == 306783378 && (i20 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    selectableChipElevation3 = selectableChipElevation;
                    borderStroke3 = borderStroke;
                    mutableInteractionSource3 = mutableInteractionSource;
                    shape4 = shape2;
                    modifier4 = modifier2;
                    z4 = z3;
                    function26 = function24;
                    selectableChipColors3 = selectableChipColors2;
                    function27 = function22;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier5 = i18 == 0 ? Modifier.INSTANCE : modifier2;
                        boolean z5 = i5 == 0 ? true : z3;
                        Function2<? super Composer, ? super Integer, Unit> function28 = i6 == 0 ? null : function22;
                        Function2<? super Composer, ? super Integer, Unit> function29 = i7 == 0 ? null : function24;
                        if ((i3 & 128) == 0) {
                            i4 &= -29360129;
                            shape3 = FilterChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        } else {
                            shape3 = shape2;
                        }
                        if ((i3 & 256) == 0) {
                            i13 = i4 & (-234881025);
                            selectableChipColorsElevatedFilterChipColors = FilterChipDefaults.INSTANCE.elevatedFilterChipColors(composerStartRestartGroup, 6);
                        } else {
                            i13 = i4;
                            selectableChipColorsElevatedFilterChipColors = selectableChipColors2;
                        }
                        if ((i3 & 512) == 0) {
                            modifier3 = modifier5;
                            i14 = i20;
                            selectableChipElevationM9460elevatedFilterChipElevationaqJV_2Y = FilterChipDefaults.INSTANCE.m9460elevatedFilterChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                            i15 = i13 & (-1879048193);
                        } else {
                            modifier3 = modifier5;
                            i14 = i20;
                            selectableChipElevationM9460elevatedFilterChipElevationaqJV_2Y = selectableChipElevation;
                            i15 = i13;
                        }
                        BorderStroke borderStroke4 = i9 == 0 ? borderStroke : null;
                        if (i12 == 0) {
                            composerStartRestartGroup.startReplaceableGroup(-790761894);
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            modifier2 = modifier3;
                            i16 = i15;
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            modifier2 = modifier3;
                            mutableInteractionSource2 = mutableInteractionSource;
                            i16 = i15;
                        }
                        function24 = function29;
                        shape2 = shape3;
                        z3 = z5;
                        borderStroke2 = borderStroke4;
                        selectableChipColors2 = selectableChipColorsElevatedFilterChipColors;
                        selectableChipElevation2 = selectableChipElevationM9460elevatedFilterChipElevationaqJV_2Y;
                        function25 = function28;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                        }
                        if ((i3 & 256) != 0) {
                            i4 &= -234881025;
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                        }
                        selectableChipElevation2 = selectableChipElevation;
                        borderStroke2 = borderStroke;
                        mutableInteractionSource2 = mutableInteractionSource;
                        i14 = i20;
                        i16 = i4;
                        function25 = function22;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-106647389, i16, i14, "androidx.compose.material3.ElevatedFilterChip (Chip.kt:514)");
                    }
                    int i21 = i16 << 3;
                    int i22 = i16 << 6;
                    int i23 = (i16 & 14) | 12582912 | ((i16 >> 6) & 112) | (i21 & 896) | ((i16 >> 3) & 7168) | (i22 & 57344) | (i21 & 3670016) | (234881024 & i22) | (1879048192 & i22);
                    int i24 = i16 >> 24;
                    m9242SelectableChipu0RnIRE(z, modifier2, function0, z3, function2, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), FilterChipTokens.INSTANCE.getLabelTextFont()), function25, null, function24, shape2, selectableChipColors2, selectableChipElevation2, borderStroke2, FilterChipDefaults.INSTANCE.m9464getHeightD9Ej5fM(), FilterChipPadding, mutableInteractionSource2, composerStartRestartGroup, i23, (i24 & 112) | (i24 & 14) | 27648 | ((i14 << 6) & 896) | ((i14 << 12) & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    selectableChipElevation3 = selectableChipElevation2;
                    borderStroke3 = borderStroke2;
                    modifier4 = modifier2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    function26 = function24;
                    shape4 = shape2;
                    z4 = z3;
                    selectableChipColors3 = selectableChipColors2;
                    function27 = function25;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.ElevatedFilterChip.2
                        public final /* synthetic */ int $$changed;
                        public final /* synthetic */ int $$changed1;
                        public final /* synthetic */ int $$default;
                        public final /* synthetic */ BorderStroke $border;
                        public final /* synthetic */ SelectableChipColors $colors;
                        public final /* synthetic */ SelectableChipElevation $elevation;
                        public final /* synthetic */ boolean $enabled;
                        public final /* synthetic */ MutableInteractionSource $interactionSource;
                        public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                        public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                        public final /* synthetic */ Modifier $modifier;
                        public final /* synthetic */ Function0<Unit> $onClick;
                        public final /* synthetic */ boolean $selected;
                        public final /* synthetic */ Shape $shape;
                        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public C13662(boolean z6, Function0<Unit> function02, Function2<? super Composer, ? super Integer, Unit> function210, Modifier modifier42, boolean z42, Function2<? super Composer, ? super Integer, Unit> function272, Function2<? super Composer, ? super Integer, Unit> function262, Shape shape42, SelectableChipColors selectableChipColors32, SelectableChipElevation selectableChipElevation32, BorderStroke borderStroke32, MutableInteractionSource mutableInteractionSource32, int i25, int i26, int i32) {
                            super(2);
                            z = z6;
                            function0 = function02;
                            function2 = function210;
                            modifier = modifier42;
                            z = z42;
                            function2 = function272;
                            function2 = function262;
                            shape = shape42;
                            selectableChipColors = selectableChipColors32;
                            selectableChipElevation = selectableChipElevation32;
                            borderStroke = borderStroke32;
                            mutableInteractionSource = mutableInteractionSource32;
                            i = i25;
                            i = i26;
                            i = i32;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i25) {
                            ChipKt.ElevatedFilterChip(z, function0, function2, modifier, z, function2, function2, shape, selectableChipColors, selectableChipElevation, borderStroke, mutableInteractionSource, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= CpioConstants.C_ISBLK;
            z3 = z2;
            i6 = i32 & 32;
            if (i6 != 0) {
            }
            i7 = i32 & 64;
            if (i7 != 0) {
            }
            if ((i25 & 12582912) == 0) {
            }
            if ((i25 & 100663296) == 0) {
            }
            if ((i25 & 805306368) == 0) {
            }
            i8 = i32 & 1024;
            if (i8 != 0) {
            }
            i11 = i32 & 2048;
            if (i11 != 0) {
            }
            int i202 = i10;
            if ((i4 & 306783379) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i25 & 1) != 0) {
                    if (i18 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if ((i32 & 128) == 0) {
                    }
                    if ((i32 & 256) == 0) {
                    }
                    if ((i32 & 512) == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    function24 = function29;
                    shape2 = shape3;
                    z3 = z5;
                    borderStroke2 = borderStroke4;
                    selectableChipColors2 = selectableChipColorsElevatedFilterChipColors;
                    selectableChipElevation2 = selectableChipElevationM9460elevatedFilterChipElevationaqJV_2Y;
                    function25 = function28;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i212 = i16 << 3;
                    int i222 = i16 << 6;
                    int i232 = (i16 & 14) | 12582912 | ((i16 >> 6) & 112) | (i212 & 896) | ((i16 >> 3) & 7168) | (i222 & 57344) | (i212 & 3670016) | (234881024 & i222) | (1879048192 & i222);
                    int i242 = i16 >> 24;
                    m9242SelectableChipu0RnIRE(z6, modifier2, function02, z3, function210, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), FilterChipTokens.INSTANCE.getLabelTextFont()), function25, null, function24, shape2, selectableChipColors2, selectableChipElevation2, borderStroke2, FilterChipDefaults.INSTANCE.m9464getHeightD9Ej5fM(), FilterChipPadding, mutableInteractionSource2, composerStartRestartGroup, i232, (i242 & 112) | (i242 & 14) | 27648 | ((i14 << 6) & 896) | ((i14 << 12) & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    selectableChipElevation32 = selectableChipElevation2;
                    borderStroke32 = borderStroke2;
                    modifier42 = modifier2;
                    mutableInteractionSource32 = mutableInteractionSource2;
                    function262 = function24;
                    shape42 = shape2;
                    z42 = z3;
                    selectableChipColors32 = selectableChipColors2;
                    function272 = function25;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i32 & 16;
        if (i5 != 0) {
        }
        z3 = z2;
        i6 = i32 & 32;
        if (i6 != 0) {
        }
        i7 = i32 & 64;
        if (i7 != 0) {
        }
        if ((i25 & 12582912) == 0) {
        }
        if ((i25 & 100663296) == 0) {
        }
        if ((i25 & 805306368) == 0) {
        }
        i8 = i32 & 1024;
        if (i8 != 0) {
        }
        i11 = i32 & 2048;
        if (i11 != 0) {
        }
        int i2022 = i10;
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:279:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:465:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InputChip(boolean z, @NotNull Function0<Unit> function0, @NotNull Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Modifier modifier, boolean z2, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function2<? super Composer, ? super Integer, Unit> function23, @Nullable Function2<? super Composer, ? super Integer, Unit> function24, @Nullable Shape shape, @Nullable SelectableChipColors selectableChipColors, @Nullable SelectableChipElevation selectableChipElevation, @Nullable BorderStroke borderStroke, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Composer composer, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i9;
        int i10;
        boolean z3;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Function2<? super Composer, ? super Integer, Unit> function29;
        Shape shape2;
        SelectableChipColors selectableChipColorsInputChipColors;
        int i11;
        boolean z4;
        int i12;
        SelectableChipElevation selectableChipElevationM9510inputChipElevationaqJV_2Y;
        BorderStroke borderStrokeM9508inputChipBorder_7El2pE;
        MutableInteractionSource mutableInteractionSource2;
        int i13;
        Modifier modifier2;
        int i14;
        int i15;
        ComposableLambda composableLambda;
        Modifier modifier3;
        SelectableChipElevation selectableChipElevation2;
        BorderStroke borderStroke2;
        MutableInteractionSource mutableInteractionSource3;
        Function2<? super Composer, ? super Integer, Unit> function210;
        boolean z5;
        Function2<? super Composer, ? super Integer, Unit> function211;
        Shape shape3;
        SelectableChipColors selectableChipColors2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1658928131);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        int i16 = i3 & 8;
        if (i16 != 0) {
            i4 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= CpioConstants.C_ISBLK;
            } else {
                if ((i & CpioConstants.C_ISBLK) == 0) {
                    i4 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    function25 = function22;
                } else {
                    function25 = function22;
                    if ((i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function25) ? 131072 : 65536;
                    }
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                    function26 = function23;
                } else {
                    function26 = function23;
                    if ((i & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function26) ? 1048576 : 524288;
                    }
                }
                i8 = i3 & 128;
                if (i8 != 0) {
                    i4 |= 12582912;
                    function27 = function24;
                } else {
                    function27 = function24;
                    if ((i & 12582912) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function27) ? 8388608 : 4194304;
                    }
                }
                if ((i & 100663296) == 0) {
                    i4 |= ((i3 & 256) == 0 && composerStartRestartGroup.changed(shape)) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                }
                if ((i & 805306368) == 0) {
                    i4 |= ((i3 & 512) == 0 && composerStartRestartGroup.changed(selectableChipColors)) ? 536870912 : 268435456;
                }
                if ((i2 & 6) == 0) {
                    i9 = i2 | (((i3 & 1024) == 0 && composerStartRestartGroup.changed(selectableChipElevation)) ? 4 : 2);
                } else {
                    i9 = i2;
                }
                if ((i2 & 48) == 0) {
                    i9 |= ((i3 & 2048) == 0 && composerStartRestartGroup.changed(borderStroke)) ? 32 : 16;
                }
                int i17 = i9;
                i10 = i3 & 4096;
                if (i10 == 0) {
                    if ((i2 & 384) == 0) {
                        i17 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 256 : 128;
                    }
                    if ((i4 & 306783379) != 306783378 && (i17 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        shape3 = shape;
                        selectableChipColors2 = selectableChipColors;
                        selectableChipElevation2 = selectableChipElevation;
                        borderStroke2 = borderStroke;
                        mutableInteractionSource3 = mutableInteractionSource;
                        function210 = function26;
                        function211 = function25;
                        z5 = z2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier4 = i16 == 0 ? Modifier.INSTANCE : modifier;
                            z3 = i5 == 0 ? true : z2;
                            function28 = i6 == 0 ? null : function25;
                            Function2<? super Composer, ? super Integer, Unit> function212 = i7 == 0 ? null : function26;
                            function29 = i8 == 0 ? null : function27;
                            if ((i3 & 256) == 0) {
                                i4 &= -234881025;
                                shape2 = InputChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            } else {
                                shape2 = shape;
                            }
                            if ((i3 & 512) == 0) {
                                i11 = i4 & (-1879048193);
                                selectableChipColorsInputChipColors = InputChipDefaults.INSTANCE.inputChipColors(composerStartRestartGroup, 6);
                            } else {
                                selectableChipColorsInputChipColors = selectableChipColors;
                                i11 = i4;
                            }
                            if ((i3 & 1024) == 0) {
                                z4 = true;
                                i12 = i10;
                                selectableChipElevationM9510inputChipElevationaqJV_2Y = InputChipDefaults.INSTANCE.m9510inputChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                                i17 &= -15;
                            } else {
                                z4 = true;
                                i12 = i10;
                                selectableChipElevationM9510inputChipElevationaqJV_2Y = selectableChipElevation;
                            }
                            if ((i3 & 2048) == 0) {
                                borderStrokeM9508inputChipBorder_7El2pE = InputChipDefaults.INSTANCE.m9508inputChipBorder_7El2pE(z3, z, 0L, 0L, 0L, 0L, 0.0f, 0.0f, composerStartRestartGroup, ((i11 >> 12) & 14) | 100663296 | ((i11 << 3) & 112), SnappyCompressorOutputStream.FOUR_SIZE_BYTE_MARKER);
                                i17 &= -113;
                            } else {
                                borderStrokeM9508inputChipBorder_7El2pE = borderStroke;
                            }
                            if (i12 == 0) {
                                composerStartRestartGroup.startReplaceableGroup(-1371993939);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            i13 = i17;
                            modifier2 = modifier4;
                            function26 = function212;
                            i14 = i11;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 256) != 0) {
                                i4 &= -234881025;
                            }
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                            }
                            if ((i3 & 1024) != 0) {
                                i17 &= -15;
                            }
                            if ((i3 & 2048) != 0) {
                                i17 &= -113;
                            }
                            z3 = z2;
                            shape2 = shape;
                            selectableChipColorsInputChipColors = selectableChipColors;
                            borderStrokeM9508inputChipBorder_7El2pE = borderStroke;
                            mutableInteractionSource2 = mutableInteractionSource;
                            i13 = i17;
                            function28 = function25;
                            function29 = function27;
                            z4 = true;
                            modifier2 = modifier;
                            i14 = i4;
                            selectableChipElevationM9510inputChipElevationaqJV_2Y = selectableChipElevation;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1658928131, i14, i13, "androidx.compose.material3.InputChip (Chip.kt:598)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-1371993712);
                        if (function26 == null) {
                            i15 = 6;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1154227507, z4, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.InputChip.2
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $avatar;
                                public final /* synthetic */ float $avatarOpacity;
                                public final /* synthetic */ Shape $avatarShape;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C13702(float f, Shape shape4, Function2<? super Composer, ? super Integer, Unit> function262) {
                                    super(2);
                                    f = f;
                                    shape = shape4;
                                    function2 = function262;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer2, int i18) {
                                    if ((i18 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1154227507, i18, -1, "androidx.compose.material3.InputChip.<anonymous> (Chip.kt:606)");
                                        }
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        composer2.startReplaceableGroup(946467138);
                                        boolean zChanged = composer2.changed(f) | composer2.changed(shape);
                                        final float f = f;
                                        final Shape shape4 = shape;
                                        Object objRememberedValue2 = composer2.rememberedValue();
                                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.ChipKt$InputChip$2$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                                    invoke2(graphicsLayerScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull GraphicsLayerScope graphicsLayerScope) {
                                                    graphicsLayerScope.setAlpha(f);
                                                    graphicsLayerScope.setShape(shape4);
                                                    graphicsLayerScope.setClip(true);
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer2.endReplaceableGroup();
                                        Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (Function1) objRememberedValue2);
                                        Alignment center = Alignment.INSTANCE.getCenter();
                                        Function2<Composer, Integer, Unit> function213 = function2;
                                        composer2.startReplaceableGroup(733328855);
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                                        composer2.startReplaceableGroup(-1323940314);
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierGraphicsLayer);
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
                                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                        composer2.startReplaceableGroup(2058660585);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        function213.invoke(composer2, 0);
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
                            });
                        } else {
                            i15 = 6;
                            composableLambda = null;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i18 = i14 << 3;
                        int i19 = i13 << 3;
                        m9242SelectableChipu0RnIRE(z, modifier2, function0, z3, function2, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, i15), InputChipTokens.INSTANCE.getLabelTextFont()), function28, composableLambda, function29, shape2, selectableChipColorsInputChipColors, selectableChipElevationM9510inputChipElevationaqJV_2Y, borderStrokeM9508inputChipBorder_7El2pE, InputChipDefaults.INSTANCE.m9506getHeightD9Ej5fM(), inputChipPadding(composableLambda == null ? z4 : false, function28 == null ? z4 : false, function29 != null ? z4 : false), mutableInteractionSource2, composerStartRestartGroup, (i14 & 14) | ((i14 >> 6) & 112) | (i18 & 896) | ((i14 >> 3) & 7168) | ((i14 << 6) & 57344) | (3670016 & i18) | (234881024 & i18) | (i18 & 1879048192), ((i14 >> 27) & 14) | 3072 | (i19 & 112) | (i19 & 896) | ((i13 << 9) & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        selectableChipElevation2 = selectableChipElevationM9510inputChipElevationaqJV_2Y;
                        borderStroke2 = borderStrokeM9508inputChipBorder_7El2pE;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        function210 = function262;
                        z5 = z3;
                        function211 = function28;
                        function27 = function29;
                        shape3 = shape2;
                        selectableChipColors2 = selectableChipColorsInputChipColors;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.InputChip.3
                            public final /* synthetic */ int $$changed;
                            public final /* synthetic */ int $$changed1;
                            public final /* synthetic */ int $$default;
                            public final /* synthetic */ Function2<Composer, Integer, Unit> $avatar;
                            public final /* synthetic */ BorderStroke $border;
                            public final /* synthetic */ SelectableChipColors $colors;
                            public final /* synthetic */ SelectableChipElevation $elevation;
                            public final /* synthetic */ boolean $enabled;
                            public final /* synthetic */ MutableInteractionSource $interactionSource;
                            public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                            public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                            public final /* synthetic */ Modifier $modifier;
                            public final /* synthetic */ Function0<Unit> $onClick;
                            public final /* synthetic */ boolean $selected;
                            public final /* synthetic */ Shape $shape;
                            public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public C13713(boolean z6, Function0<Unit> function02, Function2<? super Composer, ? super Integer, Unit> function213, Modifier modifier32, boolean z52, Function2<? super Composer, ? super Integer, Unit> function2112, Function2<? super Composer, ? super Integer, Unit> function2102, Function2<? super Composer, ? super Integer, Unit> function272, Shape shape32, SelectableChipColors selectableChipColors22, SelectableChipElevation selectableChipElevation22, BorderStroke borderStroke22, MutableInteractionSource mutableInteractionSource32, int i20, int i22, int i32) {
                                super(2);
                                z = z6;
                                function0 = function02;
                                function2 = function213;
                                modifier = modifier32;
                                z = z52;
                                function2 = function2112;
                                function2 = function2102;
                                function2 = function272;
                                shape = shape32;
                                selectableChipColors = selectableChipColors22;
                                selectableChipElevation = selectableChipElevation22;
                                borderStroke = borderStroke22;
                                mutableInteractionSource = mutableInteractionSource32;
                                i = i20;
                                i = i22;
                                i = i32;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i20) {
                                ChipKt.InputChip(z, function0, function2, modifier, z, function2, function2, function2, shape, selectableChipColors, selectableChipElevation, borderStroke, mutableInteractionSource, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
                            }
                        });
                        return;
                    }
                    return;
                }
                i17 |= 384;
                if ((i4 & 306783379) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i20 & 1) != 0) {
                        if (i16 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if ((i32 & 256) == 0) {
                        }
                        if ((i32 & 512) == 0) {
                        }
                        if ((i32 & 1024) == 0) {
                        }
                        if ((i32 & 2048) == 0) {
                        }
                        if (i12 == 0) {
                        }
                        i13 = i17;
                        modifier2 = modifier4;
                        function262 = function212;
                        i14 = i11;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(-1371993712);
                        if (function262 == null) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i182 = i14 << 3;
                        int i192 = i13 << 3;
                        m9242SelectableChipu0RnIRE(z6, modifier2, function02, z3, function213, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, i15), InputChipTokens.INSTANCE.getLabelTextFont()), function28, composableLambda, function29, shape2, selectableChipColorsInputChipColors, selectableChipElevationM9510inputChipElevationaqJV_2Y, borderStrokeM9508inputChipBorder_7El2pE, InputChipDefaults.INSTANCE.m9506getHeightD9Ej5fM(), inputChipPadding(composableLambda == null ? z4 : false, function28 == null ? z4 : false, function29 != null ? z4 : false), mutableInteractionSource2, composerStartRestartGroup, (i14 & 14) | ((i14 >> 6) & 112) | (i182 & 896) | ((i14 >> 3) & 7168) | ((i14 << 6) & 57344) | (3670016 & i182) | (234881024 & i182) | (i182 & 1879048192), ((i14 >> 27) & 14) | 3072 | (i192 & 112) | (i192 & 896) | ((i13 << 9) & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier32 = modifier2;
                        selectableChipElevation22 = selectableChipElevationM9510inputChipElevationaqJV_2Y;
                        borderStroke22 = borderStrokeM9508inputChipBorder_7El2pE;
                        mutableInteractionSource32 = mutableInteractionSource2;
                        function2102 = function262;
                        z52 = z3;
                        function2112 = function28;
                        function272 = function29;
                        shape32 = shape2;
                        selectableChipColors22 = selectableChipColorsInputChipColors;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i6 = i32 & 32;
            if (i6 != 0) {
            }
            i7 = i32 & 64;
            if (i7 != 0) {
            }
            i8 = i32 & 128;
            if (i8 != 0) {
            }
            if ((i20 & 100663296) == 0) {
            }
            if ((i20 & 805306368) == 0) {
            }
            if ((i22 & 6) == 0) {
            }
            if ((i22 & 48) == 0) {
            }
            int i172 = i9;
            i10 = i32 & 4096;
            if (i10 == 0) {
            }
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i5 = i32 & 16;
        if (i5 == 0) {
        }
        i6 = i32 & 32;
        if (i6 != 0) {
        }
        i7 = i32 & 64;
        if (i7 != 0) {
        }
        i8 = i32 & 128;
        if (i8 != 0) {
        }
        if ((i20 & 100663296) == 0) {
        }
        if ((i20 & 805306368) == 0) {
        }
        if ((i22 & 6) == 0) {
        }
        if ((i22 & 48) == 0) {
        }
        int i1722 = i9;
        i10 = i32 & 4096;
        if (i10 == 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: Chip.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipKt$InputChip$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,2741:1\n1116#2,6:2742\n69#3,5:2748\n74#3:2781\n78#3:2786\n78#4,11:2753\n91#4:2785\n456#5,8:2764\n464#5,3:2778\n467#5,3:2782\n3737#6,6:2772\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipKt$InputChip$2\n*L\n608#1:2742,6\n607#1:2748,5\n607#1:2781\n607#1:2786\n607#1:2753,11\n607#1:2785\n607#1:2764,8\n607#1:2778,3\n607#1:2782,3\n607#1:2772,6\n*E\n"})
    /* renamed from: androidx.compose.material3.ChipKt$InputChip$2 */
    /* loaded from: classes2.dex */
    public static final class C13702 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Function2<Composer, Integer, Unit> $avatar;
        public final /* synthetic */ float $avatarOpacity;
        public final /* synthetic */ Shape $avatarShape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13702(float f, Shape shape4, Function2<? super Composer, ? super Integer, Unit> function262) {
            super(2);
            f = f;
            shape = shape4;
            function2 = function262;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
            invoke(composer2, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer2, int i18) {
            if ((i18 & 3) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1154227507, i18, -1, "androidx.compose.material3.InputChip.<anonymous> (Chip.kt:606)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                composer2.startReplaceableGroup(946467138);
                boolean zChanged = composer2.changed(f) | composer2.changed(shape);
                final float f = f;
                final Shape shape4 = shape;
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.ChipKt$InputChip$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                            invoke2(graphicsLayerScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GraphicsLayerScope graphicsLayerScope) {
                            graphicsLayerScope.setAlpha(f);
                            graphicsLayerScope.setShape(shape4);
                            graphicsLayerScope.setClip(true);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (Function1) objRememberedValue2);
                Alignment center = Alignment.INSTANCE.getCenter();
                Function2<Composer, Integer, Unit> function213 = function2;
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierGraphicsLayer);
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
                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                function213.invoke(composer2, 0);
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
    }

    /* JADX WARN: Removed duplicated region for block: B:216:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:359:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SuggestionChip(@NotNull Function0<Unit> function0, @NotNull Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Modifier modifier, boolean z, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Shape shape, @Nullable ChipColors chipColors, @Nullable ChipElevation chipElevation, @Nullable BorderStroke borderStroke, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Composer composer, int i, int i2) {
        int i3;
        int i4;
        boolean z2;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Shape shape2;
        ChipColors chipColors2;
        int i6;
        int i7;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape3;
        int i8;
        ChipColors chipColorsSuggestionChipColors;
        ChipElevation chipElevationM9875suggestionChipElevationaqJV_2Y;
        BorderStroke borderStrokeM9873suggestionChipBorderh1eTWw;
        MutableInteractionSource mutableInteractionSource3;
        BorderStroke borderStroke2;
        ChipElevation chipElevation2;
        int i9;
        Composer composer2;
        boolean z3;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Shape shape4;
        ChipColors chipColors3;
        ChipElevation chipElevation3;
        BorderStroke borderStroke3;
        Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1700130831);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= CpioConstants.C_ISBLK;
                } else {
                    if ((i & CpioConstants.C_ISBLK) == 0) {
                        function23 = function22;
                        i3 |= composerStartRestartGroup.changedInstance(function23) ? 16384 : 8192;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            shape2 = shape;
                            int i11 = composerStartRestartGroup.changed(shape2) ? 131072 : 65536;
                            i3 |= i11;
                        } else {
                            shape2 = shape;
                        }
                        i3 |= i11;
                    } else {
                        shape2 = shape;
                    }
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            chipColors2 = chipColors;
                            int i12 = composerStartRestartGroup.changed(chipColors2) ? 1048576 : 524288;
                            i3 |= i12;
                        } else {
                            chipColors2 = chipColors;
                        }
                        i3 |= i12;
                    } else {
                        chipColors2 = chipColors;
                    }
                    if ((i & 12582912) == 0) {
                        i3 |= ((i2 & 128) == 0 && composerStartRestartGroup.changed(chipElevation)) ? 8388608 : 4194304;
                    }
                    if ((i & 100663296) == 0) {
                        i3 |= ((i2 & 256) == 0 && composerStartRestartGroup.changed(borderStroke)) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    i6 = i2 & 512;
                    if (i6 != 0) {
                        if ((i & 805306368) == 0) {
                            i7 = i6;
                            mutableInteractionSource2 = mutableInteractionSource;
                            i3 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 536870912 : 268435456;
                        }
                        if ((i3 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            z3 = z2;
                            function24 = function23;
                            shape4 = shape2;
                            chipColors3 = chipColors2;
                            composer2 = composerStartRestartGroup;
                            chipElevation3 = chipElevation;
                            borderStroke3 = borderStroke;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier3 = i10 == 0 ? Modifier.INSTANCE : modifier;
                                boolean z4 = i4 == 0 ? true : z2;
                                Function2<? super Composer, ? super Integer, Unit> function25 = i5 == 0 ? null : function23;
                                if ((i2 & 32) == 0) {
                                    i3 &= -458753;
                                    shape3 = SuggestionChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                } else {
                                    shape3 = shape2;
                                }
                                if ((i2 & 64) == 0) {
                                    i8 = i3 & (-3670017);
                                    chipColorsSuggestionChipColors = SuggestionChipDefaults.INSTANCE.suggestionChipColors(composerStartRestartGroup, 6);
                                } else {
                                    i8 = i3;
                                    chipColorsSuggestionChipColors = chipColors2;
                                }
                                if ((i2 & 128) == 0) {
                                    modifier = modifier3;
                                    i8 &= -29360129;
                                    chipElevationM9875suggestionChipElevationaqJV_2Y = SuggestionChipDefaults.INSTANCE.m9875suggestionChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                                } else {
                                    modifier = modifier3;
                                    chipElevationM9875suggestionChipElevationaqJV_2Y = chipElevation;
                                }
                                if ((i2 & 256) == 0) {
                                    borderStrokeM9873suggestionChipBorderh1eTWw = SuggestionChipDefaults.INSTANCE.m9873suggestionChipBorderh1eTWw(z4, 0L, 0L, 0.0f, composerStartRestartGroup, ((i8 >> 9) & 14) | CpioConstants.C_ISBLK, 14);
                                    i8 &= -234881025;
                                } else {
                                    borderStrokeM9873suggestionChipBorderh1eTWw = borderStroke;
                                }
                                if (i7 == 0) {
                                    composerStartRestartGroup.startReplaceableGroup(2118462942);
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    borderStroke2 = borderStrokeM9873suggestionChipBorderh1eTWw;
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    borderStroke2 = borderStrokeM9873suggestionChipBorderh1eTWw;
                                }
                                chipElevation2 = chipElevationM9875suggestionChipElevationaqJV_2Y;
                                shape2 = shape3;
                                z2 = z4;
                                function23 = function25;
                                chipColors2 = chipColorsSuggestionChipColors;
                                i9 = i8;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                if ((i2 & 256) != 0) {
                                    i3 &= -234881025;
                                }
                                chipElevation2 = chipElevation;
                                borderStroke2 = borderStroke;
                                mutableInteractionSource3 = mutableInteractionSource;
                                i9 = i3;
                            }
                            Modifier modifier4 = modifier;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1700130831, i9, -1, "androidx.compose.material3.SuggestionChip (Chip.kt:693)");
                            }
                            int i13 = i9 << 6;
                            int i14 = ((i9 >> 6) & 14) | 12582912 | ((i9 << 3) & 112) | ((i9 >> 3) & 896) | (i13 & 7168) | (i13 & 3670016);
                            int i15 = i9 << 9;
                            int i16 = i14 | (234881024 & i15) | (i15 & 1879048192);
                            int i17 = i9 >> 21;
                            int i18 = (i17 & 112) | (i17 & 14) | 3456 | ((i9 >> 15) & 57344);
                            composer2 = composerStartRestartGroup;
                            m9240ChipnkUnTEs(modifier4, function0, z2, function2, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), SuggestionChipTokens.INSTANCE.getLabelTextFont()), chipColors2.m9230labelColorvNxB06k$material3_release(z2), function23, null, shape2, chipColors2, chipElevation2, borderStroke2, SuggestionChipDefaults.INSTANCE.m9870getHeightD9Ej5fM(), SuggestionChipPadding, mutableInteractionSource3, composer2, i16, i18);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            mutableInteractionSource2 = mutableInteractionSource3;
                            z3 = z2;
                            function24 = function23;
                            shape4 = shape2;
                            chipColors3 = chipColors2;
                            chipElevation3 = chipElevation2;
                            borderStroke3 = borderStroke2;
                            modifier2 = modifier4;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.SuggestionChip.2
                                public final /* synthetic */ int $$changed;
                                public final /* synthetic */ int $$default;
                                public final /* synthetic */ BorderStroke $border;
                                public final /* synthetic */ ChipColors $colors;
                                public final /* synthetic */ ChipElevation $elevation;
                                public final /* synthetic */ boolean $enabled;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $icon;
                                public final /* synthetic */ MutableInteractionSource $interactionSource;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                                public final /* synthetic */ Modifier $modifier;
                                public final /* synthetic */ Function0<Unit> $onClick;
                                public final /* synthetic */ Shape $shape;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C13722(Function0<Unit> function02, Function2<? super Composer, ? super Integer, Unit> function26, Modifier modifier22, boolean z32, Function2<? super Composer, ? super Integer, Unit> function242, Shape shape42, ChipColors chipColors32, ChipElevation chipElevation32, BorderStroke borderStroke32, MutableInteractionSource mutableInteractionSource22, int i19, int i22) {
                                    super(2);
                                    function0 = function02;
                                    function2 = function26;
                                    modifier = modifier22;
                                    z = z32;
                                    function2 = function242;
                                    shape = shape42;
                                    chipColors = chipColors32;
                                    chipElevation = chipElevation32;
                                    borderStroke = borderStroke32;
                                    mutableInteractionSource = mutableInteractionSource22;
                                    i = i19;
                                    i = i22;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer3, int i19) {
                                    ChipKt.SuggestionChip(function0, function2, modifier, z, function2, shape, chipColors, chipElevation, borderStroke, mutableInteractionSource, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 805306368;
                    i7 = i6;
                    mutableInteractionSource22 = mutableInteractionSource;
                    if ((i3 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i19 & 1) != 0) {
                            if (i10 == 0) {
                            }
                            if (i4 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if ((i22 & 32) == 0) {
                            }
                            if ((i22 & 64) == 0) {
                            }
                            if ((i22 & 128) == 0) {
                            }
                            if ((i22 & 256) == 0) {
                            }
                            if (i7 == 0) {
                            }
                            chipElevation2 = chipElevationM9875suggestionChipElevationaqJV_2Y;
                            shape2 = shape3;
                            z2 = z4;
                            function23 = function25;
                            chipColors2 = chipColorsSuggestionChipColors;
                            i9 = i8;
                            Modifier modifier42 = modifier;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i132 = i9 << 6;
                            int i142 = ((i9 >> 6) & 14) | 12582912 | ((i9 << 3) & 112) | ((i9 >> 3) & 896) | (i132 & 7168) | (i132 & 3670016);
                            int i152 = i9 << 9;
                            int i162 = i142 | (234881024 & i152) | (i152 & 1879048192);
                            int i172 = i9 >> 21;
                            int i182 = (i172 & 112) | (i172 & 14) | 3456 | ((i9 >> 15) & 57344);
                            composer2 = composerStartRestartGroup;
                            m9240ChipnkUnTEs(modifier42, function02, z2, function26, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), SuggestionChipTokens.INSTANCE.getLabelTextFont()), chipColors2.m9230labelColorvNxB06k$material3_release(z2), function23, null, shape2, chipColors2, chipElevation2, borderStroke2, SuggestionChipDefaults.INSTANCE.m9870getHeightD9Ej5fM(), SuggestionChipPadding, mutableInteractionSource3, composer2, i162, i182);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            mutableInteractionSource22 = mutableInteractionSource3;
                            z32 = z2;
                            function242 = function23;
                            shape42 = shape2;
                            chipColors32 = chipColors2;
                            chipElevation32 = chipElevation2;
                            borderStroke32 = borderStroke2;
                            modifier22 = modifier42;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function23 = function22;
                if ((196608 & i19) != 0) {
                }
                if ((1572864 & i19) != 0) {
                }
                if ((i19 & 12582912) == 0) {
                }
                if ((i19 & 100663296) == 0) {
                }
                i6 = i22 & 512;
                if (i6 != 0) {
                }
                i7 = i6;
                mutableInteractionSource22 = mutableInteractionSource;
                if ((i3 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = i22 & 16;
            if (i5 != 0) {
            }
            function23 = function22;
            if ((196608 & i19) != 0) {
            }
            if ((1572864 & i19) != 0) {
            }
            if ((i19 & 12582912) == 0) {
            }
            if ((i19 & 100663296) == 0) {
            }
            i6 = i22 & 512;
            if (i6 != 0) {
            }
            i7 = i6;
            mutableInteractionSource22 = mutableInteractionSource;
            if ((i3 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i4 = i22 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i22 & 16;
        if (i5 != 0) {
        }
        function23 = function22;
        if ((196608 & i19) != 0) {
        }
        if ((1572864 & i19) != 0) {
        }
        if ((i19 & 12582912) == 0) {
        }
        if ((i19 & 100663296) == 0) {
        }
        i6 = i22 & 512;
        if (i6 != 0) {
        }
        i7 = i6;
        mutableInteractionSource22 = mutableInteractionSource;
        if ((i3 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:223:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:373:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with SuggestionChip that take a BorderStroke instead", replaceWith = @ReplaceWith(expression = "SuggestionChip(onClick, label, modifier, enabled, icon, shape, colors, elevation, border, interactionSource", imports = {}))
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void SuggestionChip(Function0 function0, Function2 function2, Modifier modifier, boolean z, Function2 function22, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2) {
        int i3;
        int i4;
        boolean z2;
        int i5;
        Function2 function23;
        Shape shape2;
        ChipColors chipColors2;
        int i6;
        int i7;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape3;
        int i8;
        ChipColors chipColorsSuggestionChipColors;
        Modifier modifier2;
        ChipElevation chipElevationM9875suggestionChipElevationaqJV_2Y;
        ChipBorder chipBorderM9872suggestionChipBorderd_3_b6Q;
        MutableInteractionSource mutableInteractionSource3;
        ChipBorder chipBorder2;
        int i9;
        Modifier modifier3;
        Composer composer2;
        boolean z3;
        Function2 function24;
        Shape shape4;
        ChipColors chipColors3;
        ChipElevation chipElevation2;
        ChipBorder chipBorder3;
        Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(170629701);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= CpioConstants.C_ISBLK;
                } else {
                    if ((i & CpioConstants.C_ISBLK) == 0) {
                        function23 = function22;
                        i3 |= composerStartRestartGroup.changedInstance(function23) ? 16384 : 8192;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            shape2 = shape;
                            int i11 = composerStartRestartGroup.changed(shape2) ? 131072 : 65536;
                            i3 |= i11;
                        } else {
                            shape2 = shape;
                        }
                        i3 |= i11;
                    } else {
                        shape2 = shape;
                    }
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            chipColors2 = chipColors;
                            int i12 = composerStartRestartGroup.changed(chipColors2) ? 1048576 : 524288;
                            i3 |= i12;
                        } else {
                            chipColors2 = chipColors;
                        }
                        i3 |= i12;
                    } else {
                        chipColors2 = chipColors;
                    }
                    if ((i & 12582912) == 0) {
                        i3 |= ((i2 & 128) == 0 && composerStartRestartGroup.changed(chipElevation)) ? 8388608 : 4194304;
                    }
                    if ((i & 100663296) == 0) {
                        i3 |= ((i2 & 256) == 0 && composerStartRestartGroup.changed(chipBorder)) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    i6 = i2 & 512;
                    if (i6 != 0) {
                        if ((i & 805306368) == 0) {
                            i7 = i6;
                            mutableInteractionSource2 = mutableInteractionSource;
                            i3 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 536870912 : 268435456;
                        }
                        if ((i3 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier4 = modifier;
                            z3 = z2;
                            function24 = function23;
                            shape4 = shape2;
                            chipColors3 = chipColors2;
                            composer2 = composerStartRestartGroup;
                            chipElevation2 = chipElevation;
                            chipBorder3 = chipBorder;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier5 = i10 == 0 ? Modifier.INSTANCE : modifier;
                                boolean z4 = i4 == 0 ? true : z2;
                                Function2 function25 = i5 == 0 ? null : function23;
                                if ((i2 & 32) == 0) {
                                    i3 &= -458753;
                                    shape3 = SuggestionChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                } else {
                                    shape3 = shape2;
                                }
                                if ((i2 & 64) == 0) {
                                    i8 = i3 & (-3670017);
                                    chipColorsSuggestionChipColors = SuggestionChipDefaults.INSTANCE.suggestionChipColors(composerStartRestartGroup, 6);
                                } else {
                                    i8 = i3;
                                    chipColorsSuggestionChipColors = chipColors2;
                                }
                                if ((i2 & 128) == 0) {
                                    modifier2 = modifier5;
                                    i8 &= -29360129;
                                    chipElevationM9875suggestionChipElevationaqJV_2Y = SuggestionChipDefaults.INSTANCE.m9875suggestionChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                                } else {
                                    modifier2 = modifier5;
                                    chipElevationM9875suggestionChipElevationaqJV_2Y = chipElevation;
                                }
                                if ((i2 & 256) == 0) {
                                    chipBorderM9872suggestionChipBorderd_3_b6Q = SuggestionChipDefaults.INSTANCE.m9872suggestionChipBorderd_3_b6Q(0L, 0L, 0.0f, composerStartRestartGroup, 3072, 7);
                                    i8 &= -234881025;
                                } else {
                                    chipBorderM9872suggestionChipBorderd_3_b6Q = chipBorder;
                                }
                                if (i7 == 0) {
                                    composerStartRestartGroup.startReplaceableGroup(2118466806);
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                    shape2 = shape3;
                                    z2 = z4;
                                    function23 = function25;
                                    chipColors2 = chipColorsSuggestionChipColors;
                                    i9 = i8;
                                    chipBorder2 = chipBorderM9872suggestionChipBorderd_3_b6Q;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    chipBorder2 = chipBorderM9872suggestionChipBorderd_3_b6Q;
                                    shape2 = shape3;
                                    z2 = z4;
                                    function23 = function25;
                                    chipColors2 = chipColorsSuggestionChipColors;
                                    i9 = i8;
                                }
                                modifier3 = modifier2;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                if ((i2 & 256) != 0) {
                                    i3 &= -234881025;
                                }
                                chipBorder2 = chipBorder;
                                mutableInteractionSource3 = mutableInteractionSource;
                                i9 = i3;
                                modifier3 = modifier;
                                chipElevationM9875suggestionChipElevationaqJV_2Y = chipElevation;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(170629701, i9, -1, "androidx.compose.material3.SuggestionChip (Chip.kt:770)");
                            }
                            TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), SuggestionChipTokens.INSTANCE.getLabelTextFont());
                            long jM9230labelColorvNxB06k$material3_release = chipColors2.m9230labelColorvNxB06k$material3_release(z2);
                            composerStartRestartGroup.startReplaceableGroup(2118467222);
                            State<BorderStroke> stateBorderStroke$material3_release = chipBorder2 != null ? null : chipBorder2.borderStroke$material3_release(z2, composerStartRestartGroup, ((i9 >> 9) & 14) | ((i9 >> 21) & 112));
                            composerStartRestartGroup.endReplaceableGroup();
                            BorderStroke value = stateBorderStroke$material3_release == null ? stateBorderStroke$material3_release.getValue() : null;
                            int i13 = i9 << 6;
                            int i14 = ((i9 >> 6) & 14) | 12582912 | ((i9 << 3) & 112) | ((i9 >> 3) & 896) | (i13 & 7168) | (i13 & 3670016);
                            int i15 = i9 << 9;
                            composer2 = composerStartRestartGroup;
                            m9240ChipnkUnTEs(modifier3, function0, z2, function2, textStyleFromToken, jM9230labelColorvNxB06k$material3_release, function23, null, shape2, chipColors2, chipElevationM9875suggestionChipElevationaqJV_2Y, value, SuggestionChipDefaults.INSTANCE.m9870getHeightD9Ej5fM(), SuggestionChipPadding, mutableInteractionSource3, composer2, i14 | (234881024 & i15) | (i15 & 1879048192), ((i9 >> 21) & 14) | 3456 | ((i9 >> 15) & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z3 = z2;
                            function24 = function23;
                            shape4 = shape2;
                            chipColors3 = chipColors2;
                            chipElevation2 = chipElevationM9875suggestionChipElevationaqJV_2Y;
                            chipBorder3 = chipBorder2;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            modifier4 = modifier3;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.SuggestionChip.4
                                public final /* synthetic */ int $$changed;
                                public final /* synthetic */ int $$default;
                                public final /* synthetic */ ChipBorder $border;
                                public final /* synthetic */ ChipColors $colors;
                                public final /* synthetic */ ChipElevation $elevation;
                                public final /* synthetic */ boolean $enabled;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $icon;
                                public final /* synthetic */ MutableInteractionSource $interactionSource;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                                public final /* synthetic */ Modifier $modifier;
                                public final /* synthetic */ Function0<Unit> $onClick;
                                public final /* synthetic */ Shape $shape;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C13734(Function0<Unit> function02, Function2<? super Composer, ? super Integer, Unit> function26, Modifier modifier42, boolean z32, Function2<? super Composer, ? super Integer, Unit> function242, Shape shape42, ChipColors chipColors32, ChipElevation chipElevation22, ChipBorder chipBorder32, MutableInteractionSource mutableInteractionSource22, int i16, int i22) {
                                    super(2);
                                    function0 = function02;
                                    function2 = function26;
                                    modifier = modifier42;
                                    z = z32;
                                    function2 = function242;
                                    shape = shape42;
                                    chipColors = chipColors32;
                                    chipElevation = chipElevation22;
                                    chipBorder = chipBorder32;
                                    mutableInteractionSource = mutableInteractionSource22;
                                    i = i16;
                                    i = i22;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer3, int i16) {
                                    ChipKt.SuggestionChip(function0, function2, modifier, z, function2, shape, chipColors, chipElevation, chipBorder, mutableInteractionSource, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 805306368;
                    i7 = i6;
                    mutableInteractionSource22 = mutableInteractionSource;
                    if ((i3 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i16 & 1) != 0) {
                            if (i10 == 0) {
                            }
                            if (i4 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if ((i22 & 32) == 0) {
                            }
                            if ((i22 & 64) == 0) {
                            }
                            if ((i22 & 128) == 0) {
                            }
                            if ((i22 & 256) == 0) {
                            }
                            if (i7 == 0) {
                            }
                            modifier3 = modifier2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), SuggestionChipTokens.INSTANCE.getLabelTextFont());
                            long jM9230labelColorvNxB06k$material3_release2 = chipColors2.m9230labelColorvNxB06k$material3_release(z2);
                            composerStartRestartGroup.startReplaceableGroup(2118467222);
                            if (chipBorder2 != null) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            if (stateBorderStroke$material3_release == null) {
                            }
                            int i132 = i9 << 6;
                            int i142 = ((i9 >> 6) & 14) | 12582912 | ((i9 << 3) & 112) | ((i9 >> 3) & 896) | (i132 & 7168) | (i132 & 3670016);
                            int i152 = i9 << 9;
                            composer2 = composerStartRestartGroup;
                            m9240ChipnkUnTEs(modifier3, function02, z2, function26, textStyleFromToken2, jM9230labelColorvNxB06k$material3_release2, function23, null, shape2, chipColors2, chipElevationM9875suggestionChipElevationaqJV_2Y, value, SuggestionChipDefaults.INSTANCE.m9870getHeightD9Ej5fM(), SuggestionChipPadding, mutableInteractionSource3, composer2, i142 | (234881024 & i152) | (i152 & 1879048192), ((i9 >> 21) & 14) | 3456 | ((i9 >> 15) & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z32 = z2;
                            function242 = function23;
                            shape42 = shape2;
                            chipColors32 = chipColors2;
                            chipElevation22 = chipElevationM9875suggestionChipElevationaqJV_2Y;
                            chipBorder32 = chipBorder2;
                            mutableInteractionSource22 = mutableInteractionSource3;
                            modifier42 = modifier3;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function23 = function22;
                if ((196608 & i16) != 0) {
                }
                if ((1572864 & i16) != 0) {
                }
                if ((i16 & 12582912) == 0) {
                }
                if ((i16 & 100663296) == 0) {
                }
                i6 = i22 & 512;
                if (i6 != 0) {
                }
                i7 = i6;
                mutableInteractionSource22 = mutableInteractionSource;
                if ((i3 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = i22 & 16;
            if (i5 != 0) {
            }
            function23 = function22;
            if ((196608 & i16) != 0) {
            }
            if ((1572864 & i16) != 0) {
            }
            if ((i16 & 12582912) == 0) {
            }
            if ((i16 & 100663296) == 0) {
            }
            i6 = i22 & 512;
            if (i6 != 0) {
            }
            i7 = i6;
            mutableInteractionSource22 = mutableInteractionSource;
            if ((i3 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i4 = i22 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i22 & 16;
        if (i5 != 0) {
        }
        function23 = function22;
        if ((196608 & i16) != 0) {
        }
        if ((1572864 & i16) != 0) {
        }
        if ((i16 & 12582912) == 0) {
        }
        if ((i16 & 100663296) == 0) {
        }
        i6 = i22 & 512;
        if (i6 != 0) {
        }
        i7 = i6;
        mutableInteractionSource22 = mutableInteractionSource;
        if ((i3 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:211:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:349:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ElevatedSuggestionChip(@NotNull Function0<Unit> function0, @NotNull Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Modifier modifier, boolean z, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Shape shape, @Nullable ChipColors chipColors, @Nullable ChipElevation chipElevation, @Nullable BorderStroke borderStroke, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Composer composer, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Shape shape2;
        ChipColors chipColors2;
        int i6;
        int i7;
        int i8;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape3;
        int i9;
        ChipColors chipColorsElevatedSuggestionChipColors;
        ChipElevation chipElevationM9869elevatedSuggestionChipElevationaqJV_2Y;
        MutableInteractionSource mutableInteractionSource3;
        ChipElevation chipElevation2;
        Modifier modifier2;
        boolean z2;
        BorderStroke borderStroke2;
        int i10;
        Composer composer2;
        BorderStroke borderStroke3;
        MutableInteractionSource mutableInteractionSource4;
        Shape shape4;
        Modifier modifier3;
        boolean z3;
        ChipElevation chipElevation3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-818834969);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= CpioConstants.C_ISBLK;
                } else {
                    if ((i & CpioConstants.C_ISBLK) == 0) {
                        function23 = function22;
                        i3 |= composerStartRestartGroup.changedInstance(function23) ? 16384 : 8192;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            shape2 = shape;
                            int i12 = composerStartRestartGroup.changed(shape2) ? 131072 : 65536;
                            i3 |= i12;
                        } else {
                            shape2 = shape;
                        }
                        i3 |= i12;
                    } else {
                        shape2 = shape;
                    }
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            chipColors2 = chipColors;
                            int i13 = composerStartRestartGroup.changed(chipColors2) ? 1048576 : 524288;
                            i3 |= i13;
                        } else {
                            chipColors2 = chipColors;
                        }
                        i3 |= i13;
                    } else {
                        chipColors2 = chipColors;
                    }
                    if ((i & 12582912) == 0) {
                        i3 |= ((i2 & 128) == 0 && composerStartRestartGroup.changed(chipElevation)) ? 8388608 : 4194304;
                    }
                    i6 = i2 & 256;
                    if (i6 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= composerStartRestartGroup.changed(borderStroke) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    i7 = i2 & 512;
                    if (i7 != 0) {
                        if ((i & 805306368) == 0) {
                            i8 = i7;
                            mutableInteractionSource2 = mutableInteractionSource;
                            i3 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 536870912 : 268435456;
                        }
                        if ((i3 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            z3 = z;
                            shape4 = shape2;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            composer2 = composerStartRestartGroup;
                            chipElevation3 = chipElevation;
                            borderStroke3 = borderStroke;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier4 = i11 == 0 ? Modifier.INSTANCE : modifier;
                                boolean z4 = i4 == 0 ? true : z;
                                Function2<? super Composer, ? super Integer, Unit> function24 = i5 == 0 ? null : function23;
                                if ((i2 & 32) == 0) {
                                    i3 &= -458753;
                                    shape3 = SuggestionChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                } else {
                                    shape3 = shape2;
                                }
                                if ((i2 & 64) == 0) {
                                    i9 = i3 & (-3670017);
                                    chipColorsElevatedSuggestionChipColors = SuggestionChipDefaults.INSTANCE.elevatedSuggestionChipColors(composerStartRestartGroup, 6);
                                } else {
                                    i9 = i3;
                                    chipColorsElevatedSuggestionChipColors = chipColors2;
                                }
                                if ((i2 & 128) == 0) {
                                    chipElevationM9869elevatedSuggestionChipElevationaqJV_2Y = SuggestionChipDefaults.INSTANCE.m9869elevatedSuggestionChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                                    i9 &= -29360129;
                                } else {
                                    chipElevationM9869elevatedSuggestionChipElevationaqJV_2Y = chipElevation;
                                }
                                BorderStroke borderStroke4 = i6 == 0 ? borderStroke : null;
                                if (i8 == 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-1455582059);
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource;
                                }
                                chipElevation2 = chipElevationM9869elevatedSuggestionChipElevationaqJV_2Y;
                                shape2 = shape3;
                                modifier2 = modifier4;
                                z2 = z4;
                                borderStroke2 = borderStroke4;
                                function23 = function24;
                                chipColors2 = chipColorsElevatedSuggestionChipColors;
                                i10 = i9;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                modifier2 = modifier;
                                chipElevation2 = chipElevation;
                                borderStroke2 = borderStroke;
                                mutableInteractionSource3 = mutableInteractionSource;
                                i10 = i3;
                                z2 = z;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-818834969, i10, -1, "androidx.compose.material3.ElevatedSuggestionChip (Chip.kt:838)");
                            }
                            int i14 = i10 << 6;
                            int i15 = ((i10 >> 6) & 14) | 12582912 | ((i10 << 3) & 112) | ((i10 >> 3) & 896) | (i14 & 7168) | (i14 & 3670016);
                            int i16 = i10 << 9;
                            int i17 = i15 | (234881024 & i16) | (i16 & 1879048192);
                            int i18 = i10 >> 21;
                            int i19 = (i18 & 112) | (i18 & 14) | 3456 | ((i10 >> 15) & 57344);
                            composer2 = composerStartRestartGroup;
                            m9240ChipnkUnTEs(modifier2, function0, z2, function2, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), SuggestionChipTokens.INSTANCE.getLabelTextFont()), chipColors2.m9230labelColorvNxB06k$material3_release(z2), function23, null, shape2, chipColors2, chipElevation2, borderStroke2, SuggestionChipDefaults.INSTANCE.m9870getHeightD9Ej5fM(), SuggestionChipPadding, mutableInteractionSource3, composer2, i17, i19);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            borderStroke3 = borderStroke2;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            shape4 = shape2;
                            modifier3 = modifier2;
                            z3 = z2;
                            chipElevation3 = chipElevation2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.ElevatedSuggestionChip.2
                                public final /* synthetic */ int $$changed;
                                public final /* synthetic */ int $$default;
                                public final /* synthetic */ BorderStroke $border;
                                public final /* synthetic */ ChipColors $colors;
                                public final /* synthetic */ ChipElevation $elevation;
                                public final /* synthetic */ boolean $enabled;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $icon;
                                public final /* synthetic */ MutableInteractionSource $interactionSource;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                                public final /* synthetic */ Modifier $modifier;
                                public final /* synthetic */ Function0<Unit> $onClick;
                                public final /* synthetic */ Shape $shape;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C13672(Function0<Unit> function02, Function2<? super Composer, ? super Integer, Unit> function25, Modifier modifier32, boolean z32, Function2<? super Composer, ? super Integer, Unit> function232, Shape shape42, ChipColors chipColors22, ChipElevation chipElevation32, BorderStroke borderStroke32, MutableInteractionSource mutableInteractionSource42, int i20, int i22) {
                                    super(2);
                                    function0 = function02;
                                    function2 = function25;
                                    modifier = modifier32;
                                    z = z32;
                                    function2 = function232;
                                    shape = shape42;
                                    chipColors = chipColors22;
                                    chipElevation = chipElevation32;
                                    borderStroke = borderStroke32;
                                    mutableInteractionSource = mutableInteractionSource42;
                                    i = i20;
                                    i = i22;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer3, int i20) {
                                    ChipKt.ElevatedSuggestionChip(function0, function2, modifier, z, function2, shape, chipColors, chipElevation, borderStroke, mutableInteractionSource, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 805306368;
                    i8 = i7;
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((i3 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i20 & 1) != 0) {
                            if (i11 == 0) {
                            }
                            if (i4 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if ((i22 & 32) == 0) {
                            }
                            if ((i22 & 64) == 0) {
                            }
                            if ((i22 & 128) == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            chipElevation2 = chipElevationM9869elevatedSuggestionChipElevationaqJV_2Y;
                            shape2 = shape3;
                            modifier2 = modifier4;
                            z2 = z4;
                            borderStroke2 = borderStroke4;
                            function232 = function24;
                            chipColors22 = chipColorsElevatedSuggestionChipColors;
                            i10 = i9;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i142 = i10 << 6;
                            int i152 = ((i10 >> 6) & 14) | 12582912 | ((i10 << 3) & 112) | ((i10 >> 3) & 896) | (i142 & 7168) | (i142 & 3670016);
                            int i162 = i10 << 9;
                            int i172 = i152 | (234881024 & i162) | (i162 & 1879048192);
                            int i182 = i10 >> 21;
                            int i192 = (i182 & 112) | (i182 & 14) | 3456 | ((i10 >> 15) & 57344);
                            composer2 = composerStartRestartGroup;
                            m9240ChipnkUnTEs(modifier2, function02, z2, function25, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), SuggestionChipTokens.INSTANCE.getLabelTextFont()), chipColors22.m9230labelColorvNxB06k$material3_release(z2), function232, null, shape2, chipColors22, chipElevation2, borderStroke2, SuggestionChipDefaults.INSTANCE.m9870getHeightD9Ej5fM(), SuggestionChipPadding, mutableInteractionSource3, composer2, i172, i192);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            borderStroke32 = borderStroke2;
                            mutableInteractionSource42 = mutableInteractionSource3;
                            shape42 = shape2;
                            modifier32 = modifier2;
                            z32 = z2;
                            chipElevation32 = chipElevation2;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function232 = function22;
                if ((196608 & i20) != 0) {
                }
                if ((1572864 & i20) != 0) {
                }
                if ((i20 & 12582912) == 0) {
                }
                i6 = i22 & 256;
                if (i6 == 0) {
                }
                i7 = i22 & 512;
                if (i7 != 0) {
                }
                i8 = i7;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i3 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i5 = i22 & 16;
            if (i5 != 0) {
            }
            function232 = function22;
            if ((196608 & i20) != 0) {
            }
            if ((1572864 & i20) != 0) {
            }
            if ((i20 & 12582912) == 0) {
            }
            i6 = i22 & 256;
            if (i6 == 0) {
            }
            i7 = i22 & 512;
            if (i7 != 0) {
            }
            i8 = i7;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i3 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i4 = i22 & 8;
        if (i4 == 0) {
        }
        i5 = i22 & 16;
        if (i5 != 0) {
        }
        function232 = function22;
        if ((196608 & i20) != 0) {
        }
        if ((1572864 & i20) != 0) {
        }
        if ((i20 & 12582912) == 0) {
        }
        i6 = i22 & 256;
        if (i6 == 0) {
        }
        i7 = i22 & 512;
        if (i7 != 0) {
        }
        i8 = i7;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i3 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:217:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:361:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with ElevatedSuggestionChip that take a BorderStroke instead", replaceWith = @ReplaceWith(expression = "ElevatedSuggestionChip(onClick, label, modifier, enabled, icon, shape, colors, elevation, border, interactionSource", imports = {}))
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void ElevatedSuggestionChip(Function0 function0, Function2 function2, Modifier modifier, boolean z, Function2 function22, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Function2 function23;
        Shape shape2;
        ChipColors chipColors2;
        int i6;
        int i7;
        int i8;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape3;
        int i9;
        ChipColors chipColorsElevatedSuggestionChipColors;
        ChipElevation chipElevationM9869elevatedSuggestionChipElevationaqJV_2Y;
        MutableInteractionSource mutableInteractionSource3;
        ChipBorder chipBorder2;
        ChipElevation chipElevation2;
        Modifier modifier2;
        boolean z2;
        int i10;
        Composer composer2;
        ChipBorder chipBorder3;
        MutableInteractionSource mutableInteractionSource4;
        Shape shape4;
        Modifier modifier3;
        boolean z3;
        ChipElevation chipElevation3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1668751803);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= CpioConstants.C_ISBLK;
                } else {
                    if ((i & CpioConstants.C_ISBLK) == 0) {
                        function23 = function22;
                        i3 |= composerStartRestartGroup.changedInstance(function23) ? 16384 : 8192;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            shape2 = shape;
                            int i12 = composerStartRestartGroup.changed(shape2) ? 131072 : 65536;
                            i3 |= i12;
                        } else {
                            shape2 = shape;
                        }
                        i3 |= i12;
                    } else {
                        shape2 = shape;
                    }
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            chipColors2 = chipColors;
                            int i13 = composerStartRestartGroup.changed(chipColors2) ? 1048576 : 524288;
                            i3 |= i13;
                        } else {
                            chipColors2 = chipColors;
                        }
                        i3 |= i13;
                    } else {
                        chipColors2 = chipColors;
                    }
                    if ((i & 12582912) == 0) {
                        i3 |= ((i2 & 128) == 0 && composerStartRestartGroup.changed(chipElevation)) ? 8388608 : 4194304;
                    }
                    i6 = i2 & 256;
                    if (i6 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= composerStartRestartGroup.changed(chipBorder) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    i7 = i2 & 512;
                    if (i7 != 0) {
                        if ((i & 805306368) == 0) {
                            i8 = i7;
                            mutableInteractionSource2 = mutableInteractionSource;
                            i3 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 536870912 : 268435456;
                        }
                        if ((i3 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            z3 = z;
                            shape4 = shape2;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            composer2 = composerStartRestartGroup;
                            chipElevation3 = chipElevation;
                            chipBorder3 = chipBorder;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier4 = i11 == 0 ? Modifier.INSTANCE : modifier;
                                boolean z4 = i4 == 0 ? true : z;
                                Function2 function24 = i5 == 0 ? null : function23;
                                if ((i2 & 32) == 0) {
                                    i3 &= -458753;
                                    shape3 = SuggestionChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                } else {
                                    shape3 = shape2;
                                }
                                if ((i2 & 64) == 0) {
                                    i9 = i3 & (-3670017);
                                    chipColorsElevatedSuggestionChipColors = SuggestionChipDefaults.INSTANCE.elevatedSuggestionChipColors(composerStartRestartGroup, 6);
                                } else {
                                    i9 = i3;
                                    chipColorsElevatedSuggestionChipColors = chipColors2;
                                }
                                if ((i2 & 128) == 0) {
                                    chipElevationM9869elevatedSuggestionChipElevationaqJV_2Y = SuggestionChipDefaults.INSTANCE.m9869elevatedSuggestionChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                                    i9 &= -29360129;
                                } else {
                                    chipElevationM9869elevatedSuggestionChipElevationaqJV_2Y = chipElevation;
                                }
                                ChipBorder chipBorder4 = i6 == 0 ? null : chipBorder;
                                if (i8 == 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-1455578225);
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    chipBorder2 = chipBorder4;
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                    shape2 = shape3;
                                    modifier2 = modifier4;
                                    function23 = function24;
                                    chipColors2 = chipColorsElevatedSuggestionChipColors;
                                    i10 = i9;
                                    chipElevation2 = chipElevationM9869elevatedSuggestionChipElevationaqJV_2Y;
                                    z2 = z4;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    chipBorder2 = chipBorder4;
                                    chipElevation2 = chipElevationM9869elevatedSuggestionChipElevationaqJV_2Y;
                                    shape2 = shape3;
                                    modifier2 = modifier4;
                                    z2 = z4;
                                    function23 = function24;
                                    chipColors2 = chipColorsElevatedSuggestionChipColors;
                                    i10 = i9;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                modifier2 = modifier;
                                chipElevation2 = chipElevation;
                                chipBorder2 = chipBorder;
                                mutableInteractionSource3 = mutableInteractionSource;
                                i10 = i3;
                                z2 = z;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1668751803, i10, -1, "androidx.compose.material3.ElevatedSuggestionChip (Chip.kt:914)");
                            }
                            TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), SuggestionChipTokens.INSTANCE.getLabelTextFont());
                            long jM9230labelColorvNxB06k$material3_release = chipColors2.m9230labelColorvNxB06k$material3_release(z2);
                            float fM9870getHeightD9Ej5fM = SuggestionChipDefaults.INSTANCE.m9870getHeightD9Ej5fM();
                            PaddingValues paddingValues = SuggestionChipPadding;
                            composerStartRestartGroup.startReplaceableGroup(-1455577719);
                            State<BorderStroke> stateBorderStroke$material3_release = chipBorder2 != null ? null : chipBorder2.borderStroke$material3_release(z2, composerStartRestartGroup, ((i10 >> 9) & 14) | ((i10 >> 21) & 112));
                            composerStartRestartGroup.endReplaceableGroup();
                            BorderStroke value = stateBorderStroke$material3_release == null ? stateBorderStroke$material3_release.getValue() : null;
                            int i14 = i10 << 6;
                            int i15 = ((i10 >> 6) & 14) | 12582912 | ((i10 << 3) & 112) | ((i10 >> 3) & 896) | (i14 & 7168) | (i14 & 3670016);
                            int i16 = i10 << 9;
                            int i17 = ((i10 >> 21) & 14) | 3456 | ((i10 >> 15) & 57344);
                            composer2 = composerStartRestartGroup;
                            m9240ChipnkUnTEs(modifier2, function0, z2, function2, textStyleFromToken, jM9230labelColorvNxB06k$material3_release, function23, null, shape2, chipColors2, chipElevation2, value, fM9870getHeightD9Ej5fM, paddingValues, mutableInteractionSource3, composer2, i15 | (234881024 & i16) | (i16 & 1879048192), i17);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            chipBorder3 = chipBorder2;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            shape4 = shape2;
                            modifier3 = modifier2;
                            z3 = z2;
                            chipElevation3 = chipElevation2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.ElevatedSuggestionChip.4
                                public final /* synthetic */ int $$changed;
                                public final /* synthetic */ int $$default;
                                public final /* synthetic */ ChipBorder $border;
                                public final /* synthetic */ ChipColors $colors;
                                public final /* synthetic */ ChipElevation $elevation;
                                public final /* synthetic */ boolean $enabled;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $icon;
                                public final /* synthetic */ MutableInteractionSource $interactionSource;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                                public final /* synthetic */ Modifier $modifier;
                                public final /* synthetic */ Function0<Unit> $onClick;
                                public final /* synthetic */ Shape $shape;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C13684(Function0<Unit> function02, Function2<? super Composer, ? super Integer, Unit> function25, Modifier modifier32, boolean z32, Function2<? super Composer, ? super Integer, Unit> function232, Shape shape42, ChipColors chipColors22, ChipElevation chipElevation32, ChipBorder chipBorder32, MutableInteractionSource mutableInteractionSource42, int i18, int i22) {
                                    super(2);
                                    function0 = function02;
                                    function2 = function25;
                                    modifier = modifier32;
                                    z = z32;
                                    function2 = function232;
                                    shape = shape42;
                                    chipColors = chipColors22;
                                    chipElevation = chipElevation32;
                                    chipBorder = chipBorder32;
                                    mutableInteractionSource = mutableInteractionSource42;
                                    i = i18;
                                    i = i22;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer3, int i18) {
                                    ChipKt.ElevatedSuggestionChip(function0, function2, modifier, z, function2, shape, chipColors, chipElevation, chipBorder, mutableInteractionSource, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 805306368;
                    i8 = i7;
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((i3 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i18 & 1) != 0) {
                            if (i11 == 0) {
                            }
                            if (i4 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if ((i22 & 32) == 0) {
                            }
                            if ((i22 & 64) == 0) {
                            }
                            if ((i22 & 128) == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), SuggestionChipTokens.INSTANCE.getLabelTextFont());
                            long jM9230labelColorvNxB06k$material3_release2 = chipColors22.m9230labelColorvNxB06k$material3_release(z2);
                            float fM9870getHeightD9Ej5fM2 = SuggestionChipDefaults.INSTANCE.m9870getHeightD9Ej5fM();
                            PaddingValues paddingValues2 = SuggestionChipPadding;
                            composerStartRestartGroup.startReplaceableGroup(-1455577719);
                            if (chipBorder2 != null) {
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            if (stateBorderStroke$material3_release == null) {
                            }
                            int i142 = i10 << 6;
                            int i152 = ((i10 >> 6) & 14) | 12582912 | ((i10 << 3) & 112) | ((i10 >> 3) & 896) | (i142 & 7168) | (i142 & 3670016);
                            int i162 = i10 << 9;
                            int i172 = ((i10 >> 21) & 14) | 3456 | ((i10 >> 15) & 57344);
                            composer2 = composerStartRestartGroup;
                            m9240ChipnkUnTEs(modifier2, function02, z2, function25, textStyleFromToken2, jM9230labelColorvNxB06k$material3_release2, function232, null, shape2, chipColors22, chipElevation2, value, fM9870getHeightD9Ej5fM2, paddingValues2, mutableInteractionSource3, composer2, i152 | (234881024 & i162) | (i162 & 1879048192), i172);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            chipBorder32 = chipBorder2;
                            mutableInteractionSource42 = mutableInteractionSource3;
                            shape42 = shape2;
                            modifier32 = modifier2;
                            z32 = z2;
                            chipElevation32 = chipElevation2;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function232 = function22;
                if ((196608 & i18) != 0) {
                }
                if ((1572864 & i18) != 0) {
                }
                if ((i18 & 12582912) == 0) {
                }
                i6 = i22 & 256;
                if (i6 == 0) {
                }
                i7 = i22 & 512;
                if (i7 != 0) {
                }
                i8 = i7;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i3 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i5 = i22 & 16;
            if (i5 != 0) {
            }
            function232 = function22;
            if ((196608 & i18) != 0) {
            }
            if ((1572864 & i18) != 0) {
            }
            if ((i18 & 12582912) == 0) {
            }
            i6 = i22 & 256;
            if (i6 == 0) {
            }
            i7 = i22 & 512;
            if (i7 != 0) {
            }
            i8 = i7;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i3 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i4 = i22 & 8;
        if (i4 == 0) {
        }
        i5 = i22 & 16;
        if (i5 != 0) {
        }
        function232 = function22;
        if ((196608 & i18) != 0) {
        }
        if ((1572864 & i18) != 0) {
        }
        if ((i18 & 12582912) == 0) {
        }
        i6 = i22 & 256;
        if (i6 == 0) {
        }
        i7 = i22 & 512;
        if (i7 != 0) {
        }
        i8 = i7;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i3 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: Chip-nkUnTEs */
    public static final void m9240ChipnkUnTEs(final Modifier modifier, final Function0<Unit> function0, final boolean z, final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, final long j, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Shape shape, final ChipColors chipColors, final ChipElevation chipElevation, final BorderStroke borderStroke, final float f, final PaddingValues paddingValues, final MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        float fM13666constructorimpl;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1400504719);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i3 |= composerStartRestartGroup.changed(textStyle) ? 16384 : 8192;
        }
        int i5 = i3;
        if ((i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
            i5 |= composerStartRestartGroup.changed(j) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function22) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function23) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i5 |= composerStartRestartGroup.changed(shape) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
        }
        if ((i & 805306368) == 0) {
            i5 |= composerStartRestartGroup.changed(chipColors) ? 536870912 : 268435456;
        }
        int i6 = i5;
        if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(chipElevation) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(borderStroke) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(paddingValues) ? 2048 : 1024;
        }
        if ((i2 & CpioConstants.C_ISBLK) == 0) {
            i4 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 16384 : 8192;
        }
        if ((306783379 & i6) != 306783378 || (i4 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1400504719, i6, i4, "androidx.compose.material3.Chip (Chip.kt:1861)");
            }
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ChipKt$Chip$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.m13009setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m12993getButtono7Vup1c());
                }
            }, 1, null);
            long jM9220containerColorvNxB06k$material3_release = chipColors.m9220containerColorvNxB06k$material3_release(z);
            if (chipElevation != null) {
                fM13666constructorimpl = chipElevation.m9239tonalElevationu2uoSUM$material3_release(z);
            } else {
                fM13666constructorimpl = C2046Dp.m13666constructorimpl(0);
            }
            float f2 = fM13666constructorimpl;
            composerStartRestartGroup.startReplaceableGroup(64045604);
            State<C2046Dp> stateShadowElevation$material3_release = chipElevation != null ? chipElevation.shadowElevation$material3_release(z, mutableInteractionSource, composerStartRestartGroup, ((i6 >> 6) & 14) | ((i4 >> 9) & 112) | ((i4 << 6) & 896)) : null;
            composerStartRestartGroup.endReplaceableGroup();
            int i7 = i4;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m9879Surfaceo_FOJdg(function0, modifierSemantics$default, z, shape, jM9220containerColorvNxB06k$material3_release, 0L, f2, stateShadowElevation$material3_release != null ? stateShadowElevation$material3_release.getValue().m13680unboximpl() : C2046Dp.m13666constructorimpl(0), borderStroke, mutableInteractionSource, ComposableLambdaKt.composableLambda(composer2, -1985962652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$Chip$2
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
                public final void invoke(@Nullable Composer composer3, int i8) {
                    if ((i8 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1985962652, i8, -1, "androidx.compose.material3.Chip.<anonymous> (Chip.kt:1873)");
                        }
                        ChipKt.m9241ChipContentfe0OD_I(function2, textStyle, j, function22, null, function23, chipColors.m9231leadingIconContentColorvNxB06k$material3_release(z), chipColors.m9232trailingIconContentColorvNxB06k$material3_release(z), f, paddingValues, composer3, CpioConstants.C_ISBLK);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composer2, ((i6 >> 15) & 7168) | ((i6 >> 3) & 14) | (i6 & 896) | ((i7 << 21) & 234881024) | (1879048192 & (i7 << 15)), 6, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$Chip$3
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

                public final void invoke(@Nullable Composer composer3, int i8) {
                    ChipKt.m9240ChipnkUnTEs(modifier, function0, z, function2, textStyle, j, function22, function23, shape, chipColors, chipElevation, borderStroke, f, paddingValues, mutableInteractionSource, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: SelectableChip-u0RnIRE */
    public static final void m9242SelectableChipu0RnIRE(final boolean z, final Modifier modifier, final Function0<Unit> function0, final boolean z2, final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final Shape shape, final SelectableChipColors selectableChipColors, final SelectableChipElevation selectableChipElevation, final BorderStroke borderStroke, final float f, final PaddingValues paddingValues, final MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        float fM13666constructorimpl;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(402951308);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if ((i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
            i3 |= composerStartRestartGroup.changed(textStyle) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function22) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function23) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function24) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changed(shape) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(selectableChipColors) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(selectableChipElevation) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(borderStroke) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
        }
        if ((i2 & CpioConstants.C_ISBLK) == 0) {
            i4 |= composerStartRestartGroup.changed(paddingValues) ? 16384 : 8192;
        }
        if ((i2 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
            i4 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 131072 : 65536;
        }
        if ((i3 & 306783379) != 306783378 || (74899 & i4) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(402951308, i3, i4, "androidx.compose.material3.SelectableChip (Chip.kt:1906)");
            }
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ChipKt$SelectableChip$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.m13009setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m12994getCheckboxo7Vup1c());
                }
            }, 1, null);
            int i5 = (i3 >> 9) & 14;
            long jM11350unboximpl = selectableChipColors.containerColor$material3_release(z2, z, composerStartRestartGroup, ((i3 << 3) & 112) | i5 | ((i4 << 6) & 896)).getValue().m11350unboximpl();
            if (selectableChipElevation != null) {
                fM13666constructorimpl = selectableChipElevation.m9738tonalElevationu2uoSUM$material3_release(z2);
            } else {
                fM13666constructorimpl = C2046Dp.m13666constructorimpl(0);
            }
            float f2 = fM13666constructorimpl;
            composerStartRestartGroup.startReplaceableGroup(1036687729);
            State<C2046Dp> stateShadowElevation$material3_release = selectableChipElevation == null ? null : selectableChipElevation.shadowElevation$material3_release(z2, mutableInteractionSource, composerStartRestartGroup, i5 | ((i4 >> 12) & 112) | ((i4 << 3) & 896));
            composerStartRestartGroup.endReplaceableGroup();
            int i6 = i3;
            int i7 = i4;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m9877Surfaced85dljk(z, function0, modifierSemantics$default, z2, shape, jM11350unboximpl, 0L, f2, stateShadowElevation$material3_release != null ? stateShadowElevation$material3_release.getValue().m13680unboximpl() : C2046Dp.m13666constructorimpl(0), borderStroke, mutableInteractionSource, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -577614814, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$SelectableChip$2
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
                public final void invoke(@Nullable Composer composer3, int i8) {
                    if ((i8 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-577614814, i8, -1, "androidx.compose.material3.SelectableChip.<anonymous> (Chip.kt:1920)");
                        }
                        ChipKt.m9241ChipContentfe0OD_I(function2, textStyle, selectableChipColors.m9729labelColorWaAFU9c$material3_release(z2, z), function22, function23, function24, selectableChipColors.m9730leadingIconContentColorWaAFU9c$material3_release(z2, z), selectableChipColors.m9731trailingIconContentColorWaAFU9c$material3_release(z2, z), f, paddingValues, composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composerStartRestartGroup, (i6 & 14) | ((i6 >> 3) & 112) | (i6 & 7168) | ((i6 >> 15) & 57344) | ((i7 << 21) & 1879048192), ((i7 >> 15) & 14) | 48, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$SelectableChip$3
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

                public final void invoke(@Nullable Composer composer3, int i8) {
                    ChipKt.m9242SelectableChipu0RnIRE(z, modifier, function0, z2, function2, textStyle, function22, function23, function24, shape, selectableChipColors, selectableChipElevation, borderStroke, f, paddingValues, mutableInteractionSource, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: ChipContent-fe0OD_I */
    public static final void m9241ChipContentfe0OD_I(final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, final long j, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final long j2, final long j3, final float f, final PaddingValues paddingValues, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-782878228);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(textStyle) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function22) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function23) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function24) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(j2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(j3) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
        }
        if ((i & 805306368) == 0) {
            i2 |= composerStartRestartGroup.changed(paddingValues) ? 536870912 : 268435456;
        }
        if ((i2 & 306783379) != 306783378 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-782878228, i2, -1, "androidx.compose.material3.ChipContent (Chip.kt:1947)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(j)), TextKt.getLocalTextStyle().provides(textStyle)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1748799148, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$ChipContent$1
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
                public final void invoke(@Nullable Composer composer2, int i3) {
                    if ((i3 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1748799148, i3, -1, "androidx.compose.material3.ChipContent.<anonymous> (Chip.kt:1952)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierPadding = PaddingKt.padding(SizeKt.m8157defaultMinSizeVpY3zN4$default(companion, 0.0f, f, 1, null), paddingValues);
                        C13631 c13631 = new MeasurePolicy() { // from class: androidx.compose.material3.ChipKt$ChipContent$1.1
                            @Override // androidx.compose.p003ui.layout.MeasurePolicy
                            @NotNull
                            /* renamed from: measure-3p2s80s */
                            public final MeasureResult mo7599measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j4) {
                                Measurable measurable;
                                Measurable measurable2;
                                int size = list.size();
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= size) {
                                        measurable = null;
                                        break;
                                    }
                                    measurable = list.get(i4);
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "leadingIcon")) {
                                        break;
                                    }
                                    i4++;
                                }
                                Measurable measurable3 = measurable;
                                final Placeable placeableMo12610measureBRTryo0 = measurable3 != null ? measurable3.mo12610measureBRTryo0(Constraints.m13613copyZbe2FdA$default(j4, 0, 0, 0, 0, 10, null)) : null;
                                final int iWidthOrZero = TextFieldImplKt.widthOrZero(placeableMo12610measureBRTryo0);
                                final int iHeightOrZero = TextFieldImplKt.heightOrZero(placeableMo12610measureBRTryo0);
                                int size2 = list.size();
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= size2) {
                                        measurable2 = null;
                                        break;
                                    }
                                    measurable2 = list.get(i5);
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "trailingIcon")) {
                                        break;
                                    }
                                    i5++;
                                }
                                Measurable measurable4 = measurable2;
                                final Placeable placeableMo12610measureBRTryo02 = measurable4 != null ? measurable4.mo12610measureBRTryo0(Constraints.m13613copyZbe2FdA$default(j4, 0, 0, 0, 0, 10, null)) : null;
                                int iWidthOrZero2 = TextFieldImplKt.widthOrZero(placeableMo12610measureBRTryo02);
                                final int iHeightOrZero2 = TextFieldImplKt.heightOrZero(placeableMo12610measureBRTryo02);
                                int size3 = list.size();
                                for (int i6 = 0; i6 < size3; i6++) {
                                    Measurable measurable5 = list.get(i6);
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable5), "label")) {
                                        final Placeable placeableMo12610measureBRTryo03 = measurable5.mo12610measureBRTryo0(ConstraintsKt.m13639offsetNN6EwU$default(j4, -(iWidthOrZero + iWidthOrZero2), 0, 2, null));
                                        int width = placeableMo12610measureBRTryo03.getWidth() + iWidthOrZero + iWidthOrZero2;
                                        final int iMax = Math.max(iHeightOrZero, Math.max(placeableMo12610measureBRTryo03.getHeight(), iHeightOrZero2));
                                        return MeasureScope.layout$default(measureScope, width, iMax, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.ChipKt.ChipContent.1.1.1
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
                                                Placeable placeable = placeableMo12610measureBRTryo0;
                                                if (placeable != null) {
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.INSTANCE.getCenterVertically().align(iHeightOrZero, iMax), 0.0f, 4, null);
                                                }
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12610measureBRTryo03, iWidthOrZero, 0, 0.0f, 4, null);
                                                Placeable placeable2 = placeableMo12610measureBRTryo02;
                                                if (placeable2 != null) {
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, placeableMo12610measureBRTryo03.getWidth() + iWidthOrZero, Alignment.INSTANCE.getCenterVertically().align(iHeightOrZero2, iMax), 0.0f, 4, null);
                                                }
                                            }
                                        }, 4, null);
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        };
                        Function2<Composer, Integer, Unit> function25 = function23;
                        Function2<Composer, Integer, Unit> function26 = function22;
                        Function2<Composer, Integer, Unit> function27 = function24;
                        long j4 = j2;
                        Function2<Composer, Integer, Unit> function28 = function2;
                        long j5 = j3;
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierPadding);
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
                        Updater.m10877setimpl(composerM10870constructorimpl, c13631, companion2.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(651014582);
                        if (function25 != null || function26 != null) {
                            Modifier modifierLayoutId = LayoutIdKt.layoutId(companion, "leadingIcon");
                            Alignment center = Alignment.INSTANCE.getCenter();
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierLayoutId);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer2);
                            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            if (function25 != null) {
                                composer2.startReplaceableGroup(1725997334);
                                function25.invoke(composer2, 0);
                                composer2.endReplaceableGroup();
                            } else if (function26 != null) {
                                composer2.startReplaceableGroup(1725997437);
                                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(j4)), function26, composer2, ProvidedValue.$stable);
                                composer2.endReplaceableGroup();
                            } else {
                                composer2.startReplaceableGroup(1725997699);
                                composer2.endReplaceableGroup();
                            }
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                        composer2.endReplaceableGroup();
                        Modifier modifierM8124paddingVpY3zN4 = PaddingKt.m8124paddingVpY3zN4(LayoutIdKt.layoutId(companion, "label"), ChipKt.HorizontalElementsPadding, C2046Dp.m13666constructorimpl(0));
                        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        Alignment.Vertical centerVertically = companion3.getCenterVertically();
                        composer2.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, 54);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM8124paddingVpY3zN4);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer2);
                        Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                        if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        function28.invoke(composer2, 0);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.startReplaceableGroup(-313041276);
                        if (function27 != null) {
                            Modifier modifierLayoutId2 = LayoutIdKt.layoutId(companion, "trailingIcon");
                            Alignment center2 = companion3.getCenter();
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer2, 6);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierLayoutId2);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor4);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer2);
                            Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion2.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                            }
                            function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(j5)), function27, composer2, ProvidedValue.$stable);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$ChipContent$2
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

                public final void invoke(@Nullable Composer composer2, int i3) {
                    ChipKt.m9241ChipContentfe0OD_I(function2, textStyle, j, function22, function23, function24, j2, j3, f, paddingValues, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @NotNull
    public static final ChipColors getDefaultSuggestionChipColors(@NotNull ColorScheme colorScheme) {
        ChipColors defaultSuggestionChipColorsCached = colorScheme.getDefaultSuggestionChipColorsCached();
        if (defaultSuggestionChipColorsCached != null) {
            return defaultSuggestionChipColorsCached;
        }
        Color.Companion companion = Color.INSTANCE;
        long jM11375getTransparent0d7_KjU = companion.m11375getTransparent0d7_KjU();
        SuggestionChipTokens suggestionChipTokens = SuggestionChipTokens.INSTANCE;
        ChipColors chipColors = new ChipColors(jM11375getTransparent0d7_KjU, ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getLeadingIconColor()), companion.m11376getUnspecified0d7_KjU(), companion.m11375getTransparent0d7_KjU(), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getDisabledLeadingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), companion.m11376getUnspecified0d7_KjU(), null);
        colorScheme.setDefaultSuggestionChipColorsCached$material3_release(chipColors);
        return chipColors;
    }

    public static /* synthetic */ PaddingValues inputChipPadding$default(boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        return inputChipPadding(z, z2, z3);
    }

    private static final PaddingValues inputChipPadding(boolean z, boolean z2, boolean z3) {
        return PaddingKt.m8120PaddingValuesa9UjIt4$default(C2046Dp.m13666constructorimpl((z || !z2) ? 4 : 8), 0.0f, C2046Dp.m13666constructorimpl(z3 ? 8 : 4), 0.0f, 10, null);
    }

    static {
        float fM13666constructorimpl = C2046Dp.m13666constructorimpl(8);
        HorizontalElementsPadding = fM13666constructorimpl;
        AssistChipPadding = PaddingKt.m8118PaddingValuesYgX7TsA$default(fM13666constructorimpl, 0.0f, 2, null);
        FilterChipPadding = PaddingKt.m8118PaddingValuesYgX7TsA$default(fM13666constructorimpl, 0.0f, 2, null);
        SuggestionChipPadding = PaddingKt.m8118PaddingValuesYgX7TsA$default(fM13666constructorimpl, 0.0f, 2, null);
    }
}
