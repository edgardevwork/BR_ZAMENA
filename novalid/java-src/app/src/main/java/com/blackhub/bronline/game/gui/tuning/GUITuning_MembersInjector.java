package com.blackhub.bronline.game.gui.tuning;

import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningCollapseViewModel;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningColorListViewModel;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDetailsListViewModel;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDiagnosticViewModel;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningMainViewModel;
import com.blackhub.bronline.game.gui.tuning.viewmodel.TuningViewCarViewModel;
import com.blackhub.bronline.launcher.viewmodel.MainViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class GUITuning_MembersInjector implements MembersInjector<GUITuning> {
    public final Provider<MainViewModelFactory<TuningCollapseViewModel>> collapseFactoryProvider;
    public final Provider<MainViewModelFactory<TuningColorListViewModel>> colorListFactoryProvider;
    public final Provider<MainViewModelFactory<TuningDetailsListViewModel>> detailsListFactoryProvider;
    public final Provider<MainViewModelFactory<TuningDiagnosticViewModel>> diagnosticFactoryProvider;
    public final Provider<MainViewModelFactory<JNIActivityViewModel>> mainActivityFactoryProvider;
    public final Provider<MainViewModelFactory<TuningMainViewModel>> tuningFactoryProvider;
    public final Provider<MainViewModelFactory<TuningViewCarViewModel>> viewCarFactoryProvider;

    public GUITuning_MembersInjector(Provider<MainViewModelFactory<JNIActivityViewModel>> mainActivityFactoryProvider, Provider<MainViewModelFactory<TuningMainViewModel>> tuningFactoryProvider, Provider<MainViewModelFactory<TuningViewCarViewModel>> viewCarFactoryProvider, Provider<MainViewModelFactory<TuningCollapseViewModel>> collapseFactoryProvider, Provider<MainViewModelFactory<TuningDiagnosticViewModel>> diagnosticFactoryProvider, Provider<MainViewModelFactory<TuningDetailsListViewModel>> detailsListFactoryProvider, Provider<MainViewModelFactory<TuningColorListViewModel>> colorListFactoryProvider) {
        this.mainActivityFactoryProvider = mainActivityFactoryProvider;
        this.tuningFactoryProvider = tuningFactoryProvider;
        this.viewCarFactoryProvider = viewCarFactoryProvider;
        this.collapseFactoryProvider = collapseFactoryProvider;
        this.diagnosticFactoryProvider = diagnosticFactoryProvider;
        this.detailsListFactoryProvider = detailsListFactoryProvider;
        this.colorListFactoryProvider = colorListFactoryProvider;
    }

    public static MembersInjector<GUITuning> create(Provider<MainViewModelFactory<JNIActivityViewModel>> mainActivityFactoryProvider, Provider<MainViewModelFactory<TuningMainViewModel>> tuningFactoryProvider, Provider<MainViewModelFactory<TuningViewCarViewModel>> viewCarFactoryProvider, Provider<MainViewModelFactory<TuningCollapseViewModel>> collapseFactoryProvider, Provider<MainViewModelFactory<TuningDiagnosticViewModel>> diagnosticFactoryProvider, Provider<MainViewModelFactory<TuningDetailsListViewModel>> detailsListFactoryProvider, Provider<MainViewModelFactory<TuningColorListViewModel>> colorListFactoryProvider) {
        return new GUITuning_MembersInjector(mainActivityFactoryProvider, tuningFactoryProvider, viewCarFactoryProvider, collapseFactoryProvider, diagnosticFactoryProvider, detailsListFactoryProvider, colorListFactoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(GUITuning instance) {
        injectMainActivityFactory(instance, this.mainActivityFactoryProvider.get());
        injectTuningFactory(instance, this.tuningFactoryProvider.get());
        injectViewCarFactory(instance, this.viewCarFactoryProvider.get());
        injectCollapseFactory(instance, this.collapseFactoryProvider.get());
        injectDiagnosticFactory(instance, this.diagnosticFactoryProvider.get());
        injectDetailsListFactory(instance, this.detailsListFactoryProvider.get());
        injectColorListFactory(instance, this.colorListFactoryProvider.get());
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.tuning.GUITuning.mainActivityFactory")
    public static void injectMainActivityFactory(GUITuning instance, MainViewModelFactory<JNIActivityViewModel> mainActivityFactory) {
        instance.mainActivityFactory = mainActivityFactory;
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.tuning.GUITuning.tuningFactory")
    public static void injectTuningFactory(GUITuning instance, MainViewModelFactory<TuningMainViewModel> tuningFactory) {
        instance.tuningFactory = tuningFactory;
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.tuning.GUITuning.viewCarFactory")
    public static void injectViewCarFactory(GUITuning instance, MainViewModelFactory<TuningViewCarViewModel> viewCarFactory) {
        instance.viewCarFactory = viewCarFactory;
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.tuning.GUITuning.collapseFactory")
    public static void injectCollapseFactory(GUITuning instance, MainViewModelFactory<TuningCollapseViewModel> collapseFactory) {
        instance.collapseFactory = collapseFactory;
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.tuning.GUITuning.diagnosticFactory")
    public static void injectDiagnosticFactory(GUITuning instance, MainViewModelFactory<TuningDiagnosticViewModel> diagnosticFactory) {
        instance.diagnosticFactory = diagnosticFactory;
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.tuning.GUITuning.detailsListFactory")
    public static void injectDetailsListFactory(GUITuning instance, MainViewModelFactory<TuningDetailsListViewModel> detailsListFactory) {
        instance.detailsListFactory = detailsListFactory;
    }

    @InjectedFieldSignature("com.blackhub.bronline.game.gui.tuning.GUITuning.colorListFactory")
    public static void injectColorListFactory(GUITuning instance, MainViewModelFactory<TuningColorListViewModel> colorListFactory) {
        instance.colorListFactory = colorListFactory;
    }
}
