package com.joocoding.android.app.hilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

//앱이 살아있는 동안 Dependency를 제공하는 역할을 하는 애플리케이션 레벨의 component이다.
//@HiltAndroidApp 어노테이션을 사용하여 컴파일 타임 시 표준 컴포넌트 빌딩에 필요한 클래스들을 초기화합니다.
@HiltAndroidApp
class MyApplication: Application() {
}