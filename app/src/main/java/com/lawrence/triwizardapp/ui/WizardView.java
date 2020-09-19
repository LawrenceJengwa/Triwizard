package com.lawrence.triwizardapp.ui;

import android.content.Intent;

import androidx.annotation.NonNull;
import com.hannesdorfmann.mosby3.mvp.MvpView;
import io.reactivex.Observable;

public interface WizardView extends MvpView {

    @NonNull
    Observable<Intent> onResumeIntent();

    void render(WizardViewState viewState);
}
