package com.davidepani.androidextensions.tests

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.davidepani.kotlinextensions.utils.test.BaseCoroutineTestWithTestDispatcherProvider
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.TestDispatcher
import org.junit.Rule


@OptIn(ExperimentalCoroutinesApi::class)
abstract class BaseCoroutineTestWithTestDispatcherProviderAndInstantTaskExecutorRule(
    dispatcher: TestDispatcher
) : BaseCoroutineTestWithTestDispatcherProvider(
    dispatcher = dispatcher
) {

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

}