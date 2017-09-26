package xyz.michaelobi.mvp.app.player;

import xyz.michaelobi.mvp.BasePresenter;

/**
 * MVP
 * Michael Obi
 * 26 09 2017 8:47 PM
 */

public class DemoPresenter extends BasePresenter<DemoContract.View> implements DemoContract.Presenter {
    @Override
    public void randomize() {
        int random = (int )(Math.random() * 500 + 1);
        getView().setNumber(random);
    }

    @Override
    public void attachView(DemoContract.View view) {
        super.attachView(view);
        view.setNumber(100);
    }
}
