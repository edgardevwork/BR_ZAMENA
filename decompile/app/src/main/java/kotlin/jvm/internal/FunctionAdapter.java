package kotlin.jvm.internal;

import com.caverock.androidsvg.SVG;
import kotlin.Function;
import kotlin.SinceKotlin;

@SinceKotlin(version = SVG.VERSION)
/* loaded from: classes7.dex */
public interface FunctionAdapter {
    Function<?> getFunctionDelegate();
}
