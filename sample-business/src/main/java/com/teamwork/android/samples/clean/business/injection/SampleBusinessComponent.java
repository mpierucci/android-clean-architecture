package com.teamwork.android.samples.clean.business.injection;

import com.teamwork.android.samples.business.injection.module.exported.DataRepoModule;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {
        DataRepoModule.class
})
public interface SampleBusinessComponent {

}