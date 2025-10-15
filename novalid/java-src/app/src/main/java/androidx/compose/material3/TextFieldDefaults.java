package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.material3.tokens.OutlinedTextFieldTokens;
import androidx.compose.p003ui.ComposedModifierKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.platform.InspectableValueKt;
import androidx.compose.p003ui.platform.InspectorInfo;
import androidx.compose.p003ui.text.input.VisualTransformation;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextFieldDefaults.kt */
@Immutable
@Metadata(m7104d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\bC\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J7\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001f2\b\b\u0002\u0010\u001c\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010+J¦\u0002\u0010,\u001a\u00020$2\u0006\u0010-\u001a\u00020.2\u0011\u0010/\u001a\r\u0012\u0004\u0012\u00020$00¢\u0006\u0002\b12\u0006\u0010%\u001a\u00020&2\u0006\u00102\u001a\u00020&2\u0006\u00103\u001a\u0002042\u0006\u0010(\u001a\u00020)2\b\b\u0002\u0010'\u001a\u00020&2\u0015\b\u0002\u00105\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000100¢\u0006\u0002\b12\u0015\b\u0002\u00106\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000100¢\u0006\u0002\b12\u0015\b\u0002\u00107\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000100¢\u0006\u0002\b12\u0015\b\u0002\u00108\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000100¢\u0006\u0002\b12\u0015\b\u0002\u00109\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000100¢\u0006\u0002\b12\u0015\b\u0002\u0010:\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000100¢\u0006\u0002\b12\u0015\b\u0002\u0010;\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000100¢\u0006\u0002\b12\b\b\u0002\u0010\u001c\u001a\u00020\u00152\b\b\u0002\u0010*\u001a\u00020\u001f2\b\b\u0002\u0010<\u001a\u00020=2\u0013\b\u0002\u0010>\u001a\r\u0012\u0004\u0012\u00020$00¢\u0006\u0002\b1H\u0007¢\u0006\u0002\u0010?J7\u0010@\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001f2\b\b\u0002\u0010\u001c\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010+JP\u0010A\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001f2\b\b\u0002\u0010\u001c\u001a\u00020\u00152\b\b\u0002\u0010B\u001a\u00020\u00042\b\b\u0002\u0010C\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\bD\u0010EJ\u009c\u0002\u0010F\u001a\u00020$2\u0006\u0010-\u001a\u00020.2\u0011\u0010/\u001a\r\u0012\u0004\u0012\u00020$00¢\u0006\u0002\b12\u0006\u0010%\u001a\u00020&2\u0006\u00102\u001a\u00020&2\u0006\u00103\u001a\u0002042\u0006\u0010(\u001a\u00020)2\b\b\u0002\u0010'\u001a\u00020&2\u0015\b\u0002\u00105\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000100¢\u0006\u0002\b12\u0015\b\u0002\u00106\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000100¢\u0006\u0002\b12\u0015\b\u0002\u00107\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000100¢\u0006\u0002\b12\u0015\b\u0002\u00108\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000100¢\u0006\u0002\b12\u0015\b\u0002\u00109\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000100¢\u0006\u0002\b12\u0015\b\u0002\u0010:\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000100¢\u0006\u0002\b12\u0015\b\u0002\u0010;\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000100¢\u0006\u0002\b12\b\b\u0002\u0010*\u001a\u00020\u001f2\b\b\u0002\u0010<\u001a\u00020=2\u0013\b\u0002\u0010>\u001a\r\u0012\u0004\u0012\u00020$00¢\u0006\u0002\b1H\u0007¢\u0006\u0002\u0010GJî\u0001\u0010F\u001a\u00020$2\u0006\u0010-\u001a\u00020.2\u0011\u0010/\u001a\r\u0012\u0004\u0012\u00020$00¢\u0006\u0002\b12\u0006\u0010%\u001a\u00020&2\u0006\u00102\u001a\u00020&2\u0006\u00103\u001a\u0002042\u0006\u0010(\u001a\u00020)2\b\b\u0002\u0010'\u001a\u00020&2\u0015\b\u0002\u00105\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000100¢\u0006\u0002\b12\u0015\b\u0002\u00106\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000100¢\u0006\u0002\b12\u0015\b\u0002\u00107\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000100¢\u0006\u0002\b12\u0015\b\u0002\u00108\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000100¢\u0006\u0002\b12\u0015\b\u0002\u0010;\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000100¢\u0006\u0002\b12\b\b\u0002\u0010*\u001a\u00020\u001f2\b\b\u0002\u0010<\u001a\u00020=2\u0013\b\u0002\u0010>\u001a\r\u0012\u0004\u0012\u00020$00¢\u0006\u0002\b1H\u0007¢\u0006\u0002\u0010HJ¦\u0002\u0010I\u001a\u00020$2\u0006\u0010-\u001a\u00020.2\u0011\u0010/\u001a\r\u0012\u0004\u0012\u00020$00¢\u0006\u0002\b12\u0006\u0010%\u001a\u00020&2\u0006\u00102\u001a\u00020&2\u0006\u00103\u001a\u0002042\u0006\u0010(\u001a\u00020)2\b\b\u0002\u0010'\u001a\u00020&2\u0015\b\u0002\u00105\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000100¢\u0006\u0002\b12\u0015\b\u0002\u00106\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000100¢\u0006\u0002\b12\u0015\b\u0002\u00107\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000100¢\u0006\u0002\b12\u0015\b\u0002\u00108\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000100¢\u0006\u0002\b12\u0015\b\u0002\u00109\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000100¢\u0006\u0002\b12\u0015\b\u0002\u0010:\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000100¢\u0006\u0002\b12\u0015\b\u0002\u0010;\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000100¢\u0006\u0002\b12\b\b\u0002\u0010\u001c\u001a\u00020\u00152\b\b\u0002\u0010*\u001a\u00020\u001f2\b\b\u0002\u0010<\u001a\u00020=2\u0013\b\u0002\u0010>\u001a\r\u0012\u0004\u0012\u00020$00¢\u0006\u0002\b1H\u0007¢\u0006\u0002\u0010?Jø\u0001\u0010I\u001a\u00020$2\u0006\u0010-\u001a\u00020.2\u0011\u0010/\u001a\r\u0012\u0004\u0012\u00020$00¢\u0006\u0002\b12\u0006\u0010%\u001a\u00020&2\u0006\u00102\u001a\u00020&2\u0006\u00103\u001a\u0002042\u0006\u0010(\u001a\u00020)2\b\b\u0002\u0010'\u001a\u00020&2\u0015\b\u0002\u00105\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000100¢\u0006\u0002\b12\u0015\b\u0002\u00106\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000100¢\u0006\u0002\b12\u0015\b\u0002\u00107\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000100¢\u0006\u0002\b12\u0015\b\u0002\u00108\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000100¢\u0006\u0002\b12\u0015\b\u0002\u0010;\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000100¢\u0006\u0002\b12\b\b\u0002\u0010\u001c\u001a\u00020\u00152\b\b\u0002\u0010*\u001a\u00020\u001f2\b\b\u0002\u0010<\u001a\u00020=2\u0013\b\u0002\u0010>\u001a\r\u0012\u0004\u0012\u00020$00¢\u0006\u0002\b1H\u0007¢\u0006\u0002\u0010JJ\r\u0010*\u001a\u00020\u001fH\u0007¢\u0006\u0002\u0010KJÂ\u0003\u0010*\u001a\u00020\u001f2\b\b\u0002\u0010L\u001a\u00020M2\b\b\u0002\u0010N\u001a\u00020M2\b\b\u0002\u0010O\u001a\u00020M2\b\b\u0002\u0010P\u001a\u00020M2\b\b\u0002\u0010Q\u001a\u00020M2\b\b\u0002\u0010R\u001a\u00020M2\b\b\u0002\u0010S\u001a\u00020M2\b\b\u0002\u0010T\u001a\u00020M2\b\b\u0002\u0010U\u001a\u00020M2\b\b\u0002\u0010V\u001a\u00020M2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010X2\b\b\u0002\u0010Y\u001a\u00020M2\b\b\u0002\u0010Z\u001a\u00020M2\b\b\u0002\u0010[\u001a\u00020M2\b\b\u0002\u0010\\\u001a\u00020M2\b\b\u0002\u0010]\u001a\u00020M2\b\b\u0002\u0010^\u001a\u00020M2\b\b\u0002\u0010_\u001a\u00020M2\b\b\u0002\u0010`\u001a\u00020M2\b\b\u0002\u0010a\u001a\u00020M2\b\b\u0002\u0010b\u001a\u00020M2\b\b\u0002\u0010c\u001a\u00020M2\b\b\u0002\u0010d\u001a\u00020M2\b\b\u0002\u0010e\u001a\u00020M2\b\b\u0002\u0010f\u001a\u00020M2\b\b\u0002\u0010g\u001a\u00020M2\b\b\u0002\u0010h\u001a\u00020M2\b\b\u0002\u0010i\u001a\u00020M2\b\b\u0002\u0010j\u001a\u00020M2\b\b\u0002\u0010k\u001a\u00020M2\b\b\u0002\u0010l\u001a\u00020M2\b\b\u0002\u0010m\u001a\u00020M2\b\b\u0002\u0010n\u001a\u00020M2\b\b\u0002\u0010o\u001a\u00020M2\b\b\u0002\u0010p\u001a\u00020M2\b\b\u0002\u0010q\u001a\u00020M2\b\b\u0002\u0010r\u001a\u00020M2\b\b\u0002\u0010s\u001a\u00020M2\b\b\u0002\u0010t\u001a\u00020M2\b\b\u0002\u0010u\u001a\u00020M2\b\b\u0002\u0010v\u001a\u00020M2\b\b\u0002\u0010w\u001a\u00020M2\b\b\u0002\u0010x\u001a\u00020MH\u0007ø\u0001\u0000¢\u0006\u0004\by\u0010zJ:\u0010{\u001a\u00020=2\b\b\u0002\u0010|\u001a\u00020\u00042\b\b\u0002\u0010}\u001a\u00020\u00042\b\b\u0002\u0010~\u001a\u00020\u00042\b\b\u0002\u0010\u007f\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J;\u0010\u0082\u0001\u001a\u00020=2\b\b\u0002\u0010|\u001a\u00020\u00042\b\b\u0002\u0010~\u001a\u00020\u00042\b\b\u0002\u0010}\u001a\u00020\u00042\b\b\u0002\u0010\u007f\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0006\b\u0083\u0001\u0010\u0081\u0001J\u0084\u0003\u0010\u0084\u0001\u001a\u00020\u001f2\t\b\u0002\u0010\u0085\u0001\u001a\u00020M2\b\b\u0002\u0010O\u001a\u00020M2\t\b\u0002\u0010\u0086\u0001\u001a\u00020M2\b\b\u0002\u0010U\u001a\u00020M2\b\b\u0002\u0010V\u001a\u00020M2\b\b\u0002\u0010W\u001a\u00020X2\t\b\u0002\u0010\u0087\u0001\u001a\u00020M2\t\b\u0002\u0010\u0088\u0001\u001a\u00020M2\t\b\u0002\u0010\u0089\u0001\u001a\u00020M2\t\b\u0002\u0010\u008a\u0001\u001a\u00020M2\b\b\u0002\u0010]\u001a\u00020M2\b\b\u0002\u0010^\u001a\u00020M2\b\b\u0002\u0010_\u001a\u00020M2\b\b\u0002\u0010`\u001a\u00020M2\b\b\u0002\u0010a\u001a\u00020M2\b\b\u0002\u0010b\u001a\u00020M2\b\b\u0002\u0010c\u001a\u00020M2\b\b\u0002\u0010d\u001a\u00020M2\b\b\u0002\u0010e\u001a\u00020M2\b\b\u0002\u0010f\u001a\u00020M2\b\b\u0002\u0010g\u001a\u00020M2\b\b\u0002\u0010h\u001a\u00020M2\t\b\u0002\u0010\u008b\u0001\u001a\u00020M2\b\b\u0002\u0010k\u001a\u00020M2\b\b\u0002\u0010m\u001a\u00020M2\b\b\u0002\u0010n\u001a\u00020M2\b\b\u0002\u0010o\u001a\u00020M2\b\b\u0002\u0010p\u001a\u00020M2\b\b\u0002\u0010q\u001a\u00020M2\b\b\u0002\u0010r\u001a\u00020M2\b\b\u0002\u0010s\u001a\u00020M2\b\b\u0002\u0010t\u001a\u00020M2\b\b\u0002\u0010u\u001a\u00020M2\b\b\u0002\u0010v\u001a\u00020M2\b\b\u0002\u0010w\u001a\u00020M2\b\b\u0002\u0010x\u001a\u00020MH\u0007ø\u0001\u0000¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J´\u0003\u0010\u0084\u0001\u001a\u00020\u001f2\b\b\u0002\u0010L\u001a\u00020M2\b\b\u0002\u0010N\u001a\u00020M2\b\b\u0002\u0010O\u001a\u00020M2\b\b\u0002\u0010P\u001a\u00020M2\t\b\u0002\u0010\u0086\u0001\u001a\u00020M2\b\b\u0002\u0010T\u001a\u00020M2\b\b\u0002\u0010U\u001a\u00020M2\b\b\u0002\u0010V\u001a\u00020M2\b\b\u0002\u0010W\u001a\u00020X2\t\b\u0002\u0010\u0087\u0001\u001a\u00020M2\t\b\u0002\u0010\u0088\u0001\u001a\u00020M2\t\b\u0002\u0010\u0089\u0001\u001a\u00020M2\t\b\u0002\u0010\u008a\u0001\u001a\u00020M2\b\b\u0002\u0010]\u001a\u00020M2\b\b\u0002\u0010^\u001a\u00020M2\b\b\u0002\u0010_\u001a\u00020M2\b\b\u0002\u0010`\u001a\u00020M2\b\b\u0002\u0010a\u001a\u00020M2\b\b\u0002\u0010b\u001a\u00020M2\b\b\u0002\u0010c\u001a\u00020M2\b\b\u0002\u0010d\u001a\u00020M2\b\b\u0002\u0010e\u001a\u00020M2\b\b\u0002\u0010f\u001a\u00020M2\b\b\u0002\u0010g\u001a\u00020M2\b\b\u0002\u0010h\u001a\u00020M2\b\b\u0002\u0010i\u001a\u00020M2\b\b\u0002\u0010j\u001a\u00020M2\b\b\u0002\u0010k\u001a\u00020M2\b\b\u0002\u0010l\u001a\u00020M2\b\b\u0002\u0010m\u001a\u00020M2\b\b\u0002\u0010n\u001a\u00020M2\b\b\u0002\u0010o\u001a\u00020M2\b\b\u0002\u0010p\u001a\u00020M2\b\b\u0002\u0010q\u001a\u00020M2\b\b\u0002\u0010r\u001a\u00020M2\b\b\u0002\u0010s\u001a\u00020M2\b\b\u0002\u0010t\u001a\u00020M2\b\b\u0002\u0010u\u001a\u00020M2\b\b\u0002\u0010v\u001a\u00020M2\b\b\u0002\u0010w\u001a\u00020M2\b\b\u0002\u0010x\u001a\u00020MH\u0007ø\u0001\u0000¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J=\u0010\u0090\u0001\u001a\u00020=2\b\b\u0002\u0010|\u001a\u00020\u00042\b\b\u0002\u0010~\u001a\u00020\u00042\b\b\u0002\u0010}\u001a\u00020\u00042\b\b\u0002\u0010\u007f\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0006\b\u0091\u0001\u0010\u0081\u0001J=\u0010\u0092\u0001\u001a\u00020=2\b\b\u0002\u0010|\u001a\u00020\u00042\b\b\u0002\u0010~\u001a\u00020\u00042\b\b\u0002\u0010}\u001a\u00020\u00042\b\b\u0002\u0010\u007f\u001a\u00020\u0004H\u0001ø\u0001\u0000¢\u0006\u0006\b\u0093\u0001\u0010\u0081\u0001J\u0080\u0003\u0010\u0094\u0001\u001a\u00020\u001f2\t\b\u0002\u0010\u0085\u0001\u001a\u00020M2\b\b\u0002\u0010O\u001a\u00020M2\t\b\u0002\u0010\u0086\u0001\u001a\u00020M2\b\b\u0002\u0010U\u001a\u00020M2\b\b\u0002\u0010V\u001a\u00020M2\b\b\u0002\u0010W\u001a\u00020X2\b\b\u0002\u0010Y\u001a\u00020M2\b\b\u0002\u0010Z\u001a\u00020M2\b\b\u0002\u0010[\u001a\u00020M2\b\b\u0002\u0010\\\u001a\u00020M2\b\b\u0002\u0010]\u001a\u00020M2\b\b\u0002\u0010^\u001a\u00020M2\b\b\u0002\u0010_\u001a\u00020M2\b\b\u0002\u0010`\u001a\u00020M2\b\b\u0002\u0010a\u001a\u00020M2\b\b\u0002\u0010b\u001a\u00020M2\b\b\u0002\u0010c\u001a\u00020M2\b\b\u0002\u0010d\u001a\u00020M2\b\b\u0002\u0010e\u001a\u00020M2\b\b\u0002\u0010f\u001a\u00020M2\b\b\u0002\u0010g\u001a\u00020M2\b\b\u0002\u0010h\u001a\u00020M2\t\b\u0002\u0010\u008b\u0001\u001a\u00020M2\b\b\u0002\u0010k\u001a\u00020M2\b\b\u0002\u0010m\u001a\u00020M2\b\b\u0002\u0010n\u001a\u00020M2\b\b\u0002\u0010o\u001a\u00020M2\b\b\u0002\u0010p\u001a\u00020M2\b\b\u0002\u0010q\u001a\u00020M2\b\b\u0002\u0010r\u001a\u00020M2\b\b\u0002\u0010s\u001a\u00020M2\b\b\u0002\u0010t\u001a\u00020M2\b\b\u0002\u0010u\u001a\u00020M2\b\b\u0002\u0010v\u001a\u00020M2\b\b\u0002\u0010w\u001a\u00020M2\b\b\u0002\u0010x\u001a\u00020MH\u0007ø\u0001\u0000¢\u0006\u0006\b\u0095\u0001\u0010\u008d\u0001J°\u0003\u0010\u0094\u0001\u001a\u00020\u001f2\b\b\u0002\u0010L\u001a\u00020M2\b\b\u0002\u0010N\u001a\u00020M2\b\b\u0002\u0010O\u001a\u00020M2\b\b\u0002\u0010P\u001a\u00020M2\t\b\u0002\u0010\u0086\u0001\u001a\u00020M2\b\b\u0002\u0010T\u001a\u00020M2\b\b\u0002\u0010U\u001a\u00020M2\b\b\u0002\u0010V\u001a\u00020M2\b\b\u0002\u0010W\u001a\u00020X2\b\b\u0002\u0010Y\u001a\u00020M2\b\b\u0002\u0010Z\u001a\u00020M2\b\b\u0002\u0010[\u001a\u00020M2\b\b\u0002\u0010\\\u001a\u00020M2\b\b\u0002\u0010]\u001a\u00020M2\b\b\u0002\u0010^\u001a\u00020M2\b\b\u0002\u0010_\u001a\u00020M2\b\b\u0002\u0010`\u001a\u00020M2\b\b\u0002\u0010a\u001a\u00020M2\b\b\u0002\u0010b\u001a\u00020M2\b\b\u0002\u0010c\u001a\u00020M2\b\b\u0002\u0010d\u001a\u00020M2\b\b\u0002\u0010e\u001a\u00020M2\b\b\u0002\u0010f\u001a\u00020M2\b\b\u0002\u0010g\u001a\u00020M2\b\b\u0002\u0010h\u001a\u00020M2\b\b\u0002\u0010i\u001a\u00020M2\b\b\u0002\u0010j\u001a\u00020M2\b\b\u0002\u0010k\u001a\u00020M2\b\b\u0002\u0010l\u001a\u00020M2\b\b\u0002\u0010m\u001a\u00020M2\b\b\u0002\u0010n\u001a\u00020M2\b\b\u0002\u0010o\u001a\u00020M2\b\b\u0002\u0010p\u001a\u00020M2\b\b\u0002\u0010q\u001a\u00020M2\b\b\u0002\u0010r\u001a\u00020M2\b\b\u0002\u0010s\u001a\u00020M2\b\b\u0002\u0010t\u001a\u00020M2\b\b\u0002\u0010u\u001a\u00020M2\b\b\u0002\u0010v\u001a\u00020M2\b\b\u0002\u0010w\u001a\u00020M2\b\b\u0002\u0010x\u001a\u00020MH\u0007ø\u0001\u0000¢\u0006\u0006\b\u0096\u0001\u0010\u008f\u0001J=\u0010\u0097\u0001\u001a\u00020=2\b\b\u0002\u0010|\u001a\u00020\u00042\b\b\u0002\u0010}\u001a\u00020\u00042\b\b\u0002\u0010~\u001a\u00020\u00042\b\b\u0002\u0010\u007f\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0006\b\u0098\u0001\u0010\u0081\u0001J=\u0010\u0099\u0001\u001a\u00020=2\b\b\u0002\u0010|\u001a\u00020\u00042\b\b\u0002\u0010~\u001a\u00020\u00042\b\b\u0002\u0010}\u001a\u00020\u00042\b\b\u0002\u0010\u007f\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0006\b\u009a\u0001\u0010\u0081\u0001JQ\u0010\u009b\u0001\u001a\u00030\u009c\u0001*\u00030\u009c\u00012\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001f2\t\b\u0002\u0010\u009d\u0001\u001a\u00020\u00042\t\b\u0002\u0010\u009e\u0001\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0006\b\u009f\u0001\u0010 \u0001R$\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0019\u0010\u000b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u0019\u0010\r\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000e\u0010\u0007R$\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0007R\u0019\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0013\u0010\u0007R\u001a\u0010\u0014\u001a\u00020\u00158GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00158GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0002\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0018R\u0018\u0010\u001e\u001a\u00020\u001f*\u00020 8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¡\u0001"}, m7105d2 = {"Landroidx/compose/material3/TextFieldDefaults;", "", "()V", "FocusedBorderThickness", "Landroidx/compose/ui/unit/Dp;", "getFocusedBorderThickness-D9Ej5fM$annotations", "getFocusedBorderThickness-D9Ej5fM", "()F", "F", "FocusedIndicatorThickness", "getFocusedIndicatorThickness-D9Ej5fM", "MinHeight", "getMinHeight-D9Ej5fM", "MinWidth", "getMinWidth-D9Ej5fM", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM$annotations", "getUnfocusedBorderThickness-D9Ej5fM", "UnfocusedIndicatorThickness", "getUnfocusedIndicatorThickness-D9Ej5fM", "filledShape", "Landroidx/compose/ui/graphics/Shape;", "getFilledShape$annotations", "getFilledShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "outlinedShape", "getOutlinedShape$annotations", "getOutlinedShape", "shape", "getShape", "defaultTextFieldColors", "Landroidx/compose/material3/TextFieldColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultTextFieldColors", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", "ContainerBox", "", "enabled", "", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "colors", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;II)V", "DecorationBox", "value", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "singleLine", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", TtmlNode.RUBY_CONTAINER, "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "FilledContainerBox", "OutlinedBorderContainerBox", "focusedBorderThickness", "unfocusedBorderThickness", "OutlinedBorderContainerBox-nbWgWpA", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "OutlinedTextFieldDecorationBox", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "TextFieldDecorationBox", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", "focusedTextColor", "Landroidx/compose/ui/graphics/Color;", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "selectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "colors-0hiis_0", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIIII)Landroidx/compose/material3/TextFieldColors;", "contentPaddingWithLabel", TtmlNode.START, "end", "top", "bottom", "contentPaddingWithLabel-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "contentPaddingWithoutLabel", "contentPaddingWithoutLabel-a9UjIt4", "outlinedTextFieldColors", "textColor", "containerColor", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "placeholderColor", "outlinedTextFieldColors-eS1Emto", "(JJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIII)Landroidx/compose/material3/TextFieldColors;", "outlinedTextFieldColors-M37tBTI", "(JJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIIII)Landroidx/compose/material3/TextFieldColors;", "outlinedTextFieldPadding", "outlinedTextFieldPadding-a9UjIt4", "supportingTextPadding", "supportingTextPadding-a9UjIt4$material3_release", "textFieldColors", "textFieldColors-eS1Emto", "textFieldColors-M37tBTI", "textFieldWithLabelPadding", "textFieldWithLabelPadding-a9UjIt4", "textFieldWithoutLabelPadding", "textFieldWithoutLabelPadding-a9UjIt4", "indicatorLine", "Landroidx/compose/ui/Modifier;", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "indicatorLine-gv0btCI", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;FF)Landroidx/compose/ui/Modifier;", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldDefaults\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,2400:1\n135#2:2401\n154#3:2402\n154#3:2408\n154#3:2409\n154#3:2410\n154#3:2411\n74#4:2403\n74#4:2404\n74#4:2405\n74#4:2406\n74#4:2407\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldDefaults\n*L\n133#1:2401\n190#1:2402\n65#1:2408\n71#1:2409\n76#1:2410\n81#1:2411\n360#1:2403\n743#1:2404\n893#1:2405\n1129#1:2406\n1224#1:2407\n*E\n"})
/* loaded from: classes2.dex */
public final class TextFieldDefaults {
    public static final int $stable = 0;
    private static final float FocusedBorderThickness;
    private static final float FocusedIndicatorThickness;

    @NotNull
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();
    private static final float MinHeight = C2046Dp.m13666constructorimpl(56);
    private static final float MinWidth = C2046Dp.m13666constructorimpl(280);
    private static final float UnfocusedBorderThickness;
    private static final float UnfocusedIndicatorThickness;

    /* compiled from: TextFieldDefaults.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.TextFieldDefaults$ContainerBox$1 */
    public static final class C16511 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ TextFieldColors $colors;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ InteractionSource $interactionSource;
        public final /* synthetic */ boolean $isError;
        public final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16511(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, int i, int i2) {
            super(2);
            z = z;
            z = z2;
            interactionSource = interactionSource;
            textFieldColors = textFieldColors;
            shape = shape;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            TextFieldDefaults.this.ContainerBox(z, z, interactionSource, textFieldColors, shape, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: TextFieldDefaults.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.TextFieldDefaults$DecorationBox$2 */
    public static final class C16532 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ TextFieldColors $colors;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $container;
        public final /* synthetic */ PaddingValues $contentPadding;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $innerTextField;
        public final /* synthetic */ InteractionSource $interactionSource;
        public final /* synthetic */ boolean $isError;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
        public final /* synthetic */ Shape $shape;
        public final /* synthetic */ boolean $singleLine;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
        public final /* synthetic */ String $value;
        public final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16532(String str, Function2<? super Composer, ? super Integer, Unit> function2, boolean z, boolean z2, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, Function2<? super Composer, ? super Integer, Unit> function28, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2<? super Composer, ? super Integer, Unit> function29, int i, int i2, int i3) {
            super(2);
            str = str;
            function2 = function2;
            z = z;
            z = z2;
            visualTransformation = visualTransformation;
            interactionSource = interactionSource;
            z = z3;
            function2 = function22;
            function2 = function23;
            function2 = function24;
            function2 = function25;
            function2 = function26;
            function2 = function27;
            function2 = function28;
            shape = shape;
            textFieldColors = textFieldColors;
            paddingValues = paddingValues;
            function2 = function29;
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
            TextFieldDefaults.this.DecorationBox(str, function2, z, z, visualTransformation, interactionSource, z, function2, function2, function2, function2, function2, function2, function2, shape, textFieldColors, paddingValues, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* compiled from: TextFieldDefaults.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.TextFieldDefaults$FilledContainerBox$1 */
    public static final class C16541 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ TextFieldColors $colors;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ InteractionSource $interactionSource;
        public final /* synthetic */ boolean $isError;
        public final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16541(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, int i, int i2) {
            super(2);
            z = z;
            z = z2;
            interactionSource = interactionSource;
            textFieldColors = textFieldColors;
            shape = shape;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            TextFieldDefaults.this.FilledContainerBox(z, z, interactionSource, textFieldColors, shape, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: TextFieldDefaults.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$2 */
    public static final class C16562 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ TextFieldColors $colors;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $container;
        public final /* synthetic */ PaddingValues $contentPadding;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $innerTextField;
        public final /* synthetic */ InteractionSource $interactionSource;
        public final /* synthetic */ boolean $isError;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
        public final /* synthetic */ boolean $singleLine;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
        public final /* synthetic */ String $value;
        public final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16562(String str, Function2<? super Composer, ? super Integer, Unit> function2, boolean z, boolean z2, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, Function2<? super Composer, ? super Integer, Unit> function28, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2<? super Composer, ? super Integer, Unit> function29, int i, int i2, int i3) {
            super(2);
            str = str;
            function2 = function2;
            z = z;
            z = z2;
            visualTransformation = visualTransformation;
            interactionSource = interactionSource;
            z = z3;
            function2 = function22;
            function2 = function23;
            function2 = function24;
            function2 = function25;
            function2 = function26;
            function2 = function27;
            function2 = function28;
            textFieldColors = textFieldColors;
            paddingValues = paddingValues;
            function2 = function29;
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
            TextFieldDefaults.this.OutlinedTextFieldDecorationBox(str, function2, z, z, visualTransformation, interactionSource, z, function2, function2, function2, function2, function2, function2, function2, textFieldColors, paddingValues, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* compiled from: TextFieldDefaults.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$4 */
    public static final class C16584 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ TextFieldColors $colors;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $container;
        public final /* synthetic */ PaddingValues $contentPadding;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $innerTextField;
        public final /* synthetic */ InteractionSource $interactionSource;
        public final /* synthetic */ boolean $isError;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
        public final /* synthetic */ boolean $singleLine;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
        public final /* synthetic */ String $value;
        public final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16584(String str, Function2<? super Composer, ? super Integer, Unit> function2, boolean z, boolean z2, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2<? super Composer, ? super Integer, Unit> function27, int i, int i2, int i3) {
            super(2);
            str = str;
            function2 = function2;
            z = z;
            z = z2;
            visualTransformation = visualTransformation;
            interactionSource = interactionSource;
            z = z3;
            function2 = function22;
            function2 = function23;
            function2 = function24;
            function2 = function25;
            function2 = function26;
            textFieldColors = textFieldColors;
            paddingValues = paddingValues;
            function2 = function27;
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
            TextFieldDefaults.this.OutlinedTextFieldDecorationBox(str, function2, z, z, visualTransformation, interactionSource, z, function2, function2, function2, function2, function2, textFieldColors, paddingValues, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* compiled from: TextFieldDefaults.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$2 */
    public static final class C16602 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ TextFieldColors $colors;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $container;
        public final /* synthetic */ PaddingValues $contentPadding;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $innerTextField;
        public final /* synthetic */ InteractionSource $interactionSource;
        public final /* synthetic */ boolean $isError;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
        public final /* synthetic */ Shape $shape;
        public final /* synthetic */ boolean $singleLine;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
        public final /* synthetic */ String $value;
        public final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16602(String str, Function2<? super Composer, ? super Integer, Unit> function2, boolean z, boolean z2, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, Function2<? super Composer, ? super Integer, Unit> function28, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2<? super Composer, ? super Integer, Unit> function29, int i, int i2, int i3) {
            super(2);
            str = str;
            function2 = function2;
            z = z;
            z = z2;
            visualTransformation = visualTransformation;
            interactionSource = interactionSource;
            z = z3;
            function2 = function22;
            function2 = function23;
            function2 = function24;
            function2 = function25;
            function2 = function26;
            function2 = function27;
            function2 = function28;
            shape = shape;
            textFieldColors = textFieldColors;
            paddingValues = paddingValues;
            function2 = function29;
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
            TextFieldDefaults.this.TextFieldDecorationBox(str, function2, z, z, visualTransformation, interactionSource, z, function2, function2, function2, function2, function2, function2, function2, shape, textFieldColors, paddingValues, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* compiled from: TextFieldDefaults.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$4 */
    public static final class C16624 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ TextFieldColors $colors;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $container;
        public final /* synthetic */ PaddingValues $contentPadding;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $innerTextField;
        public final /* synthetic */ InteractionSource $interactionSource;
        public final /* synthetic */ boolean $isError;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
        public final /* synthetic */ Shape $shape;
        public final /* synthetic */ boolean $singleLine;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
        public final /* synthetic */ String $value;
        public final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16624(String str, Function2<? super Composer, ? super Integer, Unit> function2, boolean z, boolean z2, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2<? super Composer, ? super Integer, Unit> function27, int i, int i2, int i3) {
            super(2);
            str = str;
            function2 = function2;
            z = z;
            z = z2;
            visualTransformation = visualTransformation;
            interactionSource = interactionSource;
            z = z3;
            function2 = function22;
            function2 = function23;
            function2 = function24;
            function2 = function25;
            function2 = function26;
            shape = shape;
            textFieldColors = textFieldColors;
            paddingValues = paddingValues;
            function2 = function27;
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
            TextFieldDefaults.this.TextFieldDecorationBox(str, function2, z, z, visualTransformation, interactionSource, z, function2, function2, function2, function2, function2, shape, textFieldColors, paddingValues, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.shape`", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.shape", imports = {}))
    public static /* synthetic */ void getFilledShape$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Split into `TextFieldDefaults.FocusedIndicatorThickness` and `OutlinedTextFieldDefaults.FocusedBorderThickness`. Please update as appropriate.", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.FocusedIndicatorThickness", imports = {}))
    /* renamed from: getFocusedBorderThickness-D9Ej5fM$annotations */
    public static /* synthetic */ void m9986getFocusedBorderThicknessD9Ej5fM$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.shape`", replaceWith = @ReplaceWith(expression = "OutlinedTextFieldDefaults.shape", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    public static /* synthetic */ void getOutlinedShape$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Split into `TextFieldDefaults.UnfocusedIndicatorThickness` and `OutlinedTextFieldDefaults.UnfocusedBorderThickness`. Please update as appropriate.", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.UnfocusedIndicatorThickness", imports = {}))
    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM$annotations */
    public static /* synthetic */ void m9987getUnfocusedBorderThicknessD9Ej5fM$annotations() {
    }

    private TextFieldDefaults() {
    }

    @Composable
    @JvmName(name = "getShape")
    @NotNull
    public final Shape getShape(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1941327459);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1941327459, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-shape> (TextFieldDefaults.kt:58)");
        }
        Shape value = ShapesKt.getValue(FilledTextFieldTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    /* renamed from: getMinHeight-D9Ej5fM */
    public final float m9999getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM */
    public final float m10000getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    /* renamed from: getUnfocusedIndicatorThickness-D9Ej5fM */
    public final float m10002getUnfocusedIndicatorThicknessD9Ej5fM() {
        return UnfocusedIndicatorThickness;
    }

    /* renamed from: getFocusedIndicatorThickness-D9Ej5fM */
    public final float m9998getFocusedIndicatorThicknessD9Ej5fM() {
        return FocusedIndicatorThickness;
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x013c  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ContainerBox(boolean z, boolean z2, @NotNull InteractionSource interactionSource, @NotNull TextFieldColors textFieldColors, @Nullable Shape shape, @Nullable Composer composer, int i, int i2) {
        int i3;
        Shape shape2;
        Composer composerStartRestartGroup = composer.startRestartGroup(918564008);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(interactionSource) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(textFieldColors) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            if ((i2 & 16) == 0) {
                shape2 = shape;
                int i4 = composerStartRestartGroup.changed(shape2) ? 16384 : 8192;
                i3 |= i4;
            } else {
                shape2 = shape;
            }
            i3 |= i4;
        } else {
            shape2 = shape;
        }
        if ((i2 & 32) != 0) {
            i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
        } else if ((i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
            i3 |= composerStartRestartGroup.changed(this) ? 131072 : 65536;
        }
        if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                Shape shape3 = shape2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                shape2 = shape3;
                BoxKt.Box(m9988indicatorLinegv0btCI$default(this, BackgroundKt.m7770backgroundbw27NRU(Modifier.INSTANCE, textFieldColors.containerColor$material3_release(z, z2, interactionSource, composerStartRestartGroup, i3 & 8190).getValue().m11350unboximpl(), shape3), z, z2, interactionSource, textFieldColors, 0.0f, 0.0f, 48, null), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
            } else {
                if ((i2 & 16) != 0) {
                    shape2 = INSTANCE.getShape(composerStartRestartGroup, 6);
                    i3 &= -57345;
                }
                Shape shape32 = shape2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(918564008, i3, -1, "androidx.compose.material3.TextFieldDefaults.ContainerBox (TextFieldDefaults.kt:102)");
                }
                shape2 = shape32;
                BoxKt.Box(m9988indicatorLinegv0btCI$default(this, BackgroundKt.m7770backgroundbw27NRU(Modifier.INSTANCE, textFieldColors.containerColor$material3_release(z, z2, interactionSource, composerStartRestartGroup, i3 & 8190).getValue().m11350unboximpl(), shape32), z, z2, interactionSource, textFieldColors, 0.0f, 0.0f, 48, null), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        Shape shape4 = shape2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults.ContainerBox.1
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ int $$default;
                public final /* synthetic */ TextFieldColors $colors;
                public final /* synthetic */ boolean $enabled;
                public final /* synthetic */ InteractionSource $interactionSource;
                public final /* synthetic */ boolean $isError;
                public final /* synthetic */ Shape $shape;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C16511(boolean z3, boolean z22, InteractionSource interactionSource2, TextFieldColors textFieldColors2, Shape shape42, int i5, int i22) {
                    super(2);
                    z = z3;
                    z = z22;
                    interactionSource = interactionSource2;
                    textFieldColors = textFieldColors2;
                    shape = shape42;
                    i = i5;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i5) {
                    TextFieldDefaults.this.ContainerBox(z, z, interactionSource, textFieldColors, shape, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                }
            });
        }
    }

    /* renamed from: indicatorLine-gv0btCI$default */
    public static /* synthetic */ Modifier m9988indicatorLinegv0btCI$default(TextFieldDefaults textFieldDefaults, Modifier modifier, boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, float f, float f2, int i, Object obj) {
        return textFieldDefaults.m10003indicatorLinegv0btCI(modifier, z, z2, interactionSource, textFieldColors, (i & 16) != 0 ? FocusedIndicatorThickness : f, (i & 32) != 0 ? UnfocusedIndicatorThickness : f2);
    }

    /* renamed from: contentPaddingWithLabel-a9UjIt4$default */
    public static /* synthetic */ PaddingValues m9984contentPaddingWithLabela9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        return textFieldDefaults.m9995contentPaddingWithLabela9UjIt4(f, f2, f3, f4);
    }

    @NotNull
    /* renamed from: contentPaddingWithLabel-a9UjIt4 */
    public final PaddingValues m9995contentPaddingWithLabela9UjIt4(float f, float end, float top, float bottom) {
        return PaddingKt.m8119PaddingValuesa9UjIt4(f, top, end, bottom);
    }

    /* renamed from: contentPaddingWithoutLabel-a9UjIt4$default */
    public static /* synthetic */ PaddingValues m9985contentPaddingWithoutLabela9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m9996contentPaddingWithoutLabela9UjIt4(f, f2, f3, f4);
    }

    @NotNull
    /* renamed from: contentPaddingWithoutLabel-a9UjIt4 */
    public final PaddingValues m9996contentPaddingWithoutLabela9UjIt4(float f, float top, float end, float bottom) {
        return PaddingKt.m8119PaddingValuesa9UjIt4(f, top, end, bottom);
    }

    /* renamed from: supportingTextPadding-a9UjIt4$material3_release$default */
    public static /* synthetic */ PaddingValues m9990supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getSupportingTopPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = C2046Dp.m13666constructorimpl(0);
        }
        return textFieldDefaults.m10007supportingTextPaddinga9UjIt4$material3_release(f, f2, f3, f4);
    }

    @ExperimentalMaterial3Api
    @NotNull
    /* renamed from: supportingTextPadding-a9UjIt4$material3_release */
    public final PaddingValues m10007supportingTextPaddinga9UjIt4$material3_release(float f, float top, float end, float bottom) {
        return PaddingKt.m8119PaddingValuesa9UjIt4(f, top, end, bottom);
    }

    @Composable
    @NotNull
    public final TextFieldColors colors(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(831731228);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(831731228, i, -1, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:197)");
        }
        TextFieldColors defaultTextFieldColors = getDefaultTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i << 3) & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultTextFieldColors;
    }

    @Composable
    @NotNull
    /* renamed from: colors-0hiis_0 */
    public final TextFieldColors m9994colors0hiis_0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, @Nullable SelectionColors selectionColors, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, @Nullable Composer composer, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        composer.startReplaceableGroup(1513344955);
        long jM11376getUnspecified0d7_KjU = (i6 & 1) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j;
        long jM11376getUnspecified0d7_KjU2 = (i6 & 2) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j2;
        long jM11376getUnspecified0d7_KjU3 = (i6 & 4) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j3;
        long jM11376getUnspecified0d7_KjU4 = (i6 & 8) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j4;
        long jM11376getUnspecified0d7_KjU5 = (i6 & 16) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j5;
        long jM11376getUnspecified0d7_KjU6 = (i6 & 32) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j6;
        long jM11376getUnspecified0d7_KjU7 = (i6 & 64) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j7;
        long jM11376getUnspecified0d7_KjU8 = (i6 & 128) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j8;
        long jM11376getUnspecified0d7_KjU9 = (i6 & 256) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j9;
        long jM11376getUnspecified0d7_KjU10 = (i6 & 512) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j10;
        SelectionColors selectionColors2 = (i6 & 1024) != 0 ? null : selectionColors;
        long jM11376getUnspecified0d7_KjU11 = (i6 & 2048) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j11;
        long jM11376getUnspecified0d7_KjU12 = (i6 & 4096) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j12;
        long jM11376getUnspecified0d7_KjU13 = (i6 & 8192) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j13;
        long jM11376getUnspecified0d7_KjU14 = (i6 & 16384) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j14;
        long jM11376getUnspecified0d7_KjU15 = (32768 & i6) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j15;
        long jM11376getUnspecified0d7_KjU16 = (65536 & i6) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j16;
        long jM11376getUnspecified0d7_KjU17 = (131072 & i6) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j17;
        long jM11376getUnspecified0d7_KjU18 = (262144 & i6) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j18;
        long jM11376getUnspecified0d7_KjU19 = (524288 & i6) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j19;
        long jM11376getUnspecified0d7_KjU20 = (1048576 & i6) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j20;
        long jM11376getUnspecified0d7_KjU21 = (2097152 & i6) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j21;
        long jM11376getUnspecified0d7_KjU22 = (4194304 & i6) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j22;
        long jM11376getUnspecified0d7_KjU23 = (8388608 & i6) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j23;
        long jM11376getUnspecified0d7_KjU24 = (16777216 & i6) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j24;
        long jM11376getUnspecified0d7_KjU25 = (33554432 & i6) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j25;
        long jM11376getUnspecified0d7_KjU26 = (67108864 & i6) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j26;
        long jM11376getUnspecified0d7_KjU27 = (134217728 & i6) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j27;
        long jM11376getUnspecified0d7_KjU28 = (268435456 & i6) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j28;
        long jM11376getUnspecified0d7_KjU29 = (536870912 & i6) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j29;
        long jM11376getUnspecified0d7_KjU30 = (i6 & 1073741824) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j30;
        long jM11376getUnspecified0d7_KjU31 = (i7 & 1) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j31;
        long jM11376getUnspecified0d7_KjU32 = (i7 & 2) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j32;
        long jM11376getUnspecified0d7_KjU33 = (i7 & 4) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j33;
        long jM11376getUnspecified0d7_KjU34 = (i7 & 8) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j34;
        long jM11376getUnspecified0d7_KjU35 = (i7 & 16) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j35;
        long jM11376getUnspecified0d7_KjU36 = (i7 & 32) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j36;
        long jM11376getUnspecified0d7_KjU37 = (i7 & 64) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j37;
        long jM11376getUnspecified0d7_KjU38 = (i7 & 128) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j38;
        long jM11376getUnspecified0d7_KjU39 = (i7 & 256) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j39;
        long jM11376getUnspecified0d7_KjU40 = (i7 & 512) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j40;
        long jM11376getUnspecified0d7_KjU41 = (i7 & 1024) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j41;
        long jM11376getUnspecified0d7_KjU42 = (i7 & 2048) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j42;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1513344955, i, i2, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:298)");
        }
        TextFieldColors textFieldColorsM9941copyejIjP34 = getDefaultTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i5 >> 6) & 112).m9941copyejIjP34(jM11376getUnspecified0d7_KjU, jM11376getUnspecified0d7_KjU2, jM11376getUnspecified0d7_KjU3, jM11376getUnspecified0d7_KjU4, jM11376getUnspecified0d7_KjU5, jM11376getUnspecified0d7_KjU6, jM11376getUnspecified0d7_KjU7, jM11376getUnspecified0d7_KjU8, jM11376getUnspecified0d7_KjU9, jM11376getUnspecified0d7_KjU10, selectionColors2, jM11376getUnspecified0d7_KjU11, jM11376getUnspecified0d7_KjU12, jM11376getUnspecified0d7_KjU13, jM11376getUnspecified0d7_KjU14, jM11376getUnspecified0d7_KjU15, jM11376getUnspecified0d7_KjU16, jM11376getUnspecified0d7_KjU17, jM11376getUnspecified0d7_KjU18, jM11376getUnspecified0d7_KjU19, jM11376getUnspecified0d7_KjU20, jM11376getUnspecified0d7_KjU21, jM11376getUnspecified0d7_KjU22, jM11376getUnspecified0d7_KjU23, jM11376getUnspecified0d7_KjU24, jM11376getUnspecified0d7_KjU25, jM11376getUnspecified0d7_KjU26, jM11376getUnspecified0d7_KjU27, jM11376getUnspecified0d7_KjU28, jM11376getUnspecified0d7_KjU29, jM11376getUnspecified0d7_KjU30, jM11376getUnspecified0d7_KjU31, jM11376getUnspecified0d7_KjU32, jM11376getUnspecified0d7_KjU33, jM11376getUnspecified0d7_KjU34, jM11376getUnspecified0d7_KjU35, jM11376getUnspecified0d7_KjU36, jM11376getUnspecified0d7_KjU37, jM11376getUnspecified0d7_KjU38, jM11376getUnspecified0d7_KjU39, jM11376getUnspecified0d7_KjU40, jM11376getUnspecified0d7_KjU41, jM11376getUnspecified0d7_KjU42);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColorsM9941copyejIjP34;
    }

    @Composable
    @JvmName(name = "getDefaultTextFieldColors")
    @NotNull
    public final TextFieldColors getDefaultTextFieldColors(@NotNull ColorScheme colorScheme, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(1341970309);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1341970309, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-defaultTextFieldColors> (TextFieldDefaults.kt:346)");
        }
        TextFieldColors defaultTextFieldColorsCached = colorScheme.getDefaultTextFieldColorsCached();
        if (defaultTextFieldColorsCached == null) {
            FilledTextFieldTokens filledTextFieldTokens = FilledTextFieldTokens.INSTANCE;
            defaultTextFieldColorsCached = new TextFieldColors(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getFocusInputColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputColor()), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledInputColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorInputColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getCaretColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorFocusCaretColor()), (SelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getFocusActiveIndicatorColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getActiveIndicatorColor()), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledActiveIndicatorColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorActiveIndicatorColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getFocusLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getLeadingIconColor()), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledLeadingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getFocusTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getTrailingIconColor()), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledTrailingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getFocusLabelColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getLabelColor()), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledLabelColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorLabelColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPlaceholderColor()), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledInputColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getFocusSupportingColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getSupportingColor()), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledSupportingColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorSupportingColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPrefixColor()), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPrefixColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputSuffixColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputSuffixColor()), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputSuffixColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputSuffixColor()), null);
            colorScheme.setDefaultTextFieldColorsCached$material3_release(defaultTextFieldColorsCached);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultTextFieldColorsCached;
    }

    /* compiled from: TextFieldDefaults.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.TextFieldDefaults$DecorationBox$1 */
    public static final class C16521 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ TextFieldColors $colors;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ InteractionSource $interactionSource;
        public final /* synthetic */ boolean $isError;
        public final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16521(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape) {
            super(2);
            z = z;
            z = z2;
            interactionSource = interactionSource;
            textFieldColors = textFieldColors;
            shape = shape;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-435523791, i, -1, "androidx.compose.material3.TextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:496)");
            }
            TextFieldDefaults.INSTANCE.ContainerBox(z, z, interactionSource, textFieldColors, shape, composer, ProfileVerifier.CompilationStatus.f342xf2722a21, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:305:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:557:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void DecorationBox(@NotNull String str, @NotNull Function2<? super Composer, ? super Integer, Unit> function2, boolean z, boolean z2, @NotNull VisualTransformation visualTransformation, @NotNull InteractionSource interactionSource, boolean z3, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function2<? super Composer, ? super Integer, Unit> function23, @Nullable Function2<? super Composer, ? super Integer, Unit> function24, @Nullable Function2<? super Composer, ? super Integer, Unit> function25, @Nullable Function2<? super Composer, ? super Integer, Unit> function26, @Nullable Function2<? super Composer, ? super Integer, Unit> function27, @Nullable Function2<? super Composer, ? super Integer, Unit> function28, @Nullable Shape shape, @Nullable TextFieldColors textFieldColors, @Nullable PaddingValues paddingValues, @Nullable Function2<? super Composer, ? super Integer, Unit> function29, @Nullable Composer composer, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z4;
        Function2<? super Composer, ? super Integer, Unit> function210;
        Function2<? super Composer, ? super Integer, Unit> function211;
        Function2<? super Composer, ? super Integer, Unit> function212;
        Function2<? super Composer, ? super Integer, Unit> function213;
        Function2<? super Composer, ? super Integer, Unit> function214;
        Function2<? super Composer, ? super Integer, Unit> function215;
        Shape shape2;
        TextFieldColors textFieldColorsColors;
        PaddingValues paddingValuesM9984contentPaddingWithLabela9UjIt4$default;
        Function2<? super Composer, ? super Integer, Unit> function2ComposableLambda;
        Shape shape3;
        PaddingValues paddingValues2;
        int i15;
        Function2<? super Composer, ? super Integer, Unit> function216;
        Shape shape4;
        Function2<? super Composer, ? super Integer, Unit> function217;
        Function2<? super Composer, ? super Integer, Unit> function218;
        Function2<? super Composer, ? super Integer, Unit> function219;
        Function2<? super Composer, ? super Integer, Unit> function220;
        boolean z5;
        TextFieldColors textFieldColors2;
        Function2<? super Composer, ? super Integer, Unit> function221;
        Function2<? super Composer, ? super Integer, Unit> function222;
        Function2<? super Composer, ? super Integer, Unit> function223;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(289640444);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else {
                if ((i & 384) == 0) {
                    i4 |= composerStartRestartGroup.changed(z) ? 256 : 128;
                }
                if ((i3 & 8) != 0) {
                    i4 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                    }
                    int i16 = 8192;
                    if ((i3 & 16) == 0) {
                        i4 |= CpioConstants.C_ISBLK;
                    } else {
                        if ((i & CpioConstants.C_ISBLK) == 0) {
                            i4 |= composerStartRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                        }
                        if ((i3 & 32) != 0) {
                            i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                        } else if ((i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                            i4 |= composerStartRestartGroup.changed(interactionSource) ? 131072 : 65536;
                        }
                        i5 = i3 & 64;
                        if (i5 != 0) {
                            i4 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i4 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
                        }
                        i6 = i3 & 128;
                        if (i6 != 0) {
                            i4 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                        }
                        i7 = i3 & 256;
                        if (i7 != 0) {
                            i4 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function23) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                        }
                        i8 = i3 & 512;
                        if (i8 != 0) {
                            i4 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                        }
                        i9 = i3 & 1024;
                        if (i9 != 0) {
                            i10 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i10 = i2 | (composerStartRestartGroup.changedInstance(function25) ? 4 : 2);
                        } else {
                            i10 = i2;
                        }
                        i11 = i3 & 2048;
                        if (i11 != 0) {
                            i10 |= 48;
                        } else if ((i2 & 48) == 0) {
                            i10 |= composerStartRestartGroup.changedInstance(function26) ? 32 : 16;
                        }
                        int i17 = i10;
                        i12 = i3 & 4096;
                        if (i12 != 0) {
                            i17 |= 384;
                        } else {
                            if ((i2 & 384) == 0) {
                                i17 |= composerStartRestartGroup.changedInstance(function27) ? 256 : 128;
                            }
                            i13 = i3 & 8192;
                            if (i13 != 0) {
                                if ((i2 & 3072) == 0) {
                                    i17 |= composerStartRestartGroup.changedInstance(function28) ? 2048 : 1024;
                                }
                                if ((i2 & CpioConstants.C_ISBLK) == 0) {
                                    if ((i3 & 16384) == 0 && composerStartRestartGroup.changed(shape)) {
                                        i16 = 16384;
                                    }
                                    i17 |= i16;
                                }
                                if ((i2 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                                    i17 |= ((i3 & 32768) == 0 && composerStartRestartGroup.changed(textFieldColors)) ? 131072 : 65536;
                                }
                                if ((i2 & 1572864) == 0) {
                                    i17 |= ((i3 & 65536) == 0 && composerStartRestartGroup.changed(paddingValues)) ? 1048576 : 524288;
                                }
                                i14 = i3 & 131072;
                                if (i14 != 0) {
                                    i17 |= 12582912;
                                } else if ((i2 & 12582912) == 0) {
                                    i17 |= composerStartRestartGroup.changedInstance(function29) ? 8388608 : 4194304;
                                }
                                if ((i3 & 262144) != 0) {
                                    i17 |= 100663296;
                                } else if ((i2 & 100663296) == 0) {
                                    i17 |= composerStartRestartGroup.changed(this) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                                }
                                if ((i4 & 306783379) != 306783378 || (38347923 & i17) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        z4 = i5 == 0 ? false : z3;
                                        function210 = i6 == 0 ? null : function22;
                                        function211 = i7 == 0 ? null : function23;
                                        function212 = i8 == 0 ? null : function24;
                                        function213 = i9 == 0 ? null : function25;
                                        function214 = i11 == 0 ? null : function26;
                                        function215 = i12 == 0 ? null : function27;
                                        Function2<? super Composer, ? super Integer, Unit> function224 = i13 == 0 ? function28 : null;
                                        if ((i3 & 16384) == 0) {
                                            shape2 = INSTANCE.getShape(composerStartRestartGroup, 6);
                                            i17 &= -57345;
                                        } else {
                                            shape2 = shape;
                                        }
                                        if ((i3 & 32768) == 0) {
                                            textFieldColorsColors = colors(composerStartRestartGroup, (i17 >> 24) & 14);
                                            i17 &= -458753;
                                        } else {
                                            textFieldColorsColors = textFieldColors;
                                        }
                                        if ((i3 & 65536) == 0) {
                                            if (function210 == null) {
                                                paddingValuesM9984contentPaddingWithLabela9UjIt4$default = m9985contentPaddingWithoutLabela9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                            } else {
                                                paddingValuesM9984contentPaddingWithLabela9UjIt4$default = m9984contentPaddingWithLabela9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                            }
                                            i17 &= -3670017;
                                        } else {
                                            paddingValuesM9984contentPaddingWithLabela9UjIt4$default = paddingValues;
                                        }
                                        if (i14 == 0) {
                                            function213 = function213;
                                            function214 = function214;
                                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -435523791, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults.DecorationBox.1
                                                public final /* synthetic */ TextFieldColors $colors;
                                                public final /* synthetic */ boolean $enabled;
                                                public final /* synthetic */ InteractionSource $interactionSource;
                                                public final /* synthetic */ boolean $isError;
                                                public final /* synthetic */ Shape $shape;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public C16521(boolean z6, boolean z42, InteractionSource interactionSource2, TextFieldColors textFieldColorsColors2, Shape shape22) {
                                                    super(2);
                                                    z = z6;
                                                    z = z42;
                                                    interactionSource = interactionSource2;
                                                    textFieldColors = textFieldColorsColors2;
                                                    shape = shape22;
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                    invoke(composer2, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                @Composable
                                                public final void invoke(@Nullable Composer composer2, int i18) {
                                                    if ((i18 & 3) == 2 && composer2.getSkipping()) {
                                                        composer2.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-435523791, i18, -1, "androidx.compose.material3.TextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:496)");
                                                    }
                                                    TextFieldDefaults.INSTANCE.ContainerBox(z, z, interactionSource, textFieldColors, shape, composer2, ProfileVerifier.CompilationStatus.f342xf2722a21, 0);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            });
                                            shape3 = shape22;
                                            function212 = function212;
                                        } else {
                                            function2ComposableLambda = function29;
                                            shape3 = shape22;
                                        }
                                        paddingValues2 = paddingValuesM9984contentPaddingWithLabela9UjIt4$default;
                                        i15 = i17;
                                        function216 = function224;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if ((i3 & 16384) != 0) {
                                            i17 &= -57345;
                                        }
                                        if ((32768 & i3) != 0) {
                                            i17 &= -458753;
                                        }
                                        if ((i3 & 65536) != 0) {
                                            i17 &= -3670017;
                                        }
                                        z42 = z3;
                                        function210 = function22;
                                        function211 = function23;
                                        function212 = function24;
                                        function213 = function25;
                                        function214 = function26;
                                        function215 = function27;
                                        shape3 = shape;
                                        textFieldColorsColors2 = textFieldColors;
                                        paddingValues2 = paddingValues;
                                        function2ComposableLambda = function29;
                                        i15 = i17;
                                        function216 = function28;
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(289640444, i4, i15, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:498)");
                                    }
                                    int i18 = i4 << 3;
                                    int i19 = i4 >> 3;
                                    int i20 = i4 >> 9;
                                    int i21 = i15 << 21;
                                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, str, function2, visualTransformation, function210, function211, function212, function213, function214, function215, function216, z2, z6, z42, interactionSource2, paddingValues2, textFieldColorsColors2, function2ComposableLambda, composerStartRestartGroup, (i18 & 896) | (i18 & 112) | 6 | (i19 & 7168) | (i20 & 57344) | (i20 & 458752) | (i20 & 3670016) | (i21 & 29360128) | (i21 & 234881024) | (i21 & 1879048192), (i4 & 896) | ((i15 >> 9) & 14) | ((i4 >> 6) & 112) | (i20 & 7168) | (57344 & i19) | ((i15 >> 3) & 458752) | (3670016 & (i15 << 3)) | (i15 & 29360128), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    shape4 = shape3;
                                    function217 = function213;
                                    function218 = function214;
                                    function219 = function216;
                                    function220 = function215;
                                    z5 = z42;
                                    textFieldColors2 = textFieldColorsColors2;
                                    function221 = function2ComposableLambda;
                                    function222 = function212;
                                    function223 = function210;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    z5 = z3;
                                    function223 = function22;
                                    function211 = function23;
                                    function222 = function24;
                                    function217 = function25;
                                    function218 = function26;
                                    function220 = function27;
                                    function219 = function28;
                                    shape4 = shape;
                                    textFieldColors2 = textFieldColors;
                                    paddingValues2 = paddingValues;
                                    function221 = function29;
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults.DecorationBox.2
                                        public final /* synthetic */ int $$changed;
                                        public final /* synthetic */ int $$changed1;
                                        public final /* synthetic */ int $$default;
                                        public final /* synthetic */ TextFieldColors $colors;
                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $container;
                                        public final /* synthetic */ PaddingValues $contentPadding;
                                        public final /* synthetic */ boolean $enabled;
                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $innerTextField;
                                        public final /* synthetic */ InteractionSource $interactionSource;
                                        public final /* synthetic */ boolean $isError;
                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
                                        public final /* synthetic */ Shape $shape;
                                        public final /* synthetic */ boolean $singleLine;
                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
                                        public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                                        public final /* synthetic */ String $value;
                                        public final /* synthetic */ VisualTransformation $visualTransformation;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        public C16532(String str2, Function2<? super Composer, ? super Integer, Unit> function225, boolean z6, boolean z22, VisualTransformation visualTransformation2, InteractionSource interactionSource2, boolean z52, Function2<? super Composer, ? super Integer, Unit> function2232, Function2<? super Composer, ? super Integer, Unit> function2112, Function2<? super Composer, ? super Integer, Unit> function2222, Function2<? super Composer, ? super Integer, Unit> function2172, Function2<? super Composer, ? super Integer, Unit> function2182, Function2<? super Composer, ? super Integer, Unit> function2202, Function2<? super Composer, ? super Integer, Unit> function2192, Shape shape42, TextFieldColors textFieldColors22, PaddingValues paddingValues22, Function2<? super Composer, ? super Integer, Unit> function2212, int i22, int i23, int i32) {
                                            super(2);
                                            str = str2;
                                            function2 = function225;
                                            z = z6;
                                            z = z22;
                                            visualTransformation = visualTransformation2;
                                            interactionSource = interactionSource2;
                                            z = z52;
                                            function2 = function2232;
                                            function2 = function2112;
                                            function2 = function2222;
                                            function2 = function2172;
                                            function2 = function2182;
                                            function2 = function2202;
                                            function2 = function2192;
                                            shape = shape42;
                                            textFieldColors = textFieldColors22;
                                            paddingValues = paddingValues22;
                                            function2 = function2212;
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
                                            TextFieldDefaults.this.DecorationBox(str, function2, z, z, visualTransformation, interactionSource, z, function2, function2, function2, function2, function2, function2, function2, shape, textFieldColors, paddingValues, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i17 |= 3072;
                            if ((i23 & CpioConstants.C_ISBLK) == 0) {
                            }
                            if ((i23 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                            }
                            if ((i23 & 1572864) == 0) {
                            }
                            i14 = i32 & 131072;
                            if (i14 != 0) {
                            }
                            if ((i32 & 262144) != 0) {
                            }
                            if ((i4 & 306783379) != 306783378) {
                                composerStartRestartGroup.startDefaults();
                                if ((i22 & 1) != 0) {
                                    if (i5 == 0) {
                                    }
                                    if (i6 == 0) {
                                    }
                                    if (i7 == 0) {
                                    }
                                    if (i8 == 0) {
                                    }
                                    if (i9 == 0) {
                                    }
                                    if (i11 == 0) {
                                    }
                                    if (i12 == 0) {
                                    }
                                    if (i13 == 0) {
                                    }
                                    if ((i32 & 16384) == 0) {
                                    }
                                    if ((i32 & 32768) == 0) {
                                    }
                                    if ((i32 & 65536) == 0) {
                                    }
                                    if (i14 == 0) {
                                    }
                                    paddingValues22 = paddingValuesM9984contentPaddingWithLabela9UjIt4$default;
                                    i15 = i17;
                                    function216 = function224;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    int i182 = i4 << 3;
                                    int i192 = i4 >> 3;
                                    int i202 = i4 >> 9;
                                    int i212 = i15 << 21;
                                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, str2, function225, visualTransformation2, function210, function2112, function212, function213, function214, function215, function216, z22, z6, z42, interactionSource2, paddingValues22, textFieldColorsColors2, function2ComposableLambda, composerStartRestartGroup, (i182 & 896) | (i182 & 112) | 6 | (i192 & 7168) | (i202 & 57344) | (i202 & 458752) | (i202 & 3670016) | (i212 & 29360128) | (i212 & 234881024) | (i212 & 1879048192), (i4 & 896) | ((i15 >> 9) & 14) | ((i4 >> 6) & 112) | (i202 & 7168) | (57344 & i192) | ((i15 >> 3) & 458752) | (3670016 & (i15 << 3)) | (i15 & 29360128), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    shape42 = shape3;
                                    function2172 = function213;
                                    function2182 = function214;
                                    function2192 = function216;
                                    function2202 = function215;
                                    z52 = z42;
                                    textFieldColors22 = textFieldColorsColors2;
                                    function2212 = function2ComposableLambda;
                                    function2222 = function212;
                                    function2232 = function210;
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i13 = i32 & 8192;
                        if (i13 != 0) {
                        }
                        if ((i23 & CpioConstants.C_ISBLK) == 0) {
                        }
                        if ((i23 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                        }
                        if ((i23 & 1572864) == 0) {
                        }
                        i14 = i32 & 131072;
                        if (i14 != 0) {
                        }
                        if ((i32 & 262144) != 0) {
                        }
                        if ((i4 & 306783379) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    if ((i32 & 32) != 0) {
                    }
                    i5 = i32 & 64;
                    if (i5 != 0) {
                    }
                    i6 = i32 & 128;
                    if (i6 != 0) {
                    }
                    i7 = i32 & 256;
                    if (i7 != 0) {
                    }
                    i8 = i32 & 512;
                    if (i8 != 0) {
                    }
                    i9 = i32 & 1024;
                    if (i9 != 0) {
                    }
                    i11 = i32 & 2048;
                    if (i11 != 0) {
                    }
                    int i172 = i10;
                    i12 = i32 & 4096;
                    if (i12 != 0) {
                    }
                    i13 = i32 & 8192;
                    if (i13 != 0) {
                    }
                    if ((i23 & CpioConstants.C_ISBLK) == 0) {
                    }
                    if ((i23 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                    }
                    if ((i23 & 1572864) == 0) {
                    }
                    i14 = i32 & 131072;
                    if (i14 != 0) {
                    }
                    if ((i32 & 262144) != 0) {
                    }
                    if ((i4 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                int i162 = 8192;
                if ((i32 & 16) == 0) {
                }
                if ((i32 & 32) != 0) {
                }
                i5 = i32 & 64;
                if (i5 != 0) {
                }
                i6 = i32 & 128;
                if (i6 != 0) {
                }
                i7 = i32 & 256;
                if (i7 != 0) {
                }
                i8 = i32 & 512;
                if (i8 != 0) {
                }
                i9 = i32 & 1024;
                if (i9 != 0) {
                }
                i11 = i32 & 2048;
                if (i11 != 0) {
                }
                int i1722 = i10;
                i12 = i32 & 4096;
                if (i12 != 0) {
                }
                i13 = i32 & 8192;
                if (i13 != 0) {
                }
                if ((i23 & CpioConstants.C_ISBLK) == 0) {
                }
                if ((i23 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                }
                if ((i23 & 1572864) == 0) {
                }
                i14 = i32 & 131072;
                if (i14 != 0) {
                }
                if ((i32 & 262144) != 0) {
                }
                if ((i4 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i32 & 8) != 0) {
            }
            int i1622 = 8192;
            if ((i32 & 16) == 0) {
            }
            if ((i32 & 32) != 0) {
            }
            i5 = i32 & 64;
            if (i5 != 0) {
            }
            i6 = i32 & 128;
            if (i6 != 0) {
            }
            i7 = i32 & 256;
            if (i7 != 0) {
            }
            i8 = i32 & 512;
            if (i8 != 0) {
            }
            i9 = i32 & 1024;
            if (i9 != 0) {
            }
            i11 = i32 & 2048;
            if (i11 != 0) {
            }
            int i17222 = i10;
            i12 = i32 & 4096;
            if (i12 != 0) {
            }
            i13 = i32 & 8192;
            if (i13 != 0) {
            }
            if ((i23 & CpioConstants.C_ISBLK) == 0) {
            }
            if ((i23 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
            }
            if ((i23 & 1572864) == 0) {
            }
            i14 = i32 & 131072;
            if (i14 != 0) {
            }
            if ((i32 & 262144) != 0) {
            }
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i32 & 4) == 0) {
        }
        if ((i32 & 8) != 0) {
        }
        int i16222 = 8192;
        if ((i32 & 16) == 0) {
        }
        if ((i32 & 32) != 0) {
        }
        i5 = i32 & 64;
        if (i5 != 0) {
        }
        i6 = i32 & 128;
        if (i6 != 0) {
        }
        i7 = i32 & 256;
        if (i7 != 0) {
        }
        i8 = i32 & 512;
        if (i8 != 0) {
        }
        i9 = i32 & 1024;
        if (i9 != 0) {
        }
        i11 = i32 & 2048;
        if (i11 != 0) {
        }
        int i172222 = i10;
        i12 = i32 & 4096;
        if (i12 != 0) {
        }
        i13 = i32 & 8192;
        if (i13 != 0) {
        }
        if ((i23 & CpioConstants.C_ISBLK) == 0) {
        }
        if ((i23 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
        }
        if ((i23 & 1572864) == 0) {
        }
        i14 = i32 & 131072;
        if (i14 != 0) {
        }
        if ((i32 & 262144) != 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @Composable
    @JvmName(name = "getOutlinedShape")
    @NotNull
    public final Shape getOutlinedShape(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-584749279);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-584749279, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-outlinedShape> (TextFieldDefaults.kt:527)");
        }
        Shape shape = OutlinedTextFieldDefaults.INSTANCE.getShape(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    @JvmName(name = "getFilledShape")
    @NotNull
    public final Shape getFilledShape(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(611926497);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(611926497, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-filledShape> (TextFieldDefaults.kt:534)");
        }
        Shape shape = getShape(composer, i & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM */
    public final float m10001getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    /* renamed from: getFocusedBorderThickness-D9Ej5fM */
    public final float m9997getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @ExperimentalMaterial3Api
    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.ContainerBox`", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.ContainerBox(\n        enabled = enabled,\n        isError = isError,\n        interactionSource = interactionSource,\n        colors = colors,\n        shape = shape,\n    )", imports = {}))
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void FilledContainerBox(boolean z, boolean z2, @NotNull InteractionSource interactionSource, @NotNull TextFieldColors textFieldColors, @Nullable Shape shape, @Nullable Composer composer, int i, int i2) {
        int i3;
        Shape shape2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1358797526);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    i3 |= composerStartRestartGroup.changed(interactionSource) ? 256 : 128;
                }
                if ((i2 & 8) == 0) {
                    if ((i & 3072) == 0) {
                        i3 |= composerStartRestartGroup.changed(textFieldColors) ? 2048 : 1024;
                    }
                    if ((i & CpioConstants.C_ISBLK) != 0) {
                        if ((i2 & 16) == 0) {
                            shape2 = shape;
                            int i4 = composerStartRestartGroup.changed(shape2) ? 16384 : 8192;
                            i3 |= i4;
                        } else {
                            shape2 = shape;
                        }
                        i3 |= i4;
                    } else {
                        shape2 = shape;
                    }
                    if ((i2 & 32) == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    } else if ((i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                        i3 |= composerStartRestartGroup.changed(this) ? 131072 : 65536;
                    }
                    if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if ((i2 & 16) != 0) {
                                shape2 = INSTANCE.getShape(composerStartRestartGroup, 6);
                                i3 &= -57345;
                            }
                            Shape shape3 = shape2;
                            int i5 = i3;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1358797526, i5, -1, "androidx.compose.material3.TextFieldDefaults.FilledContainerBox (TextFieldDefaults.kt:571)");
                            }
                            ContainerBox(z, z2, interactionSource, textFieldColors, shape3, composerStartRestartGroup, 524286 & i5, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            shape2 = shape3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            Shape shape32 = shape2;
                            int i52 = i3;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            ContainerBox(z, z2, interactionSource, textFieldColors, shape32, composerStartRestartGroup, 524286 & i52, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            shape2 = shape32;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults.FilledContainerBox.1
                            public final /* synthetic */ int $$changed;
                            public final /* synthetic */ int $$default;
                            public final /* synthetic */ TextFieldColors $colors;
                            public final /* synthetic */ boolean $enabled;
                            public final /* synthetic */ InteractionSource $interactionSource;
                            public final /* synthetic */ boolean $isError;
                            public final /* synthetic */ Shape $shape;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C16541(boolean z3, boolean z22, InteractionSource interactionSource2, TextFieldColors textFieldColors2, Shape shape22, int i6, int i22) {
                                super(2);
                                z = z3;
                                z = z22;
                                interactionSource = interactionSource2;
                                textFieldColors = textFieldColors2;
                                shape = shape22;
                                i = i6;
                                i = i22;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i6) {
                                TextFieldDefaults.this.FilledContainerBox(z, z, interactionSource, textFieldColors, shape, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                if ((i6 & CpioConstants.C_ISBLK) != 0) {
                }
                if ((i22 & 32) == 0) {
                }
                if ((74899 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i6 & 1) != 0) {
                        if ((i22 & 16) != 0) {
                        }
                        Shape shape322 = shape22;
                        int i522 = i3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ContainerBox(z3, z22, interactionSource2, textFieldColors2, shape322, composerStartRestartGroup, 524286 & i522, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        shape22 = shape322;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            if ((i22 & 8) == 0) {
            }
            if ((i6 & CpioConstants.C_ISBLK) != 0) {
            }
            if ((i22 & 32) == 0) {
            }
            if ((74899 & i3) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i22 & 4) == 0) {
        }
        if ((i22 & 8) == 0) {
        }
        if ((i6 & CpioConstants.C_ISBLK) != 0) {
        }
        if ((i22 & 32) == 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:229:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @ExperimentalMaterial3Api
    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.ContainerBox`", replaceWith = @ReplaceWith(expression = "OutlinedTextFieldDefaults.ContainerBox(\n        enabled = enabled,\n        isError = isError,\n        interactionSource = interactionSource,\n        colors = colors,\n        shape = shape,\n        focusedBorderThickness = focusedBorderThickness,\n        unfocusedBorderThickness = unfocusedBorderThickness,\n    )", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    @Composable
    /* renamed from: OutlinedBorderContainerBox-nbWgWpA */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m9993OutlinedBorderContainerBoxnbWgWpA(final boolean z, final boolean z2, @NotNull final InteractionSource interactionSource, @NotNull final TextFieldColors textFieldColors, @Nullable Shape shape, float f, float f2, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Shape value;
        int i4;
        float f3;
        int i5;
        float f4;
        float fM9628getFocusedBorderThicknessD9Ej5fM;
        int i6;
        float fM9631getUnfocusedBorderThicknessD9Ej5fM;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1998946250);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    i3 |= composerStartRestartGroup.changed(interactionSource) ? 256 : 128;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        i3 |= composerStartRestartGroup.changed(textFieldColors) ? 2048 : 1024;
                    }
                    if ((i & CpioConstants.C_ISBLK) != 0) {
                        if ((i2 & 16) == 0) {
                            value = shape;
                            int i7 = composerStartRestartGroup.changed(value) ? 16384 : 8192;
                            i3 |= i7;
                        } else {
                            value = shape;
                        }
                        i3 |= i7;
                    } else {
                        value = shape;
                    }
                    i4 = i2 & 32;
                    if (i4 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    } else {
                        if ((196608 & i) == 0) {
                            f3 = f;
                            i3 |= composerStartRestartGroup.changed(f3) ? 131072 : 65536;
                        }
                        i5 = i2 & 64;
                        if (i5 == 0) {
                            if ((1572864 & i) == 0) {
                                f4 = f2;
                                i3 |= composerStartRestartGroup.changed(f4) ? 1048576 : 524288;
                            }
                            if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    if ((i2 & 16) != 0) {
                                        value = ShapesKt.getValue(OutlinedTextFieldTokens.INSTANCE.getContainerShape(), composerStartRestartGroup, 6);
                                        i3 &= -57345;
                                    }
                                    fM9628getFocusedBorderThicknessD9Ej5fM = i4 == 0 ? OutlinedTextFieldDefaults.INSTANCE.m9628getFocusedBorderThicknessD9Ej5fM() : f3;
                                    if (i5 == 0) {
                                        i6 = i3;
                                        fM9631getUnfocusedBorderThicknessD9Ej5fM = OutlinedTextFieldDefaults.INSTANCE.m9631getUnfocusedBorderThicknessD9Ej5fM();
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1998946250, i6, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedBorderContainerBox (TextFieldDefaults.kt:603)");
                                    }
                                    OutlinedTextFieldDefaults.INSTANCE.m9625ContainerBoxnbWgWpA(z, z2, interactionSource, textFieldColors, value, fM9628getFocusedBorderThicknessD9Ej5fM, fM9631getUnfocusedBorderThicknessD9Ej5fM, composerStartRestartGroup, (i6 & 14) | 12582912 | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (458752 & i6) | (i6 & 3670016), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    f4 = fM9631getUnfocusedBorderThicknessD9Ej5fM;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                    }
                                    fM9628getFocusedBorderThicknessD9Ej5fM = f3;
                                }
                                i6 = i3;
                                fM9631getUnfocusedBorderThicknessD9Ej5fM = f4;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                OutlinedTextFieldDefaults.INSTANCE.m9625ContainerBoxnbWgWpA(z, z2, interactionSource, textFieldColors, value, fM9628getFocusedBorderThicknessD9Ej5fM, fM9631getUnfocusedBorderThicknessD9Ej5fM, composerStartRestartGroup, (i6 & 14) | 12582912 | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (458752 & i6) | (i6 & 3670016), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                f4 = fM9631getUnfocusedBorderThicknessD9Ej5fM;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                fM9628getFocusedBorderThicknessD9Ej5fM = f3;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                final Shape shape2 = value;
                                final float f5 = fM9628getFocusedBorderThicknessD9Ej5fM;
                                final float f6 = f4;
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedBorderContainerBox$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@Nullable Composer composer2, int i8) {
                                        this.$tmp0_rcvr.m9993OutlinedBorderContainerBoxnbWgWpA(z, z2, interactionSource, textFieldColors, shape2, f5, f6, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 1572864;
                        f4 = f2;
                        if ((599187 & i3) == 599186) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if ((i2 & 16) != 0) {
                                }
                                if (i4 == 0) {
                                }
                                if (i5 == 0) {
                                    i6 = i3;
                                    fM9631getUnfocusedBorderThicknessD9Ej5fM = f4;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                OutlinedTextFieldDefaults.INSTANCE.m9625ContainerBoxnbWgWpA(z, z2, interactionSource, textFieldColors, value, fM9628getFocusedBorderThicknessD9Ej5fM, fM9631getUnfocusedBorderThicknessD9Ej5fM, composerStartRestartGroup, (i6 & 14) | 12582912 | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (458752 & i6) | (i6 & 3670016), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                f4 = fM9631getUnfocusedBorderThicknessD9Ej5fM;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    f3 = f;
                    i5 = i2 & 64;
                    if (i5 == 0) {
                    }
                    f4 = f2;
                    if ((599187 & i3) == 599186) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                if ((i & CpioConstants.C_ISBLK) != 0) {
                }
                i4 = i2 & 32;
                if (i4 == 0) {
                }
                f3 = f;
                i5 = i2 & 64;
                if (i5 == 0) {
                }
                f4 = f2;
                if ((599187 & i3) == 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            if ((i2 & 8) != 0) {
            }
            if ((i & CpioConstants.C_ISBLK) != 0) {
            }
            i4 = i2 & 32;
            if (i4 == 0) {
            }
            f3 = f;
            i5 = i2 & 64;
            if (i5 == 0) {
            }
            f4 = f2;
            if ((599187 & i3) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i & CpioConstants.C_ISBLK) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        f3 = f;
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        f4 = f2;
        if ((599187 & i3) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* renamed from: textFieldWithLabelPadding-a9UjIt4$default */
    public static /* synthetic */ PaddingValues m9991textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        return textFieldDefaults.m10010textFieldWithLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.contentPaddingWithLabel`", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.contentPaddingWithLabel(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {}))
    @NotNull
    /* renamed from: textFieldWithLabelPadding-a9UjIt4 */
    public final PaddingValues m10010textFieldWithLabelPaddinga9UjIt4(float f, float end, float top, float bottom) {
        return m9995contentPaddingWithLabela9UjIt4(f, end, top, bottom);
    }

    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4$default */
    public static /* synthetic */ PaddingValues m9992textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m10011textFieldWithoutLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.contentPaddingWithoutLabel`", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.contentPaddingWithoutLabel(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {}))
    @NotNull
    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4 */
    public final PaddingValues m10011textFieldWithoutLabelPaddinga9UjIt4(float f, float top, float end, float bottom) {
        return m9996contentPaddingWithoutLabela9UjIt4(f, top, end, bottom);
    }

    /* renamed from: outlinedTextFieldPadding-a9UjIt4$default */
    public static /* synthetic */ PaddingValues m9989outlinedTextFieldPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m10006outlinedTextFieldPaddinga9UjIt4(f, f2, f3, f4);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.contentPadding`", replaceWith = @ReplaceWith(expression = "OutlinedTextFieldDefaults.contentPadding(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    @NotNull
    /* renamed from: outlinedTextFieldPadding-a9UjIt4 */
    public final PaddingValues m10006outlinedTextFieldPaddinga9UjIt4(float f, float top, float end, float bottom) {
        return OutlinedTextFieldDefaults.INSTANCE.m9627contentPaddinga9UjIt4(f, top, end, bottom);
    }

    @ExperimentalMaterial3Api
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.colors` with additional parameters to controlcontainer color based on state.", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.colors(\n        focusedTextColor = focusedTextColor,\n        unfocusedTextColor = unfocusedTextColor,\n        disabledTextColor = disabledTextColor,\n        errorTextColor = errorTextColor,\n        focusedContainerColor = containerColor,\n        unfocusedContainerColor = containerColor,\n        disabledContainerColor = containerColor,\n        errorContainerColor = errorContainerColor,\n        cursorColor = cursorColor,\n        errorCursorColor = errorCursorColor,\n        selectionColors = selectionColors,\n        focusedIndicatorColor = focusedIndicatorColor,\n        unfocusedIndicatorColor = unfocusedIndicatorColor,\n        disabledIndicatorColor = disabledIndicatorColor,\n        errorIndicatorColor = errorIndicatorColor,\n        focusedLeadingIconColor = focusedLeadingIconColor,\n        unfocusedLeadingIconColor = unfocusedLeadingIconColor,\n        disabledLeadingIconColor = disabledLeadingIconColor,\n        errorLeadingIconColor = errorLeadingIconColor,\n        focusedTrailingIconColor = focusedTrailingIconColor,\n        unfocusedTrailingIconColor = unfocusedTrailingIconColor,\n        disabledTrailingIconColor = disabledTrailingIconColor,\n        errorTrailingIconColor = errorTrailingIconColor,\n        focusedLabelColor = focusedLabelColor,\n        unfocusedLabelColor = unfocusedLabelColor,\n        disabledLabelColor = disabledLabelColor,\n        errorLabelColor = errorLabelColor,\n        focusedPlaceholderColor = focusedPlaceholderColor,\n        unfocusedPlaceholderColor = unfocusedPlaceholderColor,\n        disabledPlaceholderColor = disabledPlaceholderColor,\n        errorPlaceholderColor = errorPlaceholderColor,\n        focusedSupportingTextColor = focusedSupportingTextColor,\n        unfocusedSupportingTextColor = unfocusedSupportingTextColor,\n        disabledSupportingTextColor = disabledSupportingTextColor,\n        errorSupportingTextColor = errorSupportingTextColor,\n        focusedPrefixColor = focusedPrefixColor,\n        unfocusedPrefixColor = unfocusedPrefixColor,\n        disabledPrefixColor = disabledPrefixColor,\n        errorPrefixColor = errorPrefixColor,\n        focusedSuffixColor = focusedSuffixColor,\n        unfocusedSuffixColor = unfocusedSuffixColor,\n        disabledSuffixColor = disabledSuffixColor,\n        errorSuffixColor = errorSuffixColor,\n    )", imports = {}))
    @Composable
    /* renamed from: textFieldColors-M37tBTI */
    public final TextFieldColors m10008textFieldColorsM37tBTI(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, @Nullable SelectionColors selectionColors, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, @Nullable Composer composer, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        composer.startReplaceableGroup(568209592);
        long value = (i6 & 1) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getFocusInputColor(), composer, 6) : j;
        long value2 = (i6 & 2) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputColor(), composer, 6) : j2;
        long jM11339copywmQWz5c$default = (i6 & 4) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long value3 = (i6 & 8) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getErrorInputColor(), composer, 6) : j4;
        long value4 = (i6 & 16) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getContainerColor(), composer, 6) : j5;
        long value5 = (i6 & 32) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getContainerColor(), composer, 6) : j6;
        long value6 = (i6 & 64) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j7;
        long value7 = (i6 & 128) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer, 6) : j8;
        SelectionColors selectionColors2 = (i6 & 256) != 0 ? (SelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : selectionColors;
        long value8 = (i6 & 512) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getFocusActiveIndicatorColor(), composer, 6) : j9;
        long value9 = (i6 & 1024) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getActiveIndicatorColor(), composer, 6) : j10;
        long jM11339copywmQWz5c$default2 = (i6 & 2048) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledActiveIndicatorColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long value10 = (i6 & 4096) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getErrorActiveIndicatorColor(), composer, 6) : j12;
        long value11 = (i6 & 8192) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer, 6) : j13;
        long value12 = (i6 & 16384) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j14;
        long jM11339copywmQWz5c$default3 = (32768 & i6) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long value13 = (65536 & i6) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer, 6) : j16;
        long value14 = (131072 & i6) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer, 6) : j17;
        long value15 = (262144 & i6) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j18;
        long jM11339copywmQWz5c$default4 = (524288 & i6) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long value16 = (1048576 & i6) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer, 6) : j20;
        long value17 = (2097152 & i6) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getFocusLabelColor(), composer, 6) : j21;
        long value18 = (4194304 & i6) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getLabelColor(), composer, 6) : j22;
        long jM11339copywmQWz5c$default5 = (8388608 & i6) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j23;
        long value19 = (16777216 & i6) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getErrorLabelColor(), composer, 6) : j24;
        long value20 = (33554432 & i6) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j25;
        long value21 = (67108864 & i6) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j26;
        long jM11339copywmQWz5c$default6 = (134217728 & i6) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j27;
        long value22 = (268435456 & i6) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j28;
        long value23 = (536870912 & i6) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer, 6) : j29;
        long value24 = (i6 & 1073741824) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getSupportingColor(), composer, 6) : j30;
        long jM11339copywmQWz5c$default7 = (i7 & 1) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j31;
        long value25 = (i7 & 2) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer, 6) : j32;
        long value26 = (i7 & 4) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j33;
        long value27 = (i7 & 8) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j34;
        long jM11339copywmQWz5c$default8 = (i7 & 16) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j35;
        long value28 = (i7 & 32) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j36;
        long value29 = (i7 & 64) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j37;
        long value30 = (i7 & 128) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j38;
        long jM11339copywmQWz5c$default9 = (i7 & 256) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j39;
        long value31 = (i7 & 512) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j40;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(568209592, i, i2, "androidx.compose.material3.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:783)");
        }
        int i8 = i << 6;
        int i9 = i2 << 6;
        int i10 = i3 << 6;
        int i11 = ((i2 >> 24) & 126) | (i10 & 896) | (i10 & 7168) | (i10 & 57344) | (i10 & 458752) | (i10 & 3670016) | (i10 & 29360128) | (i10 & 234881024) | (i10 & 1879048192);
        int i12 = i4 << 6;
        int i13 = ((i3 >> 24) & 126) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192);
        int i14 = i5 << 6;
        TextFieldColors textFieldColorsM9994colors0hiis_0 = m9994colors0hiis_0(value, value2, jM11339copywmQWz5c$default, value3, value4, value4, value4, value5, value6, value7, selectionColors2, value8, value9, jM11339copywmQWz5c$default2, value10, value11, value12, jM11339copywmQWz5c$default3, value13, value14, value15, jM11339copywmQWz5c$default4, value16, value17, value18, jM11339copywmQWz5c$default5, value19, value20, value21, jM11339copywmQWz5c$default6, value22, value23, value24, jM11339copywmQWz5c$default7, value25, value26, value27, jM11339copywmQWz5c$default8, value28, value29, value30, jM11339copywmQWz5c$default9, value31, composer, (65534 & i) | ((i << 3) & 458752) | (i8 & 3670016) | (i8 & 29360128) | (i8 & 234881024) | (i8 & 1879048192), ((i >> 24) & 126) | (i9 & 896) | (i9 & 7168) | (i9 & 57344) | (i9 & 458752) | (i9 & 3670016) | (i9 & 29360128) | (i9 & 234881024) | (i9 & 1879048192), i11, i13, ((i4 >> 24) & 126) | (i14 & 896) | (i14 & 7168), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColorsM9994colors0hiis_0;
    }

    @ExperimentalMaterial3Api
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.colors` with additional parameters tocontrol container color based on state.", replaceWith = @ReplaceWith(expression = "OutlinedTextFieldDefaults.colors(\n        focusedTextColor = focusedTextColor,\n        unfocusedTextColor = unfocusedTextColor,\n        disabledTextColor = disabledTextColor,\n        errorTextColor = errorTextColor,\n        focusedContainerColor = containerColor,\n        unfocusedContainerColor = containerColor,\n        disabledContainerColor = containerColor,\n        errorContainerColor = errorContainerColor,\n        cursorColor = cursorColor,\n        errorCursorColor = errorCursorColor,\n        selectionColors = selectionColors,\n        focusedBorderColor = focusedBorderColor,\n        unfocusedBorderColor = unfocusedBorderColor,\n        disabledBorderColor = disabledBorderColor,\n        errorBorderColor = errorBorderColor,\n        focusedLeadingIconColor = focusedLeadingIconColor,\n        unfocusedLeadingIconColor = unfocusedLeadingIconColor,\n        disabledLeadingIconColor = disabledLeadingIconColor,\n        errorLeadingIconColor = errorLeadingIconColor,\n        focusedTrailingIconColor = focusedTrailingIconColor,\n        unfocusedTrailingIconColor = unfocusedTrailingIconColor,\n        disabledTrailingIconColor = disabledTrailingIconColor,\n        errorTrailingIconColor = errorTrailingIconColor,\n        focusedLabelColor = focusedLabelColor,\n        unfocusedLabelColor = unfocusedLabelColor,\n        disabledLabelColor = disabledLabelColor,\n        errorLabelColor = errorLabelColor,\n        focusedPlaceholderColor = focusedPlaceholderColor,\n        unfocusedPlaceholderColor = unfocusedPlaceholderColor,\n        disabledPlaceholderColor = disabledPlaceholderColor,\n        errorPlaceholderColor = errorPlaceholderColor,\n        focusedSupportingTextColor = focusedSupportingTextColor,\n        unfocusedSupportingTextColor = unfocusedSupportingTextColor,\n        disabledSupportingTextColor = disabledSupportingTextColor,\n        errorSupportingTextColor = errorSupportingTextColor,\n        focusedPrefixColor = focusedPrefixColor,\n        unfocusedPrefixColor = unfocusedPrefixColor,\n        disabledPrefixColor = disabledPrefixColor,\n        errorPrefixColor = errorPrefixColor,\n        focusedSuffixColor = focusedSuffixColor,\n        unfocusedSuffixColor = unfocusedSuffixColor,\n        disabledSuffixColor = disabledSuffixColor,\n        errorSuffixColor = errorSuffixColor,\n    )", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    @Composable
    /* renamed from: outlinedTextFieldColors-M37tBTI */
    public final TextFieldColors m10004outlinedTextFieldColorsM37tBTI(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, @Nullable SelectionColors selectionColors, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, @Nullable Composer composer, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        composer.startReplaceableGroup(618732090);
        long value = (i6 & 1) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getFocusInputColor(), composer, 6) : j;
        long value2 = (i6 & 2) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputColor(), composer, 6) : j2;
        long jM11339copywmQWz5c$default = (i6 & 4) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long value3 = (i6 & 8) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getErrorInputColor(), composer, 6) : j4;
        long jM11375getTransparent0d7_KjU = (i6 & 16) != 0 ? Color.INSTANCE.m11375getTransparent0d7_KjU() : j5;
        long jM11375getTransparent0d7_KjU2 = (i6 & 32) != 0 ? Color.INSTANCE.m11375getTransparent0d7_KjU() : j6;
        long value4 = (i6 & 64) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j7;
        long value5 = (i6 & 128) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer, 6) : j8;
        SelectionColors selectionColors2 = (i6 & 256) != 0 ? (SelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : selectionColors;
        long value6 = (i6 & 512) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getFocusOutlineColor(), composer, 6) : j9;
        long value7 = (i6 & 1024) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getOutlineColor(), composer, 6) : j10;
        long jM11339copywmQWz5c$default2 = (i6 & 2048) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long value8 = (i6 & 4096) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getErrorOutlineColor(), composer, 6) : j12;
        long value9 = (i6 & 8192) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer, 6) : j13;
        long value10 = (i6 & 16384) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j14;
        long jM11339copywmQWz5c$default3 = (32768 & i6) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long value11 = (65536 & i6) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer, 6) : j16;
        long value12 = (131072 & i6) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer, 6) : j17;
        long value13 = (262144 & i6) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j18;
        long jM11339copywmQWz5c$default4 = (524288 & i6) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long value14 = (1048576 & i6) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer, 6) : j20;
        long value15 = (2097152 & i6) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getFocusLabelColor(), composer, 6) : j21;
        long value16 = (4194304 & i6) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getLabelColor(), composer, 6) : j22;
        long jM11339copywmQWz5c$default5 = (8388608 & i6) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j23;
        long value17 = (16777216 & i6) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getErrorLabelColor(), composer, 6) : j24;
        long value18 = (33554432 & i6) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j25;
        long value19 = (67108864 & i6) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j26;
        long jM11339copywmQWz5c$default6 = (134217728 & i6) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j27;
        long value20 = (268435456 & i6) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j28;
        long value21 = (536870912 & i6) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer, 6) : j29;
        long value22 = (i6 & 1073741824) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getSupportingColor(), composer, 6) : j30;
        long jM11339copywmQWz5c$default7 = (i7 & 1) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j31;
        long value23 = (i7 & 2) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer, 6) : j32;
        long value24 = (i7 & 4) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j33;
        long value25 = (i7 & 8) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j34;
        long jM11339copywmQWz5c$default8 = (i7 & 16) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j35;
        long value26 = (i7 & 32) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j36;
        long value27 = (i7 & 64) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j37;
        long value28 = (i7 & 128) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j38;
        long jM11339copywmQWz5c$default9 = (i7 & 256) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j39;
        long value29 = (i7 & 512) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j40;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(618732090, i, i2, "androidx.compose.material3.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:933)");
        }
        int i8 = i << 6;
        int i9 = i2 << 6;
        int i10 = i3 << 6;
        int i11 = ((i2 >> 24) & 126) | (i10 & 896) | (i10 & 7168) | (i10 & 57344) | (i10 & 458752) | (i10 & 3670016) | (i10 & 29360128) | (i10 & 234881024) | (i10 & 1879048192);
        int i12 = i4 << 6;
        int i13 = i4 >> 24;
        TextFieldColors textFieldColorsM9626colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m9626colors0hiis_0(value, value2, jM11339copywmQWz5c$default, value3, jM11375getTransparent0d7_KjU, jM11375getTransparent0d7_KjU, jM11375getTransparent0d7_KjU, jM11375getTransparent0d7_KjU2, value4, value5, selectionColors2, value6, value7, jM11339copywmQWz5c$default2, value8, value9, value10, jM11339copywmQWz5c$default3, value11, value12, value13, jM11339copywmQWz5c$default4, value14, value15, value16, jM11339copywmQWz5c$default5, value17, value18, value19, jM11339copywmQWz5c$default6, value20, value21, value22, jM11339copywmQWz5c$default7, value23, value24, value25, jM11339copywmQWz5c$default8, value26, value27, value28, jM11339copywmQWz5c$default9, value29, composer, (65534 & i) | ((i << 3) & 458752) | (i8 & 3670016) | (i8 & 29360128) | (i8 & 234881024) | (i8 & 1879048192), ((i >> 24) & 126) | (i9 & 896) | (i9 & 7168) | (i9 & 57344) | (i9 & 458752) | (i9 & 3670016) | (i9 & 29360128) | (i9 & 234881024) | (i9 & 1879048192), i11, ((i3 >> 24) & 126) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192), (i13 & 112) | (i13 & 14) | 3072 | ((i5 << 6) & 896), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColorsM9626colors0hiis_0;
    }

    /* compiled from: TextFieldDefaults.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$1 */
    public static final class C16591 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ TextFieldColors $colors;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ InteractionSource $interactionSource;
        public final /* synthetic */ boolean $isError;
        public final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16591(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape) {
            super(2);
            z = z;
            z = z2;
            interactionSource = interactionSource;
            textFieldColors = textFieldColors;
            shape = shape;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2023266550, i, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:1029)");
            }
            TextFieldDefaults.INSTANCE.ContainerBox(z, z, interactionSource, textFieldColors, shape, composer, ProfileVerifier.CompilationStatus.f342xf2722a21, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:323:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:553:? A[RETURN, SYNTHETIC] */
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.DecorationBox`", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.DecorationBox(\n        value = value,\n        innerTextField = innerTextField,\n        enabled = enabled,\n        singleLine = singleLine,\n        visualTransformation = visualTransformation,\n        interactionSource = interactionSource,\n        isError = isError,\n        label = label,\n        placeholder = placeholder,\n        leadingIcon = leadingIcon,\n        trailingIcon = trailingIcon,\n        prefix = prefix,\n        suffix = suffix,\n        supportingText = supportingText,\n        shape = shape,\n        colors = colors,\n        contentPadding = contentPadding,\n        container = container,\n    )", imports = {}))
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void TextFieldDecorationBox(@NotNull String str, @NotNull Function2<? super Composer, ? super Integer, Unit> function2, boolean z, boolean z2, @NotNull VisualTransformation visualTransformation, @NotNull InteractionSource interactionSource, boolean z3, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function2<? super Composer, ? super Integer, Unit> function23, @Nullable Function2<? super Composer, ? super Integer, Unit> function24, @Nullable Function2<? super Composer, ? super Integer, Unit> function25, @Nullable Function2<? super Composer, ? super Integer, Unit> function26, @Nullable Function2<? super Composer, ? super Integer, Unit> function27, @Nullable Function2<? super Composer, ? super Integer, Unit> function28, @Nullable Shape shape, @Nullable TextFieldColors textFieldColors, @Nullable PaddingValues paddingValues, @Nullable Function2<? super Composer, ? super Integer, Unit> function29, @Nullable Composer composer, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Function2<? super Composer, ? super Integer, Unit> function210;
        Shape shape2;
        TextFieldColors textFieldColorsColors;
        PaddingValues paddingValuesM9984contentPaddingWithLabela9UjIt4$default;
        Function2<? super Composer, ? super Integer, Unit> function211;
        Shape shape3;
        Function2<? super Composer, ? super Integer, Unit> function212;
        Function2<? super Composer, ? super Integer, Unit> function2ComposableLambda;
        Function2<? super Composer, ? super Integer, Unit> function213;
        Function2<? super Composer, ? super Integer, Unit> function214;
        Function2<? super Composer, ? super Integer, Unit> function215;
        Function2<? super Composer, ? super Integer, Unit> function216;
        TextFieldColors textFieldColors2;
        boolean z4;
        Function2<? super Composer, ? super Integer, Unit> function217;
        Function2<? super Composer, ? super Integer, Unit> function218;
        PaddingValues paddingValues2;
        Composer composer2;
        boolean z5;
        Function2<? super Composer, ? super Integer, Unit> function219;
        Function2<? super Composer, ? super Integer, Unit> function220;
        Function2<? super Composer, ? super Integer, Unit> function221;
        Function2<? super Composer, ? super Integer, Unit> function222;
        Function2<? super Composer, ? super Integer, Unit> function223;
        Function2<? super Composer, ? super Integer, Unit> function224;
        Function2<? super Composer, ? super Integer, Unit> function225;
        Shape shape4;
        TextFieldColors textFieldColors3;
        PaddingValues paddingValues3;
        Function2<? super Composer, ? super Integer, Unit> function226;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1042273141);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
            }
            int i15 = 8192;
            if ((i3 & 16) == 0) {
                i4 |= CpioConstants.C_ISBLK;
            } else {
                if ((i & CpioConstants.C_ISBLK) == 0) {
                    i4 |= composerStartRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                }
                if ((i3 & 32) != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                } else if ((i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                    i4 |= composerStartRestartGroup.changed(interactionSource) ? 131072 : 65536;
                }
                i5 = i3 & 64;
                if (i5 != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i4 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
                }
                i6 = i3 & 128;
                if (i6 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                }
                i7 = i3 & 256;
                if (i7 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function23) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                }
                i8 = i3 & 512;
                if (i8 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                }
                i9 = i3 & 1024;
                if (i9 != 0) {
                    i10 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    i10 = i2 | (composerStartRestartGroup.changedInstance(function25) ? 4 : 2);
                } else {
                    i10 = i2;
                }
                i11 = i3 & 2048;
                if (i11 != 0) {
                    i10 |= 48;
                } else if ((i2 & 48) == 0) {
                    i10 |= composerStartRestartGroup.changedInstance(function26) ? 32 : 16;
                }
                int i16 = i10;
                i12 = i3 & 4096;
                if (i12 != 0) {
                    i16 |= 384;
                } else {
                    if ((i2 & 384) == 0) {
                        i16 |= composerStartRestartGroup.changedInstance(function27) ? 256 : 128;
                    }
                    i13 = i3 & 8192;
                    if (i13 != 0) {
                        if ((i2 & 3072) == 0) {
                            i16 |= composerStartRestartGroup.changedInstance(function28) ? 2048 : 1024;
                        }
                        if ((i2 & CpioConstants.C_ISBLK) == 0) {
                            if ((i3 & 16384) == 0 && composerStartRestartGroup.changed(shape)) {
                                i15 = 16384;
                            }
                            i16 |= i15;
                        }
                        if ((i2 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                            i16 |= ((i3 & 32768) == 0 && composerStartRestartGroup.changed(textFieldColors)) ? 131072 : 65536;
                        }
                        if ((i2 & 1572864) == 0) {
                            i16 |= ((i3 & 65536) == 0 && composerStartRestartGroup.changed(paddingValues)) ? 1048576 : 524288;
                        }
                        i14 = i3 & 131072;
                        if (i14 != 0) {
                            i16 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            i16 |= composerStartRestartGroup.changedInstance(function29) ? 8388608 : 4194304;
                        }
                        if ((i3 & 262144) != 0) {
                            i16 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i16 |= composerStartRestartGroup.changed(this) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                        }
                        if ((i4 & 306783379) != 306783378 || (38347923 & i16) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                boolean z6 = i5 == 0 ? false : z3;
                                Function2<? super Composer, ? super Integer, Unit> function227 = i6 == 0 ? null : function22;
                                Function2<? super Composer, ? super Integer, Unit> function228 = i7 == 0 ? null : function23;
                                Function2<? super Composer, ? super Integer, Unit> function229 = i8 == 0 ? null : function24;
                                Function2<? super Composer, ? super Integer, Unit> function230 = i9 == 0 ? null : function25;
                                Function2<? super Composer, ? super Integer, Unit> function231 = i11 == 0 ? null : function26;
                                Function2<? super Composer, ? super Integer, Unit> function232 = i12 == 0 ? null : function27;
                                Function2<? super Composer, ? super Integer, Unit> function233 = i13 == 0 ? function28 : null;
                                if ((i3 & 16384) == 0) {
                                    function210 = function229;
                                    shape2 = INSTANCE.getShape(composerStartRestartGroup, 6);
                                    i16 &= -57345;
                                } else {
                                    function210 = function229;
                                    shape2 = shape;
                                }
                                if ((32768 & i3) == 0) {
                                    textFieldColorsColors = colors(composerStartRestartGroup, (i16 >> 24) & 14);
                                    i16 &= -458753;
                                } else {
                                    textFieldColorsColors = textFieldColors;
                                }
                                if ((i3 & 65536) == 0) {
                                    if (function227 == null) {
                                        paddingValuesM9984contentPaddingWithLabela9UjIt4$default = m9985contentPaddingWithoutLabela9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    } else {
                                        paddingValuesM9984contentPaddingWithLabela9UjIt4$default = m9984contentPaddingWithLabela9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    }
                                    i16 &= -3670017;
                                } else {
                                    paddingValuesM9984contentPaddingWithLabela9UjIt4$default = paddingValues;
                                }
                                if (i14 == 0) {
                                    function211 = function230;
                                    shape3 = shape2;
                                    function212 = function231;
                                    function213 = function210;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2023266550, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.1
                                        public final /* synthetic */ TextFieldColors $colors;
                                        public final /* synthetic */ boolean $enabled;
                                        public final /* synthetic */ InteractionSource $interactionSource;
                                        public final /* synthetic */ boolean $isError;
                                        public final /* synthetic */ Shape $shape;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public C16591(boolean z7, boolean z62, InteractionSource interactionSource2, TextFieldColors textFieldColorsColors2, Shape shape22) {
                                            super(2);
                                            z = z7;
                                            z = z62;
                                            interactionSource = interactionSource2;
                                            textFieldColors = textFieldColorsColors2;
                                            shape = shape22;
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer3, int i17) {
                                            if ((i17 & 3) == 2 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(2023266550, i17, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:1029)");
                                            }
                                            TextFieldDefaults.INSTANCE.ContainerBox(z, z, interactionSource, textFieldColors, shape, composer3, ProfileVerifier.CompilationStatus.f342xf2722a21, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    });
                                } else {
                                    function211 = function230;
                                    shape3 = shape22;
                                    function212 = function231;
                                    function2ComposableLambda = function29;
                                    function213 = function210;
                                }
                                function214 = function227;
                                function215 = function228;
                                function216 = function232;
                                textFieldColors2 = textFieldColorsColors2;
                                z4 = z62;
                                function217 = function233;
                                function218 = function211;
                                paddingValues2 = paddingValuesM9984contentPaddingWithLabela9UjIt4$default;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 16384) != 0) {
                                    i16 &= -57345;
                                }
                                if ((32768 & i3) != 0) {
                                    i16 &= -458753;
                                }
                                if ((i3 & 65536) != 0) {
                                    i16 &= -3670017;
                                }
                                z4 = z3;
                                function214 = function22;
                                function215 = function23;
                                function213 = function24;
                                function218 = function25;
                                function212 = function26;
                                function216 = function27;
                                function217 = function28;
                                shape3 = shape;
                                textFieldColors2 = textFieldColors;
                                paddingValues2 = paddingValues;
                                function2ComposableLambda = function29;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1042273141, i4, i16, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:1031)");
                            }
                            composer2 = composerStartRestartGroup;
                            DecorationBox(str, function2, z7, z2, visualTransformation, interactionSource2, z4, function214, function215, function213, function218, function212, function216, function217, shape3, textFieldColors2, paddingValues2, function2ComposableLambda, composer2, i4 & 2147483646, i16 & 268435454, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z4;
                            function219 = function214;
                            function220 = function215;
                            function221 = function213;
                            function222 = function218;
                            function223 = function212;
                            function224 = function216;
                            function225 = function217;
                            shape4 = shape3;
                            textFieldColors3 = textFieldColors2;
                            paddingValues3 = paddingValues2;
                            function226 = function2ComposableLambda;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            z5 = z3;
                            function219 = function22;
                            function220 = function23;
                            function222 = function25;
                            function223 = function26;
                            function224 = function27;
                            function225 = function28;
                            shape4 = shape;
                            textFieldColors3 = textFieldColors;
                            paddingValues3 = paddingValues;
                            function226 = function29;
                            composer2 = composerStartRestartGroup;
                            function221 = function24;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.2
                                public final /* synthetic */ int $$changed;
                                public final /* synthetic */ int $$changed1;
                                public final /* synthetic */ int $$default;
                                public final /* synthetic */ TextFieldColors $colors;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $container;
                                public final /* synthetic */ PaddingValues $contentPadding;
                                public final /* synthetic */ boolean $enabled;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $innerTextField;
                                public final /* synthetic */ InteractionSource $interactionSource;
                                public final /* synthetic */ boolean $isError;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
                                public final /* synthetic */ Shape $shape;
                                public final /* synthetic */ boolean $singleLine;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                                public final /* synthetic */ String $value;
                                public final /* synthetic */ VisualTransformation $visualTransformation;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C16602(String str2, Function2<? super Composer, ? super Integer, Unit> function234, boolean z7, boolean z22, VisualTransformation visualTransformation2, InteractionSource interactionSource2, boolean z52, Function2<? super Composer, ? super Integer, Unit> function2192, Function2<? super Composer, ? super Integer, Unit> function2202, Function2<? super Composer, ? super Integer, Unit> function2212, Function2<? super Composer, ? super Integer, Unit> function2222, Function2<? super Composer, ? super Integer, Unit> function2232, Function2<? super Composer, ? super Integer, Unit> function2242, Function2<? super Composer, ? super Integer, Unit> function2252, Shape shape42, TextFieldColors textFieldColors32, PaddingValues paddingValues32, Function2<? super Composer, ? super Integer, Unit> function2262, int i17, int i22, int i32) {
                                    super(2);
                                    str = str2;
                                    function2 = function234;
                                    z = z7;
                                    z = z22;
                                    visualTransformation = visualTransformation2;
                                    interactionSource = interactionSource2;
                                    z = z52;
                                    function2 = function2192;
                                    function2 = function2202;
                                    function2 = function2212;
                                    function2 = function2222;
                                    function2 = function2232;
                                    function2 = function2242;
                                    function2 = function2252;
                                    shape = shape42;
                                    textFieldColors = textFieldColors32;
                                    paddingValues = paddingValues32;
                                    function2 = function2262;
                                    i = i17;
                                    i = i22;
                                    i = i32;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer3, int i17) {
                                    TextFieldDefaults.this.TextFieldDecorationBox(str, function2, z, z, visualTransformation, interactionSource, z, function2, function2, function2, function2, function2, function2, function2, shape, textFieldColors, paddingValues, function2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i16 |= 3072;
                    if ((i22 & CpioConstants.C_ISBLK) == 0) {
                    }
                    if ((i22 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                    }
                    if ((i22 & 1572864) == 0) {
                    }
                    i14 = i32 & 131072;
                    if (i14 != 0) {
                    }
                    if ((i32 & 262144) != 0) {
                    }
                    if ((i4 & 306783379) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i17 & 1) != 0) {
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i11 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i13 == 0) {
                            }
                            if ((i32 & 16384) == 0) {
                            }
                            if ((32768 & i32) == 0) {
                            }
                            if ((i32 & 65536) == 0) {
                            }
                            if (i14 == 0) {
                            }
                            function214 = function227;
                            function215 = function228;
                            function216 = function232;
                            textFieldColors2 = textFieldColorsColors2;
                            z4 = z62;
                            function217 = function233;
                            function218 = function211;
                            paddingValues2 = paddingValuesM9984contentPaddingWithLabela9UjIt4$default;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer2 = composerStartRestartGroup;
                            DecorationBox(str2, function234, z7, z22, visualTransformation2, interactionSource2, z4, function214, function215, function213, function218, function212, function216, function217, shape3, textFieldColors2, paddingValues2, function2ComposableLambda, composer2, i4 & 2147483646, i16 & 268435454, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z52 = z4;
                            function2192 = function214;
                            function2202 = function215;
                            function2212 = function213;
                            function2222 = function218;
                            function2232 = function212;
                            function2242 = function216;
                            function2252 = function217;
                            shape42 = shape3;
                            textFieldColors32 = textFieldColors2;
                            paddingValues32 = paddingValues2;
                            function2262 = function2ComposableLambda;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i13 = i32 & 8192;
                if (i13 != 0) {
                }
                if ((i22 & CpioConstants.C_ISBLK) == 0) {
                }
                if ((i22 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                }
                if ((i22 & 1572864) == 0) {
                }
                i14 = i32 & 131072;
                if (i14 != 0) {
                }
                if ((i32 & 262144) != 0) {
                }
                if ((i4 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i32 & 32) != 0) {
            }
            i5 = i32 & 64;
            if (i5 != 0) {
            }
            i6 = i32 & 128;
            if (i6 != 0) {
            }
            i7 = i32 & 256;
            if (i7 != 0) {
            }
            i8 = i32 & 512;
            if (i8 != 0) {
            }
            i9 = i32 & 1024;
            if (i9 != 0) {
            }
            i11 = i32 & 2048;
            if (i11 != 0) {
            }
            int i162 = i10;
            i12 = i32 & 4096;
            if (i12 != 0) {
            }
            i13 = i32 & 8192;
            if (i13 != 0) {
            }
            if ((i22 & CpioConstants.C_ISBLK) == 0) {
            }
            if ((i22 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
            }
            if ((i22 & 1572864) == 0) {
            }
            i14 = i32 & 131072;
            if (i14 != 0) {
            }
            if ((i32 & 262144) != 0) {
            }
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        int i152 = 8192;
        if ((i32 & 16) == 0) {
        }
        if ((i32 & 32) != 0) {
        }
        i5 = i32 & 64;
        if (i5 != 0) {
        }
        i6 = i32 & 128;
        if (i6 != 0) {
        }
        i7 = i32 & 256;
        if (i7 != 0) {
        }
        i8 = i32 & 512;
        if (i8 != 0) {
        }
        i9 = i32 & 1024;
        if (i9 != 0) {
        }
        i11 = i32 & 2048;
        if (i11 != 0) {
        }
        int i1622 = i10;
        i12 = i32 & 4096;
        if (i12 != 0) {
        }
        i13 = i32 & 8192;
        if (i13 != 0) {
        }
        if ((i22 & CpioConstants.C_ISBLK) == 0) {
        }
        if ((i22 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
        }
        if ((i22 & 1572864) == 0) {
        }
        i14 = i32 & 131072;
        if (i14 != 0) {
        }
        if ((i32 & 262144) != 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: TextFieldDefaults.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$1 */
    public static final class C16551 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ TextFieldColors $colors;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ InteractionSource $interactionSource;
        public final /* synthetic */ boolean $isError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16551(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors) {
            super(2);
            z = z;
            z = z2;
            interactionSource = interactionSource;
            textFieldColors = textFieldColors;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1153197597, i, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:1096)");
            }
            OutlinedTextFieldDefaults.INSTANCE.m9625ContainerBoxnbWgWpA(z, z, interactionSource, textFieldColors, null, 0.0f, 0.0f, composer, 12582912, 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:293:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:493:? A[RETURN, SYNTHETIC] */
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.DecorationBox`", replaceWith = @ReplaceWith(expression = "OutlinedTextFieldDefaults.DecorationBox(\n        value = value,\n        innerTextField = innerTextField,\n        enabled = enabled,\n        singleLine = singleLine,\n        visualTransformation = visualTransformation,\n        interactionSource = interactionSource,\n        isError = isError,\n        label = label,\n        placeholder = placeholder,\n        leadingIcon = leadingIcon,\n        trailingIcon = trailingIcon,\n        prefix = prefix,\n        suffix = suffix,\n        supportingText = supportingText,\n        colors = colors,\n        contentPadding = contentPadding,\n        container = container,\n    )", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OutlinedTextFieldDecorationBox(@NotNull String str, @NotNull Function2<? super Composer, ? super Integer, Unit> function2, boolean z, boolean z2, @NotNull VisualTransformation visualTransformation, @NotNull InteractionSource interactionSource, boolean z3, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function2<? super Composer, ? super Integer, Unit> function23, @Nullable Function2<? super Composer, ? super Integer, Unit> function24, @Nullable Function2<? super Composer, ? super Integer, Unit> function25, @Nullable Function2<? super Composer, ? super Integer, Unit> function26, @Nullable Function2<? super Composer, ? super Integer, Unit> function27, @Nullable Function2<? super Composer, ? super Integer, Unit> function28, @Nullable TextFieldColors textFieldColors, @Nullable PaddingValues paddingValues, @Nullable Function2<? super Composer, ? super Integer, Unit> function29, @Nullable Composer composer, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Function2<? super Composer, ? super Integer, Unit> function210;
        TextFieldColors textFieldColorsColors;
        PaddingValues paddingValuesM9624contentPaddinga9UjIt4$default;
        TextFieldColors textFieldColors2;
        Function2<? super Composer, ? super Integer, Unit> function211;
        Function2<? super Composer, ? super Integer, Unit> function212;
        Function2<? super Composer, ? super Integer, Unit> function213;
        Function2<? super Composer, ? super Integer, Unit> function2ComposableLambda;
        Function2<? super Composer, ? super Integer, Unit> function214;
        Function2<? super Composer, ? super Integer, Unit> function215;
        Function2<? super Composer, ? super Integer, Unit> function216;
        PaddingValues paddingValues2;
        boolean z4;
        Function2<? super Composer, ? super Integer, Unit> function217;
        TextFieldColors textFieldColors3;
        Composer composer2;
        boolean z5;
        Function2<? super Composer, ? super Integer, Unit> function218;
        Function2<? super Composer, ? super Integer, Unit> function219;
        Function2<? super Composer, ? super Integer, Unit> function220;
        Function2<? super Composer, ? super Integer, Unit> function221;
        Function2<? super Composer, ? super Integer, Unit> function222;
        Function2<? super Composer, ? super Integer, Unit> function223;
        Function2<? super Composer, ? super Integer, Unit> function224;
        TextFieldColors textFieldColors4;
        PaddingValues paddingValues3;
        Function2<? super Composer, ? super Integer, Unit> function225;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-789275592);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
            }
            int i15 = 8192;
            if ((i3 & 16) == 0) {
                i4 |= CpioConstants.C_ISBLK;
            } else {
                if ((i & CpioConstants.C_ISBLK) == 0) {
                    i4 |= composerStartRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                }
                if ((i3 & 32) != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                } else if ((i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                    i4 |= composerStartRestartGroup.changed(interactionSource) ? 131072 : 65536;
                }
                i5 = i3 & 64;
                if (i5 != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i4 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
                }
                i6 = i3 & 128;
                if (i6 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                }
                i7 = i3 & 256;
                if (i7 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function23) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                }
                i8 = i3 & 512;
                if (i8 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                }
                i9 = i3 & 1024;
                if (i9 != 0) {
                    i10 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    i10 = i2 | (composerStartRestartGroup.changedInstance(function25) ? 4 : 2);
                } else {
                    i10 = i2;
                }
                i11 = i3 & 2048;
                if (i11 != 0) {
                    i10 |= 48;
                } else if ((i2 & 48) == 0) {
                    i10 |= composerStartRestartGroup.changedInstance(function26) ? 32 : 16;
                }
                int i16 = i10;
                i12 = i3 & 4096;
                if (i12 != 0) {
                    i16 |= 384;
                } else {
                    if ((i2 & 384) == 0) {
                        i16 |= composerStartRestartGroup.changedInstance(function27) ? 256 : 128;
                    }
                    i13 = i3 & 8192;
                    if (i13 != 0) {
                        if ((i2 & 3072) == 0) {
                            i16 |= composerStartRestartGroup.changedInstance(function28) ? 2048 : 1024;
                        }
                        if ((i2 & CpioConstants.C_ISBLK) == 0) {
                            if ((i3 & 16384) == 0 && composerStartRestartGroup.changed(textFieldColors)) {
                                i15 = 16384;
                            }
                            i16 |= i15;
                        }
                        if ((i2 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                            i16 |= ((i3 & 32768) == 0 && composerStartRestartGroup.changed(paddingValues)) ? 131072 : 65536;
                        }
                        i14 = i3 & 65536;
                        if (i14 != 0) {
                            i16 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i16 |= composerStartRestartGroup.changedInstance(function29) ? 1048576 : 524288;
                        }
                        if ((i4 & 306783379) != 306783378 || (599187 & i16) != 599186 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                boolean z6 = i5 == 0 ? false : z3;
                                Function2<? super Composer, ? super Integer, Unit> function226 = i6 == 0 ? null : function22;
                                Function2<? super Composer, ? super Integer, Unit> function227 = i7 == 0 ? null : function23;
                                Function2<? super Composer, ? super Integer, Unit> function228 = i8 == 0 ? null : function24;
                                Function2<? super Composer, ? super Integer, Unit> function229 = i9 == 0 ? null : function25;
                                Function2<? super Composer, ? super Integer, Unit> function230 = i11 == 0 ? null : function26;
                                Function2<? super Composer, ? super Integer, Unit> function231 = i12 == 0 ? null : function27;
                                Function2<? super Composer, ? super Integer, Unit> function232 = i13 == 0 ? function28 : null;
                                if ((i3 & 16384) == 0) {
                                    function210 = function228;
                                    textFieldColorsColors = OutlinedTextFieldDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                                    i16 &= -57345;
                                } else {
                                    function210 = function228;
                                    textFieldColorsColors = textFieldColors;
                                }
                                if ((i3 & 32768) == 0) {
                                    paddingValuesM9624contentPaddinga9UjIt4$default = OutlinedTextFieldDefaults.m9624contentPaddinga9UjIt4$default(OutlinedTextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i16 &= -458753;
                                } else {
                                    paddingValuesM9624contentPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i14 == 0) {
                                    textFieldColors2 = textFieldColorsColors;
                                    function211 = function210;
                                    function212 = function229;
                                    function213 = function230;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1153197597, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.1
                                        public final /* synthetic */ TextFieldColors $colors;
                                        public final /* synthetic */ boolean $enabled;
                                        public final /* synthetic */ InteractionSource $interactionSource;
                                        public final /* synthetic */ boolean $isError;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public C16551(boolean z7, boolean z62, InteractionSource interactionSource2, TextFieldColors textFieldColorsColors2) {
                                            super(2);
                                            z = z7;
                                            z = z62;
                                            interactionSource = interactionSource2;
                                            textFieldColors = textFieldColorsColors2;
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer3, int i17) {
                                            if ((i17 & 3) == 2 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1153197597, i17, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:1096)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m9625ContainerBoxnbWgWpA(z, z, interactionSource, textFieldColors, null, 0.0f, 0.0f, composer3, 12582912, 112);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    });
                                } else {
                                    textFieldColors2 = textFieldColorsColors2;
                                    function211 = function210;
                                    function212 = function229;
                                    function213 = function230;
                                    function2ComposableLambda = function29;
                                }
                                function214 = function226;
                                function215 = function227;
                                function216 = function231;
                                paddingValues2 = paddingValuesM9624contentPaddinga9UjIt4$default;
                                z4 = z62;
                                function217 = function232;
                                textFieldColors3 = textFieldColors2;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 16384) != 0) {
                                    i16 &= -57345;
                                }
                                if ((i3 & 32768) != 0) {
                                    i16 &= -458753;
                                }
                                z4 = z3;
                                function214 = function22;
                                function215 = function23;
                                function211 = function24;
                                function212 = function25;
                                function213 = function26;
                                function216 = function27;
                                function217 = function28;
                                textFieldColors3 = textFieldColors;
                                paddingValues2 = paddingValues;
                                function2ComposableLambda = function29;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-789275592, i4, i16, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:1098)");
                            }
                            composer2 = composerStartRestartGroup;
                            OutlinedTextFieldDefaults.INSTANCE.DecorationBox(str, function2, z7, z2, visualTransformation, interactionSource2, z4, function214, function215, function211, function212, function213, function216, function217, textFieldColors3, paddingValues2, function2ComposableLambda, composer2, i4 & 2147483646, (i16 & 14) | 12582912 | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (57344 & i16) | (458752 & i16) | (3670016 & i16), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z4;
                            function218 = function214;
                            function219 = function215;
                            function220 = function211;
                            function221 = function212;
                            function222 = function213;
                            function223 = function216;
                            function224 = function217;
                            textFieldColors4 = textFieldColors3;
                            paddingValues3 = paddingValues2;
                            function225 = function2ComposableLambda;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            z5 = z3;
                            function218 = function22;
                            function220 = function24;
                            function221 = function25;
                            function222 = function26;
                            function223 = function27;
                            function224 = function28;
                            textFieldColors4 = textFieldColors;
                            paddingValues3 = paddingValues;
                            function225 = function29;
                            composer2 = composerStartRestartGroup;
                            function219 = function23;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.2
                                public final /* synthetic */ int $$changed;
                                public final /* synthetic */ int $$changed1;
                                public final /* synthetic */ int $$default;
                                public final /* synthetic */ TextFieldColors $colors;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $container;
                                public final /* synthetic */ PaddingValues $contentPadding;
                                public final /* synthetic */ boolean $enabled;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $innerTextField;
                                public final /* synthetic */ InteractionSource $interactionSource;
                                public final /* synthetic */ boolean $isError;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
                                public final /* synthetic */ boolean $singleLine;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                                public final /* synthetic */ String $value;
                                public final /* synthetic */ VisualTransformation $visualTransformation;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C16562(String str2, Function2<? super Composer, ? super Integer, Unit> function233, boolean z7, boolean z22, VisualTransformation visualTransformation2, InteractionSource interactionSource2, boolean z52, Function2<? super Composer, ? super Integer, Unit> function2182, Function2<? super Composer, ? super Integer, Unit> function2192, Function2<? super Composer, ? super Integer, Unit> function2202, Function2<? super Composer, ? super Integer, Unit> function2212, Function2<? super Composer, ? super Integer, Unit> function2222, Function2<? super Composer, ? super Integer, Unit> function2232, Function2<? super Composer, ? super Integer, Unit> function2242, TextFieldColors textFieldColors42, PaddingValues paddingValues32, Function2<? super Composer, ? super Integer, Unit> function2252, int i17, int i22, int i32) {
                                    super(2);
                                    str = str2;
                                    function2 = function233;
                                    z = z7;
                                    z = z22;
                                    visualTransformation = visualTransformation2;
                                    interactionSource = interactionSource2;
                                    z = z52;
                                    function2 = function2182;
                                    function2 = function2192;
                                    function2 = function2202;
                                    function2 = function2212;
                                    function2 = function2222;
                                    function2 = function2232;
                                    function2 = function2242;
                                    textFieldColors = textFieldColors42;
                                    paddingValues = paddingValues32;
                                    function2 = function2252;
                                    i = i17;
                                    i = i22;
                                    i = i32;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer3, int i17) {
                                    TextFieldDefaults.this.OutlinedTextFieldDecorationBox(str, function2, z, z, visualTransformation, interactionSource, z, function2, function2, function2, function2, function2, function2, function2, textFieldColors, paddingValues, function2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i16 |= 3072;
                    if ((i22 & CpioConstants.C_ISBLK) == 0) {
                    }
                    if ((i22 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                    }
                    i14 = i32 & 65536;
                    if (i14 != 0) {
                    }
                    if ((i4 & 306783379) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i17 & 1) != 0) {
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i11 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i13 == 0) {
                            }
                            if ((i32 & 16384) == 0) {
                            }
                            if ((i32 & 32768) == 0) {
                            }
                            if (i14 == 0) {
                            }
                            function214 = function226;
                            function215 = function227;
                            function216 = function231;
                            paddingValues2 = paddingValuesM9624contentPaddinga9UjIt4$default;
                            z4 = z62;
                            function217 = function232;
                            textFieldColors3 = textFieldColors2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer2 = composerStartRestartGroup;
                            OutlinedTextFieldDefaults.INSTANCE.DecorationBox(str2, function233, z7, z22, visualTransformation2, interactionSource2, z4, function214, function215, function211, function212, function213, function216, function217, textFieldColors3, paddingValues2, function2ComposableLambda, composer2, i4 & 2147483646, (i16 & 14) | 12582912 | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (57344 & i16) | (458752 & i16) | (3670016 & i16), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z52 = z4;
                            function2182 = function214;
                            function2192 = function215;
                            function2202 = function211;
                            function2212 = function212;
                            function2222 = function213;
                            function2232 = function216;
                            function2242 = function217;
                            textFieldColors42 = textFieldColors3;
                            paddingValues32 = paddingValues2;
                            function2252 = function2ComposableLambda;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i13 = i32 & 8192;
                if (i13 != 0) {
                }
                if ((i22 & CpioConstants.C_ISBLK) == 0) {
                }
                if ((i22 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                }
                i14 = i32 & 65536;
                if (i14 != 0) {
                }
                if ((i4 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i32 & 32) != 0) {
            }
            i5 = i32 & 64;
            if (i5 != 0) {
            }
            i6 = i32 & 128;
            if (i6 != 0) {
            }
            i7 = i32 & 256;
            if (i7 != 0) {
            }
            i8 = i32 & 512;
            if (i8 != 0) {
            }
            i9 = i32 & 1024;
            if (i9 != 0) {
            }
            i11 = i32 & 2048;
            if (i11 != 0) {
            }
            int i162 = i10;
            i12 = i32 & 4096;
            if (i12 != 0) {
            }
            i13 = i32 & 8192;
            if (i13 != 0) {
            }
            if ((i22 & CpioConstants.C_ISBLK) == 0) {
            }
            if ((i22 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
            }
            i14 = i32 & 65536;
            if (i14 != 0) {
            }
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        int i152 = 8192;
        if ((i32 & 16) == 0) {
        }
        if ((i32 & 32) != 0) {
        }
        i5 = i32 & 64;
        if (i5 != 0) {
        }
        i6 = i32 & 128;
        if (i6 != 0) {
        }
        i7 = i32 & 256;
        if (i7 != 0) {
        }
        i8 = i32 & 512;
        if (i8 != 0) {
        }
        i9 = i32 & 1024;
        if (i9 != 0) {
        }
        i11 = i32 & 2048;
        if (i11 != 0) {
        }
        int i1622 = i10;
        i12 = i32 & 4096;
        if (i12 != 0) {
        }
        i13 = i32 & 8192;
        if (i13 != 0) {
        }
        if ((i22 & CpioConstants.C_ISBLK) == 0) {
        }
        if ((i22 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
        }
        i14 = i32 & 65536;
        if (i14 != 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    @ExperimentalMaterial3Api
    /* renamed from: textFieldColors-eS1Emto */
    public final /* synthetic */ TextFieldColors m10009textFieldColorseS1Emto(long j, long j2, long j3, long j4, long j5, SelectionColors selectionColors, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, Composer composer, int i, int i2, int i3, int i4, int i5, int i6) {
        composer.startReplaceableGroup(-595874869);
        long value = (i5 & 1) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputColor(), composer, 6) : j;
        long jM11339copywmQWz5c$default = (i5 & 2) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long value2 = (i5 & 4) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getContainerColor(), composer, 6) : j3;
        long value3 = (i5 & 8) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j4;
        long value4 = (i5 & 16) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer, 6) : j5;
        SelectionColors selectionColors2 = (i5 & 32) != 0 ? (SelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : selectionColors;
        long value5 = (i5 & 64) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getFocusActiveIndicatorColor(), composer, 6) : j6;
        long value6 = (i5 & 128) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getActiveIndicatorColor(), composer, 6) : j7;
        long jM11339copywmQWz5c$default2 = (i5 & 256) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledActiveIndicatorColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long value7 = (i5 & 512) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getErrorActiveIndicatorColor(), composer, 6) : j9;
        long value8 = (i5 & 1024) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer, 6) : j10;
        long value9 = (i5 & 2048) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j11;
        long jM11339copywmQWz5c$default3 = (i5 & 4096) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long value10 = (i5 & 8192) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer, 6) : j13;
        long value11 = (i5 & 16384) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer, 6) : j14;
        long value12 = (32768 & i5) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j15;
        long jM11339copywmQWz5c$default4 = (65536 & i5) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long value13 = (131072 & i5) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer, 6) : j17;
        long value14 = (262144 & i5) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getFocusLabelColor(), composer, 6) : j18;
        long value15 = (524288 & i5) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getLabelColor(), composer, 6) : j19;
        long jM11339copywmQWz5c$default5 = (1048576 & i5) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long value16 = (2097152 & i5) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getErrorLabelColor(), composer, 6) : j21;
        long value17 = (4194304 & i5) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j22;
        long jM11339copywmQWz5c$default6 = (8388608 & i5) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j23;
        long value18 = (16777216 & i5) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer, 6) : j24;
        long value19 = (33554432 & i5) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getSupportingColor(), composer, 6) : j25;
        long jM11339copywmQWz5c$default7 = (67108864 & i5) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j26;
        long value20 = (134217728 & i5) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer, 6) : j27;
        long value21 = (268435456 & i5) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j28;
        long value22 = (536870912 & i5) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j29;
        long jM11339copywmQWz5c$default8 = (i5 & 1073741824) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j30;
        long value23 = (i6 & 1) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j31;
        long value24 = (i6 & 2) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j32;
        long value25 = (i6 & 4) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j33;
        long jM11339copywmQWz5c$default9 = (i6 & 8) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j34;
        long value26 = (i6 & 16) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j35;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-595874869, i, i2, "androidx.compose.material3.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:1167)");
        }
        int i7 = i << 3;
        int i8 = (i & 14) | (i7 & 112) | (i7 & 896);
        int i9 = i << 9;
        int i10 = i8 | (i9 & 7168) | ((i << 6) & 57344) | (i9 & 458752) | ((i << 12) & 3670016);
        int i11 = i << 15;
        int i12 = i10 | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192);
        int i13 = i2 << 15;
        int i14 = i3 << 15;
        int i15 = ((i2 >> 15) & 65534) | (i14 & 458752) | (i14 & 3670016) | (i14 & 29360128);
        int i16 = i3 << 18;
        int i17 = i15 | (i16 & 234881024) | (i16 & 1879048192);
        int i18 = i3 >> 9;
        int i19 = ((i3 >> 6) & 14) | (i18 & 112) | (i18 & 896) | (i18 & 7168) | (i18 & 57344) | (i18 & 458752) | (i18 & 3670016);
        int i20 = i4 << 21;
        TextFieldColors textFieldColorsM9994colors0hiis_0 = m9994colors0hiis_0(value, value, jM11339copywmQWz5c$default, value, value2, value2, value2, value2, value3, value4, selectionColors2, value5, value6, jM11339copywmQWz5c$default2, value7, value8, value9, jM11339copywmQWz5c$default3, value10, value11, value12, jM11339copywmQWz5c$default4, value13, value14, value15, jM11339copywmQWz5c$default5, value16, value17, value17, jM11339copywmQWz5c$default6, value17, value18, value19, jM11339copywmQWz5c$default7, value20, value21, value22, jM11339copywmQWz5c$default8, value23, value24, value25, jM11339copywmQWz5c$default9, value26, composer, i12, ((i >> 15) & 65534) | (i13 & 458752) | (i13 & 3670016) | (i13 & 29360128) | (i13 & 234881024) | (i13 & 1879048192), i17, i19 | (i20 & 29360128) | (i20 & 234881024) | (i20 & 1879048192), (i4 >> 9) & 8190, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColorsM9994colors0hiis_0;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    @ExperimentalMaterial3Api
    /* renamed from: outlinedTextFieldColors-eS1Emto */
    public final /* synthetic */ TextFieldColors m10005outlinedTextFieldColorseS1Emto(long j, long j2, long j3, long j4, long j5, SelectionColors selectionColors, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, Composer composer, int i, int i2, int i3, int i4, int i5, int i6) {
        composer.startReplaceableGroup(1767818445);
        long value = (i5 & 1) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputColor(), composer, 6) : j;
        long jM11339copywmQWz5c$default = (i5 & 2) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long jM11375getTransparent0d7_KjU = (i5 & 4) != 0 ? Color.INSTANCE.m11375getTransparent0d7_KjU() : j3;
        long value2 = (i5 & 8) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j4;
        long value3 = (i5 & 16) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer, 6) : j5;
        SelectionColors selectionColors2 = (i5 & 32) != 0 ? (SelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : selectionColors;
        long value4 = (i5 & 64) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getFocusOutlineColor(), composer, 6) : j6;
        long value5 = (i5 & 128) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getOutlineColor(), composer, 6) : j7;
        long jM11339copywmQWz5c$default2 = (i5 & 256) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long value6 = (i5 & 512) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getErrorOutlineColor(), composer, 6) : j9;
        long value7 = (i5 & 1024) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer, 6) : j10;
        long value8 = (i5 & 2048) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j11;
        long jM11339copywmQWz5c$default3 = (i5 & 4096) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long value9 = (i5 & 8192) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer, 6) : j13;
        long value10 = (i5 & 16384) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer, 6) : j14;
        long value11 = (32768 & i5) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j15;
        long jM11339copywmQWz5c$default4 = (65536 & i5) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long value12 = (131072 & i5) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer, 6) : j17;
        long value13 = (262144 & i5) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getFocusLabelColor(), composer, 6) : j18;
        long value14 = (524288 & i5) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getLabelColor(), composer, 6) : j19;
        long jM11339copywmQWz5c$default5 = (1048576 & i5) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long value15 = (2097152 & i5) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getErrorLabelColor(), composer, 6) : j21;
        long value16 = (4194304 & i5) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j22;
        long jM11339copywmQWz5c$default6 = (8388608 & i5) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j23;
        long value17 = (16777216 & i5) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer, 6) : j24;
        long value18 = (33554432 & i5) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getSupportingColor(), composer, 6) : j25;
        long jM11339copywmQWz5c$default7 = (67108864 & i5) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j26;
        long value19 = (134217728 & i5) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer, 6) : j27;
        long value20 = (268435456 & i5) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j28;
        long value21 = (536870912 & i5) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j29;
        long jM11339copywmQWz5c$default8 = (i5 & 1073741824) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j30;
        long value22 = (i6 & 1) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j31;
        long value23 = (i6 & 2) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j32;
        long value24 = (i6 & 4) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j33;
        long jM11339copywmQWz5c$default9 = (i6 & 8) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j34;
        long value25 = (i6 & 16) != 0 ? ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j35;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1767818445, i, i2, "androidx.compose.material3.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:1262)");
        }
        int i7 = i << 3;
        int i8 = (i & 14) | (i7 & 112) | (i7 & 896);
        int i9 = i << 9;
        int i10 = i8 | (i9 & 7168) | ((i << 6) & 57344) | (i9 & 458752) | ((i << 12) & 3670016);
        int i11 = i << 15;
        int i12 = i10 | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192);
        int i13 = i2 << 15;
        int i14 = i3 << 15;
        int i15 = ((i2 >> 15) & 65534) | (i14 & 458752) | (i14 & 3670016) | (i14 & 29360128);
        int i16 = i3 << 18;
        int i17 = i15 | (i16 & 234881024) | (i16 & 1879048192);
        int i18 = i3 >> 9;
        int i19 = ((i3 >> 6) & 14) | (i18 & 112) | (i18 & 896) | (i18 & 7168) | (i18 & 57344) | (i18 & 458752) | (i18 & 3670016);
        int i20 = i4 << 21;
        int i21 = i19 | (i20 & 29360128) | (i20 & 234881024) | (i20 & 1879048192);
        int i22 = i4 >> 9;
        TextFieldColors textFieldColorsM9626colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m9626colors0hiis_0(value, value, jM11339copywmQWz5c$default, value, jM11375getTransparent0d7_KjU, jM11375getTransparent0d7_KjU, jM11375getTransparent0d7_KjU, jM11375getTransparent0d7_KjU, value2, value3, selectionColors2, value4, value5, jM11339copywmQWz5c$default2, value6, value7, value8, jM11339copywmQWz5c$default3, value9, value10, value11, jM11339copywmQWz5c$default4, value12, value13, value14, jM11339copywmQWz5c$default5, value15, value16, value16, jM11339copywmQWz5c$default6, value16, value17, value18, jM11339copywmQWz5c$default7, value19, value20, value21, jM11339copywmQWz5c$default8, value22, value23, value24, jM11339copywmQWz5c$default9, value25, composer, i12, ((i >> 15) & 65534) | (i13 & 458752) | (i13 & 3670016) | (i13 & 29360128) | (i13 & 234881024) | (i13 & 1879048192), i17, i21, (i22 & 14) | 3072 | (i22 & 112) | (i22 & 896), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColorsM9626colors0hiis_0;
    }

    /* compiled from: TextFieldDefaults.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.TextFieldDefaults$TextFieldDecorationBox$3 */
    public static final class C16613 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ TextFieldColors $colors;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ InteractionSource $interactionSource;
        public final /* synthetic */ boolean $isError;
        public final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16613(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape) {
            super(2);
            z = z;
            z = z2;
            interactionSource = interactionSource;
            textFieldColors = textFieldColors;
            shape = shape;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1171460386, i, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:1333)");
            }
            TextFieldDefaults.INSTANCE.ContainerBox(z, z, interactionSource, textFieldColors, shape, composer, ProfileVerifier.CompilationStatus.f342xf2722a21, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:287:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:501:? A[RETURN, SYNTHETIC] */
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use overload with prefix and suffix parameters")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void TextFieldDecorationBox(String str, Function2 function2, boolean z, boolean z2, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z3, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2 function27, Composer composer, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        Function2 function28;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Shape shape2;
        TextFieldColors textFieldColorsColors;
        PaddingValues paddingValuesM9984contentPaddingWithLabela9UjIt4$default;
        Function2 function29;
        Function2 function210;
        Function2 function211;
        Function2 function2ComposableLambda;
        Shape shape3;
        TextFieldColors textFieldColors2;
        boolean z4;
        PaddingValues paddingValues2;
        Function2 function212;
        Function2 function213;
        Function2 function214;
        Composer composer2;
        boolean z5;
        Function2 function215;
        Function2 function216;
        Function2 function217;
        Function2 function218;
        Function2 function219;
        Shape shape4;
        TextFieldColors textFieldColors3;
        PaddingValues paddingValues3;
        Function2 function220;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1224712461);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                i4 |= composerStartRestartGroup.changed(z) ? 256 : 128;
            }
            int i14 = 1024;
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                int i15 = 8192;
                if ((i3 & 16) == 0) {
                    if ((i & CpioConstants.C_ISBLK) == 0) {
                        i4 |= composerStartRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                    }
                    if ((i3 & 32) == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    } else if ((i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                        i4 |= composerStartRestartGroup.changed(interactionSource) ? 131072 : 65536;
                    }
                    i5 = i3 & 64;
                    if (i5 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
                    }
                    i6 = i3 & 128;
                    if (i6 == 0) {
                        i4 |= 12582912;
                        function28 = function22;
                    } else {
                        function28 = function22;
                        if ((i & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function28) ? 8388608 : 4194304;
                        }
                    }
                    i7 = i3 & 256;
                    if (i7 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function23) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    i8 = i3 & 512;
                    if (i8 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                    }
                    i9 = i3 & 1024;
                    if (i9 == 0) {
                        i10 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i10 = i2 | (composerStartRestartGroup.changedInstance(function25) ? 4 : 2);
                    } else {
                        i10 = i2;
                    }
                    i11 = i3 & 2048;
                    if (i11 == 0) {
                        i10 |= 48;
                    } else if ((i2 & 48) == 0) {
                        i10 |= composerStartRestartGroup.changedInstance(function26) ? 32 : 16;
                    }
                    if ((i2 & 384) == 0) {
                        i10 |= ((i3 & 4096) == 0 && composerStartRestartGroup.changed(shape)) ? 256 : 128;
                    }
                    if ((i2 & 3072) == 0) {
                        if ((i3 & 8192) == 0 && composerStartRestartGroup.changed(textFieldColors)) {
                            i14 = 2048;
                        }
                        i10 |= i14;
                    }
                    if ((i2 & CpioConstants.C_ISBLK) == 0) {
                        if ((i3 & 16384) == 0 && composerStartRestartGroup.changed(paddingValues)) {
                            i15 = 16384;
                        }
                        i10 |= i15;
                    }
                    i12 = i3 & 32768;
                    if (i12 == 0) {
                        i10 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    } else if ((i2 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                        i10 |= composerStartRestartGroup.changedInstance(function27) ? 131072 : 65536;
                    }
                    if ((i3 & 65536) == 0) {
                        i10 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i10 |= composerStartRestartGroup.changed(this) ? 1048576 : 524288;
                    }
                    i13 = i10;
                    if ((i4 & 306783379) == 306783378 || (599187 & i13) != 599186 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            boolean z6 = i5 == 0 ? false : z3;
                            if (i6 != 0) {
                                function28 = null;
                            }
                            Function2 function221 = i7 == 0 ? null : function23;
                            Function2 function222 = i8 == 0 ? null : function24;
                            Function2 function223 = i9 == 0 ? null : function25;
                            Function2 function224 = i11 == 0 ? function26 : null;
                            if ((i3 & 4096) == 0) {
                                shape2 = INSTANCE.getShape(composerStartRestartGroup, 6);
                                i13 &= -897;
                            } else {
                                shape2 = shape;
                            }
                            if ((i3 & 8192) == 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i13 >> 18) & 14);
                                i13 &= -7169;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 16384) == 0) {
                                if (function28 == null) {
                                    paddingValuesM9984contentPaddingWithLabela9UjIt4$default = m9985contentPaddingWithoutLabela9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    paddingValuesM9984contentPaddingWithLabela9UjIt4$default = m9984contentPaddingWithLabela9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i13 &= -57345;
                            } else {
                                paddingValuesM9984contentPaddingWithLabela9UjIt4$default = paddingValues;
                            }
                            if (i12 == 0) {
                                function29 = function221;
                                function210 = function222;
                                function211 = function223;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1171460386, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.3
                                    public final /* synthetic */ TextFieldColors $colors;
                                    public final /* synthetic */ boolean $enabled;
                                    public final /* synthetic */ InteractionSource $interactionSource;
                                    public final /* synthetic */ boolean $isError;
                                    public final /* synthetic */ Shape $shape;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public C16613(boolean z7, boolean z62, InteractionSource interactionSource2, TextFieldColors textFieldColorsColors2, Shape shape22) {
                                        super(2);
                                        z = z7;
                                        z = z62;
                                        interactionSource = interactionSource2;
                                        textFieldColors = textFieldColorsColors2;
                                        shape = shape22;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer3, int i16) {
                                        if ((i16 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1171460386, i16, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:1333)");
                                        }
                                        TextFieldDefaults.INSTANCE.ContainerBox(z, z, interactionSource, textFieldColors, shape, composer3, ProfileVerifier.CompilationStatus.f342xf2722a21, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                });
                            } else {
                                function29 = function221;
                                function210 = function222;
                                function211 = function223;
                                function2ComposableLambda = function27;
                            }
                            shape3 = shape22;
                            textFieldColors2 = textFieldColorsColors2;
                            z4 = z62;
                            paddingValues2 = paddingValuesM9984contentPaddingWithLabela9UjIt4$default;
                            function212 = function28;
                            function213 = function224;
                            function214 = function29;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 4096) != 0) {
                                i13 &= -897;
                            }
                            if ((i3 & 8192) != 0) {
                                i13 &= -7169;
                            }
                            if ((i3 & 16384) != 0) {
                                i13 &= -57345;
                            }
                            z4 = z3;
                            function214 = function23;
                            function210 = function24;
                            function211 = function25;
                            function213 = function26;
                            shape3 = shape;
                            textFieldColors2 = textFieldColors;
                            paddingValues2 = paddingValues;
                            function2ComposableLambda = function27;
                            function212 = function28;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1224712461, i4, i13, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:1335)");
                        }
                        int i16 = i4 & 2147483646;
                        int i17 = i13 << 6;
                        composer2 = composerStartRestartGroup;
                        DecorationBox(str, function2, z7, z2, visualTransformation, interactionSource2, z4, function212, function214, function210, function211, null, null, function213, shape3, textFieldColors2, paddingValues2, function2ComposableLambda, composer2, i16, (i13 & 14) | 432 | (i17 & 7168) | (57344 & i17) | (458752 & i17) | (3670016 & i17) | (29360128 & i17) | (i17 & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z4;
                        function215 = function212;
                        function216 = function214;
                        function217 = function210;
                        function218 = function211;
                        function219 = function213;
                        shape4 = shape3;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function220 = function2ComposableLambda;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        z5 = z3;
                        function216 = function23;
                        function217 = function24;
                        function219 = function26;
                        shape4 = shape;
                        textFieldColors3 = textFieldColors;
                        paddingValues3 = paddingValues;
                        function220 = function27;
                        composer2 = composerStartRestartGroup;
                        function215 = function28;
                        function218 = function25;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.4
                            public final /* synthetic */ int $$changed;
                            public final /* synthetic */ int $$changed1;
                            public final /* synthetic */ int $$default;
                            public final /* synthetic */ TextFieldColors $colors;
                            public final /* synthetic */ Function2<Composer, Integer, Unit> $container;
                            public final /* synthetic */ PaddingValues $contentPadding;
                            public final /* synthetic */ boolean $enabled;
                            public final /* synthetic */ Function2<Composer, Integer, Unit> $innerTextField;
                            public final /* synthetic */ InteractionSource $interactionSource;
                            public final /* synthetic */ boolean $isError;
                            public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                            public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                            public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                            public final /* synthetic */ Shape $shape;
                            public final /* synthetic */ boolean $singleLine;
                            public final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
                            public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                            public final /* synthetic */ String $value;
                            public final /* synthetic */ VisualTransformation $visualTransformation;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public C16624(String str2, Function2<? super Composer, ? super Integer, Unit> function225, boolean z7, boolean z22, VisualTransformation visualTransformation2, InteractionSource interactionSource2, boolean z52, Function2<? super Composer, ? super Integer, Unit> function2152, Function2<? super Composer, ? super Integer, Unit> function2162, Function2<? super Composer, ? super Integer, Unit> function2172, Function2<? super Composer, ? super Integer, Unit> function2182, Function2<? super Composer, ? super Integer, Unit> function2192, Shape shape42, TextFieldColors textFieldColors32, PaddingValues paddingValues32, Function2<? super Composer, ? super Integer, Unit> function2202, int i18, int i22, int i32) {
                                super(2);
                                str = str2;
                                function2 = function225;
                                z = z7;
                                z = z22;
                                visualTransformation = visualTransformation2;
                                interactionSource = interactionSource2;
                                z = z52;
                                function2 = function2152;
                                function2 = function2162;
                                function2 = function2172;
                                function2 = function2182;
                                function2 = function2192;
                                shape = shape42;
                                textFieldColors = textFieldColors32;
                                paddingValues = paddingValues32;
                                function2 = function2202;
                                i = i18;
                                i = i22;
                                i = i32;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer3, int i18) {
                                TextFieldDefaults.this.TextFieldDecorationBox(str, function2, z, z, visualTransformation, interactionSource, z, function2, function2, function2, function2, function2, shape, textFieldColors, paddingValues, function2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= CpioConstants.C_ISBLK;
                if ((i32 & 32) == 0) {
                }
                i5 = i32 & 64;
                if (i5 == 0) {
                }
                i6 = i32 & 128;
                if (i6 == 0) {
                }
                i7 = i32 & 256;
                if (i7 == 0) {
                }
                i8 = i32 & 512;
                if (i8 == 0) {
                }
                i9 = i32 & 1024;
                if (i9 == 0) {
                }
                i11 = i32 & 2048;
                if (i11 == 0) {
                }
                if ((i22 & 384) == 0) {
                }
                if ((i22 & 3072) == 0) {
                }
                if ((i22 & CpioConstants.C_ISBLK) == 0) {
                }
                i12 = i32 & 32768;
                if (i12 == 0) {
                }
                if ((i32 & 65536) == 0) {
                }
                i13 = i10;
                if ((i4 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i18 & 1) != 0) {
                        if (i5 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if ((i32 & 4096) == 0) {
                        }
                        if ((i32 & 8192) == 0) {
                        }
                        if ((i32 & 16384) == 0) {
                        }
                        if (i12 == 0) {
                        }
                        shape3 = shape22;
                        textFieldColors2 = textFieldColorsColors2;
                        z4 = z62;
                        paddingValues2 = paddingValuesM9984contentPaddingWithLabela9UjIt4$default;
                        function212 = function28;
                        function213 = function224;
                        function214 = function29;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i162 = i4 & 2147483646;
                        int i172 = i13 << 6;
                        composer2 = composerStartRestartGroup;
                        DecorationBox(str2, function225, z7, z22, visualTransformation2, interactionSource2, z4, function212, function214, function210, function211, null, null, function213, shape3, textFieldColors2, paddingValues2, function2ComposableLambda, composer2, i162, (i13 & 14) | 432 | (i172 & 7168) | (57344 & i172) | (458752 & i172) | (3670016 & i172) | (29360128 & i172) | (i172 & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z52 = z4;
                        function2152 = function212;
                        function2162 = function214;
                        function2172 = function210;
                        function2182 = function211;
                        function2192 = function213;
                        shape42 = shape3;
                        textFieldColors32 = textFieldColors2;
                        paddingValues32 = paddingValues2;
                        function2202 = function2ComposableLambda;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            int i152 = 8192;
            if ((i32 & 16) == 0) {
            }
            if ((i32 & 32) == 0) {
            }
            i5 = i32 & 64;
            if (i5 == 0) {
            }
            i6 = i32 & 128;
            if (i6 == 0) {
            }
            i7 = i32 & 256;
            if (i7 == 0) {
            }
            i8 = i32 & 512;
            if (i8 == 0) {
            }
            i9 = i32 & 1024;
            if (i9 == 0) {
            }
            i11 = i32 & 2048;
            if (i11 == 0) {
            }
            if ((i22 & 384) == 0) {
            }
            if ((i22 & 3072) == 0) {
            }
            if ((i22 & CpioConstants.C_ISBLK) == 0) {
            }
            i12 = i32 & 32768;
            if (i12 == 0) {
            }
            if ((i32 & 65536) == 0) {
            }
            i13 = i10;
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        int i142 = 1024;
        if ((i32 & 8) == 0) {
        }
        int i1522 = 8192;
        if ((i32 & 16) == 0) {
        }
        if ((i32 & 32) == 0) {
        }
        i5 = i32 & 64;
        if (i5 == 0) {
        }
        i6 = i32 & 128;
        if (i6 == 0) {
        }
        i7 = i32 & 256;
        if (i7 == 0) {
        }
        i8 = i32 & 512;
        if (i8 == 0) {
        }
        i9 = i32 & 1024;
        if (i9 == 0) {
        }
        i11 = i32 & 2048;
        if (i11 == 0) {
        }
        if ((i22 & 384) == 0) {
        }
        if ((i22 & 3072) == 0) {
        }
        if ((i22 & CpioConstants.C_ISBLK) == 0) {
        }
        i12 = i32 & 32768;
        if (i12 == 0) {
        }
        if ((i32 & 65536) == 0) {
        }
        i13 = i10;
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: TextFieldDefaults.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.TextFieldDefaults$OutlinedTextFieldDecorationBox$3 */
    public static final class C16573 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ TextFieldColors $colors;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ InteractionSource $interactionSource;
        public final /* synthetic */ boolean $isError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16573(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors) {
            super(2);
            z = z;
            z = z2;
            interactionSource = interactionSource;
            textFieldColors = textFieldColors;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(144282315, i, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:1377)");
            }
            OutlinedTextFieldDefaults.INSTANCE.m9625ContainerBoxnbWgWpA(z, z, interactionSource, textFieldColors, null, 0.0f, 0.0f, composer, 12582912, 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:249:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:445:? A[RETURN, SYNTHETIC] */
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use overload with prefix and suffix parameters")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void OutlinedTextFieldDecorationBox(String str, Function2 function2, boolean z, boolean z2, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z3, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2 function27, Composer composer, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        TextFieldColors textFieldColorsColors;
        PaddingValues paddingValuesM9624contentPaddinga9UjIt4$default;
        Function2 function28;
        Function2 function29;
        Function2 function2ComposableLambda;
        TextFieldColors textFieldColors2;
        Function2 function210;
        boolean z4;
        PaddingValues paddingValues2;
        Function2 function211;
        Function2 function212;
        Composer composer2;
        boolean z5;
        Function2 function213;
        Function2 function214;
        Function2 function215;
        Function2 function216;
        Function2 function217;
        TextFieldColors textFieldColors3;
        PaddingValues paddingValues3;
        Function2 function218;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(508645792);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                i4 |= composerStartRestartGroup.changed(z) ? 256 : 128;
            }
            int i13 = 1024;
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((i3 & 16) != 0) {
                    i4 |= CpioConstants.C_ISBLK;
                } else {
                    if ((i & CpioConstants.C_ISBLK) == 0) {
                        i4 |= composerStartRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                    }
                    if ((i3 & 32) == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    } else if ((i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                        i4 |= composerStartRestartGroup.changed(interactionSource) ? 131072 : 65536;
                    }
                    i5 = i3 & 64;
                    if (i5 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
                    }
                    i6 = i3 & 128;
                    if (i6 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                    }
                    i7 = i3 & 256;
                    if (i7 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function23) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    i8 = i3 & 512;
                    if (i8 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                    }
                    i9 = i3 & 1024;
                    if (i9 == 0) {
                        i10 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i10 = i2 | (composerStartRestartGroup.changedInstance(function25) ? 4 : 2);
                    } else {
                        i10 = i2;
                    }
                    i11 = i3 & 2048;
                    if (i11 == 0) {
                        i10 |= 48;
                    } else if ((i2 & 48) == 0) {
                        i10 |= composerStartRestartGroup.changedInstance(function26) ? 32 : 16;
                    }
                    if ((i2 & 384) == 0) {
                        i10 |= ((i3 & 4096) == 0 && composerStartRestartGroup.changed(textFieldColors)) ? 256 : 128;
                    }
                    if ((i2 & 3072) == 0) {
                        if ((i3 & 8192) == 0 && composerStartRestartGroup.changed(paddingValues)) {
                            i13 = 2048;
                        }
                        i10 |= i13;
                    }
                    int i14 = i10;
                    i12 = i3 & 16384;
                    if (i12 != 0) {
                        if ((i2 & CpioConstants.C_ISBLK) == 0) {
                            i14 |= composerStartRestartGroup.changedInstance(function27) ? 16384 : 8192;
                        }
                        if ((i4 & 306783379) != 306783378 || (i14 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                boolean z6 = i5 == 0 ? false : z3;
                                Function2 function219 = i6 == 0 ? null : function22;
                                Function2 function220 = i7 == 0 ? null : function23;
                                Function2 function221 = i8 == 0 ? null : function24;
                                Function2 function222 = i9 == 0 ? null : function25;
                                Function2 function223 = i11 == 0 ? function26 : null;
                                if ((i3 & 4096) == 0) {
                                    textFieldColorsColors = OutlinedTextFieldDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                                    i14 &= -897;
                                } else {
                                    textFieldColorsColors = textFieldColors;
                                }
                                if ((i3 & 8192) == 0) {
                                    paddingValuesM9624contentPaddinga9UjIt4$default = OutlinedTextFieldDefaults.m9624contentPaddinga9UjIt4$default(OutlinedTextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i14 &= -7169;
                                } else {
                                    paddingValuesM9624contentPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i12 == 0) {
                                    function28 = function221;
                                    function29 = function222;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 144282315, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.3
                                        public final /* synthetic */ TextFieldColors $colors;
                                        public final /* synthetic */ boolean $enabled;
                                        public final /* synthetic */ InteractionSource $interactionSource;
                                        public final /* synthetic */ boolean $isError;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public C16573(boolean z7, boolean z62, InteractionSource interactionSource2, TextFieldColors textFieldColorsColors2) {
                                            super(2);
                                            z = z7;
                                            z = z62;
                                            interactionSource = interactionSource2;
                                            textFieldColors = textFieldColorsColors2;
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer3, int i15) {
                                            if ((i15 & 3) == 2 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(144282315, i15, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:1377)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m9625ContainerBoxnbWgWpA(z, z, interactionSource, textFieldColors, null, 0.0f, 0.0f, composer3, 12582912, 112);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    });
                                } else {
                                    function28 = function221;
                                    function29 = function222;
                                    function2ComposableLambda = function27;
                                }
                                textFieldColors2 = textFieldColorsColors2;
                                function210 = function219;
                                z4 = z62;
                                paddingValues2 = paddingValuesM9624contentPaddinga9UjIt4$default;
                                function211 = function220;
                                function212 = function223;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 4096) != 0) {
                                    i14 &= -897;
                                }
                                if ((i3 & 8192) != 0) {
                                    i14 &= -7169;
                                }
                                z4 = z3;
                                function210 = function22;
                                function211 = function23;
                                function28 = function24;
                                function29 = function25;
                                function212 = function26;
                                textFieldColors2 = textFieldColors;
                                paddingValues2 = paddingValues;
                                function2ComposableLambda = function27;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(508645792, i4, i14, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:1379)");
                            }
                            int i15 = i14 << 6;
                            composer2 = composerStartRestartGroup;
                            OutlinedTextFieldDefaults.INSTANCE.DecorationBox(str, function2, z7, z2, visualTransformation, interactionSource2, z4, function210, function211, function28, function29, null, null, function212, textFieldColors2, paddingValues2, function2ComposableLambda, composer2, i4 & 2147483646, (i14 & 14) | 12583344 | (i15 & 7168) | (57344 & i15) | (458752 & i15) | (i15 & 3670016), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z4;
                            function213 = function210;
                            function214 = function211;
                            function215 = function28;
                            function216 = function29;
                            function217 = function212;
                            textFieldColors3 = textFieldColors2;
                            paddingValues3 = paddingValues2;
                            function218 = function2ComposableLambda;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            function213 = function22;
                            function214 = function23;
                            function215 = function24;
                            function216 = function25;
                            function217 = function26;
                            textFieldColors3 = textFieldColors;
                            paddingValues3 = paddingValues;
                            function218 = function27;
                            composer2 = composerStartRestartGroup;
                            z5 = z3;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.4
                                public final /* synthetic */ int $$changed;
                                public final /* synthetic */ int $$changed1;
                                public final /* synthetic */ int $$default;
                                public final /* synthetic */ TextFieldColors $colors;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $container;
                                public final /* synthetic */ PaddingValues $contentPadding;
                                public final /* synthetic */ boolean $enabled;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $innerTextField;
                                public final /* synthetic */ InteractionSource $interactionSource;
                                public final /* synthetic */ boolean $isError;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                                public final /* synthetic */ boolean $singleLine;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
                                public final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                                public final /* synthetic */ String $value;
                                public final /* synthetic */ VisualTransformation $visualTransformation;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C16584(String str2, Function2<? super Composer, ? super Integer, Unit> function224, boolean z7, boolean z22, VisualTransformation visualTransformation2, InteractionSource interactionSource2, boolean z52, Function2<? super Composer, ? super Integer, Unit> function2132, Function2<? super Composer, ? super Integer, Unit> function2142, Function2<? super Composer, ? super Integer, Unit> function2152, Function2<? super Composer, ? super Integer, Unit> function2162, Function2<? super Composer, ? super Integer, Unit> function2172, TextFieldColors textFieldColors32, PaddingValues paddingValues32, Function2<? super Composer, ? super Integer, Unit> function2182, int i16, int i22, int i32) {
                                    super(2);
                                    str = str2;
                                    function2 = function224;
                                    z = z7;
                                    z = z22;
                                    visualTransformation = visualTransformation2;
                                    interactionSource = interactionSource2;
                                    z = z52;
                                    function2 = function2132;
                                    function2 = function2142;
                                    function2 = function2152;
                                    function2 = function2162;
                                    function2 = function2172;
                                    textFieldColors = textFieldColors32;
                                    paddingValues = paddingValues32;
                                    function2 = function2182;
                                    i = i16;
                                    i = i22;
                                    i = i32;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer3, int i16) {
                                    TextFieldDefaults.this.OutlinedTextFieldDecorationBox(str, function2, z, z, visualTransformation, interactionSource, z, function2, function2, function2, function2, function2, textFieldColors, paddingValues, function2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i14 |= CpioConstants.C_ISBLK;
                    if ((i4 & 306783379) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i16 & 1) != 0) {
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i11 == 0) {
                            }
                            if ((i32 & 4096) == 0) {
                            }
                            if ((i32 & 8192) == 0) {
                            }
                            if (i12 == 0) {
                            }
                            textFieldColors2 = textFieldColorsColors2;
                            function210 = function219;
                            z4 = z62;
                            paddingValues2 = paddingValuesM9624contentPaddinga9UjIt4$default;
                            function211 = function220;
                            function212 = function223;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i152 = i14 << 6;
                            composer2 = composerStartRestartGroup;
                            OutlinedTextFieldDefaults.INSTANCE.DecorationBox(str2, function224, z7, z22, visualTransformation2, interactionSource2, z4, function210, function211, function28, function29, null, null, function212, textFieldColors2, paddingValues2, function2ComposableLambda, composer2, i4 & 2147483646, (i14 & 14) | 12583344 | (i152 & 7168) | (57344 & i152) | (458752 & i152) | (i152 & 3670016), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z52 = z4;
                            function2132 = function210;
                            function2142 = function211;
                            function2152 = function28;
                            function2162 = function29;
                            function2172 = function212;
                            textFieldColors32 = textFieldColors2;
                            paddingValues32 = paddingValues2;
                            function2182 = function2ComposableLambda;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i32 & 32) == 0) {
                }
                i5 = i32 & 64;
                if (i5 == 0) {
                }
                i6 = i32 & 128;
                if (i6 == 0) {
                }
                i7 = i32 & 256;
                if (i7 == 0) {
                }
                i8 = i32 & 512;
                if (i8 == 0) {
                }
                i9 = i32 & 1024;
                if (i9 == 0) {
                }
                i11 = i32 & 2048;
                if (i11 == 0) {
                }
                if ((i22 & 384) == 0) {
                }
                if ((i22 & 3072) == 0) {
                }
                int i142 = i10;
                i12 = i32 & 16384;
                if (i12 != 0) {
                }
                if ((i4 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i32 & 16) != 0) {
            }
            if ((i32 & 32) == 0) {
            }
            i5 = i32 & 64;
            if (i5 == 0) {
            }
            i6 = i32 & 128;
            if (i6 == 0) {
            }
            i7 = i32 & 256;
            if (i7 == 0) {
            }
            i8 = i32 & 512;
            if (i8 == 0) {
            }
            i9 = i32 & 1024;
            if (i9 == 0) {
            }
            i11 = i32 & 2048;
            if (i11 == 0) {
            }
            if ((i22 & 384) == 0) {
            }
            if ((i22 & 3072) == 0) {
            }
            int i1422 = i10;
            i12 = i32 & 16384;
            if (i12 != 0) {
            }
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i32 & 4) == 0) {
        }
        int i132 = 1024;
        if ((i32 & 8) == 0) {
        }
        if ((i32 & 16) != 0) {
        }
        if ((i32 & 32) == 0) {
        }
        i5 = i32 & 64;
        if (i5 == 0) {
        }
        i6 = i32 & 128;
        if (i6 == 0) {
        }
        i7 = i32 & 256;
        if (i7 == 0) {
        }
        i8 = i32 & 512;
        if (i8 == 0) {
        }
        i9 = i32 & 1024;
        if (i9 == 0) {
        }
        i11 = i32 & 2048;
        if (i11 == 0) {
        }
        if ((i22 & 384) == 0) {
        }
        if ((i22 & 3072) == 0) {
        }
        int i14222 = i10;
        i12 = i32 & 16384;
        if (i12 != 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @ExperimentalMaterial3Api
    @NotNull
    /* renamed from: indicatorLine-gv0btCI */
    public final Modifier m10003indicatorLinegv0btCI(@NotNull Modifier modifier, final boolean z, final boolean z2, @NotNull final InteractionSource interactionSource, @NotNull final TextFieldColors textFieldColors, final float f, final float f2) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                inspectorInfo.setName("indicatorLine");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("isError", Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("interactionSource", interactionSource);
                inspectorInfo.getProperties().set("colors", textFieldColors);
                inspectorInfo.getProperties().set("focusedIndicatorLineThickness", C2046Dp.m13664boximpl(f));
                inspectorInfo.getProperties().set("unfocusedIndicatorLineThickness", C2046Dp.m13664boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material3.TextFieldDefaults$indicatorLine$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier2, @Nullable Composer composer, int i) {
                composer.startReplaceableGroup(-891038934);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-891038934, i, -1, "androidx.compose.material3.TextFieldDefaults.indicatorLine.<anonymous> (TextFieldDefaults.kt:141)");
                }
                Modifier modifierDrawIndicatorLine = TextFieldKt.drawIndicatorLine(Modifier.INSTANCE, (BorderStroke) TextFieldDefaultsKt.m10013animateBorderStrokeAsStateNuRrP5Q(z, z2, interactionSource, textFieldColors, f, f2, composer, 0).getValue());
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierDrawIndicatorLine;
            }
        });
    }

    static {
        float fM13666constructorimpl = C2046Dp.m13666constructorimpl(1);
        UnfocusedIndicatorThickness = fM13666constructorimpl;
        float fM13666constructorimpl2 = C2046Dp.m13666constructorimpl(2);
        FocusedIndicatorThickness = fM13666constructorimpl2;
        UnfocusedBorderThickness = fM13666constructorimpl;
        FocusedBorderThickness = fM13666constructorimpl2;
    }
}
