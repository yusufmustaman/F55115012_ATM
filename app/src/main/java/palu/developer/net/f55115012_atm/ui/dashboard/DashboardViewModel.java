package palu.developer.net.f55115012_atm.ui.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DashboardViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DashboardViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("SISTEM INFORMASI GEOGRAFIS ATM");
    }

    public LiveData<String> getText() {
        return mText;
    }
}