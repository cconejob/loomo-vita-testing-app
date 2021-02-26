// Generated code from Butter Knife. Do not modify!
package com.segway.robot.algo.algo_app;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends com.segway.robot.algo.algo_app.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131165215, "field 'mBindSwitch' and method 'bind'");
    target.mBindSwitch = finder.castView(view, 2131165215, "field 'mBindSwitch'");
    ((android.widget.CompoundButton) view).setOnCheckedChangeListener(
      new android.widget.CompoundButton.OnCheckedChangeListener() {
        @Override public void onCheckedChanged(
          android.widget.CompoundButton p0,
          boolean p1
        ) {
          target.bind(p1);
        }
      });
    view = finder.findRequiredView(source, 2131165221, "field 'mAlgoTestButton' and method 'startStopAlgo'");
    target.mAlgoTestButton = finder.castView(view, 2131165221, "field 'mAlgoTestButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.startStopAlgo();
        }
      });
    view = finder.findRequiredView(source, 2131165222, "field 'mAlgoRecordButton' and method 'StartStopRecord'");
    target.mAlgoRecordButton = finder.castView(view, 2131165222, "field 'mAlgoRecordButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.StartStopRecord();
        }
      });
    view = finder.findRequiredView(source, 2131165223, "field 'mRecordNewLoc' and method 'LocOfRecord'");
    target.mRecordNewLoc = finder.castView(view, 2131165223, "field 'mRecordNewLoc'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.LocOfRecord();
        }
      });
    view = finder.findRequiredView(source, 2131165224, "field 'mLiveSimSwitch' and method 'switchLiveSim'");
    target.mLiveSimSwitch = finder.castView(view, 2131165224, "field 'mLiveSimSwitch'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.switchLiveSim();
        }
      });
    view = finder.findRequiredView(source, 2131165251, "field 'mColorImage'");
    target.mColorImage = finder.castView(view, 2131165251, "field 'mColorImage'");
    view = finder.findRequiredView(source, 2131165249, "field 'mDepthImage'");
    target.mDepthImage = finder.castView(view, 2131165249, "field 'mDepthImage'");
    view = finder.findRequiredView(source, 2131165250, "field 'mFishEyeImage'");
    target.mFishEyeImage = finder.castView(view, 2131165250, "field 'mFishEyeImage'");
    view = finder.findRequiredView(source, 2131165252, "field 'mPlatformImage'");
    target.mPlatformImage = finder.castView(view, 2131165252, "field 'mPlatformImage'");
    view = finder.findRequiredView(source, 2131165218, "method 'btnA'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.btnA();
        }
      });
    view = finder.findRequiredView(source, 2131165219, "method 'btnB'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.btnB();
        }
      });
    view = finder.findRequiredView(source, 2131165220, "method 'btnC'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.btnC();
        }
      });
  }

  @Override public void unbind(T target) {
    target.mBindSwitch = null;
    target.mAlgoTestButton = null;
    target.mAlgoRecordButton = null;
    target.mRecordNewLoc = null;
    target.mLiveSimSwitch = null;
    target.mColorImage = null;
    target.mDepthImage = null;
    target.mFishEyeImage = null;
    target.mPlatformImage = null;
  }
}
