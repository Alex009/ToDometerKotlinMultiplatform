/*
 * Copyright 2021 Sergio Belda
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.sergiobelda.todometer.wear.ui.addtask

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dev.sergiobelda.todometer.common.usecase.InsertTaskUseCase
import kotlinx.coroutines.launch

class AddTaskViewModel(
    private val insertTaskUseCase: InsertTaskUseCase
) : ViewModel() {

    fun insertTask(projectId: String, title: String) = viewModelScope.launch {
        insertTaskUseCase.invoke(projectId, title)
    }
}
