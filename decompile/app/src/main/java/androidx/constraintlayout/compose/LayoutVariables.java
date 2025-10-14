package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLString;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ConstraintSetParser.kt */
@Metadata(m7104d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001J\"\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00072\u0006\u0010\u000f\u001a\u00020\u0005J\u001e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eJ6\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\fJ&\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00052\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0006j\b\u0012\u0004\u0012\u00020\u0005`\u0007J\u0016\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u000eRJ\u0010\u0003\u001a>\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0006j\b\u0012\u0004\u0012\u00020\u0005`\u00070\u0004j\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0006j\b\u0012\u0004\u0012\u00020\u0005`\u0007`\bX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n`\bX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f`\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m7105d2 = {"Landroidx/constraintlayout/compose/LayoutVariables;", "", "()V", "arrayIds", "Ljava/util/HashMap;", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Lkotlin/collections/HashMap;", "generators", "Landroidx/constraintlayout/compose/GeneratedValue;", "margins", "", "get", "", "elementName", "getList", "put", "", TtmlNode.START, "incrementBy", "from", "to", "step", "prefix", "postfix", "element", "elements", "putOverride", "value", "compose_release"}, m7106k = 1, m7107mv = {1, 5, 1}, m7109xi = 48)
/* loaded from: classes.dex */
public final class LayoutVariables {

    @NotNull
    public final HashMap<String, Integer> margins = new HashMap<>();

    @NotNull
    public final HashMap<String, GeneratedValue> generators = new HashMap<>();

    @NotNull
    public final HashMap<String, ArrayList<String>> arrayIds = new HashMap<>();

    public final void put(@NotNull String elementName, int element) {
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        this.margins.put(elementName, Integer.valueOf(element));
    }

    public final void put(@NotNull String elementName, float start, float incrementBy) {
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        if (this.generators.containsKey(elementName) && (this.generators.get(elementName) instanceof OverrideValue)) {
            return;
        }
        this.generators.put(elementName, new Generator(start, incrementBy));
    }

    public final void put(@NotNull String elementName, float from, float to, float step, @NotNull String prefix, @NotNull String postfix) {
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        if (this.generators.containsKey(elementName) && (this.generators.get(elementName) instanceof OverrideValue)) {
            return;
        }
        FiniteGenerator finiteGenerator = new FiniteGenerator(from, to, step, prefix, postfix);
        this.generators.put(elementName, finiteGenerator);
        this.arrayIds.put(elementName, finiteGenerator.array());
    }

    public final void putOverride(@NotNull String elementName, float value) {
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        this.generators.put(elementName, new OverrideValue(value));
    }

    public final float get(@NotNull Object elementName) {
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        if (elementName instanceof CLString) {
            String strContent = ((CLString) elementName).content();
            if (this.generators.containsKey(strContent)) {
                GeneratedValue generatedValue = this.generators.get(strContent);
                Intrinsics.checkNotNull(generatedValue);
                return generatedValue.getValue();
            }
            if (!this.margins.containsKey(strContent)) {
                return 0.0f;
            }
            Intrinsics.checkNotNull(this.margins.get(strContent));
            return r2.intValue();
        }
        if (elementName instanceof CLNumber) {
            return ((CLNumber) elementName).getFloat();
        }
        return 0.0f;
    }

    @Nullable
    public final ArrayList<String> getList(@NotNull String elementName) {
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        if (this.arrayIds.containsKey(elementName)) {
            return this.arrayIds.get(elementName);
        }
        return null;
    }

    public final void put(@NotNull String elementName, @NotNull ArrayList<String> elements) {
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.arrayIds.put(elementName, elements);
    }
}
