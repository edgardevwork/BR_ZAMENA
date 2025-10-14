package com.blackhub.bronline.game.p019ui.widget.block;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.p019ui.panelinfo.PanelInfoContentKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HorizontalPagerBlock.kt */
/* loaded from: classes3.dex */
public final class ComposableSingletons$HorizontalPagerBlockKt {

    @NotNull
    public static final ComposableSingletons$HorizontalPagerBlockKt INSTANCE = new ComposableSingletons$HorizontalPagerBlockKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function3<Integer, Composer, Integer, Unit> f11258lambda1 = ComposableLambdaKt.composableLambdaInstance(-341014809, false, new Function3<Integer, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.ComposableSingletons$HorizontalPagerBlockKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Composer composer, Integer num2) {
            invoke(num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(int i, @Nullable Composer composer, int i2) {
            if ((i2 & 81) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-341014809, i2, -1, "com.blackhub.bronline.game.ui.widget.block.ComposableSingletons$HorizontalPagerBlockKt.lambda-1.<anonymous> (HorizontalPagerBlock.kt:89)");
                }
                PanelInfoContentKt.PanelInfoContent(null, StringExtensionKt.htmlTextToAnnotatedString("Каждый час по карте разбрасываются подарки, которые можно собрать.\n\nТолько это не так просто, ведь все любят подарки.\n\nКак только Вы увидите что подарки были разбросаны по карте, сразу отправляйтесь на поиски и найдите их первым как можно больше. "), StringExtensionKt.htmlTextToAnnotatedString("Собирать и открывать подарки, которые появляются\nпо всей карте раз в час.\n- Играть в снежки c другими игроками\n(Меню - Навигатор - Новый Год 2024 - Ближайшее место игры\nв снежки)\n- Выигрывать в мини-играх\n(Меню - Навигатор - Новый Год 2024 - Мини игры) Проходить сюжетный квест\n(Меню - Навигатор - Новый Год 2024 - Пройти квест)\n- Выполнять ежедневные задания у Cиняка\n(Меню - Навигатор - Новый Год 2024 - Синяк | Ежедневные задания)\n- Собирать и открывать подарки, которые появляются\nпо всей карте раз в час.\n- Играть в снежки c другими игроками\n(Меню - Навигатор - Новый Год 2024 - Ближайшее место игры\nв снежки)\n- Выигрывать в мини-играх\n(Меню - Навигатор - Новый Год 2024 - Мини игры)"), composer, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    @NotNull
    /* renamed from: getLambda-1$app_siteRelease, reason: not valid java name */
    public final Function3<Integer, Composer, Integer, Unit> m15041getLambda1$app_siteRelease() {
        return f11258lambda1;
    }
}

