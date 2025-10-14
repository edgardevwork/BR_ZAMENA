package com.blackhub.bronline.game.gui.fractions;

import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsControlViewModel;
import com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsDocumentsViewModel;
import com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsMainViewModel;
import com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsQuestsViewModel;
import com.blackhub.bronline.game.gui.fractions.viewmodel.FractionsShopViewModel;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class GUIFractionSystem_MembersInjector implements MembersInjector<GUIFractionSystem> {
    public final Provider<MainViewModelFactory<FractionsControlViewModel>> controlVMFactoryProvider;
    public final Provider<MainViewModelFactory<FractionsDocumentsViewModel>> documentsVMFactoryProvider;
    public final Provider<MainViewModelFactory<JNIActivityViewModel>> mainActivityFactoryProvider;
    public final Provider<MainViewModelFactory<FractionsMainViewModel>> mainVMFactoryProvider;
    public final Provider<MainViewModelFactory<FractionsQuestsViewModel>> questsVMFactoryProvider;
    public final Provider<MainViewModelFactory<FractionsShopViewModel>> shopVMFactoryProvider;

    public GUIFractionSystem_MembersInjector(Provider<MainViewModelFactory<JNIActivityViewModel>> mainActivityFactoryProvider, Provider<MainViewModelFactory<FractionsMainViewModel>> mainVMFactoryProvider, Provider<MainViewModelFactory<FractionsQuestsViewModel>> questsVMFactoryProvider, Provider<MainViewModelFactory<FractionsDocumentsViewModel>> documentsVMFactoryProvider, Provider<MainViewModelFactory<FractionsShopViewModel>> shopVMFactoryProvider, Provider<MainViewModelFactory<FractionsControlViewModel>> controlVMFactoryProvider) {
        this.mainActivityFactoryProvider = mainActivityFactoryProvider;
        this.mainVMFactoryProvider = mainVMFactoryProvider;
        this.questsVMFactoryProvider = questsVMFactoryProvider;
        this.documentsVMFactoryProvider = documentsVMFactoryProvider;
        this.shopVMFactoryProvider = shopVMFactoryProvider;
        this.controlVMFactoryProvider = controlVMFactoryProvider;
    }

    public static MembersInjector<GUIFractionSystem> create(Provider<MainViewModelFactory<JNIActivityViewModel>> mainActivityFactoryProvider, Provider<MainViewModelFactory<FractionsMainViewModel>> mainVMFactoryProvider, Provider<MainViewModelFactory<FractionsQuestsViewModel>> questsVMFactoryProvider, Provider<MainViewModelFactory<FractionsDocumentsViewModel>> documentsVMFactoryProvider, Provider<MainViewModelFactory<FractionsShopViewModel>> shopVMFactoryProvider, Provider<MainViewModelFactory<FractionsControlViewModel>> controlVMFactoryProvider) {
        return new GUIFractionSystem_MembersInjector(mainActivityFactoryProvider, mainVMFactoryProvider, questsVMFactoryProvider, documentsVMFactoryProvider, shopVMFactoryProvider, controlVMFactoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(GUIFractionSystem instance) {
        injectMainActivityFactory(instance, this.mainActivityFactoryProvider.get());
        injectMainVMFactory(instance, this.mainVMFactoryProvider.get());
        injectQuestsVMFactory(instance, this.questsVMFactoryProvider.get());
        injectDocumentsVMFactory(instance, this.documentsVMFactoryProvider.get());
        injectShopVMFactory(instance, this.shopVMFactoryProvider.get());
        injectControlVMFactory(instance, this.controlVMFactoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.fractions.GUIFractionSystem.mainActivityFactory")
    public static void injectMainActivityFactory(GUIFractionSystem instance, MainViewModelFactory<JNIActivityViewModel> mainActivityFactory) {
        instance.mainActivityFactory = mainActivityFactory;
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.fractions.GUIFractionSystem.mainVMFactory")
    public static void injectMainVMFactory(GUIFractionSystem instance, MainViewModelFactory<FractionsMainViewModel> mainVMFactory) {
        instance.mainVMFactory = mainVMFactory;
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.fractions.GUIFractionSystem.questsVMFactory")
    public static void injectQuestsVMFactory(GUIFractionSystem instance, MainViewModelFactory<FractionsQuestsViewModel> questsVMFactory) {
        instance.questsVMFactory = questsVMFactory;
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.fractions.GUIFractionSystem.documentsVMFactory")
    public static void injectDocumentsVMFactory(GUIFractionSystem instance, MainViewModelFactory<FractionsDocumentsViewModel> documentsVMFactory) {
        instance.documentsVMFactory = documentsVMFactory;
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.fractions.GUIFractionSystem.shopVMFactory")
    public static void injectShopVMFactory(GUIFractionSystem instance, MainViewModelFactory<FractionsShopViewModel> shopVMFactory) {
        instance.shopVMFactory = shopVMFactory;
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.fractions.GUIFractionSystem.controlVMFactory")
    public static void injectControlVMFactory(GUIFractionSystem instance, MainViewModelFactory<FractionsControlViewModel> controlVMFactory) {
        instance.controlVMFactory = controlVMFactory;
    }
}
