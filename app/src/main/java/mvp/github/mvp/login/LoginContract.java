package mvp.github.mvp.login;

import mvp.github.mvp.BasePresenter;
import mvp.github.mvp.BaseView;

/**
 * Created by Administrator on 2016/7/11 0011.
 */
public interface LoginContract {

    interface Presenter extends BasePresenter {
        void login();
        void reset();
    }

    interface View extends BaseView<Presenter> {
        String getUserEmail();
        String getPassword();

        boolean isEmailValid(String email);
        boolean isPasswordValid(String password);

        boolean setEmailError(String error);
        boolean setPasswordError(String error);

        void showLoginProgress(boolean show);
        void toMainAct();
        void showFailedError();
        void reset();
    }
}
