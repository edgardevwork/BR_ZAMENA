package com.blackhub.bronline.game.gui.smieditor;

import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import com.blackhub.bronline.game.gui.smieditor.viewmodel.SmiEditorViewModel;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class GUISmiEditor_MembersInjector implements MembersInjector<GUISmiEditor> {
    public final Provider<MainViewModelFactory<JNIActivityViewModel>> mainActivityFactoryProvider;
    public final Provider<MainViewModelFactory<SmiEditorViewModel>> smiEditorFactoryProvider;

    public GUISmiEditor_MembersInjector(Provider<MainViewModelFactory<JNIActivityViewModel>> mainActivityFactoryProvider, Provider<MainViewModelFactory<SmiEditorViewModel>> smiEditorFactoryProvider) {
        this.mainActivityFactoryProvider = mainActivityFactoryProvider;
        this.smiEditorFactoryProvider = smiEditorFactoryProvider;
    }

    public static MembersInjector<GUISmiEditor> create(Provider<MainViewModelFactory<JNIActivityViewModel>> mainActivityFactoryProvider, Provider<MainViewModelFactory<SmiEditorViewModel>> smiEditorFactoryProvider) {
        return new GUISmiEditor_MembersInjector(mainActivityFactoryProvider, smiEditorFactoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(GUISmiEditor instance) {
        injectMainActivityFactory(instance, this.mainActivityFactoryProvider.get());
        injectSmiEditorFactory(instance, this.smiEditorFactoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.smieditor.GUISmiEditor.mainActivityFactory")
    public static void injectMainActivityFactory(GUISmiEditor instance, MainViewModelFactory<JNIActivityViewModel> mainActivityFactory) {
        instance.mainActivityFactory = mainActivityFactory;
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.smieditor.GUISmiEditor.smiEditorFactory")
    public static void injectSmiEditorFactory(GUISmiEditor instance, MainViewModelFactory<SmiEditorViewModel> smiEditorFactory) {
        instance.smiEditorFactory = smiEditorFactory;
    }
}
