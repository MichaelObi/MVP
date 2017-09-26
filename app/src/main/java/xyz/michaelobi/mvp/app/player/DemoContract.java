package xyz.michaelobi.mvp.app.player;

import xyz.michaelobi.mvp.Mvp;

/**
 * MVP
 * Michael Obi
 * 26 09 2017 8:42 PM
 */

public interface DemoContract {
    interface View extends  Mvp.View {
        void setNumber(int number);
    }

    interface Presenter extends Mvp.Presenter<View> {
        void randomize();
    }
}
