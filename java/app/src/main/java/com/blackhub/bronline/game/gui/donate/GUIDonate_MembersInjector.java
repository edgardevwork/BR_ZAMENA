package com.blackhub.bronline.game.gui.donate;

import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassActivateViewModel;
import com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel;
import com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassPrizeListViewModel;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateDepositCoinsViewModel;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateMainViewModel;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateServiceViewModel;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateTileViewModel;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class GUIDonate_MembersInjector implements MembersInjector<GUIDonate> {
    public final Provider<MainViewModelFactory<BlackPassActivateViewModel>> blackPassActivateFactoryProvider;
    public final Provider<MainViewModelFactory<BlackPassMainViewModel>> blackPassMainFactoryProvider;
    public final Provider<MainViewModelFactory<BlackPassPrizeListViewModel>> blackPassPrizeListFactoryProvider;
    public final Provider<MainViewModelFactory<DonateDepositCoinsViewModel>> depositCoinsFactoryProvider;
    public final Provider<MainViewModelFactory<DonateMainViewModel>> donateFactoryProvider;
    public final Provider<MainViewModelFactory<DonateServiceViewModel>> donateServiceFactoryProvider;
    public final Provider<MainViewModelFactory<DonateTileViewModel>> donateTileFactoryProvider;
    public final Provider<MainViewModelFactory<JNIActivityViewModel>> mainActivityFactoryProvider;

    public GUIDonate_MembersInjector(Provider<MainViewModelFactory<JNIActivityViewModel>> mainActivityFactoryProvider, Provider<MainViewModelFactory<DonateMainViewModel>> donateFactoryProvider, Provider<MainViewModelFactory<DonateTileViewModel>> donateTileFactoryProvider, Provider<MainViewModelFactory<DonateDepositCoinsViewModel>> depositCoinsFactoryProvider, Provider<MainViewModelFactory<DonateServiceViewModel>> donateServiceFactoryProvider, Provider<MainViewModelFactory<BlackPassMainViewModel>> blackPassMainFactoryProvider, Provider<MainViewModelFactory<BlackPassActivateViewModel>> blackPassActivateFactoryProvider, Provider<MainViewModelFactory<BlackPassPrizeListViewModel>> blackPassPrizeListFactoryProvider) {
        this.mainActivityFactoryProvider = mainActivityFactoryProvider;
        this.donateFactoryProvider = donateFactoryProvider;
        this.donateTileFactoryProvider = donateTileFactoryProvider;
        this.depositCoinsFactoryProvider = depositCoinsFactoryProvider;
        this.donateServiceFactoryProvider = donateServiceFactoryProvider;
        this.blackPassMainFactoryProvider = blackPassMainFactoryProvider;
        this.blackPassActivateFactoryProvider = blackPassActivateFactoryProvider;
        this.blackPassPrizeListFactoryProvider = blackPassPrizeListFactoryProvider;
    }

    public static MembersInjector<GUIDonate> create(Provider<MainViewModelFactory<JNIActivityViewModel>> mainActivityFactoryProvider, Provider<MainViewModelFactory<DonateMainViewModel>> donateFactoryProvider, Provider<MainViewModelFactory<DonateTileViewModel>> donateTileFactoryProvider, Provider<MainViewModelFactory<DonateDepositCoinsViewModel>> depositCoinsFactoryProvider, Provider<MainViewModelFactory<DonateServiceViewModel>> donateServiceFactoryProvider, Provider<MainViewModelFactory<BlackPassMainViewModel>> blackPassMainFactoryProvider, Provider<MainViewModelFactory<BlackPassActivateViewModel>> blackPassActivateFactoryProvider, Provider<MainViewModelFactory<BlackPassPrizeListViewModel>> blackPassPrizeListFactoryProvider) {
        return new GUIDonate_MembersInjector(mainActivityFactoryProvider, donateFactoryProvider, donateTileFactoryProvider, depositCoinsFactoryProvider, donateServiceFactoryProvider, blackPassMainFactoryProvider, blackPassActivateFactoryProvider, blackPassPrizeListFactoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(GUIDonate instance) {
        injectMainActivityFactory(instance, this.mainActivityFactoryProvider.get());
        injectDonateFactory(instance, this.donateFactoryProvider.get());
        injectDonateTileFactory(instance, this.donateTileFactoryProvider.get());
        injectDepositCoinsFactory(instance, this.depositCoinsFactoryProvider.get());
        injectDonateServiceFactory(instance, this.donateServiceFactoryProvider.get());
        injectBlackPassMainFactory(instance, this.blackPassMainFactoryProvider.get());
        injectBlackPassActivateFactory(instance, this.blackPassActivateFactoryProvider.get());
        injectBlackPassPrizeListFactory(instance, this.blackPassPrizeListFactoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.donate.GUIDonate.mainActivityFactory")
    public static void injectMainActivityFactory(GUIDonate instance, MainViewModelFactory<JNIActivityViewModel> mainActivityFactory) {
        instance.mainActivityFactory = mainActivityFactory;
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.donate.GUIDonate.donateFactory")
    public static void injectDonateFactory(GUIDonate instance, MainViewModelFactory<DonateMainViewModel> donateFactory) {
        instance.donateFactory = donateFactory;
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.donate.GUIDonate.donateTileFactory")
    public static void injectDonateTileFactory(GUIDonate instance, MainViewModelFactory<DonateTileViewModel> donateTileFactory) {
        instance.donateTileFactory = donateTileFactory;
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.donate.GUIDonate.depositCoinsFactory")
    public static void injectDepositCoinsFactory(GUIDonate instance, MainViewModelFactory<DonateDepositCoinsViewModel> depositCoinsFactory) {
        instance.depositCoinsFactory = depositCoinsFactory;
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.donate.GUIDonate.donateServiceFactory")
    public static void injectDonateServiceFactory(GUIDonate instance, MainViewModelFactory<DonateServiceViewModel> donateServiceFactory) {
        instance.donateServiceFactory = donateServiceFactory;
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.donate.GUIDonate.blackPassMainFactory")
    public static void injectBlackPassMainFactory(GUIDonate instance, MainViewModelFactory<BlackPassMainViewModel> blackPassMainFactory) {
        instance.blackPassMainFactory = blackPassMainFactory;
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.donate.GUIDonate.blackPassActivateFactory")
    public static void injectBlackPassActivateFactory(GUIDonate instance, MainViewModelFactory<BlackPassActivateViewModel> blackPassActivateFactory) {
        instance.blackPassActivateFactory = blackPassActivateFactory;
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.donate.GUIDonate.blackPassPrizeListFactory")
    public static void injectBlackPassPrizeListFactory(GUIDonate instance, MainViewModelFactory<BlackPassPrizeListViewModel> blackPassPrizeListFactory) {
        instance.blackPassPrizeListFactory = blackPassPrizeListFactory;
    }
}
