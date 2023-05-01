package com.example.homework11;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    private MutableLiveData<Boolean> isStarted = new MutableLiveData<>(false);
    private MutableLiveData<Integer> value;
    private boolean isPaused = false;

    public LiveData<Integer> getValue() {
        if (value == null) {
            value = new MutableLiveData<>(0);
        }
        return value;
    }

    public void execute(){
        if(!isStarted.getValue()){
            isStarted.postValue(true);
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    for(int i = value.getValue(); i <= 100; i++){
                        try {
                            if (!isPaused) { // добавляем проверку для состояния паузы
                                value.postValue(i);
                                Thread.sleep(400);
                            } else {
                                i--; // если пауза, то уменьшаем индекс
                                Thread.sleep(100); // добавляем задержку для уменьшения нагрузки на процессор
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            };
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }

    public void pause() {
        if (isStarted.getValue()) {
            isPaused = true; // устанавливаем состояние паузы
            isStarted.postValue(false);
        }
    }
    public void resume() {
        isPaused = false;
    }


}
