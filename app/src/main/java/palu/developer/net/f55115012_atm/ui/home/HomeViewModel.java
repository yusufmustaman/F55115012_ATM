package palu.developer.net.f55115012_atm.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("SISTEM INFORMASI GEOGRAFIS ATM");
    }

    public LiveData<String> getText() {
        return mText;
    }
}