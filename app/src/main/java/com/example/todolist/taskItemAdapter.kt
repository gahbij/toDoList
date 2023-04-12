package com.example.todolist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.todolist.databinding.TaskItemCellBinding

class taskItemAdapter(
    private val taskItems: List<TaskItem>,
    private val clickListener: taskItemClickListen
): RecyclerView.Adapter<taskItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): taskItemViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = TaskItemCellBinding.inflate(from, parent, false)
        return taskItemViewHolder(parent.context, binding, clickListener)
    }

    override fun onBindViewHolder(holder: taskItemViewHolder, position: Int) {
        holder.bindTaskItem(taskItems[position])
    }

    override fun getItemCount(): Int = taskItems.size
}