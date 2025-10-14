package androidx.compose.p003ui.tooling.preview;

import androidx.compose.p003ui.tooling.preview.Preview;
import com.blackhub.bronline.game.gui.fishing.FishingConstants;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* compiled from: MultiPreviews.android.kt */
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Metadata(m7104d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m7105d2 = {"Landroidx/compose/ui/tooling/preview/PreviewFontScale;", "", "ui-tooling-preview_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@Preview.Container({@Preview(fontScale = 0.85f, name = "85%"), @Preview(fontScale = 1.0f, name = "100%"), @Preview(fontScale = 1.15f, name = "115%"), @Preview(fontScale = 1.3f, name = "130%"), @Preview(fontScale = 1.5f, name = "150%"), @Preview(fontScale = FishingConstants.DIFFERENCE_WITH_IOS, name = "180%"), @Preview(fontScale = 2.0f, name = "200%")})
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
/* loaded from: classes3.dex */
public @interface PreviewFontScale {
}
