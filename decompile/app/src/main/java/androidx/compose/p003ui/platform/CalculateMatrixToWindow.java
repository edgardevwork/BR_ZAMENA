package androidx.compose.p003ui.platform;

import android.view.View;
import com.caverock.androidsvg.SVG;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jfrog.build.extractor.clientConfiguration.ClientConfigurationFields;

/* compiled from: AndroidComposeView.android.kt */
@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bb\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m7105d2 = {"Landroidx/compose/ui/platform/CalculateMatrixToWindow;", "", "calculateMatrixToWindow", "", SVG.View.NODE_NAME, "Landroid/view/View;", ClientConfigurationFields.MATRIX, "Landroidx/compose/ui/graphics/Matrix;", "calculateMatrixToWindow-EL8BTi8", "(Landroid/view/View;[F)V", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public interface CalculateMatrixToWindow {
    /* renamed from: calculateMatrixToWindow-EL8BTi8, reason: not valid java name */
    void mo12916calculateMatrixToWindowEL8BTi8(@NotNull View view, @NotNull float[] matrix);
}
