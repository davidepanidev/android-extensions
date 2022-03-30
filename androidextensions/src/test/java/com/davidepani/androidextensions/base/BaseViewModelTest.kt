package com.davidepani.androidextensions.base

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.davidepani.androidextensions.rules.TestCoroutineRule
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.TestCoroutineScope
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Rule

@ExperimentalCoroutinesApi
abstract class BaseViewModelTest {

    @get:Rule
    val testCoroutineRule = TestCoroutineRule()
    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    fun runBlockingTest(block: suspend TestCoroutineScope.() -> Unit): Unit = testCoroutineRule.runBlockingTest(block)

}