package androidx.compose.p003ui.focus;

import androidx.compose.p003ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;

/* compiled from: FocusProperties.kt */
@Metadata(m7104d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¨\u0006\u0007"}, m7105d2 = {"focusProperties", "Landroidx/compose/ui/Modifier;", PomReader.SCOPE, "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusProperties;", "", "Lkotlin/ExtensionFunctionType;", "ui_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class FocusPropertiesKt {
    @NotNull
    public static final Modifier focusProperties(@NotNull Modifier modifier, @NotNull Function1<? super FocusProperties, Unit> function1) {
        return modifier.then(new FocusPropertiesElement(new C1849xfe8f9d59(function1)));
    }
}
