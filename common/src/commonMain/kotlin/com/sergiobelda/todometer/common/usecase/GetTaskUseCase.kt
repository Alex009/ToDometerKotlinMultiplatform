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

package com.sergiobelda.todometer.common.usecase

import com.sergiobelda.todometer.common.datasource.Result
import com.sergiobelda.todometer.common.model.TaskTag
import com.sergiobelda.todometer.common.repository.ITaskRepository
import kotlinx.coroutines.flow.Flow

class GetTaskUseCase(
    private val taskRepository: ITaskRepository
) {

    /**
     * Gets a task by it id.
     *
     * @param id Task id.
     */
    operator fun invoke(id: Long): Flow<Result<TaskTag?>> =
        taskRepository.getTask(id)
}
