package com.blackhub.bronline.game.p019ui.chat;

import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.blackhub.bronline.game.gui.chat.ChatUiState;
import com.blackhub.bronline.game.gui.chat.ChatViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChatGui.kt */
@SourceDebugExtension({"SMAP\nChatGui.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatGui.kt\ncom/blackhub/bronline/game/ui/chat/ChatGuiKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n*L\n1#1,25:1\n81#2,11:26\n*S KotlinDebug\n*F\n+ 1 ChatGui.kt\ncom/blackhub/bronline/game/ui/chat/ChatGuiKt\n*L\n12#1:26,11\n*E\n"})

public final class ChatGuiKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ChatGui(@Nullable Composer composer, final int i) {
        CreationExtras defaultViewModelCreationExtras;
        Composer composerStartRestartGroup = composer.startRestartGroup(-227327326);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-227327326, i, -1, "com.blackhub.bronline.game.ui.chat.ChatGui (ChatGui.kt:9)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel(ChatViewModel.class, current, null, null, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            final ChatViewModel chatViewModel = (ChatViewModel) viewModel;
            ChatUiState chatUiState = (ChatUiState) FlowExtKt.collectAsStateWithLifecycle(chatViewModel.getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 8, 7).getValue();
            char[] charArray = StringResources_androidKt.stringResource(chatUiState.getValidationChars(), composerStartRestartGroup, 0).toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
            ChatContentKt.ChatContent(chatUiState.getMessagesList(), chatUiState.getTimerSeconds(), charArray, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.chat.ChatGuiKt.ChatGui.1
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
                    chatViewModel.sendOnVoteClick();
                }
            }, new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.chat.ChatGuiKt.ChatGui.2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String text) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    chatViewModel.onButtonSendClick(text);
                }
            }, composerStartRestartGroup, 520);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.chat.ChatGuiKt.ChatGui.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    ChatGuiKt.ChatGui(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

